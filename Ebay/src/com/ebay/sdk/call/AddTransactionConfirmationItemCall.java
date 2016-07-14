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
 * Wrapper class of the AddTransactionConfirmationItem call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>RecipientUserID</code> - Specifies the user to whom the seller is offering the Transaction
 * Confirmation Request.
 * <br> <B>Input property:</B> <code>VerifyEligibilityOnly</code> - If true, specifies that the seller is verifying whether a new Transaction
 * Confirmation Request (TCR) can be created. Thus, if this value is passed
 * as true, then no Transaction Confirmation Request is actually made. If
 * VerifyEligibilityOnly is not passed, or is false, a Transaction
 * Confirmation Request is actually made.
 * <br> <B>Input property:</B> <code>RecipientPostalCode</code> - Specifies the postal code of the user to whom the seller is offering the
 * Transaction Confirmation Request. Required only if the user does not meet
 * the other options listed in RecipientRelationCodeType. An error is
 * returned if RecipientUserID and RecipientPostalCode do not match for more
 * than 3 times for a seller per day.
 * <br> <B>Input property:</B> <code>RecipientRelationType</code> - Specifies the current relationship between the seller and the potential
 * buyer. A seller can make a Transaction Confirmation Request (TCR) for an
 * item to a potential buyer if the buyer meets one of several criteria. A
 * TCR is sent by a seller to one of the following: a bidder, a best offer
 * buyer, a member with an ASQ question, or any member with a postal code.
 * See the values and annotations in RecipientRelationCodeType.
 * <br> <B>Input property:</B> <code>NegotiatedPrice</code> - The amount the offer recipient must pay to buy the item
 * specified in the Transaction Confirmation Request (TCR).
 * A negotiated amount between the buyer and the seller.
 * <br> <B>Input property:</B> <code>ListingDuration</code> - Specifies the length of time the item in the Transaction Confirmation
 * Request (TCR) will be available for purchase.
 * <br> <B>Input property:</B> <code>ItemID</code> - The ItemID of the item that the seller wants to end in order to create a
 * Transaction Confirmation Request (TCR).
 * <br> <B>Input property:</B> <code>Comments</code> - Comments the seller wants to send to the recipient (bidder, best offer
 * buyer, member with an ASQ question, or member with a postal code).
 * <br> <B>Output property:</B> <code>ReturnedItemID</code> - The new item ID for the item in the new Transaction Confirmation Request (TCR).
 * This field is not returned if the request was only used to verify that a new TCR could be created.
 * <br> <B>Output property:</B> <code>ReturnedStartTime</code> - The date and time when the item in the new Transaction Confirmation Request (TCR)
 * becomes available for purchase.
 * <br> <B>Output property:</B> <code>ReturnedEndTime</code> - The date and time when the item in the new Transaction Confirmation Request (TCR)
 * is no longer available for purchase.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddTransactionConfirmationItemCall extends com.ebay.sdk.ApiCall
{
  
  private String recipientUserID = null;
  private String verifyEligibilityOnly = null;
  private String recipientPostalCode = null;
  private String recipientRelationType = null;
  private AmountType negotiatedPrice = null;
  private SecondChanceOfferDurationCodeType listingDuration = null;
  private String itemID = null;
  private String comments = null;
  private String returnedItemID=null;
  private Calendar returnedStartTime=null;
  private Calendar returnedEndTime=null;


  /**
   * Constructor.
   */
  public AddTransactionConfirmationItemCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddTransactionConfirmationItemCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Ends the eBay Motors listing specified by ItemID and creates a new Transaction
   * Confirmation Request (TCR) for the item, thus enabling the TCR recipient to
   * purchase the item. You can also use this call to see if a new TCR can be created
   * for the specified item.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The String object.
   */
  public String addTransactionConfirmationItem()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddTransactionConfirmationItemRequestType req;
    req = new AddTransactionConfirmationItemRequestType();
    if (this.recipientUserID != null)
      req.setRecipientUserID(this.recipientUserID);
    if (this.verifyEligibilityOnly != null)
      req.setVerifyEligibilityOnly(this.verifyEligibilityOnly);
    if (this.recipientPostalCode != null)
      req.setRecipientPostalCode(this.recipientPostalCode);
    if (this.recipientRelationType != null)
      req.setRecipientRelationType(this.recipientRelationType);
    if (this.negotiatedPrice != null)
      req.setNegotiatedPrice(this.negotiatedPrice);
    if (this.listingDuration != null)
      req.setListingDuration(this.listingDuration);
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.comments != null)
      req.setComments(this.comments);

    AddTransactionConfirmationItemResponseType resp = (AddTransactionConfirmationItemResponseType) execute(req);

    this.returnedItemID = resp.getItemID();
    this.returnedStartTime = resp.getStartTime();
    this.returnedEndTime = resp.getEndTime();
    return this.getReturnedItemID();
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.comments.
   * @return String
   */
  public String getComments()
  {
    return this.comments;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.comments.
   * @param comments String
   */
  public void setComments(String comments)
  {
    this.comments = comments;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.listingDuration.
   * @return SecondChanceOfferDurationCodeType
   */
  public SecondChanceOfferDurationCodeType getListingDuration()
  {
    return this.listingDuration;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.listingDuration.
   * @param listingDuration SecondChanceOfferDurationCodeType
   */
  public void setListingDuration(SecondChanceOfferDurationCodeType listingDuration)
  {
    this.listingDuration = listingDuration;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.negotiatedPrice.
   * @return AmountType
   */
  public AmountType getNegotiatedPrice()
  {
    return this.negotiatedPrice;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.negotiatedPrice.
   * @param negotiatedPrice AmountType
   */
  public void setNegotiatedPrice(AmountType negotiatedPrice)
  {
    this.negotiatedPrice = negotiatedPrice;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.recipientPostalCode.
   * @return String
   */
  public String getRecipientPostalCode()
  {
    return this.recipientPostalCode;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.recipientPostalCode.
   * @param recipientPostalCode String
   */
  public void setRecipientPostalCode(String recipientPostalCode)
  {
    this.recipientPostalCode = recipientPostalCode;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.recipientRelationType.
   * @return String
   */
  public String getRecipientRelationType()
  {
    return this.recipientRelationType;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.recipientRelationType.
   * @param recipientRelationType String
   */
  public void setRecipientRelationType(String recipientRelationType)
  {
    this.recipientRelationType = recipientRelationType;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.recipientUserID.
   * @return String
   */
  public String getRecipientUserID()
  {
    return this.recipientUserID;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.recipientUserID.
   * @param recipientUserID String
   */
  public void setRecipientUserID(String recipientUserID)
  {
    this.recipientUserID = recipientUserID;
  }

  /**
   * Gets the AddTransactionConfirmationItemRequestType.verifyEligibilityOnly.
   * @return String
   */
  public String getVerifyEligibilityOnly()
  {
    return this.verifyEligibilityOnly;
  }

  /**
   * Sets the AddTransactionConfirmationItemRequestType.verifyEligibilityOnly.
   * @param verifyEligibilityOnly String
   */
  public void setVerifyEligibilityOnly(String verifyEligibilityOnly)
  {
    this.verifyEligibilityOnly = verifyEligibilityOnly;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddTransactionConfirmationItemResponseType.returnedEndTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedEndTime()
  {
    return this.returnedEndTime;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddTransactionConfirmationItemResponseType.returnedItemID.
   * 
   * @return String
   */
  public String getReturnedItemID()
  {
    return this.returnedItemID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddTransactionConfirmationItemResponseType.returnedStartTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedStartTime()
  {
    return this.returnedStartTime;
  }

}

