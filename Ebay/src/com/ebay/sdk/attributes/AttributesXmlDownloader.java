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
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.AttributeSet;
import com.ebay.sdk.attributes.model.IAttributesXmlProvider;
import com.ebay.sdk.call.GetAttributesCSCall;
import com.ebay.sdk.call.GetProductSellingPagesCall;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.soap.eBLBaseComponents.CharacteristicsSetType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ProductType;
import com.ebay.soap.eBLBaseComponents.ProductUseCaseCodeType;


/**
 * Implements IAttributesXmlProvider by directly downloading attributes CS Xml
 * through eBay API.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004 - 2007</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class AttributesXmlDownloader implements IAttributesXmlProvider {
  private Document csXml;
  private ApiContext apiContext;
  private String currentVersion;
  private String ROOT_DIR;
  private String ATTR_XML_FILE_NAME_PREFIX;
  private String ATTR_XML_FILE_NAME;
  private final static String ATTR_XML_FILE_EXTENSION = "attrcs";
  
  /**
   * Constructor.
   * @param apiContext ApiContext
   */
  public AttributesXmlDownloader(ApiContext apiContext) throws ApiException, SdkException, Exception {
	  this.apiContext = apiContext;
  }

  private void init(AttributeSet[] asList) throws ApiException, SdkException, Exception {
	  if(currentVersion == null || currentVersion.length() == 0) {
		  currentVersion = getCurrentAttributeSystemVersion();
	  }
	  ROOT_DIR = new File (".").getCanonicalPath();
	  File dir = new File(ROOT_DIR);
	  String[] dataFiles = getDataFiles(dir);
	  boolean foundVersion = false;
	  boolean foundAllVersion = false;
	  String site = apiContext.getSite().toString();
	  String fileNamePrefix = site + "." + ATTR_XML_FILE_NAME_PREFIX + "." + currentVersion;
	  if(dataFiles != null) {
		  foundVersion = foundVersion(dataFiles, fileNamePrefix);
		  if(!foundVersion) {
			  foundAllVersion = foundVersion(dataFiles, site + "." + "ALL" + "." + currentVersion);
		  } 
		  if(foundAllVersion) {
			  fileNamePrefix = site + "." + "ALL" + "." + currentVersion;
		  }
	  }
	  ATTR_XML_FILE_NAME = ROOT_DIR + "/" + fileNamePrefix + "." + ATTR_XML_FILE_EXTENSION;
	  if(foundVersion || foundAllVersion) {
		  try {
			  File csFile = new File(ATTR_XML_FILE_NAME);
			  csXml = XmlUtil.createDom(csFile);
		  } catch(IOException ioe) {
			  throw new SdkException("Error processing file: " + ATTR_XML_FILE_NAME + " : " + ioe.getMessage());
		  } catch(SAXException se) {
			  throw new SdkException("Error processing file: " + ATTR_XML_FILE_NAME + " : " + se.getMessage());
		  } catch(ParserConfigurationException pce) {
			  throw new SdkException("Error processing file: " + ATTR_XML_FILE_NAME + " : " + pce.getMessage());
			  }
		  } else {
			  int[] attrSetIds = null;
			  if(asList != null) {
				  attrSetIds = new int[asList.length];
				  for(int i = 0; i < asList.length; i++) {
					  attrSetIds[i] =  asList[i].getAttributeSetID();
				  }
			  }
			  csXml = downloadXml(attrSetIds);
			  writeXmlFile(csXml, ATTR_XML_FILE_NAME);
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
  
	  //This method writes a DOM document to a file
  private void writeXmlFile(Document doc, String filename) {
      try {
          // Prepare the DOM document for writing
          Source source = new DOMSource(doc);
  
          // Prepare the output file
          File file = new File(filename);
          Result result = new StreamResult(file);
  
          // Write the DOM document to the file
          Transformer xformer = TransformerFactory.newInstance().newTransformer();
          xformer.transform(source, result);
      } catch (TransformerConfigurationException e) {
      } catch (TransformerException e) {
      }
  }

  private boolean validateCurrentVersion() throws ApiException, SdkException, Exception {
	  String currentSystemVersion = getCurrentAttributeSystemVersion();
	  if(currentVersion == null) {
		  currentVersion = currentSystemVersion;
		  return false;
	  }
	  return currentVersion.equals(currentSystemVersion);
  }
  
  private String createXmlFilePrefix(AttributeSet[] asList) {
	  if(asList == null) {
		  return "ALL";
	  }
	  Set<Integer> attrListSet = new HashSet<Integer>();
	  for(int i = 0; i < asList.length; i++) {
		  attrListSet.add(new Integer(asList[i].getAttributeSetID()));  
	  }
	  return String.valueOf(attrListSet.hashCode());

  }

  /**
   * Get xml that contains multiple CSs. Only set IAttributeSet.CSId
   * and IAttributeSet.ProductId (optional). Set IAttributeSet.ProductId to retrieve CSXml with
   * pre-filled product information.
   * @param asList AttributeSet[] List of attribute sets for which you want to get CSXml.
   * @return String The CS xml for specified CSs.
   */
  public synchronized String getMultipleCSXmlText(AttributeSet[] asList) throws SdkException, Exception
  {	  
	  Document xmlDoc = getMultipleCSXml(asList);
	  
	  return XmlUtil.getXmlStringFromDom(xmlDoc);
  }  
  
  /**
   * Get xml that contains multiple CSs. Only set IAttributeSet.CSId
   * and IAttributeSet.ProductId (optional). Set IAttributeSet.ProductId to retrieve CSXml with
   * pre-filled product information.
   * @param asList AttributeSet[] List of attribute sets for which you want to get CSXml.
   * @return Document The CS xml for specified CSs.
   */
  public synchronized Document getMultipleCSXml(AttributeSet[] asList)
      throws SdkException, Exception
  {	  
	  boolean validVersion = validateCurrentVersion();
	  if(validVersion) {
		  boolean isAllAttributesFile = ATTR_XML_FILE_NAME_PREFIX != null && ATTR_XML_FILE_NAME_PREFIX.indexOf(".ALL.") != -1;
		  if(!isAllAttributesFile) {
			  // check file name
			  String fileNamePrefix = createXmlFilePrefix(asList);
			  if(!fileNamePrefix.equals(ATTR_XML_FILE_NAME_PREFIX)) {
				  ATTR_XML_FILE_NAME_PREFIX = fileNamePrefix;
				  init(asList);
			  }
		  }
	  } else {
		  ATTR_XML_FILE_NAME_PREFIX = createXmlFilePrefix(asList);
		  init(asList);
	  }
	  if(csXml == null) {
		  return null;
	  }
	  Document doc = null;
	  // Separate attributes with product ids:
	  ArrayList<AttributeSet> asListWithProdIds = new ArrayList<AttributeSet>();
	  ArrayList<AttributeSet> asListNoProdIds = new ArrayList<AttributeSet>();
	  for(int i = 0; i < asList.length; i++) {
		  AttributeSet ast = asList[i];
		  if( ast.getProductID() != null ) {
			  asListWithProdIds.add(ast);
		  } else {
			  asListNoProdIds.add(ast);
		  }
	  }
	  AttributeSet[] asArrayWithProdIds = new AttributeSet[asListWithProdIds.size()];
	  for(int i = 0; i < asArrayWithProdIds.length; i++){
		  asArrayWithProdIds[i] = (AttributeSet)asListWithProdIds.get(i);
	  }
	  AttributeSet[] asArrayNoProdIds = new AttributeSet[asListNoProdIds.size()];
	  for(int i = 0; i < asArrayNoProdIds.length; i++) {
		  asArrayNoProdIds[i] = (AttributeSet)asListNoProdIds.get(i);
	  }
	  // 
      Document rawDoc;
      // Process attr sets with prod ids
	  if(asArrayWithProdIds.length != 0) {
	      GetProductSellingPagesCall psp = new GetProductSellingPagesCall(apiContext);
	      psp.setDetailLevel(new DetailLevelCodeType[] {DetailLevelCodeType.RETURN_ALL});
	      ProductType[] products = new ProductType[asArrayWithProdIds.length];
	      int[] csidArray = new int[asArrayWithProdIds.length];
	      for(int i = 0; i < asArrayWithProdIds.length; i++) {
	          ProductType prod = new ProductType();
	          prod.setProductID(asArrayWithProdIds[i].getProductID());
	          CharacteristicsSetType cs = new CharacteristicsSetType();
	          cs.setAttributeSetID(new Integer(asArrayWithProdIds[i].getAttributeSetID()));
	          prod.setCharacteristicsSet(cs);
	          products[i] = prod;
	          csidArray[i] = asArrayWithProdIds[i].getAttributeSetID();
	      }
	      psp.setProducts(products);
	      psp.setUseCase(ProductUseCaseCodeType.ADD_ITEM);
	      String spText = psp.getProductSellingPages();
	      rawDoc = XmlUtil.createDom(spText);
	      doc = GetAttributesCSCall.extractMultiCSFromXml(rawDoc, csidArray, true, "/Products/Product", doc);
	      // Patch it with style XSL.
	      String xmlBefore = XmlUtil.getXmlStringFromDom(doc);
	      String xmlPatched = GetAttributesCSCall.fixAttributesXml(xmlBefore, GetAttributesCSCall.getDefaultStyleXsl());
	      doc = XmlUtil.createDom(xmlPatched);
	  } 
      // Process attr sets with no prod ids
	  if(asArrayNoProdIds.length != 0) {
	      int[] csidArray = new int[asArrayNoProdIds.length];
	      for(int i = 0; i < asArrayNoProdIds.length; i++) {
	          csidArray[i] = asArrayNoProdIds[i].getAttributeSetID();
	      }	  
		  rawDoc = csXml;
	      doc = GetAttributesCSCall.extractMultiCSFromXml(rawDoc, csidArray, true, "/eBay", doc);
	  }

    return doc;
  }
  
  private String[] getDataFiles(File dir) {
    FilenameFilter filter = new FilenameFilter() {
        public boolean accept(File dir, String name) {
        	String site = apiContext.getSite().toString();
        	boolean acceptIt = (name.startsWith(site + "." + ATTR_XML_FILE_NAME_PREFIX) || 
        						name.startsWith(site + "." + "ALL")) && 
        						name.endsWith(ATTR_XML_FILE_EXTENSION);
            return acceptIt;
        }
    };
    String [] files = dir.list(filter);
    return files;
  }
  
  private String getCurrentAttributeSystemVersion() throws ApiException, SdkException, Exception {
    GetAttributesCSCall api = new GetAttributesCSCall(apiContext);
    api.addDetailLevel(DetailLevelCodeType.RETURN_SUMMARY);
    api.getAttributesCS();
    
    return api.getReturnedattributeSystemVersion();  
  }
   
  /**
   * Downloads AttributesCS for all categories through eBay SOAP API.
   * @throws SdkException
   * @throws Exception
   * @return Document for all categories
   */	   
   public Document downloadXml() throws ApiException, SdkException, Exception {
	   return downloadXml((int[])null);
   }	  
   
  /**
   * Downloads AttributesCS for specified categories through eBay SOAP API.
   * @param attrSetIds int[] List of attribute setid for which you want to get CSXml
   * @throws SdkException
   * @throws Exception
   * @return Document for specified attr set ids
   */
   public Document downloadXml(int[] attrSetIds) throws ApiException, SdkException, Exception {
	  GetAttributesCSCall api = new GetAttributesCSCall(apiContext);
	  api.addDetailLevel(DetailLevelCodeType.RETURN_ALL);
	  if(attrSetIds != null) {
		  api.setAttributeSetIDs(attrSetIds);
	  }
	  String xmlText = api.getAttributesCS();
	  api.setIncludeCategoryMappingDetails(new Boolean(true));

	  csXml = XmlUtil.createDom(xmlText);
	  
	  return csXml;
   }
   
   public Document downloadXml(AttributeSet[] attrSets) throws ApiException, SdkException, Exception {
	   if(attrSets == null) {
		   return downloadXml();
	   }
	   int[] attrSetIds = new int[attrSets.length];
	   for(int i = 0; i < attrSets.length; i++) {
		   attrSetIds[i] =  attrSets[i].getAttributeSetID();
	   }
	   
	   return downloadXml(attrSetIds);
   }
   
}
