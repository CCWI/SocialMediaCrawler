/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.Attribute;
import com.ebay.sdk.attributes.model.AttributeSet;
import com.ebay.sdk.attributes.model.AttributeTypes;
import com.ebay.sdk.attributes.model.Error;
import com.ebay.sdk.attributes.model.ErrorSet;
import com.ebay.sdk.attributes.model.IAttributesMaster;
import com.ebay.sdk.attributes.model.IAttributesXmlProvider;
import com.ebay.sdk.attributes.model.IAttributesXslProvider;
import com.ebay.sdk.attributes.model.ICategoryCSProvider;
import com.ebay.sdk.attributes.model.ValidationResult;
import com.ebay.sdk.attributes.model.Value;
import com.ebay.sdk.attributes.model.ValueIds;
import com.ebay.sdk.util.XPathUtil;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.soap.eBLBaseComponents.AttributeType;
import com.ebay.soap.eBLBaseComponents.SiteWideCharacteristicsType;

/**
 * The core implementation of interface IAttributesMaster.
 * <br><br>
 * <a href="{@docRoot}/images/AttributesMaster.jpg">View UML diagram of the class.</a>
 * <br>
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004-2008</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
*  @author Vladimir Fishman
 * @version 1.0
 */
public class AttributesMaster implements IAttributesMaster {
	private static final Logger logger = Logger.getLogger(AttributesMaster.class);
  private static final String CAT_CS_ID = "cat_cs_id";
  private static final String ATTRIBUTE_SET = "AttributeSet";
  private static final String ID = "id";
  private static final String ATTRIBUTE = "Attribute";
  private static final String VALUE = "Value";
  private static final String NAME = "Name";
  private static final String SELECTED_ATTRIBUTES = "SelectedAttributes";
  private static final String RETURN_POLICY = "Return Policy";
  private static final String RETURN_POLICY_PAGE_ID = "ReturnPolicy";
  private static final String PAGE_ID = "pageId";

  private Document xslDoc = null;
  private IAttributesXslProvider attrXslProvider;
  private IAttributesXmlProvider attrXmlProvider;
  private ICategoryCSProvider categoryCSProvider;

  /**
   * Constructor.
   */
  public AttributesMaster() {
  }

  /**
   * Sets the IAttributesXslProvider object.
   * @return IAttributesXslProvider
   */
  public IAttributesXslProvider getXslProvider() {
    return this.attrXslProvider;
  }

  /**
   * Gets the IAttributesXslProvider object.
   * @param attrXslProvider IAttributesXslProvider
   */
  public void setXslProvider(IAttributesXslProvider attrXslProvider) throws Exception {
    this.attrXslProvider = attrXslProvider;

    String xslText = attrXslProvider.getXslText();
    if(xslText != null && xslText.length() > 0) {
      xslDoc = XmlUtil.createDom(xslText);
    } else {
      xslDoc = null;
    }
  }

  /**
   * Sets the IAttributesXmlProvider object.
   * @return IAttributesXmlProvider
   */
  public IAttributesXmlProvider getXmlProvider() {
    return attrXmlProvider;
  }

  /**
   * Gets the IAttributesXmlProvider object.
   * @param attrXmlProvider IAttributesXmlProvider
   */
  public void setXmlProvider(IAttributesXmlProvider attrXmlProvider) {
    this.attrXmlProvider = attrXmlProvider;
  }

  /**
   * Sets the ICategoryCSProvider object.
   * @return ICategoryCSProvider
   */
  public ICategoryCSProvider getCategoryCSProvider() {
    return this.categoryCSProvider;
  }

  /**
   * Gets the ICategoryCSProvider object.
   * @param categoryCSProvider ICategoryCSProvider
   */
  public void setCategoryCSProvider(ICategoryCSProvider categoryCSProvider) {
    this.categoryCSProvider = categoryCSProvider;
  }

