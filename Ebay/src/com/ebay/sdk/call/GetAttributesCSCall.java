/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.io.*;
import java.text.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import com.ebay.sdk.util.*;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetAttributesCS call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>AttributeSystemVersion</code> - A version of the Item Specifics definitions (attribute meta-data)
 * for the site.
 * Typically, an application passes the version value that was
 * returned the last time the application executed this call.
 * Filter that causes the call to return only the characteristic sets
 * for which the attribute meta-data has changed since the specified
 * version. If not specified, all characteristics sets are returned.
 * The latest version value is not necessarily greater than the
 * previous value that was returned. Therefore, when comparing
 * versions, only compare whether the value has changed.
 * <br> <B>Input property:</B> <code>AttributeSetIDs</code> - An array of characteristic setIDs (which always correspond to
 * attribute set IDs).
 * Each characteristic setcorresponds to a level in the eBay
 * category hierarchy at
 * which all items share common characteristics.
 * Multiple categories can be mapped to the same characteristic set.
 * AttributeSetIDs is an optional input. When IDs are specified,
 * the call only returns meta-data for the corresponding
 * characteristic sets.
 * When no IDs are specified, the call returns all the current
 * attribute meta-data in the system.
 * <br> <B>Input property:</B> <code>IncludeCategoryMappingDetails</code> - If true, includes a list of CategoryMapping nodes in the response.
 * Each CategoryMapping node specifies category information as well as
 * attributes and values that your application can auto-fill for
 * items listed in that category. See the eBay Features Guide for more
 * information about options for maintaining category data and
 * auto-filling Item Specifics.
 * <br> <B>Output property:</B> <code>ReturnedattributeSystemVersion</code> - Current version of the Item Specifics meta-data system for
 * the site.
 * This value changes each time changes are made to the meta-data.
 * The current version value is not necessarily greater than
 * the previous value. Therefore, when comparing versions, only
 * compare whether the value has changed.
 * <br> <B>Output property:</B> <code>AttributeData</code> - A string containing a list of all the attributes that are
 * applicable to the site (or characteristic sets in the request),
 * along with related meta-data.
 * The meta-data specifies all the possible values of each attribute,
 * the logic for presenting attributes to a user, and rules for
 * validating the user's selections. Individual
 * elements are not described in the eBay schema format.
 * For information about each element in the AttributeData string,
 * see the attribute model documentation in the
 * eBay Features Guide (see links below).<br>
 * <br>
 * Because this is returned as a string, the XML markup elements
 * are escaped with character entity references (e.g.,
 * &amp;lt;eBay&amp;gt;&amp;lt;Attributes&amp;gt;
 * ...).
 * See the appendices in the eBay Features Guide for general
 * information about string data types.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetAttributesCSCall extends com.ebay.sdk.ApiCall
{
  
  private String attributeSystemVersion = null;
  private int[] attributeSetIDs = null;
  private Boolean includeCategoryMappingDetails = null;
  private String returnedattributeSystemVersion=null;
  private String attributeData=null;


  static final String XmlDeclaration = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
  static final String eBay_Start = "<eBay>";
  static final String eBay_End = "</eBay>";

  private String styleXsl = "";

  /**
   * Name of the XSL Overrides node.
   */
  public static final String OverridesName = "API.XSL.Overrides";

  /**
   * Name of the XSL GlobalSettings node.
   */
  public static final String GlobalSettingsName = "GlobalSettings";

  /**
   * XPath of AttributeSet node.
   */
  public static final String SELECT_AS = "//Attributes/AttributeSet[@id=\"{0}\"]";

  /**
   * XPath of CharacteristicsSet node.
   */
  public static final String SELECT_CS = "//Characteristics/CharacteristicsSet[@id=\"{0}\"]";

  /**
   * XPath of overrides node.
   */
  public static final String SELECT_OVERRIDES = "//" + OverridesName;

  /**
   * XPath of version node.
   */
  public static final String SELECT_VERSION = "//Version";

  /**
   * XPath of GlobalSettings node.
   */
  public static final String SELECT_GLOBALSETTINGS = "//" + GlobalSettingsName;


  /**
   * Constructor.
   */
  public GetAttributesCSCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetAttributesCSCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Executing the GetAttributesCS SOAP API call.
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return java.lang.String Same as the return value of getAttributeData().
   */
  public String getAttributesCS() throws ApiException,
      SdkException, Exception
  {
    GetAttributesCSRequestType request = new GetAttributesCSRequestType();

    if( this.attributeSetIDs != null )
      request.setAttributeSetID(attributeSetIDs);

    if( this.attributeSystemVersion != null )
      request.setAttributeSystemVersion(attributeSystemVersion);

    if (this.includeCategoryMappingDetails != null)
      request.setIncludeCategoryMappingDetails(includeCategoryMappingDetails);

    GetAttributesCSResponseType resp = (GetAttributesCSResponseType)execute(request);

    returnedattributeSystemVersion = resp.getAttributeSystemVersion();

    String csXml = null;
    if( resp.getAttributeData() != null ) {
      csXml = XmlDeclaration + "\n" +
          //"<Version>" + this.returnedattributeSystemVersion + "</Version>\n" +
          resp.getAttributeData();
    }

    /*
    java.io.File fl = new java.io.File("c:/SDK/csXml.xml");
    java.io.FileWriter fw = new java.io.FileWriter(fl);
    fw.write(csXml);
    fw.close();
    */

    // Patch the response xml.
    if( csXml != null && this.styleXsl!= null) {
      String styleXslToUse;
      if (this.styleXsl == null || this.styleXsl.length() == 0 )
        styleXslToUse = getDefaultStyleXsl();
      else
        styleXslToUse = this.styleXsl;

      csXml = fixAttributesXml(csXml, styleXslToUse);
    }

    return csXml;
  }


  /**
   * Gets the GetAttributesCSRequestType.attributeSetIDs.
   * @return int[]
   */
  public int[] getAttributeSetIDs()
  {
    return this.attributeSetIDs;
  }

  /**
   * Sets the GetAttributesCSRequestType.attributeSetIDs.
   * @param attributeSetIDs int[]
   */
  public void setAttributeSetIDs(int[] attributeSetIDs)
  {
    this.attributeSetIDs = attributeSetIDs;
  }

  /**
   * Gets the GetAttributesCSRequestType.attributeSystemVersion.
   * @return String
   */
  public String getAttributeSystemVersion()
  {
    return this.attributeSystemVersion;
  }

  /**
   * Sets the GetAttributesCSRequestType.attributeSystemVersion.
   * @param attributeSystemVersion String
   */
  public void setAttributeSystemVersion(String attributeSystemVersion)
  {
    this.attributeSystemVersion = attributeSystemVersion;
  }

  /**
   * Gets the GetAttributesCSRequestType.includeCategoryMappingDetails.
   * @return Boolean
   */
  public Boolean getIncludeCategoryMappingDetails()
  {
    return this.includeCategoryMappingDetails;
  }

  /**
   * Sets the GetAttributesCSRequestType.includeCategoryMappingDetails.
   * @param includeCategoryMappingDetails Boolean
   */
  public void setIncludeCategoryMappingDetails(Boolean includeCategoryMappingDetails)
  {
    this.includeCategoryMappingDetails = includeCategoryMappingDetails;
  }
/**
   * Extract CS xml by CSId from combined CS Xml document.
   * @param allCSXml Document The CS Xml document that contains multiple CS Xml.
   * @param csId int Id of the CS that you want to get Xml for. Set to null to return xml for all CS.
   * @param copyOverrides boolean Copy Overrides node or not.
   * @param fromPath String Xpath of the node from where to copy all nodes.
   * @param outputXml Document The output Xml to copy selected nodes to. null means to
   * create a new Document object.
   * @throws TransformerException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   * @throws SdkException
   * @return Document The new generated Xml document that contains the specified CS Xml.
   */
  public static Document extractCSFromXml(Document allCSXml, int csId, boolean copyOverrides, String fromPath, Document outputXml)
      throws TransformerException, ParserConfigurationException, SAXException, IOException, SdkException
  {
      int[] csIds = null;
      if( csId != 0 ) {
        csIds = new int[] {csId};
      }
      return extractMultiCSFromXml(allCSXml, csIds, copyOverrides, fromPath, outputXml);
  }

/**
   * Extract CS xml by list of CSId from combined CS Xml document.
   * @param allCSXml Document The CS Xml document that contains multiple CS Xml.
   * @param csIds int[] List of CSIDs that you want to get Xml for. Set to null to return xml for all CS.
   * @param copyOverrides bool Copy Overrides node or not.
   * @param fromPath String Xpath of the node from where to copy all nodes.
   * @param outputXml Document The output Xml to copy selected nodes to. null means to
   * @throws TransformerException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   * @throws SdkException
   * @return Document The new generated Xml document that contains the specified CS Xml.
   */
  public static Document extractMultiCSFromXml(Document allCSXml, int[] csIds, boolean copyOverrides, String fromPath, Document outputXml)
      throws TransformerException, ParserConfigurationException, SAXException, IOException, SdkException
  {
	  Document retXml = null;
	  if( csIds == null || csIds.length == 0 ) {
		  // Ingore outputXml.
		  retXml = allCSXml;
	  } else {
		  if(outputXml == null) {
			  // Create empty doc
			  retXml = XmlUtil.createDom(XmlDeclaration + "\n" + eBay_Start + "\n" + eBay_End);
		  } else {
			  retXml = outputXml;
		  }

		  //Node node = retXml.CreateXmlDeclaration("1.0", System.Text.Encoding.Unicode.BodyName, null);
		  //retXml.AppendChild(node);

		  Node eBayNode = XmlUtil.getChildByName(retXml, "eBay");
		  Node asNode = XmlUtil.getChildByName(eBayNode, "Attributes");
		  if( asNode == null ) {
			  asNode = XmlUtil.appendChildNode(retXml, eBayNode, "Attributes");
		  }
		  Node csNode = XmlUtil.getChildByName(eBayNode, "Characteristics");
		  if( csNode == null ) {
			  csNode = XmlUtil.appendChildNode(retXml, eBayNode, "Characteristics");
		  }

		  // Copy verNode
		  Node verNode = XPathUtil.selectSingleNode(fromPath + SELECT_VERSION,
                                                allCSXml);
		  if (verNode != null) {
			  Node oldNode = XmlUtil.getChildByName(eBayNode, "Version");
			  if( oldNode == null ) {
				  eBayNode.appendChild(retXml.importNode(verNode, true));
			  }
		  }

		  Node fromNode;
		  String xp;

		  for(int i = 0; i < csIds.length; i++ ) {
			  int csId = csIds[i];

			  // Copy Attributes/AttributeSet
			  xp = MessageFormat.format(fromPath + SELECT_AS, new Object[] {String.valueOf(csId)});
			  fromNode = XPathUtil.selectSingleNode(xp, allCSXml);
			  if( fromNode == null ) {
		                  String expMsg = "extractMultiCSFromXml: Unable to find source Attributes node the given CSId: " + csId + ".\r\n";
		                  expMsg += "There is error in the attributes meta-data, please check if the category is \r\n";
		                  expMsg += "item specifics enabled(using GetCategoryFeatures) and use eBay item specifics related API instead.\r\n";
		                  expMsg += "You may also contact eBay and report the error.";
				  throw new SdkException(expMsg);
			  }
			  asNode.appendChild(retXml.importNode(fromNode, true));

			  // Copy Characteristics/CharacteristicsSet
			  xp = MessageFormat.format(fromPath + SELECT_CS, new Object[] {String.valueOf(csId)} );
			  fromNode = XPathUtil.selectSingleNode(xp, allCSXml);
			  if( fromNode == null ) {
				  throw new SdkException("extractMultiCSFromXml: Unable to find source Characteristics node the given CSId: " + csId);
			  }
			  csNode.appendChild(retXml.importNode(fromNode, true));
		  }

		  // Copy eBay//API.XSL.Overrides
		  if( copyOverrides ) {
			  fromNode = XPathUtil.selectSingleNode(fromPath + SELECT_OVERRIDES, allCSXml);
			  if( fromNode != null ) {
				  Node oldNode = XmlUtil.getChildByName(eBayNode, OverridesName);
				  if( oldNode == null ) {
					  eBayNode.appendChild(retXml.importNode(fromNode, true));
				  }
			  }

			  // Copy GlobalSettings
			  fromNode = XPathUtil.selectSingleNode(fromPath + SELECT_GLOBALSETTINGS, allCSXml);
			  if( fromNode != null ) {
				  Node oldNode = XmlUtil.getChildByName(eBayNode, GlobalSettingsName);
				  if( oldNode == null ) {
					  eBayNode.appendChild(retXml.importNode(fromNode, true));
				  }
			  }
		  }
	  }

	  return retXml;
  }

/**
   * Use style XSL to transform attributes CS Xml.
   * @param attrXmlDoc String
   * @param styleXsl String
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   * @throws TransformerConfigurationException
   * @throws TransformerException
   * @return String
   */
  public static String fixAttributesXml(String attrXmlDoc, String styleXsl)
      throws ParserConfigurationException, SAXException, IOException,
      TransformerConfigurationException, TransformerException
  {
    String fixed = null;
    try
    {
      Document srcDoc = XmlUtil.createDom(attrXmlDoc);
      Document srcXslDoc = XmlUtil.createDom(styleXsl);

      fixed = XmlUtil.xslTransform(srcDoc, srcXslDoc);
    }
    catch(Exception ex)
    {
      String t = "";
    }

    return fixed;
  }
/**
    * Get the default Style XSL.
    * @throws IOException
    * @return String
    */
   public static String getDefaultStyleXsl() throws java.io.IOException
  {
    java.io.InputStream strm = GetAttributesCSCall.class.getResourceAsStream("Attributes_Style.xsl");
    return eBayUtil.convertInputStreamToString(strm);
  }
/**
   * Gets the style XSL for patching the returned the CS Xml.
   * @return String
   */
  public String getStyleXsl() {
    return styleXsl;
  }
/**
   * The style XSL that will be used to patch the returned xml. By default
   * this property is empty string, meaning to use the default style XSL built into SDK.
   * Set to null to disable the XSL pathcing for the returned XML.
   * @param styleXsl String
   */
  public void setStyleXsl(String styleXsl) {
    this.styleXsl = styleXsl;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetAttributesCSResponseType.attributeData.
   * 
   * @return String
   */
  public String getAttributeData()
  {
    return this.attributeData;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetAttributesCSResponseType.returnedattributeSystemVersion.
   * 
   * @return String
   */
  public String getReturnedattributeSystemVersion()
  {
    return this.returnedattributeSystemVersion;
  }

}

