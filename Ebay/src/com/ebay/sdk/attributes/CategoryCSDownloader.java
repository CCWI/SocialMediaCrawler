/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.ICategoryCSProvider;
import com.ebay.sdk.call.GetCategory2CSCall;
import com.ebay.soap.eBLBaseComponents.CategoryArrayType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CharacteristicsSetType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.GetCategory2CSResponseType;
import com.ebay.soap.eBLBaseComponents.SiteWideCharacteristicsType;

/**
 * Implements ICategoryCSProvider by downloading CS Xml through eBay API.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li & changed by William Yang
 * @version 1.0
 */
public class CategoryCSDownloader implements ICategoryCSProvider {
	private ApiContext apiContext;
	private String currentVersion;
	private String ROOT_DIR;
	private String CATCS_FILE_NAME;
	private final static String CATCS_FILE_EXTENSION = "catcs";
	private String CATCS_FILE_NAME_PREFIX;
	private GetCategory2CSResponseType resp;
	private CategoryType[] cats;
	private SiteWideCharacteristicsType[] siteWideCharacteristicSets;
	
	public CategoryCSDownloader(ApiContext apiContext) throws ApiException, SdkException, Exception {
		this.apiContext = apiContext;
	}

	  private void init(String catId) throws ApiException, SdkException, Exception {
		  if(currentVersion == null || currentVersion.length() == 0) {
			  currentVersion = getCurrentAttributeSystemVersion();
		  }
		  if(catId != null && catId.length() == 0) {
			  catId = null;
		  }
		  String site = apiContext.getSite().toString();
		  CATCS_FILE_NAME_PREFIX = (catId == null)?"ALL":catId;
		  ROOT_DIR = new File (".").getCanonicalPath();
		  File dir = new File(ROOT_DIR);
		  String[] dataFiles = getDataFiles(dir);
		  boolean foundVersion = false;
		  boolean foundAllVersion = false;
		  String fileNamePrefix = site + "." + CATCS_FILE_NAME_PREFIX + "." + currentVersion;
		  if(dataFiles != null) {
			  foundVersion = foundVersion(dataFiles, fileNamePrefix);
			  if(!foundVersion) {
				  foundAllVersion = foundVersion(dataFiles, site + "." + "ALL" + "." + currentVersion);
			  } 
			  if(foundAllVersion) {
				  fileNamePrefix = site + "." + "ALL" + "." + currentVersion;
			  }
		  }
		  CATCS_FILE_NAME = ROOT_DIR + "/" + fileNamePrefix + "." + CATCS_FILE_EXTENSION;
		  if(foundVersion || foundAllVersion) {
			  try {
				  Object obj = readObjectFromDisk();
				  resp = (GetCategory2CSResponseType)obj;
				  if(resp != null) {
					  CategoryArrayType mappedArray = resp.getMappedCategoryArray();
					  if(mappedArray != null) {
						  cats = mappedArray.getCategory();
					  }
					  siteWideCharacteristicSets = resp.getSiteWideCharacteristicSets();
				  }
			  } catch(IOException ioe) {
				  throw new SdkException("Error processing file: " + CATCS_FILE_NAME + " : " + ioe.getMessage());
			  } catch(ClassNotFoundException cnfe) {
				  throw new SdkException("Error processing file: " + CATCS_FILE_NAME + " : " + cnfe.getMessage());
			  } catch(ClassCastException cce) {
				  throw new SdkException("Error processing file: " + CATCS_FILE_NAME + " : " + cce.getMessage());
			  }
		  } else {
			  downloadCategoryCS(catId);
			  writeObjectToDisk(resp);
		  }
	  }
	  
	private boolean foundVersion(String[] dataFiles, String fileNamePrefix) {
		for(int i = 0; i < dataFiles.length; i++) {
			  String fileName = dataFiles[i];
			  if(fileName.startsWith(fileNamePrefix)) {
				  return true;
			  } 
		  }
		return false;
	}
	  
	  private String[] getDataFiles(File dir) {
		    FilenameFilter filter = new FilenameFilter() {
		        public boolean accept(File dir, String name) {
		  		  	String site = apiContext.getSite().toString();
		            return name.startsWith(site + "." + CATCS_FILE_NAME_PREFIX) || 
		            	   name.startsWith(site + "." + "ALL") &&
		                   name.endsWith(CATCS_FILE_EXTENSION);
		        }
		    };
	    String [] files = dir.list(filter);
	    return files;
	  }
	  
 
	   private String getCurrentAttributeSystemVersion() throws ApiException, SdkException, Exception {
		   GetCategory2CSCall api = new GetCategory2CSCall(apiContext);
		    api.addDetailLevel(DetailLevelCodeType.RETURN_SUMMARY);
		    api.getCategory2CS();
		    
		    return api.getReturnedAttributeSystemVersion();  
	   }

	  private boolean validate() throws ApiException, SdkException, Exception {
		  String currentSystemVersion = getCurrentAttributeSystemVersion();
		  if(currentVersion == null) {
			  currentVersion = currentSystemVersion;
			  return false;
		  }
		  return currentVersion.equals(currentSystemVersion);
	  }
	  
		/**
		 * Returns the Category2CS list.
		 * @return CategoryType[]
		 */
	  	public CategoryType[] getCategoriesCS() throws ApiException, SdkException, Exception {
	  		return getCategoriesCS(null);
	  	}
	  	
		public CategoryType[] getCategoriesCS(String catId) throws ApiException, SdkException, Exception {
			if(!validate()) {
				init(catId);
			}
			if(resp != null) {
				if(resp.getMappedCategoryArray() == null){
					cats = new CategoryType[0];
				}else{ 
					cats = resp.getMappedCategoryArray().getCategory();
				}
			}
			return cats;
		}
	
