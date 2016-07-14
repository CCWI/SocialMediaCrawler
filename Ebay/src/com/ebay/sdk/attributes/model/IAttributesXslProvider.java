/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;

/**
 * Supplies attributes XSL for IAttributesMaster.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface IAttributesXslProvider  {

  /**
   * Gets the XSL text.
   * @return String
   */
  String getXslText() throws ApiException, SdkException, Exception; 
  String downloadXsl(ApiContext asn) throws ApiException, SdkException, Exception;
  String downloadXsl() throws ApiException, SdkException, Exception;
  String getXslFileName();
}