  private AttributeSet extractOneCat(String catCsName, Map request) {
    AttributeSet attrSet = null;

    Object obj = request.get(catCsName);
    if (obj != null) {
      String cat_cs = ((String[])obj)[0];

      String[] delim = cat_cs.split("_");
      int catId = Integer.parseInt(delim[0]);
      int csId = Integer.parseInt(delim[1]);
      //int csId = this.mCategoryCSProvider.GetVCSId(catId);

      String prodId = null;
      if( delim.length > 2 )
        prodId= delim[2];

      if (csId != 0) {
        attrSet = AttrParamParser.parse(csId, request);
        attrSet.setCategoryID(catId);
        attrSet.setAttributeSetID(csId);

        if( prodId != null ) {
          attrSet.setProductID(prodId);
        }
      }
    }

    return attrSet;
  }

  static AttributeSet[] attributeSetToArrayList(ArrayList al) {
    AttributeSet[] sets = new AttributeSet[al.size()];
    for(int i = 0; i < al.size(); i++ ) {
      sets[i] = (AttributeSet)al.get(i);
    }
    return sets;
  }

  /**
   * Parse name value pair list to extract AttributeSet objects. This method is
   * typically used to parse the query string returned from form POST or GET.
   * @param nameValues java.util.Map The parameters map got from query string or post.
   * @return AttributeSet[]
   */
  public AttributeSet[] nameValuesToAttributeSets(Map nameValues) throws SdkException, Exception {
    ArrayList attrSets = new ArrayList();
    AttributeSet attrSet;

    for (int ordinal = 0; ; ordinal++) {
      String ordStr = String.valueOf(ordinal); 
      attrSet = extractOneCat(CAT_CS_ID + ordStr, nameValues);
      if (attrSet != null) {
        attrSet.setCategoryOrdinal(attrSets.size());
        attrSets.add(attrSet);
      } else {
        break;
      }
    }

    return attributeSetToArrayList(attrSets);
  }

  /**
   * Returns an array of item specific AttributeSet objects for an array category Ids.
   * Each element of the array contains a VCS Id, if it exists for a given category Id.
   * 
   * @param catIds int[]
   * @return AttributeSet[]
   */
  public AttributeSet[] getItemSpecificAttributeSetsForCategories(int[] catIds) throws SdkException, Exception {
    AttributeSet[] sets = new AttributeSet[catIds.length];
    for (int i = 0; i < catIds.length; i++) {
      int catId = catIds[i];
      AttributeSet ast = new AttributeSet();
      int csId = categoryCSProvider.getVCSId(catId);
      if (csId == 0) {
    	return null;
        //throw new SdkException("Unable to get CSID by category Id");
      }
      ast.setAttributeSetID(csId);
      ast.setCategoryID(catId);
      ast.setCategoryOrdinal(i);

      sets[i] = ast;
    }

    return sets;
  }

  /**
   * Creates an array of AttributeSet objects which contains item specific attribute sets and
   * site wide attribute sets with the exception of the attribute set for return policy.
   * 
   * @param itemSpecAttrSets AttributeSet[]
   * @param swAttrSets AttributeSet[]
   * @return AttributeSet[]
   * @see getItemSpecificAttributeSetsForCategories()
   * @see getSiteWideAttributeSetsForCategories()
   */
  public AttributeSet[] joinItemSpecificAndSiteWideAttributeSets(AttributeSet[] itemSpecAttrSets, AttributeSet[] swAttrSets) throws Exception {
	  if(swAttrSets == null || swAttrSets.length == 0) {
		  if(itemSpecAttrSets == null || itemSpecAttrSets.length == 0) {
			  return null;
		  } else {
			  return itemSpecAttrSets;
		  }
	  }
	  
	  // Exclude Return Policy:
	  AttributeSet[] swAttrNoRetPolicySets = excludeReturnPolicyFromSiteWideAttributes(swAttrSets);
	  if(swAttrNoRetPolicySets == null || swAttrNoRetPolicySets.length == 0) {
		  return itemSpecAttrSets;
	  }

	  // Append Site Wide attributes to the Site Specific attributes:
	  int itemSpecAttrSetsLength = (itemSpecAttrSets == null)?0:itemSpecAttrSets.length;
	  AttributeSet[] joinedAttrSet = new AttributeSet[itemSpecAttrSetsLength + swAttrNoRetPolicySets.length];
	  for(int i = 0; i < itemSpecAttrSetsLength; i++) {
		  joinedAttrSet[i] = itemSpecAttrSets[i];
	  }
	  for(int i = 0; i < swAttrNoRetPolicySets.length; i++) {
		  joinedAttrSet[itemSpecAttrSetsLength + i] = swAttrNoRetPolicySets[i];
	  }
	  
	  return joinedAttrSet;
   }
  
