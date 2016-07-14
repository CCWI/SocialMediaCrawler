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
 *
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface IProductFinderXmlProvider {

  /**
   * Get product finder XML by list of product finder IDs.
   * @param productFinderIDList int[] List of product finder IDs.
   * @return Document
   */
  Document getProductFinderXml(int[] productFinderIDList)
      throws SdkException, Exception;
}
