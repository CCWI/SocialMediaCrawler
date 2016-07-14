/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Integer;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetProductSearchPage call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>LastAttributeVersion</code> - A version of the search page definitions for the site. Typically, an
 * application passes the version value that was returned the last time the
 * application executed this call. Filter that causes the call to return only
 * the search pages for which the attribute meta-data has changed since the
 * specified version. The latest version value is not necessarily greater
 * than the previous value that was returned. Therefore, when comparing
 * versions, only compare whether the value has changed.
 * <br> <B>Input property:</B> <code>AttributeSetID</code> - A characteristic set ID that is associated with a
 * catalog-enabled category that supports product search pages.
 * You can pass an array of these IDs in the request.
 * Each characteristic set corresponds to a level in the
 * eBay category hierarchy at which all items share common characteristics.
 * Multiple categories can be mapped to the same characteristic set.
 * Each ID is used as a filter to limit the response content to fewer
 * characteristic sets. When IDs are specified, the call only returns
 * search page data for the corresponding characteristic sets.
 * When no IDs are specified, the call returns all the current
 * search page data in the system.
 * <br> <B>Output property:</B> <code>ReturnedAttributeSystemVersion</code> - Current version of the product search page data for the site.
 * This value changes each time changes are made to the search page data.
 * The current version value is not necessarily greater than the previous
 * value. Therefore, when comparing versions, only compare whether the
 * value has changed.
 * <br> <B>Output property:</B> <code>ReturnedProductSearchPages</code> - A list of catalog search criteria and sort keys associated with a catalog-enabled category,
 * plus supplemental information to help the seller understand how to make selections.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductSearchPageCall extends com.ebay.sdk.ApiCall
{
  
  private String lastAttributeVersion = null;
  private int[] attributeSetID = null;
  private String returnedAttributeSystemVersion=null;
  private ProductSearchPageType[] returnedProductSearchPages=null;


  /**
   * Constructor.
   */
  public GetProductSearchPageCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductSearchPageCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * This type is deprecated as the call is no longer available.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The ProductSearchPageType[] object.
   */
  public ProductSearchPageType[] getProductSearchPage()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductSearchPageRequestType req;
    req = new GetProductSearchPageRequestType();

    if( this.attributeSetID == null )
      throw new SdkException("AttributeSetID property is not set.");

    req.setDetailLevel(this.getDetailLevel());
    if (this.lastAttributeVersion != null)
      req.setAttributeSystemVersion(this.lastAttributeVersion);
    if (this.attributeSetID != null)
      req.setAttributeSetID(this.attributeSetID);

    GetProductSearchPageResponseType resp = (GetProductSearchPageResponseType) execute(req);

    this.returnedAttributeSystemVersion = resp.getAttributeSystemVersion();
    this.returnedProductSearchPages = resp.getProductSearchPage();
    return this.getReturnedProductSearchPages();
  }

  /**
   * Gets the GetProductSearchPageRequestType.attributeSetID.
   * @return int[]
   */
  public int[] getAttributeSetID()
  {
    return this.attributeSetID;
  }

  /**
   * Sets the GetProductSearchPageRequestType.attributeSetID.
   * @param attributeSetID int[]
   */
  public void setAttributeSetID(int[] attributeSetID)
  {
    this.attributeSetID = attributeSetID;
  }

  /**
   * Gets the GetProductSearchPageRequestType.lastAttributeVersion.
   * @return String
   */
  public String getLastAttributeVersion()
  {
    return this.lastAttributeVersion;
  }

  /**
   * Sets the GetProductSearchPageRequestType.lastAttributeVersion.
   * @param lastAttributeVersion String
   */
  public void setLastAttributeVersion(String lastAttributeVersion)
  {
    this.lastAttributeVersion = lastAttributeVersion;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductSearchPageResponseType.returnedAttributeSystemVersion.
   * 
   * @return String
   */
  public String getReturnedAttributeSystemVersion()
  {
    return this.returnedAttributeSystemVersion;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductSearchPageResponseType.returnedProductSearchPages.
   * 
   * @return ProductSearchPageType[]
   */
  public ProductSearchPageType[] getReturnedProductSearchPages()
  {
    return this.returnedProductSearchPages;
  }

}