  /*
   * Excludes Return Policy attribute set from SW attributes and returns the resulting array.
   */
  private AttributeSet[] excludeReturnPolicyFromSiteWideAttributes(AttributeSet[] siteWideAttributeSet) throws Exception {
	  if(siteWideAttributeSet == null) {
		  return null;
	  }
	  AttributeSet retPolicyAttrSet = getReturnPolicyAttributeSet(siteWideAttributeSet);
	  if(retPolicyAttrSet == null) {
		  return siteWideAttributeSet;
	  }
	  int retPolicyAttrId = retPolicyAttrSet.getAttributeSetID();
	  List attrList = new ArrayList();
	  for(int i = 0; i < siteWideAttributeSet.length; i++) {
		  if(siteWideAttributeSet[i].getAttributeSetID() == retPolicyAttrId) {
			  continue;
		  } else {
			  attrList.add(siteWideAttributeSet[i]);
		  }
	  }
	  AttributeSet[] attrSet = new AttributeSet[attrList.size()];
	  for(int i = 0; i < attrSet.length; i++) {
		  attrSet[i] = (AttributeSet)attrList.get(i);
	  }
	  
	  return attrSet;
  }
  
  /**
   * Returns an array of Site Wide AttributeSet objects for an array category Ids.
   * Each element of the array contains a VCS Id, if it exists for a given category Id.
   * 
   * @param catIds int[]
   * @return AttributeSet[]
   */
  public AttributeSet[] getSiteWideAttributeSetsForCategories(int[] catIds) throws SdkException, Exception {
	  ArrayList attrSetsList = new ArrayList();
	  for (int i = 0; i < catIds.length; i++) {
		  SiteWideCharacteristicsType[] swAttrSets = categoryCSProvider.getSiteWideCharacteristics(String.valueOf(catIds[i]));
		  if(swAttrSets != null) {
			  for(int j = 0; j < swAttrSets.length; j++) {
				  SiteWideCharacteristicsType swAttrSet = swAttrSets[j];
				  AttributeSet swAst = new AttributeSet();
				  swAst.setAttributeSetID(swAttrSet.getCharacteristicsSet().getAttributeSetID().intValue());
				  swAst.setCategoryID(catIds[i]);
				  swAst.setCategoryOrdinal(i);
				  swAst.setName(swAttrSet.getCharacteristicsSet().getName());
				  attrSetsList.add(swAst);
			  }
		  }
	  }
	  AttributeSet[] retVal = new AttributeSet[attrSetsList.size()];
	  for(int i = 0; i < attrSetsList.size(); i++) {
		  retVal[i] = (AttributeSet)attrSetsList.get(i);
	  }
	  return retVal;
  }

  private static Node addErrorElements(Document doc, Node eBayNode, ErrorSet[] errList) {
    Node errors = XmlUtil.appendChildNode(doc, eBayNode, "Errors");
    for(int i = 0; i < errList.length; i++ ) {
      Node err = errList[i].toXml(doc);
      errors.appendChild(err);
    }

    return errors;
  }

  static void addHiddenInputTag(StringBuffer sb, String name, String val) {
      String str = "<input type=\"hidden\" name=\"" + name + "\" value=\"" + val + "\"/>";
      sb.append(str);
  }
  