		  /**
		   * Get CSIds[0] by categoryId.
		   * @see CategoryType[] getCategoriesCS
		   * @param categoryId int The categoryId for which you want to get CSId.
		   * @return int The CSId.
		   */
		public int getVCSId(int categoryId) throws ApiException, SdkException, Exception {
			int[] vcsIds =  getVCSIdArray(categoryId);
			return vcsIds[0];
		}
		
		public int[] getVCSIdArray(int categoryId) throws ApiException, SdkException, Exception {
			Map vcsIdMap =  getVCSIdMap(categoryId);
			CharacteristicsSetType[] sets = (CharacteristicsSetType[])vcsIdMap.get(Integer.valueOf(String.valueOf(categoryId)));
			int setsLength = (sets == null)?1:sets.length;
			int[] vcsIds = new int[setsLength];
			if(sets == null) {
				vcsIds[0] = 0;
			} else {
				for(int i = 0; i < setsLength; i++) {
					vcsIds[i] = sets[i].getAttributeSetID().intValue();
				}
			}
			return vcsIds;
		}

		/**
		 * Get getVCSIdMap by categoryId.
		 * @param categoryId int The categoryId for which you want to get CSId.
		 * @return Map of characteristics sets by categoryId.
		 */
		public Map getVCSIdMap(int categoryId) throws ApiException, SdkException, Exception {
			Map vcsIdMap = new HashMap(1);
			if(!validate()) {
				init(String.valueOf(categoryId));
			}
			if(cats == null || cats.length == 0) {
				vcsIdMap.put(Integer.valueOf("-1"), Integer.valueOf("-1")); // dummy value
				return vcsIdMap;
			}
			for(int i = 0; i < cats.length; i++) {
				CategoryType cat = cats[i];
				CharacteristicsSetType[] sets = cat.getCharacteristicsSets();
				if(sets != null && sets.length > 0)
					vcsIdMap.put(Integer.valueOf(cat.getCategoryID()), sets);
			}
			return vcsIdMap;
		}

		private void writeObjectToDisk(Object obj) throws IOException {
			FileOutputStream f_out = new FileOutputStream (CATCS_FILE_NAME);
			ObjectOutputStream obj_out = new ObjectOutputStream (f_out);

			obj_out.writeObject (obj);			
		}

		private Object readObjectFromDisk() throws IOException, ClassNotFoundException {
			FileInputStream f_in = new FileInputStream (CATCS_FILE_NAME);
			ObjectInputStream obj_in = new ObjectInputStream (f_in);
			return obj_in.readObject();
		}
		
		/**
		 * Download category2CS data from eBay.
		 * @param asn ApiContext
		 * @throws ApiException
		 * @throws SdkException
		 * @throws Exception
		 */
		public GetCategory2CSResponseType downloadCategoryCS(ApiContext asn, String catId) throws ApiException, SdkException, Exception {
			apiContext = asn;
			GetCategory2CSCall api = new GetCategory2CSCall(asn);
			api.setDetailLevel(new DetailLevelCodeType[] {DetailLevelCodeType.RETURN_ALL});
			if(catId != null) {
				api.setCategoryID(catId);
			}
			cats = api.getCategory2CS();		// make API call
			resp = api.getResponse();
			siteWideCharacteristicSets = resp.getSiteWideCharacteristicSets();
			
			return resp;
	    }
				
		public SiteWideCharacteristicsType[] getSiteWideCharacteristics(String catId)  throws ApiException, SdkException, Exception {
			if(!validate()) {
				init(catId);
			}
			List swCharSetList = new ArrayList();
			for(int i = 0; i < siteWideCharacteristicSets.length; i++) {
				SiteWideCharacteristicsType swCharSet = siteWideCharacteristicSets[i];
				if(isExcludedCategoryID(catId, swCharSet)) {
					continue;
				}
				swCharSetList.add(swCharSet);
			}
			SiteWideCharacteristicsType[] retVal = new SiteWideCharacteristicsType[swCharSetList.size()];
			for(int i = 0; i < retVal.length; i++) {
				retVal[i] = (SiteWideCharacteristicsType)swCharSetList.get(i);
			}
			return retVal;
		}
		
		public int[] getSiteWideCharSetsAttrIds(String catId) throws ApiException, SdkException, Exception {
			SiteWideCharacteristicsType[] swAttrSets = getSiteWideCharacteristics(catId);
			int[] ids = new int[swAttrSets.length];
			
			for(int i = 0; i < siteWideCharacteristicSets.length; i++) {
				SiteWideCharacteristicsType swCharSet = siteWideCharacteristicSets[i];
				ids[i] = swCharSet.getCharacteristicsSet().getAttributeSetID().intValue();
			}
			return ids;
		}
		
		private boolean isExcludedCategoryID(String catId, SiteWideCharacteristicsType swCharSet) {
			boolean isExcluded = false;
			String[] excluded = swCharSet.getExcludeCategoryID();
			for(int i = 0; i < excluded.length; i++) {
				if(excluded[i].equals(catId)) {
					isExcluded = true;
					break;
				}
			}
			return isExcluded;
		}
		
		public GetCategory2CSResponseType downloadCategoryCS(String catId) throws ApiException, SdkException, Exception {
			return downloadCategoryCS(apiContext, catId);
		}

		public GetCategory2CSResponseType downloadCategoryCS() throws ApiException, SdkException, Exception {
			return downloadCategoryCS(null);
		}

		public GetCategory2CSResponseType getResponse() throws ApiException, SdkException, Exception {
			return getResponse(null);
		}
		
		public GetCategory2CSResponseType getResponse(String catId) throws ApiException, SdkException, Exception {
			if(!validate()) {
				init(catId);
			}
			return resp;
		}

}
