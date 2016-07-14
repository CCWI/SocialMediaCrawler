/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;


import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetItemsAwaitingFeedback call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>Sort</code> - Specifies how the returned feedback items should be sorted.
 * Valid values are Title, EndTime, QuestionCount, FeedbackLeft,
 * FeedbackReceivedDescending, UserIDDescending, TitleDescending,
 * and EndTimeDescending.
 * <br> <B>Input property:</B> <code>Pagination</code> - Specifies the number of entries per page and the page number to return
 * in the result set.
 * <br> <B>Output property:</B> <code>ReturnedItemsAwaitingFeedback</code> - Contains the items awaiting feedback.
 * Returned only if there are items that do not yet
 * have feedback.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetItemsAwaitingFeedbackCall extends com.ebay.sdk.ApiCall
{
  
  private ItemSortTypeCodeType sort = null;
  private PaginationType pagination = null;
  private PaginatedTransactionArrayType returnedItemsAwaitingFeedback=null;


  /**
   * Constructor.
   */
  public GetItemsAwaitingFeedbackCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetItemsAwaitingFeedbackCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Returns orders in which the user was involved and for which feedback
   * is still needed from either the buyer or seller.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getItemsAwaitingFeedback()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetItemsAwaitingFeedbackRequestType req;
    req = new GetItemsAwaitingFeedbackRequestType();
    if (this.sort != null)
      req.setSort(this.sort);
    if (this.pagination != null)
      req.setPagination(this.pagination);

    GetItemsAwaitingFeedbackResponseType resp = (GetItemsAwaitingFeedbackResponseType) execute(req);

    this.returnedItemsAwaitingFeedback = resp.getItemsAwaitingFeedback();

  }

  /**
   * Gets the GetItemsAwaitingFeedbackRequestType.pagination.
   * @return PaginationType
   */
  public PaginationType getPagination()
  {
    return this.pagination;
  }

  /**
   * Sets the GetItemsAwaitingFeedbackRequestType.pagination.
   * @param pagination PaginationType
   */
  public void setPagination(PaginationType pagination)
  {
    this.pagination = pagination;
  }

  /**
   * Gets the GetItemsAwaitingFeedbackRequestType.sort.
   * @return ItemSortTypeCodeType
   */
  public ItemSortTypeCodeType getSort()
  {
    return this.sort;
  }

  /**
   * Sets the GetItemsAwaitingFeedbackRequestType.sort.
   * @param sort ItemSortTypeCodeType
   */
  public void setSort(ItemSortTypeCodeType sort)
  {
    this.sort = sort;
  }
/**
   * Gets the returned pagination result within the PaginatedTransactionArrayType.
   * @return PaginationResultType
   */
  public PaginationResultType getReturnedPaginationResult() {
    PaginatedTransactionArrayType ary = this.returnedItemsAwaitingFeedback;
    return (ary == null? null: ary.getPaginationResult());
  }
/**
   * Gets the returned transaction array within the PaginatedTransactionArrayType.
   * @return TransactionType[]
   */
  public TransactionType[] getReturnedTransaction() {
    PaginatedTransactionArrayType ary = this.returnedItemsAwaitingFeedback;
    return (ary == null || ary.getTransactionArray() == null) ? null : ary.getTransactionArray().getTransaction();
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetItemsAwaitingFeedbackResponseType.returnedItemsAwaitingFeedback.
   * 
   * @return PaginatedTransactionArrayType
   */
  public PaginatedTransactionArrayType getReturnedItemsAwaitingFeedback()
  {
    return this.returnedItemsAwaitingFeedback;
  }

}

