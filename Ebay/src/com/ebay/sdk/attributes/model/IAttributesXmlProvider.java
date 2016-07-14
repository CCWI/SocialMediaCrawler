/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import org.w3c.dom.Document;

import com.ebay.sdk.SdkException;

/**
 * Supplies attributes XML for <c>IAttributesMaster</c>.
 * The implementation of IAttributeXmlProvider should handle IAttributeSet
 * objects that has valid IAttributeSet.ProductId nd return attributes with pre-filled
 * product information for them.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface IAttributesXmlProvider {

  /**
   * Get CharacteristicSet(CS) xml. Set IAttributeSet.ProductId to retrieve CSXml with
   * pre-filled product information.
   * @param csInfo AttributeSet Identification information about the CS for which
   * you want to get CSXml. You only need to set CS.CSId and, optionally, you can
   * set CS.ProductId if you want to get the CSXml that is associated with
   * specific product information.
   * <p>Set CS.CSId to 0 to get entire CharacteristicSet xml for all CSs.</p>
   * @return String The xml text of the CS.
   */
  // Document getCSXmlText(AttributeSet csInfo) throws SdkException, Exception;

	  /**
	   * Get xml that contains multiple CSs. Only set IAttributeSet.CSId
	   * and IAttributeSet.ProductId (optional). Set IAttributeSet.ProductId to retrieve CSXml with
	   * pre-filled product information.
	   * @param asList AttributeSet[] List of attribute sets for which you
	   * want to get CSXml.
	   * @return String The CS xml for specified CSs.
	   */
	  String getMultipleCSXmlText(AttributeSet[] asList) throws SdkException, Exception;

	  /**
	   * Get xml that contains multiple CSs. Only set IAttributeSet.CSId
	   * and IAttributeSet.ProductId (optional). Set IAttributeSet.ProductId to retrieve CSXml with
	   * pre-filled product information.
	   * @param asList AttributeSet[] List of attribute sets for which you
	   * want to get CSXml.
	   * @return Document The CS xml for specified CSs.
	   */
	  Document getMultipleCSXml(AttributeSet[] asList) throws SdkException, Exception;

  /**
   * Downloads AttributesCS for specified categories through eBay SOAP API.
   * @param attrSetIds int[] List of attribute setid for which you want to get CSXml
   * @throws SdkException
   * @throws Exception
   * @return Document for specified attr set ids
   */
  Document downloadXml(int[] attrSetIds) throws SdkException, Exception;
  
  /**
   * Downloads AttributesCS for specified categories through eBay SOAP API.
   * @param attrSets AttributeSet[] List of attribute sets for which you want to get CSXml
   * @throws SdkException
   * @throws Exception
   * @return Document for specified attribute sets 
   */
  Document downloadXml(AttributeSet[] attrSets) throws SdkException, Exception;

  /**
   * Downloads AttributesCS for all categories through eBay SOAP API.
   * @throws SdkException
   * @throws Exception
   * @return Document for all categories
   */
  Document downloadXml() throws SdkException, Exception;

}
