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
 * Wrapper class of the RespondToBestOffer call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - Specifies the item for which the BestOffer data is to be returned.
 * <br> <B>Input property:</B> <code>BestOfferIDs</code> - The ID of a Best Offer for the item.
 * <br> <B>Input property:</B> <code>BestOfferAction</code> - The action taken on the Best Offer by the seller (e.g.,
 * Accept, Decline, or Counter). Bulk Accept and Bulk
 * Counter are not supported. That is, you cannot accept or
 * counter multiple offers in a single call. You can,
 * however, decline multiple offers in a single call.
 * <br> <B>Input property:</B> <code>SellerResponse</code> - A comment from the seller to the buyer.
 * <br> <B>Input property:</B> <code>CounterOfferPrice</code> - The counter offer price. When Action is set to Counter,
 * you must specify the amount for the counter offer with
 * CounterOfferPrice. The value of CounterOfferPrice cannot
 * exceed the Buy It Now price for a single quantity item.
 * The value of CounterOfferPrice may exceed the Buy It Now
 * price if the value for CounterOfferQuantity is greater
 * than 1.
 * <br> <B>Input property:</B> <code>CounterOfferQuantity</code> - The quantity of items in the counter offer. When Action is set to
 * Counter you must specify the quantity of items for the
 * counter offer with CounterOfferQuantity.
 * <br> <B>Output property:</B> <code>ReturnedBestOffers</code> - A list of BestOffers that were either accepted or declined.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class RespondToBestOfferCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private String[] bestOfferIDs = null;
  private BestOfferActionCodeType bestOfferAction = null;
  private String sellerResponse = null;
  private AmountType counterOfferPrice = null;
  private Integer counterOfferQuantity = null;
  private BestOfferType[] returnedBestOffers=null;


  /**
   * Constructor.
   */
  public RespondToBestOfferCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public RespondToBestOfferCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Enables the seller of a Best Offer item to accept, decline, or counter offers
   * made by bidders. Best offers can be declined in bulk, using the same message
   * from the seller to the bidders of all rejected offers.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void respondToBestOffer()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    RespondToBestOfferRequestType req;
    req = new RespondToBestOfferRequestType();

    if( this.itemID == null )
      throw new Exception("ItemID property is not set.");
    if( this.bestOfferAction == null )
      throw new Exception("BestOfferAction property is not set.");
    if( this.bestOfferIDs == null || this.bestOfferIDs.length == 0 )
      throw new Exception("Please specify one or more BestOfferIDs.");

    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.bestOfferIDs != null)
      req.setBestOfferID(this.bestOfferIDs);
    if (this.bestOfferAction != null)
      req.setAction(this.bestOfferAction);
    if (this.sellerResponse != null)
      req.setSellerResponse(this.sellerResponse);
    if (this.counterOfferPrice != null)
      req.setCounterOfferPrice(this.counterOfferPrice);
    if (this.counterOfferQuantity != null)
      req.setCounterOfferQuantity(this.counterOfferQuantity);

    RespondToBestOfferResponseType resp = (RespondToBestOfferResponseType) execute(req);

    this.returnedBestOffers = (resp.getRespondToBestOffer() == null? null: resp.getRespondToBestOffer().getBestOffer());

  }

  /**
   * Gets the RespondToBestOfferRequestType.bestOfferAction.
   * @return BestOfferActionCodeType
   */
  public BestOfferActionCodeType getBestOfferAction()
  {
    return this.bestOfferAction;
  }

  /**
   * Sets the RespondToBestOfferRequestType.bestOfferAction.
   * @param bestOfferAction BestOfferActionCodeType
   */
  public void setBestOfferAction(BestOfferActionCodeType bestOfferAction)
  {
    this.bestOfferAction = bestOfferAction;
  }

  /**
   * Gets the RespondToBestOfferRequestType.bestOfferIDs.
   * @return String[]
   */
  public String[] getBestOfferIDs()
  {
    return this.bestOfferIDs;
  }

  /**
   * Sets the RespondToBestOfferRequestType.bestOfferIDs.
   * @param bestOfferIDs String[]
   */
  public void setBestOfferIDs(String[] bestOfferIDs)
  {
    this.bestOfferIDs = bestOfferIDs;
  }

  /**
   * Gets the RespondToBestOfferRequestType.counterOfferPrice.
   * @return AmountType
   */
  public AmountType getCounterOfferPrice()
  {
    return this.counterOfferPrice;
  }

  /**
   * Sets the RespondToBestOfferRequestType.counterOfferPrice.
   * @param counterOfferPrice AmountType
   */
  public void setCounterOfferPrice(AmountType counterOfferPrice)
  {
    this.counterOfferPrice = counterOfferPrice;
  }

  /**
   * Gets the RespondToBestOfferRequestType.counterOfferQuantity.
   * @return Integer
   */
  public Integer getCounterOfferQuantity()
  {
    return this.counterOfferQuantity;
  }

  /**
   * Sets the RespondToBestOfferRequestType.counterOfferQuantity.
   * @param counterOfferQuantity Integer
   */
  public void setCounterOfferQuantity(Integer counterOfferQuantity)
  {
    this.counterOfferQuantity = counterOfferQuantity;
  }

  /**
   * Gets the RespondToBestOfferRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the RespondToBestOfferRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the RespondToBestOfferRequestType.sellerResponse.
   * @return String
   */
  public String getSellerResponse()
  {
    return this.sellerResponse;
  }

  /**
   * Sets the RespondToBestOfferRequestType.sellerResponse.
   * @param sellerResponse String
   */
  public void setSellerResponse(String sellerResponse)
  {
    this.sellerResponse = sellerResponse;
  }

  /**
   * Valid after executing the API.
   * Gets the returned RespondToBestOfferResponseType.returnedBestOffers.
   * 
   * @return BestOfferType[]
   */
  public BestOfferType[] getReturnedBestOffers()
  {
    return this.returnedBestOffers;
  }

}

