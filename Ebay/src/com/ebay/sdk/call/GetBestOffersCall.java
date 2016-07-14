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

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetBestOffers call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The ID of the listing for which Best Offer information is to be returned.
 * See the description of GetBestOffers
 * for details related to who makes the request and how
 * ItemID and BestOfferID can be omitted.
 * <br> <B>Input property:</B> <code>BestOfferID</code> - The ID of the Best Offer for which information is to be returned.
 * See the description of GetBestOffers
 * for details related to who makes the request and how
 * ItemID and BestOfferID can be omitted.
 * <br> <B>Input property:</B> <code>BestOfferStatus</code> - This optional filter controls whether only active Best Offers are retrieved or
 * all Best Offers (even Best Offers that were declined or all no longer the "best
 * offer"). The "All" value can only be specified if an <b>ItemID</b> 
 * value is also supplied in the request.
 * <br> <B>Input property:</B> <code>Pagination</code> - Specifies how to create virtual pages in the returned list (such as total
 * number of entries and total number of pages to return).
 * <br> <B>Output property:</B> <code>ReturnedBestOffers</code> - All Best Offers for the item according to the filter or
 * Best Offer id (or both) used in the input. The buyer and
 * seller messages are returned only if the detail level is
 * defined. Includes the buyer and seller message only if the
 * ReturnAll detail level is used.
 * Only returned if Best Offers have been made.
 * <br> <B>Output property:</B> <code>ReturnedItem</code> - The item for which Best Offers are being returned.
 * Only returned if Best Offers have been made.
 * <br> <B>Output property:</B> <code>ReturnedItemBestOffersArray</code> - A collection of details about the Best Offers received for a specific item. Empty if there are no Best Offers.
 * <br> <B>Output property:</B> <code>ReturnedPageNumber</code> - Specifies the number of the page of data to return in the response.
 * Default is 1 for most calls. For some calls, the default is 0. Specify a
 * positive value equal to or lower than the number of pages available (which you
 * determine by examining the results of your initial request).
 * See the documentation for other individual calls to determine the correct
 * default value. For GetOrders, PageNumber is only applicable to Half.com (is not
 * applicable to eBay.com).
 * <br> <B>Output property:</B> <code>ReturnedPaginationResult</code> - Provides information about the data returned, including the number of pages and the number
 * of entries.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetBestOffersCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private String bestOfferID = null;
  private BestOfferStatusCodeType bestOfferStatus = null;
  private PaginationType pagination = null;
  private BestOfferType[] returnedBestOffers=null;
  private ItemType returnedItem=null;
  private ItemBestOffersArrayType returnedItemBestOffersArray=null;
  private Integer returnedPageNumber=null;
  private PaginationResultType returnedPaginationResult=null;


  /**
   * Constructor.
   */
  public GetBestOffersCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetBestOffersCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves Best Offers.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getBestOffers()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetBestOffersRequestType req;
    req = new GetBestOffersRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.bestOfferID != null)
      req.setBestOfferID(this.bestOfferID);
    if (this.bestOfferStatus != null)
      req.setBestOfferStatus(this.bestOfferStatus);
    if (this.pagination != null)
      req.setPagination(this.pagination);

    GetBestOffersResponseType resp = (GetBestOffersResponseType) execute(req);

    this.returnedBestOffers = (resp.getBestOfferArray() == null? null: resp.getBestOfferArray().getBestOffer());
    this.returnedItem = resp.getItem();
    this.returnedItemBestOffersArray = resp.getItemBestOffersArray();
    this.returnedPageNumber = resp.getPageNumber();
    this.returnedPaginationResult = resp.getPaginationResult();

  }

  /**
   * Gets the GetBestOffersRequestType.bestOfferID.
   * @return String
   */
  public String getBestOfferID()
  {
    return this.bestOfferID;
  }

  /**
   * Sets the GetBestOffersRequestType.bestOfferID.
   * @param bestOfferID String
   */
  public void setBestOfferID(String bestOfferID)
  {
    this.bestOfferID = bestOfferID;
  }

  /**
   * Gets the GetBestOffersRequestType.bestOfferStatus.
   * @return BestOfferStatusCodeType
   */
  public BestOfferStatusCodeType getBestOfferStatus()
  {
    return this.bestOfferStatus;
  }

  /**
   * Sets the GetBestOffersRequestType.bestOfferStatus.
   * @param bestOfferStatus BestOfferStatusCodeType
   */
  public void setBestOfferStatus(BestOfferStatusCodeType bestOfferStatus)
  {
    this.bestOfferStatus = bestOfferStatus;
  }

  /**
   * Gets the GetBestOffersRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the GetBestOffersRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the GetBestOffersRequestType.pagination.
   * @return PaginationType
   */
  public PaginationType getPagination()
  {
    return this.pagination;
  }

  /**
   * Sets the GetBestOffersRequestType.pagination.
   * @param pagination PaginationType
   */
  public void setPagination(PaginationType pagination)
  {
    this.pagination = pagination;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetBestOffersResponseType.returnedBestOffers.
   * 
   * @return BestOfferType[]
   */
  public BestOfferType[] getReturnedBestOffers()
  {
    return this.returnedBestOffers;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetBestOffersResponseType.returnedItem.
   * 
   * @return ItemType
   */
  public ItemType getReturnedItem()
  {
    return this.returnedItem;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetBestOffersResponseType.returnedItemBestOffersArray.
   * 
   * @return ItemBestOffersArrayType
   */
  public ItemBestOffersArrayType getReturnedItemBestOffersArray()
  {
    return this.returnedItemBestOffersArray;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetBestOffersResponseType.returnedPageNumber.
   * 
   * @return Integer
   */
  public Integer getReturnedPageNumber()
  {
    return this.returnedPageNumber;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetBestOffersResponseType.returnedPaginationResult.
   * 
   * @return PaginationResultType
   */
  public PaginationResultType getReturnedPaginationResult()
  {
    return this.returnedPaginationResult;
  }

}

