/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.IAttributesXslProvider;
import com.ebay.sdk.call.GetAttributesXSLCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.XSLFileType;

/**
 * Implements <c>IAttributesXslProvider</c>. It makes calls eBay SDK to download
* the XSL data fromgets XSL data by calling eBay API.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class AttributesXslDownloader implements IAttributesXslProvider {
	private ApiContext apiContext;
	private String xslFileName;
	private String xslText;
	private String currentVersion;
	private String ROOT_DIR; 
	private String XSL_FILE_NAME;
	private final static String ATTR_XSL_FILE_EXTENSION = "attrxsl";
	
	  public AttributesXslDownloader(ApiContext apiContext) throws Exception, IOException {
		  this.apiContext = apiContext;
	  }

	  private void init() throws Exception, IOException {
		  currentVersion = getCurrentFileVersion();
		  String site = apiContext.getSite().toString();
		  ROOT_DIR = new File (".").getCanonicalPath();
		  XSL_FILE_NAME = ROOT_DIR + "/" + site + "." + currentVersion + "." + ATTR_XSL_FILE_EXTENSION;
		  File dir = new File(ROOT_DIR);
		  String[] dataFiles = getDataFiles(dir);
		  boolean foundVersion = false;
		  if(dataFiles != null) {
			  for(int i = 0; i < dataFiles.length; i++) {
				  if(dataFiles[i].startsWith(site + "." + currentVersion + ".")) {
					  foundVersion = true;
					  break;
				  }
			  }
		  }
		  if(foundVersion) {
			  try {
				  xslText = loadXslFile();
			  } catch(IOException ioe) {
				  throw new SdkException("Error processing file: " + XSL_FILE_NAME + " : " + ioe.getMessage());
			  }
		  } else {
			  xslText = downloadXsl();
			  saveXslTextInFile(xslText);
		  }
	  }

	  private void saveXslTextInFile(String xslText) throws IOException {
	    File fl = new File(XSL_FILE_NAME);
	    FileWriter fw = new FileWriter(fl);
	    fw.write(xslText);
	    fw.close();	  
	  }
	  
	  /**
	   * Gets the XSL text.
	   * @return String
	   */
	  public synchronized String getXslText() throws ApiException, SdkException, Exception {
		  if(!validateCurrentVersion()) {
			  init();
		  }
	    return xslText;
	  }

	  private String fixXslTest(String xslSource) {
		  StringBuffer retval = new StringBuffer();
		  final String XSL_CHOOSE_START = "<xsl:choose>";
		  final String XSL_CHOOSE_END = "</xsl:choose>";
		  final String XAL_NODESET = "xal:nodeset";
		  int xalPos = xslSource.indexOf(XAL_NODESET);
		  if(xalPos < 0) {
			  return xslSource;
		  }
		  String firstPart = xslSource.substring(0, xalPos);
		  int chooseStartPos = firstPart.lastIndexOf(XSL_CHOOSE_START);
		  if(chooseStartPos < 0) {
			  return xslSource;
		  }
		  retval.append(firstPart.substring(0, chooseStartPos-1));
		  String secondPart = xslSource.substring(chooseStartPos);
		  int chooseEndPos = secondPart.indexOf(XSL_CHOOSE_END) + XSL_CHOOSE_END.length();
		  retval.append(secondPart.substring(chooseEndPos));
		  
		  return retval.toString();
	  }
	  /**
	   * Downloads attributes XSL through eBay SOAP API.
	   * @param asn ApiContext
	   * @throws ApiException
	   * @throws SdkException
	   * @throws Exception
	   */
	  public String downloadXsl(ApiContext asn) throws ApiException, SdkException, Exception {
		  apiContext = asn;
		  GetAttributesXSLCall api = new GetAttributesXSLCall(asn);
		  api.addDetailLevel(DetailLevelCodeType.RETURN_ALL);
	
		  XSLFileType[] xslFiles = api.getAttributesXSL();
		  String myXslText = null;
		  if( xslFiles.length > 0 ) {
			  myXslText = xslFiles[0].getFileContent();
			  xslFileName = xslFiles[0].getFileName();
		  }
		  String firstPart = fixXslTest(myXslText);
		  xslText = fixXslTest(firstPart);
//		  this.xslText = myXslText;
		  
		  return xslText;
	  }
	  
	  private String getCurrentFileVersion() throws ApiException, SdkException, Exception {
		    GetAttributesXSLCall api = new GetAttributesXSLCall(apiContext);
		    api.addDetailLevel(DetailLevelCodeType.RETURN_SUMMARY);
		    api.getAttributesXSL();
		    
		    return api.getXSLFile()[0].getFileVersion();  
	   }
	  
	  private boolean validateCurrentVersion() throws ApiException, SdkException, Exception {
		  String currentFileVersion = getCurrentFileVersion();
		  if(currentVersion == null) {
				currentVersion = currentFileVersion;
				return false;
		  }
		  return this.currentVersion.equals(currentFileVersion);
	  }
	   
	   private String[] getDataFiles(File dir) {
		   FilenameFilter filter = new FilenameFilter() {
			   public boolean accept(File dir, String name) {
		            return name.endsWith(ATTR_XSL_FILE_EXTENSION);
		        }
		    };
		    String [] files = dir.list(filter);
		    return files;
	   }
	   
	   private String loadXslFile() throws IOException {
		    StringBuffer contents = new StringBuffer();

		    BufferedReader input = null;
		    try {
		      input = new BufferedReader( new FileReader(XSL_FILE_NAME) );
		      String line = null; 
		      while (( line = input.readLine()) != null){
		        contents.append(line);
		        contents.append(System.getProperty("line.separator"));
		      }
		    } finally {
		        if (input!= null) {
		          input.close();
		      }
		    }
		    return contents.toString();
	   }
	  
	   public String getXslFileName() {
		  return xslFileName;
	   }
	  
	   public String downloadXsl() throws ApiException, SdkException, Exception {
		   return downloadXsl(apiContext);
	   }
	   
}

