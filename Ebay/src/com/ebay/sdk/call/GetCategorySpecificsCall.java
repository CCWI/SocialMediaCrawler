/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetCategorySpecifics call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CategoryID</code> - An eBay category ID. This call retrieves recommended
 * Item Specifics (if any) for each category you specify.
 * To determine which categories support listing with custom
 * Item Specifics, use GetCategoryFeatures.
 * <br><br>
 * <span class="tablenote"><b>Note:</b>
 * This call may return recommendations for categories that don't
 * support listing with custom Item Specifics. That is, the
 * presence of recommendations for a category does not necessarily
 * mean that AddItem supports custom Item Specifics for that
 * category and site.
 * </span>
 * <br><br>
 * The request requires either CategoryID, CategorySpecifics.CategoryID, or
 * CategorySpecificsFileInfo (or the call returns an error). CategoryID and
 * CategorySpecific.CategoryID can both be used in the same request.
 * (CategorySpecific offers more options to control the response.)
 * Some input fields, such as IncludeConfidence, only work when 
 * CategoryID or CategorySpecifics.CategoryID is specified.
 * <br><br>
 * You can specify multiple categories, but more categories can result in
 * longer response times. If your request times out, specify fewer IDs. If you
 * specify the same ID twice, we use the first instance.
 * <br> <B>Input property:</B> <code>LastUpdateTime</code> - Causes the recommendation engine to check whether the list of
 * popular Item Specifics for each specified category has changed
 * since this date and time. If specified, this call returns no
 * Item Specifics; it only returns whether the data has changed
 * for any of the requested categories.<br>
 * <br>
 * Typically, you pass in the Timestamp that was
 * returned the last time you refreshed the list of names and values
 * for the same categories. If the Updated flag returns true for any
 * categories in the response, call GetCategorySpecifics again
 * for those categories to get the latest names and values.
 * (As downloading all the data may affect your application's
 * performance, it may help to only download Item Specifics
 * for a category if they have changed since you last checked.)
 * <br> <B>Input property:</B> <code>MaxNames</code> - Maximum number of Item Specifics to return
 * per category (where each Item Specific is identified
 * by a unique name within the category).
 * Use this to retrieve fewer results per category.
 * For example, if you only want up to 2 per category
 * (the top 2 most popular names), specify 2.
 * <br> <B>Input property:</B> <code>MaxValuesPerName</code> - Maximum number of values to retrieve per item specific. 
 * The best practice for using this field depends on your use case.
 * For example, if you want all possible values (such as all brands 
 * and sizes in a clothing category), then specify a very large 
 * number. (This is recommended in most cases.) If you only want the most popular value (like the most popular color), then specify a small number.
 * <br> <B>Input property:</B> <code>Name</code> - The name of one Item Specific name to find values for.
 * Use this if you want to find out whether a name
 * that the seller provided has recommended values.
 * If you specify multiple categories in the request,
 * the recommendation engine returns all matching
 * names and values it finds for each of those categories.
 * At the time of this writing, this value is case-sensitive.
 * (Wildcards are not supported.)<br>
 * <br>
 * Name and CategorySpecific.ItemSpecific can be used in the
 * request. (If you plan to only use one or the other in your application,
 * you should use ItemSpecific, as it may offer more options in the future.)
 * <br> <B>Input property:</B> <code>CategorySpecific</code> - Applicable with request version 609 and higher. (This
 * does not retrieve data at all if your request version is lower
 * than 609.)
 * Contains a category for which you want recommended
 * Item Specifics, and (optionally) names and values to help
 * you refine the recommendations.
 * You can specify multiple categories (but more categories
 * can result in longer response times). If you specify the same
 * category twice, we use the first instance.<br>
 * <br>
 * Depending on how many recommendations are found, your request
 * may time out if you specify too many categories.
 * (Typically, you can download recommendations for about 275
 * categories at a time.)<br>
 * <br>
 * CategoryID and CategorySpecific.CategoryID can be used
 * in the request. (If you plan to only use one or the other in
 * your application, you should use CategorySpecific,
 * as it may offer more options in the future.)
 * <br> <B>Input property:</B> <code>ExcludeRelationships</code> - If true, the Relationship node is not returned for any
 * recommendations. Relationship recommendations tell you whether
 * an Item Specific value has a logical dependency another
 * Item Specific.<br>
 * <br>
 * For example, in a clothing category, Size Type could be
 * recommended as a parent of Size, because Size=Small would
 * mean something different to buyers depending on whether
 * Size Type=Petite or Size Type=Plus.<br>
 * <br>
 * In general, it is a good idea to retrieve and use relationship
 * recommendations, as this data can help buyers find the items
 * they want more easily.
 * <br> <B>Input property:</B> <code>IncludeConfidence</code> - If true, returns eBay's level of confidence in the popularity of
 * each name and value for the specified category. 
 * Some sellers may find this useful when
 * choosing whether to use eBay's recommendation or their own
 * name or value.<br>
 * <br>
 * Requires CategoryID to also be passed in.<br>
 * <br>
 * If you try to use this with CategorySpecificsFileInfo 
 * but without	CategoryID, the request fails and no 
 * TaskReferenceID or FileReferenceID is returned.
 * <br> <B>Input property:</B> <code>CategorySpecificsFileInfo</code> - If true, the response includes FileReferenceID and
 * TaskReferenceID. Use these IDs as inputs to the downloadFile
 * call in the eBay File Transfer API. That API lets you retrieve
 * a single (bulk) GetCategorySpecifics response with all the Item
 * Specifics recommendations available for the requested site ID.
 * (The downloadFile call downloads a .zip file as an
 * attachment.)<br>
 * <br>
 * Either CategorySpecificsFileInfo or a CategoryID is required
 * (or you can specify both). <br>
 * <br>
 * <span class="tablenote"><b>Note:</b>
 * You can use the File Transfer API without using or learning
 * about the Bulk Data Exchange API or other
 * Large Merchant Services APIs.
 * </span>
 * <br>
 * <br> <B>Output property:</B> <code>ReturnedRecommendations</code> - Contains the most popular Item Specifics, if any, for a category
 * specified in the request, or contains information about whether
 * the recommendations have changed for that category since
 * the LastUpdateTime you requested. <br>
 * <br>
 * The most relevant Item Specifics (as determined by eBay) 
 * are returned first. In many cases, the values are returned in 
 * alphabetical order.<br>
 * <br>
 * This node returns empty (or it's not returned) for a category if
 * there is no applicable data (such as when you request a parent category, a category that has no popular Item Specifics yet,
 * or a duplicate category that was already returned).
 * If you pass in the CategoryID and Name fields together, but no
 * matching values are found for the name, eBay returns the name
 * with no values (even if the name is not recommended).<br>
 * <br>
 * If GetCategoryFeatures indicates that custom Item Specifics are
 * enabled for a category, but GetCategorySpecifics doesn't
 * return any recommendations for that category, the seller can still
 * specify their own custom Item Specifics in that category.
 * <br> <B>Output property:</B> <code>ReturnedTaskReferenceID</code> - Use TaskReferenceID and FileReferenceID as inputs to the
 * downloadFile call in the eBay File Transfer API. That API lets
 * you retrieve a single (bulk) GetCategorySpecifics response with
 * all the Item Specifics recommendations available for the
 * requested site ID. (The downloadFile call downloads a .zip file
 * as an attachment.)<br>
 * <br>
 * Only returned when CategorySpecificsFileInfo is passed in the
 * request.
 * <br> <B>Output property:</B> <code>ReturnedFileReferenceID</code> - Use TaskReferenceID and FileReferenceID as inputs to the
 * downloadFile call in the eBay File Transfer API. That API lets
 * you retrieve a single (bulk) GetCategorySpecifics response with
 * all the Item Specifics recommendations available for the
 * requested site ID. (The downloadFile call downloads a .zip file
 * as an attachment.)<br>
 * <br>
 * Only returned when CategorySpecificsFileInfo is passed in the
 * request.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetCategorySpecificsCall extends com.ebay.sdk.ApiCall
{
  
  private String[] categoryID = null;
  private Calendar lastUpdateTime = null;
  private Integer maxNames = null;
  private Integer maxValuesPerName = null;
  private String name = null;
  private CategoryItemSpecificsType[] categorySpecific = null;
  private Boolean excludeRelationships = null;
  private Boolean includeConfidence = null;
  private Boolean categorySpecificsFileInfo = null;
  private RecommendationsType[] returnedRecommendations=null;
  private String returnedTaskReferenceID=null;
  private String returnedFileReferenceID=null;


  /**
   * Constructor.
   */
  public GetCategorySpecificsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetCategorySpecificsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Returns the most popular custom Item Specific names and values for each
   * category you request.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The RecommendationsType[] object.
   */
  public RecommendationsType[] getCategorySpecifics()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetCategorySpecificsRequestType req;
    req = new GetCategorySpecificsRequestType();
    if (this.categoryID != null)
      req.setCategoryID(this.categoryID);
    if (this.lastUpdateTime != null)
      req.setLastUpdateTime(this.lastUpdateTime);
    if (this.maxNames != null)
      req.setMaxNames(this.maxNames);
    if (this.maxValuesPerName != null)
      req.setMaxValuesPerName(this.maxValuesPerName);
    if (this.name != null)
      req.setName(this.name);
    if (this.categorySpecific != null)
      req.setCategorySpecific(this.categorySpecific);
    if (this.excludeRelationships != null)
      req.setExcludeRelationships(this.excludeRelationships);
    if (this.includeConfidence != null)
      req.setIncludeConfidence(this.includeConfidence);
    if (this.categorySpecificsFileInfo != null)
      req.setCategorySpecificsFileInfo(this.categorySpecificsFileInfo);

    GetCategorySpecificsResponseType resp = (GetCategorySpecificsResponseType) execute(req);

    this.returnedRecommendations = resp.getRecommendations();
    this.returnedTaskReferenceID = resp.getTaskReferenceID();
    this.returnedFileReferenceID = resp.getFileReferenceID();
    return this.getReturnedRecommendations();
  }

  /**
   * Gets the GetCategorySpecificsRequestType.categoryID.
   * @return String[]
   */
  public String[] getCategoryID()
  {
    return this.categoryID;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.categoryID.
   * @param categoryID String[]
   */
  public void setCategoryID(String[] categoryID)
  {
    this.categoryID = categoryID;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.categorySpecific.
   * @return CategoryItemSpecificsType[]
   */
  public CategoryItemSpecificsType[] getCategorySpecific()
  {
    return this.categorySpecific;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.categorySpecific.
   * @param categorySpecific CategoryItemSpecificsType[]
   */
  public void setCategorySpecific(CategoryItemSpecificsType[] categorySpecific)
  {
    this.categorySpecific = categorySpecific;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.categorySpecificsFileInfo.
   * @return Boolean
   */
  public Boolean getCategorySpecificsFileInfo()
  {
    return this.categorySpecificsFileInfo;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.categorySpecificsFileInfo.
   * @param categorySpecificsFileInfo Boolean
   */
  public void setCategorySpecificsFileInfo(Boolean categorySpecificsFileInfo)
  {
    this.categorySpecificsFileInfo = categorySpecificsFileInfo;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.excludeRelationships.
   * @return Boolean
   */
  public Boolean getExcludeRelationships()
  {
    return this.excludeRelationships;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.excludeRelationships.
   * @param excludeRelationships Boolean
   */
  public void setExcludeRelationships(Boolean excludeRelationships)
  {
    this.excludeRelationships = excludeRelationships;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.includeConfidence.
   * @return Boolean
   */
  public Boolean getIncludeConfidence()
  {
    return this.includeConfidence;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.includeConfidence.
   * @param includeConfidence Boolean
   */
  public void setIncludeConfidence(Boolean includeConfidence)
  {
    this.includeConfidence = includeConfidence;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.lastUpdateTime.
   * @return Calendar
   */
  public Calendar getLastUpdateTime()
  {
    return this.lastUpdateTime;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.lastUpdateTime.
   * @param lastUpdateTime Calendar
   */
  public void setLastUpdateTime(Calendar lastUpdateTime)
  {
    this.lastUpdateTime = lastUpdateTime;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.maxNames.
   * @return Integer
   */
  public Integer getMaxNames()
  {
    return this.maxNames;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.maxNames.
   * @param maxNames Integer
   */
  public void setMaxNames(Integer maxNames)
  {
    this.maxNames = maxNames;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.maxValuesPerName.
   * @return Integer
   */
  public Integer getMaxValuesPerName()
  {
    return this.maxValuesPerName;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.maxValuesPerName.
   * @param maxValuesPerName Integer
   */
  public void setMaxValuesPerName(Integer maxValuesPerName)
  {
    this.maxValuesPerName = maxValuesPerName;
  }

  /**
   * Gets the GetCategorySpecificsRequestType.name.
   * @return String
   */
  public String getName()
  {
    return this.name;
  }

  /**
   * Sets the GetCategorySpecificsRequestType.name.
   * @param name String
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategorySpecificsResponseType.returnedFileReferenceID.
   * 
   * @return String
   */
  public String getReturnedFileReferenceID()
  {
    return this.returnedFileReferenceID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategorySpecificsResponseType.returnedRecommendations.
   * 
   * @return RecommendationsType[]
   */
  public RecommendationsType[] getReturnedRecommendations()
  {
    return this.returnedRecommendations;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCategorySpecificsResponseType.returnedTaskReferenceID.
   * 
   * @return String
   */
  public String getReturnedTaskReferenceID()
  {
    return this.returnedTaskReferenceID;
  }

}

