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
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the AddSecondChanceItem call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>RecipientBidderUserID</code> - Specifies the bidder from the original, ended listing to whom the seller
 * is extending the second chance offer. Specify only one
 * RecipientBidderUserID per call. If multiple users are specified (each in a
 * RecipientBidderUserID node), only the last one specified receives the
 * offer.
 * <br> <B>Input property:</B> <code>BuyItNowPrice</code> - The amount the offer recipient must pay to purchase the item
 * from the second chance offer listing. Use only when the original
 * item was listed in an eBay Motors vehicle category (or in some
 * categories on U.S. and international sites for
 * high-priced items, such as items in many U.S. and Canada
 * Business and Industrial categories) and it ended unsold
 * because the reserve price was not met. Otherwise, eBay
 * establishes the price and no price should be submitted.
 * <br> <B>Input property:</B> <code>Duration</code> - Specifies the length of time the second chance offer listing will be
 * active. The recipient bidder has that much time to purchase the item or
 * the listing expires.
 * <br> <B>Input property:</B> <code>ItemID</code> - Specifies the item ID for the original, ended listing from which the
 * second chance offer item comes. A new ItemID is returned for the second
 * chance offer item.
 * <br> <B>Input property:</B> <code>SellerMessage</code> - Message content. Cannot contain HTML, asterisks, or quotes. This content
 * is included in the second chance offer email sent to the recipient, which
 * can be retrieved with GetMyMessages.
 * <br> <B>Output property:</B> <code>ReturnedItemID</code> - Contains the item ID for the new second chance
 * offer listing. Different from the original ItemID passed in the request.
 * <br> <B>Output property:</B> <code>ReturnedStartTime</code> - Indicates the date and time when the new second chance offer listing
 * became active and the recipient user could purchase the item.
 * <br> <B>Output property:</B> <code>ReturnedEndTime</code> - Indicates the date and time when the second chance offer listing expires,
 * at which time the listing ends (if the recipient user does not purchase
 * the item first).
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddSecondChanceItemCall extends com.ebay.sdk.ApiCall
{
  
  private String recipientBidderUserID = null;
  private AmountType buyItNowPrice = null;
  private SecondChanceOfferDurationCodeType duration = null;
  private String itemID = null;
  private String sellerMessage = null;
  private String returnedItemID=null;
  private Calendar returnedStartTime=null;
  private Calendar returnedEndTime=null;


  /**
   * Constructor.
   */
  public AddSecondChanceItemCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddSecondChanceItemCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Creates a new Second Chance Offer (that is, an offer for an unsold item)
   * for one of that item's non-winning bidders.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The String object.
   */
  public String addSecondChanceItem()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddSecondChanceItemRequestType req;
    req = new AddSecondChanceItemRequestType();

    if( this.recipientBidderUserID == null )
      throw new SdkException("RecipientBidderUserID property is not set.");
    if( this.itemID == null )
      throw new SdkException("ItemID should be set to the original item ID that you want to make an offer for.");

    if (this.recipientBidderUserID != null)
      req.setRecipientBidderUserID(this.recipientBidderUserID);
    if (this.buyItNowPrice != null)
      req.setBuyItNowPrice(this.buyItNowPrice);
    if (this.duration != null)
      req.setDuration(this.duration);
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.sellerMessage != null)
      req.setSellerMessage(this.sellerMessage);

    AddSecondChanceItemResponseType resp = (AddSecondChanceItemResponseType) execute(req);

    this.returnedItemID = resp.getItemID();
    this.returnedStartTime = resp.getStartTime();
    this.returnedEndTime = resp.getEndTime();
    return this.getReturnedItemID();
  }

  /**
   * Gets the AddSecondChanceItemRequestType.buyItNowPrice.
   * @return AmountType
   */
  public AmountType getBuyItNowPrice()
  {
    return this.buyItNowPrice;
  }

  /**
   * Sets the AddSecondChanceItemRequestType.buyItNowPrice.
   * @param buyItNowPrice AmountType
   */
  public void setBuyItNowPrice(AmountType buyItNowPrice)
  {
    this.buyItNowPrice = buyItNowPrice;
  }

  /**
   * Gets the AddSecondChanceItemRequestType.duration.
   * @return SecondChanceOfferDurationCodeType
   */
  public SecondChanceOfferDurationCodeType getDuration()
  {
    return this.duration;
  }

  /**
   * Sets the AddSecondChanceItemRequestType.duration.
   * @param duration SecondChanceOfferDurationCodeType
   */
  public void setDuration(SecondChanceOfferDurationCodeType duration)
  {
    this.duration = duration;
  }

  /**
   * Gets the AddSecondChanceItemRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the AddSecondChanceItemRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the AddSecondChanceItemRequestType.recipientBidderUserID.
   * @return String
   */
  public String getRecipientBidderUserID()
  {
    return this.recipientBidderUserID;
  }

  /**
   * Sets the AddSecondChanceItemRequestType.recipientBidderUserID.
   * @param recipientBidderUserID String
   */
  public void setRecipientBidderUserID(String recipientBidderUserID)
  {
    this.recipientBidderUserID = recipientBidderUserID;
  }

  /**
   * Gets the AddSecondChanceItemRequestType.sellerMessage.
   * @return String
   */
  public String getSellerMessage()
  {
    return this.sellerMessage;
  }

  /**
   * Sets the AddSecondChanceItemRequestType.sellerMessage.
   * @param sellerMessage String
   */
  public void setSellerMessage(String sellerMessage)
  {
    this.sellerMessage = sellerMessage;
  }
/**
   * Executes VerifyAddSecondChanceItem API. This call is used to evaluate
   * listing fees without actually making the second chance offer.
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return FeesType
   */
  public void verifyAddSecondChanceItem() throws com.ebay.sdk.ApiException,
     com.ebay.sdk.SdkException, java.lang.Exception
  {
    VerifyAddSecondChanceItemRequestType req = new VerifyAddSecondChanceItemRequestType();

    if( this.recipientBidderUserID == null )
      throw new SdkException("RecipientBidderUserID is not set.");
    req.setRecipientBidderUserID(this.recipientBidderUserID);

    if( this.itemID == null )
      throw new SdkException("ItemID should be set to the original item ID that you want to make offer for.");
    req.setItemID(this.itemID);

    if (null != this.sellerMessage)
    {
    	req.setSellerMessage(this.sellerMessage);
    }

    if( this.buyItNowPrice != null )
      req.setBuyItNowPrice(this.buyItNowPrice);
      
    if( this.duration != null )
      req.setDuration(this.duration);

    // Executes the API.
    VerifyAddSecondChanceItemResponseType resp = (VerifyAddSecondChanceItemResponseType)this.execute(req);
    
  }




  /**
   * Valid after executing the API.
   * Gets the returned AddSecondChanceItemResponseType.returnedEndTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedEndTime()
  {
    return this.returnedEndTime;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSecondChanceItemResponseType.returnedItemID.
   * 
   * @return String
   */
  public String getReturnedItemID()
  {
    return this.returnedItemID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSecondChanceItemResponseType.returnedStartTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedStartTime()
  {
    return this.returnedStartTime;
  }

}