  /**
   * Render HTML text by specifying list of AttributeSet and xsl Document
   * @param attrSets AttributeSet[] List of AttributeSet objects.
   * @param xslDoc Document
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  public synchronized String renderHtml(AttributeSet[] attrSets, Document xslDoc, ErrorSet[] errorList) throws SdkException, Exception {
	  this.xslDoc = xslDoc;
	  return renderHtml(attrSets, errorList);
  }
 
  /**
   * Extracts AttributeSet object for Return Policy from site wide attribute sets
   * @param siteWideAttrSets AttributeSet[] array of site wide AttributeSet objects.
   * @return AttributeSet for Return Policy
   * @see getSiteWideAttributeSetsForCategories()
   */
  public AttributeSet getReturnPolicyAttributeSet(AttributeSet[] siteWideAttrSets) throws SdkException, Exception {
	  AttributeSet retVal = null;
	    for(int i = 0; i < siteWideAttrSets.length; i++ ) {
	        AttributeSet attrSet = siteWideAttrSets[i];
	    	if(attrSet.getName().equals(RETURN_POLICY)) {
	    		retVal = attrSet;
	    	    break;
	    	}
	    }	
	    
	    return retVal;
  }
  
  /**
   * Render HTML text by specifying list of AttributeSet.
   * @param attrSets AttributeSet[] List of AttributeSet objects.
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  public synchronized String renderHtml(AttributeSet[] attrSets, ErrorSet[] errorList) throws SdkException, Exception {
    StringBuffer sb = new StringBuffer();
    logger.info("Render html called...");
    if(attrSets == null || attrSets.length == 0) {
    	return "";
    }
    // Add identification information for parsing.
    for(int i = 0; i < attrSets.length; i++ ) {
      AttributeSet attrSet = attrSets[i];
      if(attrSet == null) {
    	  return "";
      }
      String productID = attrSet.getProductID();
      if( productID == null ) {
        productID = "";
      }
      logger.info(attrSet);
      addHiddenInputTag(sb, 
    		  			CAT_CS_ID + String.valueOf(i), 
    		  			String.valueOf(attrSet.getCategoryID()) + 
    		  			"_" + String.valueOf(attrSet.getAttributeSetID()) + 
    		  			"_" + productID);
    }
    
    Document xmlDoc = attrXmlProvider.getMultipleCSXml(attrSets);
    if(xmlDoc == null) {
    	return sb.toString();
    }

    // Add SelectedAttributes node.
    Node eBayNode = XPathUtil.selectSingleNode("//eBay", xmlDoc);
    Element selectedAttributes = xmlDoc.createElement(SELECTED_ATTRIBUTES);
    eBayNode.appendChild(selectedAttributes);
    for(int i = 0; i < attrSets.length; i++ ) {
      AttributeSet attrSet = attrSets[i];
      String attrSetName = attrSet.getName();
      if(attrSetName != null && attrSetName.equals(RETURN_POLICY)) {
		    XmlUtil.appendAttributeNode(selectedAttributes, PAGE_ID, RETURN_POLICY_PAGE_ID);
      }
      Node node = getSelectedAttributesXml(xmlDoc, attrSet);
      selectedAttributes.appendChild(node);
    }

    // Add error node.
    Node errNode = null;
    if( errorList != null && errorList.length != 0 ) {
      errNode = addErrorElements(xmlDoc, eBayNode, errorList);
    }
    
    // Generate html text.
    String table = XmlUtil.xslTransform(xmlDoc, xslDoc);
    sb.append(table);
    
	// Cleanup.
	if( errNode != null ) {
		eBayNode.removeChild(errNode);
	}
	eBayNode.removeChild(selectedAttributes);

 
    return sb.toString();
  }

  /**
   * Render HTML text by raw name-value pairs that you got during HTML submit.
   * @param nameValues java.util.Map List of name-value pairs from submit of
   * attributes HTML form generated by all these RenderHtml methods.
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  public synchronized String renderHtmlForPostback(Map nameValues, ErrorSet[] errorList)
      throws SdkException, Exception
  {
    AttributeSet[] attrSets = nameValuesToAttributeSets(nameValues);
    return renderHtml(attrSets, errorList);
  }

  private static void addDateToValueNode(Node valNode, String date) throws Exception {
    String year = "", month = "", day = "";

    try {
      year = date.substring(0, 4);
      month = date.substring(4, 4 + 2);
      day = date.substring(6, 6 + 2);
    } catch(Exception ex) {
      throw ex;
    }

    Document doc = valNode.getOwnerDocument();
    XmlUtil.appendChildNode(doc, valNode, "Year", year);
    XmlUtil.appendChildNode(doc, valNode, "Month", month);
    XmlUtil.appendChildNode(doc, valNode, "Day", day);
  }

  private void checkSingleValueListItem(Attribute attr) throws SdkException {
    if( attr.getValue().length != 1 ) {
            throw new SdkException("Invalid IAttribute object. One one value in ValueList is expected.");
    }
  }

  private Node getSelectedAttributesXml(Document doc, AttributeSet attrSet) throws Exception {
    Element attrSetNode = doc.createElement(ATTRIBUTE_SET);
    XmlUtil.appendAttributeNode(attrSetNode, ID, String.valueOf(attrSet.getAttributeSetID()));
    //XmlUtil.AddAttributeNode(doc, attrSetNode, ID, attrSet.CSId.ToString());

    AttributeType[] attrs = attrSet.getAttribute();
    if( attrs != null ) {
      for (int i = 0; i < attrs.length; i++) {
        int n;
        Attribute attr = (Attribute) attrSet.getAttribute(i);

        Element attrNode = XmlUtil.appendChildNode(doc, attrSetNode, ATTRIBUTE);
        XmlUtil.appendAttributeNode(attrNode, ID, attr.getAttributeID());

        Element valueElement;
        Value val;
        if (attr.getType() == AttributeTypes.ATTR_ID) {
          checkSingleValueListItem(attr);
          val = (Value) attr.getValue(0);

          valueElement = XmlUtil.appendChildNode(doc, attrNode, VALUE);
          XmlUtil.appendAttributeNode(valueElement, ID, val.getValueID().intValue());

          if (val.getValueID().intValue() == (int) ValueIds.OTHER && val.getValueLiteral() != null) {
            // Add one more Attribute node with the same id.
            Element attrOther = XmlUtil.appendChildNode(doc, attrSetNode,
                ATTRIBUTE);
            XmlUtil.appendAttributeNode(attrOther, ID, attr.getAttributeID());

            Node v_e = XmlUtil.appendChildNode(doc, attrOther, VALUE);
            XmlUtil.appendChildNode(doc, v_e, NAME, val.getValueLiteral());
          }
        } else if (attr.getType() == AttributeTypes.ATTR_IDS) {
          for (n = 0; n < attr.getValue().length; n++) {
            Value v_s = (Value) attr.getValue(n);
            valueElement = XmlUtil.appendChildNode(doc, attrNode, VALUE);
            XmlUtil.appendAttributeNode(valueElement, ID, v_s.getValueID().intValue());
          }
        } else if (attr.getType() == AttributeTypes.ATTR_TEXT) {
          checkSingleValueListItem(attr);
          val = (Value) attr.getValue(0);

          valueElement = XmlUtil.appendChildNode(doc, attrNode, VALUE);
          XmlUtil.appendChildNode(doc, valueElement, NAME, val.getValueLiteral());

          /*
                   if( val.ValueId == (int)ValueIds.OTHER )
                   {
                  // Add another attribute node with the same attribute Id
           Node attrOther = XmlUtil.AddChild(doc, attrSetNode, ATTRIBUTE);
           XmlUtil.AddAttributeNode(doc, attrOther, ID, attr.AttributeId.ToString());

                  valueElement = XmlUtil.AddChild(doc, attrOther, VALUE);
           XmlUtil.AddAttributeNode(doc, valueElement, ID, val.ValueId.ToString());
                   }
           */
        } else if (attr.getType() == AttributeTypes.ATTR_TEXT_DATE) {
          checkSingleValueListItem(attr);
          val = (Value) attr.getValue(0);

          valueElement = XmlUtil.appendChildNode(doc, attrNode, VALUE);
          XmlUtil.appendAttributeNode(valueElement, ID, val.getValueID().intValue());

          addDateToValueNode(valueElement, val.getValueLiteral());
        } else {
          // Unsupported attribute type.
          for (n = 0; n < attr.getValue().length; n++) {
          //foreach(IValue v_o in attr.ValueList )
            Value v_o = (Value) attr.getValue(n);
            valueElement = XmlUtil.appendChildNode(doc, attrNode, VALUE);
            XmlUtil.appendChildNode(doc, valueElement, NAME, v_o.getValueLiteral());
            if (v_o.getValueID() != null && v_o.getValueID().intValue() != 0) {
              XmlUtil.appendAttributeNode(valueElement, ID, v_o.getValueID().toString());
            }
          }
        }
      }
    }

    return attrSetNode;
  }

  /**
   * Validate list of AttributeSet objects against eBay Attributes rules.
   * Returns zero size array means the validation succeeded.
   * Otherwise means failure and you have to call the above RenderHtml... methods
   * and pass in the ErrorSet list to re-generate Attributes HTML text that
   * contains all the error messages.
   * @param attrSets AttributeSet[] The list of AttributeSet object which you want to validate.
   * @return ErrorSet[] Returns zero-size array means the validation succeeded.
   * Otherwise the list of the ErrorSet objects.
   */
  public ErrorSet[] validate(AttributeSet[] attrSets) throws SdkException, Exception {
    int i;
    ArrayList<ErrorSet> errList = new ArrayList<ErrorSet>();

    for(i = 0; i < attrSets.length; i++ ) {
      AttributeSet attrSet = attrSets[i];
      ErrorSet errSet = validateOneSet(attrSet);
      if (errSet != null) {
        errList.add(errSet);
      }
    }

    ErrorSet es[] = new ErrorSet[errList.size()];
    for(i = 0; i < errList.size(); i++ ) {
      es[i] = (ErrorSet)errList.get(i);
    }
    return es;
  }

  private String getRuleSelectString(int csId, int aId) {
    String s = "//eBay/Characteristics/CharacteristicsSet";
    String select = s + "[@id='" + csId + "']";
    select += "/CharacteristicsList/Initial/Attribute";
    select += "[@id='" + aId + "']";
    select += "/ValidationRules/Rule";
    return select;
  }

  private ErrorSet validateOneSet(AttributeSet attrSet) throws SAXException, IOException,
      ParserConfigurationException, SdkException, Exception
  {
    ErrorSet errSet = null;

    AttributeType[] attrs = attrSet.getAttribute();
    if(attrs == null) {
    	return errSet;
    }
    Document xml = attrXmlProvider.getMultipleCSXml(new AttributeSet[]{attrSet});

    for(int i = 0; i < attrs.length; i++ ) {
      Attribute attr = (Attribute)attrSet.getAttribute(i);
      String select = getRuleSelectString(attrSet.getAttributeSetID(), attr.getAttributeID());
      NodeList rules = XPathUtil.selectNodes(select, xml);

      int rCnt = rules.getLength();
      for (int r = 0; r < rCnt; r++) {
        Error err = validateAttr(attr, rules.item(r));
        if (err != null) {
          if (errSet == null)
            errSet = new ErrorSet(attrSet.getAttributeSetID());

          errSet.addError(err);
        }
      }
    }

    return errSet;
  }

  private Error validateAttr(Attribute attr, Node rule) {
    ValidationRule v = null;
    ValidationResult result = null;

    try {
      v = new ValidationRule(rule);
      Object [] vParams = ValidationParams.getValidationParams(attr, v);
      result = (ValidationResult)SimpleValidator.validate(v.name, vParams);
    } catch(Exception ex) {
      result = new ValidationResult();
      result.setSuccess(false);
      result.setErrorMessage(ex.getClass().getName() + ": " + ex.getMessage());
    }

    if (!result.getSuccess()) {
      Error err = new Error();
      err.setAttributeID(attr.getAttributeID());
      err.setRuleName(v.name);
      err.setMessage(result.getErrorMessage()); //SimpleValidator.getErrorMessage(v.name);
      return err;
    }

    return null;
  }
  
}
