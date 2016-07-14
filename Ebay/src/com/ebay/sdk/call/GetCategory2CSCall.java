/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetCategory2CS call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CategoryID</code> - ID of a category for which to retrieve mappings.
 * If not specified, the call
 * retrieves a map for all categories.
 * <br> <B>Input property:</B> <code>AttributeSystemVersion</code> - A version of the mappings for the site.
 * Typically, an application passes the version value that was returned the last
 * time the application executed this call.
 * Filter that causes the call to return only the categories
 * for which the mappings have changed since the specified version.
 * If not specified, all category-to-characteristics set mappings are returned.
 * This value changes each time changes are made to the mappings.
 * The current version value is not necessarily greater than the previous
 * value. Therefore, when comparing versions, only compare whether the
 * value has changed.
 * <br> <B>Output property:</B> <code>MappedCategories</code> - Contains data about categories that are mapped to characteristics sets.
 * Use this data to determine:<br>
 * - The names and IDs of the characteristics sets<br>
 * - The availability of the Pre-filled Item Information feature for listings in that category
 * (i.e., whether the category is catalog-enabled)<br>
 * - For catalog-enabled categories, the available product search methods<br>
 * - The current version information for the complete mapping<br>
 * - The version information for each characteristics set
 * <br> <B>Output property:</B> <code>UnmappedCategories</code> - Contains data about categories (if any) whose characteristics set mappings have changed
 * since the version specified in the request. When a characteristics set mapping
 * changes, the data appears in both the UnmappedCategoryArray object
 * (to indicate that the change occurred) and the MappedCategoryArray object.
 * <br> <B>Output property:</B> <code>ReturnedAttributeSystemVersion</code> - Current version of the mappings for the site.
 * This value changes each time changes are made to the mappings.
 * The current version value is not necessarily greater than the previous
 * value. Therefore, when comparing versions, only compare whether the
 * value has changed.
 * <br> <B>Output property:</B> <code>ReturnedSiteWideCharacteristicSets</code> - A list of one or more characteristics sets mapped to the category, if any. Use this
 * information when working with Item Specifics (Attributes) and Pre-filled Item
 * Information (Catalogs) functionality.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetCategory2CSCall extends com.ebay.sdk.ApiCall
{
  
  private String categoryID = null;
  private String attributeSystemVersion = null;
  private CategoryType[] mappedCategories=null;
  private CategoryType[] unmappedCategories=null;
  private String returnedAttributeSystemVersion=null;
  private SiteWideCharacteristicsType[] returnedSiteWideCharacteristicSets=null;

  private GetCategory2CSResponseType response;

  /**
   * Constructor.
   */
  public GetCategory2CSCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetCategory2CSCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * No longer recommended in general, although this call may still be used to 
   * determine whether a category is catalog-enabled. All other features of this call 
   * are no longer functional.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The CategoryType[] object.
   */
  public CategoryType[] getCategory2CS()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetCategory2CSRequestType req;
    req = new GetCategory2CSRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.categoryID != null)
      req.setCategoryID(this.categoryID);
    if (this.attributeSystemVersion != null)
      req.setAttributeSystemVersion(this.attributeSystemVersion);

    GetCategory2CSResponseType resp = (GetCategory2CSResponseType) execute(req);

    this.mappedCategories = (resp.getMappedCategoryArray() == null? null: resp.getMappedCategoryArray().getCategory());
    this.unmappedCategories = (resp.getUnmappedCategoryArray() == null? null: resp.getUnmappedCategoryArray().getCategory());
    this.returnedAttributeSystemVersion = resp.getAttributeSystemVersion();
    this.returnedSiteWideCharacteristicSets = resp.getSiteWideCharacteristicSets();
    response =  resp;

    return this.getMappedCategories();
  }

  /**
   * Gets the GetCategory2CSRequestType.attributeSystemVersion.
   * @return String
   */
  public String getAttributeSystemVersion()
  {
    return this.attributeSystemVersion;
  }

  /**
   * Sets the GetCategory2CSRequestType.attributeSystemVersion.
   * @param attributeSystemVersion String
   */
  public void setAttributeSystemVersion(String attributeSystemVersion)
  {
    this.attributeSystemVersion = attributeSystemVersion;
  }

  /**
   * Gets the GetCategory2CSRequestType.categoryID.
   * @return String
   */
  public String getCategoryID()
  {
    return this.categoryID;
  }

  /**
   * Sets the GetCategory2CSRequestType.categoryID.
   * @param categoryID String
   */
  public void setCategoryID(String categoryID)
  {
    this.categoryID = categoryID;
  }
/**
   * Gets the GetCategory2CSResponseType.
   * @return GetCategory2CSResponseType
   */ 
  public GetCategory2CSResponseType getResponse() {
	return response;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategory2CSResponseType.mappedCategories.
   * 
   * @return CategoryType[]
   */
  public CategoryType[] getMappedCategories()
  {
    return this.mappedCategories;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategory2CSResponseType.returnedAttributeSystemVersion.
   * 
   * @return String
   */
  public String getReturnedAttributeSystemVersion()
  {
    return this.returnedAttributeSystemVersion;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategory2CSResponseType.returnedSiteWideCharacteristicSets.
   * 
   * @return SiteWideCharacteristicsType[]
   */
  public SiteWideCharacteristicsType[] getReturnedSiteWideCharacteristicSets()
  {
    return this.returnedSiteWideCharacteristicSets;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategory2CSResponseType.unmappedCategories.
   * 
   * @return CategoryType[]
   */
  public CategoryType[] getUnmappedCategories()
  {
    return this.unmappedCategories;
  }

}

