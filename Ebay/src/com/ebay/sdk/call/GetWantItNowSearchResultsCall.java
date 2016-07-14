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

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetWantItNowSearchResults call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CategoryID</code> - Limits the result set to just those Want It Now posts listed in the
 * specified category. Defaults to all categories if no category ID is
 * specified. If the specified category ID does not match an existing
 * category for the site, an invalid-category error message is returned.
 * Controls the set of listings to return (not the details to return for each
 * listing).
 * You must specify a Query and/or a CategoryID in the request.
 * <br> <B>Input property:</B> <code>Query</code> - Specifies a search string. The search string consists of one or more
 * keywords to search for in the listing title. Note that the post
 * description will also be searched if SearchInDescription is enabled.
 * By default, requests return a list of Want It Now posts that include all
 * of the keywords specified in the Query. All words used in the query,
 * including "and," "or," and "the,"  will be treated as keywords. You can,
 * however, use modifiers and wildcards (e.g., +, -, and *) in the Query
 * field to create more complex searches. Be careful when using spaces before
 * or after modifiers and wildcards (+, -, or *), as the spaces can affect
 * the query logic.
 * See the eBay Web Services Guide for a list of valid search keyword query
 * operators and examples.
 * <br> <B>Input property:</B> <code>SearchInDescription</code> - If true, include the description field of Want It Now posts in the keyword search. Want
 * It Now posts returned are those where specified search keywords appear in
 * either the description or the title. This is the default behavior if SearchInDescription
 * is not specified. If false, only the title will be searched. SearchInDescription is an
 * optional input.
 * <br> <B>Input property:</B> <code>SearchWorldwide</code> - If true, the search applies to all eBay sites. If false, the search is
 * limited to the site specified in the URL query string when the call is
 * made.
 * <br> <B>Input property:</B> <code>Pagination</code> - Controls the pagination of the result set. Child elements specify the
 * maximum number of item listings to return per call and which page of data
 * to return.
 * <br> <B>Output property:</B> <code>ReturnedWantItNowPostArray</code> - Contains the returned Want It Now posts, if any. The data for each post is
 * returned in a WantItNowPostType object.
 * <br> <B>Output property:</B> <code>ReturnedHasMoreItems</code> - Indicates whether there are additional Want It Now posts that meet the
 * search criteria.
 * <br> <B>Output property:</B> <code>ReturnedItemsPerPage</code> - Indicates the maximum number of Want It Now posts that can be returned in
 * a WantItNowPostArray for a request. This value can be specified in the
 * request by  EntriesPerPage in Pagination in the request.
 * <br> <B>Output property:</B> <code>ReturnedPageNumber</code> - Indicates the page of data returned by the current call.
 * <br> <B>Output property:</B> <code>ReturnedPaginationResult</code> - Indicates the results of the pagination, including the total number of
 * pages of data there are to be returned and the total number of posts there
 * are to be returned.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetWantItNowSearchResultsCall extends com.ebay.sdk.ApiCall
{
  
  private String categoryID = null;
  private String query = null;
  private Boolean searchInDescription = null;
  private Boolean searchWorldwide = null;
  private PaginationType pagination = null;
  private WantItNowPostArrayType returnedWantItNowPostArray=null;
  private Boolean returnedHasMoreItems=null;
  private Integer returnedItemsPerPage=null;
  private Integer returnedPageNumber=null;
  private PaginationResultType returnedPaginationResult=null;


  /**
   * Constructor.
   */
  public GetWantItNowSearchResultsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetWantItNowSearchResultsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves a list of active Want It Now posts that match specified keywords
   * and/or a specific category ID. The response contains the following data:
   * CategoryID, PostID, StartTime, ResponseCount, Site, and Title. To get the post
   * description (Description), you must use GetWantItNowPost to retrieve individual
   * posts.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The WantItNowPostArrayType object.
   */
  public WantItNowPostArrayType getWantItNowSearchResults()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetWantItNowSearchResultsRequestType req;
    req = new GetWantItNowSearchResultsRequestType();
    if (this.categoryID != null)
      req.setCategoryID(this.categoryID);
    if (this.query != null)
      req.setQuery(this.query);
    if (this.searchInDescription != null)
      req.setSearchInDescription(this.searchInDescription);
    if (this.searchWorldwide != null)
      req.setSearchWorldwide(this.searchWorldwide);
    if (this.pagination != null)
      req.setPagination(this.pagination);

    GetWantItNowSearchResultsResponseType resp = (GetWantItNowSearchResultsResponseType) execute(req);

    this.returnedWantItNowPostArray = resp.getWantItNowPostArray();
    this.returnedHasMoreItems = resp.isHasMoreItems();
    this.returnedItemsPerPage = resp.getItemsPerPage();
    this.returnedPageNumber = resp.getPageNumber();
    this.returnedPaginationResult = resp.getPaginationResult();
    return this.getReturnedWantItNowPostArray();
  }

  /**
   * Gets the GetWantItNowSearchResultsRequestType.categoryID.
   * @return String
   */
  public String getCategoryID()
  {
    return this.categoryID;
  }

  /**
   * Sets the GetWantItNowSearchResultsRequestType.categoryID.
   * @param categoryID String
   */
  public void setCategoryID(String categoryID)
  {
    this.categoryID = categoryID;
  }

  /**
   * Gets the GetWantItNowSearchResultsRequestType.pagination.
   * @return PaginationType
   */
  public PaginationType getPagination()
  {
    return this.pagination;
  }

  /**
   * Sets the GetWantItNowSearchResultsRequestType.pagination.
   * @param pagination PaginationType
   */
  public void setPagination(PaginationType pagination)
  {
    this.pagination = pagination;
  }

  /**
   * Gets the GetWantItNowSearchResultsRequestType.query.
   * @return String
   */
  public String getQuery()
  {
    return this.query;
  }

  /**
   * Sets the GetWantItNowSearchResultsRequestType.query.
   * @param query String
   */
  public void setQuery(String query)
  {
    this.query = query;
  }

  /**
   * Gets the GetWantItNowSearchResultsRequestType.searchInDescription.
   * @return Boolean
   */
  public Boolean getSearchInDescription()
  {
    return this.searchInDescription;
  }

  /**
   * Sets the GetWantItNowSearchResultsRequestType.searchInDescription.
   * @param searchInDescription Boolean
   */
  public void setSearchInDescription(Boolean searchInDescription)
  {
    this.searchInDescription = searchInDescription;
  }

  /**
   * Gets the GetWantItNowSearchResultsRequestType.searchWorldwide.
   * @return Boolean
   */
  public Boolean getSearchWorldwide()
  {
    return this.searchWorldwide;
  }

  /**
   * Sets the GetWantItNowSearchResultsRequestType.searchWorldwide.
   * @param searchWorldwide Boolean
   */
  public void setSearchWorldwide(Boolean searchWorldwide)
  {
    this.searchWorldwide = searchWorldwide;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowSearchResultsResponseType.returnedHasMoreItems.
   * 
   * @return Boolean
   */
  public Boolean getReturnedHasMoreItems()
  {
    return this.returnedHasMoreItems;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowSearchResultsResponseType.returnedItemsPerPage.
   * 
   * @return Integer
   */
  public Integer getReturnedItemsPerPage()
  {
    return this.returnedItemsPerPage;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowSearchResultsResponseType.returnedPageNumber.
   * 
   * @return Integer
   */
  public Integer getReturnedPageNumber()
  {
    return this.returnedPageNumber;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowSearchResultsResponseType.returnedPaginationResult.
   * 
   * @return PaginationResultType
   */
  public PaginationResultType getReturnedPaginationResult()
  {
    return this.returnedPaginationResult;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowSearchResultsResponseType.returnedWantItNowPostArray.
   * 
   * @return WantItNowPostArrayType
   */
  public WantItNowPostArrayType getReturnedWantItNowPostArray()
  {
    return this.returnedWantItNowPostArray;
  }

}

