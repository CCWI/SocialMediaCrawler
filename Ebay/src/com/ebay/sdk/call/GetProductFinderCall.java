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
 * Wrapper class of the GetProductFinder call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>AttributeSystemVersion</code> - A version of the product finder attribute definitions for the site.
 * Typically, an application passes the version value that was returned the last
 * time the application executed this call.
 * Filter that causes the call to return only the Product Finders
 * for which the attribute meta-data has changed since the specified version.
 * The latest version value is not necessarily greater than the previous
 * value that was returned. Therefore, when comparing versions, only
 * compare whether the value has changed.
 * <br> <B>Input property:</B> <code>ProductFinderIDs</code> - A number that uniquely identifies a product finder. <br>
 * <br>
 * For sell-side searches, you can determine the
 * product finder IDs for a category by calling GetCategory2CS.<br>
 * <br>
 * For buy-side searches, you can't use GetCategory2CS to reliably determine
 * the product finder IDs for an eBay category.
 * GetProductFinder may work for some attributes. Alternatively, you can
 * use the pfid parameter from the URL of the Product Finder search page
 * on the site you're interested in.
 * See the Knowledge Base article referenced below for more details.<br>
 * <br>
 * Multiple categories can be mapped to the same product finder ID.
 * You can pass zero or multiple IDs in the request. When IDs are specified, the call
 * only returns product finder meta-data for the specified product finders.
 * When no IDs are specified, the call returns all the current product finder
 * meta-data available on the site.
 * <br> <B>Output property:</B> <code>ReturnedAttributeSystemVersion</code> - Current version of the product search page data for the site.
 * This value changes each time changes are made to the search page data.
 * The current version value is not necessarily greater than the previous
 * value. Therefore, when comparing versions, only compare whether the
 * value has changed.
 * <br> <B>Output property:</B> <code>ProductFinderData</code> - A string containing a list of search attributes that can be used in a
 * "Product Finder" style query, along with related meta-data. The meta-data
 * specifies possible values of each attribute, the logic for presenting
 * attributes to a user, and rules for validating the user's selections. For
 * backward compatibility, this data is in the same XML format that was used
 * in the Legacy XML API so that you can apply the same Product Finder XSL
 * stylesheet to it. That is, individual elements are not described using the
 * new eBay XML schema format. For information about each element in the
 * ProductFinderData string, see the product finder model documentation in
 * the eBay Features Guide (see links below).<br>
 * <br>
 * Because this is returned as a string, the XML markup is escaped with
 * character entity references (e.g., &amp;lt;eBay&amp;gt;&amp;lt;ProductFinders&amp;gt;...).
 * See the appendices in the eBay Features Guide for general information about
 * string data types.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductFinderCall extends com.ebay.sdk.ApiCall
{
  
  private String attributeSystemVersion = null;
  private int[] productFinderIDs = null;
  private String returnedAttributeSystemVersion=null;
  private String productFinderData=null;


  /**
   * Constructor.
   */
  public GetProductFinderCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductFinderCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves data that you use to construct valid "product finder" queries
   * (queries against multiple attributes) against catalog products or listed items.
   * The attributes describe search criteria (e.g., Manufacturer), as appropriate for the category.
   * Use the results in combination with GetProductFinderXSL to render the Product Finder
   * in a graphical user interface.
   * GetProductFinder does not conduct the actual product or listing search.
   * It only returns data about what you can search on. Use the data as input to
   * GetProductSearchResults to conduct the actual search for product information
   * or as input to GetSearchResults to conduct the search for listed items.
   * To retrieve single-attribute search criteria (querying against a single attribute, like UPC),
   * use GetProductSearchPage instead (only applicable for catalog searches).
   * See the eBay Web Services Guide for an overview of Pre-filled Item Information and details about
   * searching for catalog products and for information about searching for listed items.
   * 
   * <br>
   * @throws ApiException, SdkException, Exception
   * @return The String object.
   */
  public String getProductFinder()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductFinderRequestType req;
    req = new GetProductFinderRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.attributeSystemVersion != null)
      req.setAttributeSystemVersion(this.attributeSystemVersion);
    if (this.productFinderIDs != null)
      req.setProductFinderID(this.productFinderIDs);

    GetProductFinderResponseType resp = (GetProductFinderResponseType) execute(req);

    this.returnedAttributeSystemVersion = resp.getAttributeSystemVersion();
    this.productFinderData = resp.getProductFinderData();
    
    return this.productFinderData;
  }

  /**
   * Gets the GetProductFinderRequestType.attributeSystemVersion.
   * @return String
   */
  public String getAttributeSystemVersion()
  {
    return this.attributeSystemVersion;
  }

  /**
   * Sets the GetProductFinderRequestType.attributeSystemVersion.
   * @param attributeSystemVersion String
   */
  public void setAttributeSystemVersion(String attributeSystemVersion)
  {
    this.attributeSystemVersion = attributeSystemVersion;
  }

  /**
   * Gets the GetProductFinderRequestType.productFinderIDs.
   * @return int[]
   */
  public int[] getProductFinderIDs()
  {
    return this.productFinderIDs;
  }

  /**
   * Sets the GetProductFinderRequestType.productFinderIDs.
   * @param productFinderIDs int[]
   */
  public void setProductFinderIDs(int[] productFinderIDs)
  {
    this.productFinderIDs = productFinderIDs;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductFinderResponseType.productFinderData.
   * 
   * @return String
   */
  public String getProductFinderData()
  {
    return this.productFinderData;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductFinderResponseType.returnedAttributeSystemVersion.
   * 
   * @return String
   */
  public String getReturnedAttributeSystemVersion()
  {
    return this.returnedAttributeSystemVersion;
  }

}

