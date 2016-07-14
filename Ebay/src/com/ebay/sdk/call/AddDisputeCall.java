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
 * Wrapper class of the AddDispute call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>DisputeExplanation</code> - This enumerated value gives the explanation of why the buyer or seller opened a
 * case (or why seller canceled an order line item). Not all values contained in 
 * <b>DisputeExplanationCodeType</b> are allowed in the 
 * <b>AddDispute</b> call, and the values that are allowed must match 
 * the <b>DisputeReason</b> value.
 * <br> <B>Input property:</B> <code>DisputeReason</code> - The type of dispute being created. <b>BuyerHasNotPaid</b> and
 * <b>TransactionMutuallyCanceled</b> are the only values that may
 * be used with the <b>AddDispute</b> call. 
 * <br> <B>Input property:</B> <code>ItemID</code> - Unique identifier for an eBay item listing. A listing can have multiple
 * orders, but only one <b>ItemID</b>. To
 * identify a specific order line item, either an
 * <b>ItemID</b>/<b>TransactionID</b> pair or an
 * <b>OrderLineItemID</b> value must be passed in the request. So,
 * unless <b>OrderLineItemID</b> is used, this field is required.
 * <br>
 * <br> <B>Input property:</B> <code>TransactionID</code> - The unique identifier of an order line item. An order line item is created once
 * a buyer purchases the item through a fixed-priced listing or by using the Buy It
 * Now feature in an auction listing, or when an auction listing ends with a
 * winning bidder. To identify a specific order line item, either an 
 * <b>ItemID</b>/<b>TransactionID</b> pair or an 
 * <b>OrderLineItemID</b> value must be passed in the request. So,
 * unless <b>OrderLineItemID</b> is used, this field is required.
 * <br>
 * <br> <B>Input property:</B> <code>OrderLineItemID</code> - <b>OrderLineItemID</b> is a unique identifier of an order line item,
 * and is based upon the concatenation of <b>ItemID</b> and 
 * <b>TransactionID</b>, with a hyphen in between these two IDs. To 
 * identify a specific order line item, either an 
 * <b>ItemID</b>/<b>TransactionID</b> pair or an 
 * <b>OrderLineItemID</b> value must be passed in the request. So,
 * unless <b>ItemID</b>/<b>TransactionID</b> pair is used,
 * this field is required.
 * <br>
 * <br> <B>Output property:</B> <code>ReturnedDisputeID</code> - The unique identifier of the Unpaid Item or Mutually Canceled Transaction case 
 * that was successfully created with the <b>AddDispute</b> call.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddDisputeCall extends com.ebay.sdk.ApiCall
{
  
  private DisputeExplanationCodeType disputeExplanation = null;
  private DisputeReasonCodeType disputeReason = null;
  private String itemID = null;
  private String transactionID = null;
  private String orderLineItemID = null;
  private String returnedDisputeID=null;


  /**
   * Constructor.
   */
  public AddDisputeCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddDisputeCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * This call enables a seller to create an Unpaid Item case against a buyer, or to cancel a
   * single line item order. 
   * <br/><br/>
   * <span class="tablenote"><b>Note:</b>
   * This call is only used by sellers to create an Unpaid Item case or to mutually cancel a
   * single line item order. Buyers must use the eBay Resolution Center or PayPal Resolution 
   * Center (for orders that satisfy requirements) to create an Item Not Received or an Item
   * Significantly Not as Described case. 
   * </span>
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The String object.
   */
  public String addDispute()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddDisputeRequestType req;
    req = new AddDisputeRequestType();
    if (this.disputeExplanation != null)
      req.setDisputeExplanation(this.disputeExplanation);
    if (this.disputeReason != null)
      req.setDisputeReason(this.disputeReason);
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.transactionID != null)
      req.setTransactionID(this.transactionID);
    if (this.orderLineItemID != null)
      req.setOrderLineItemID(this.orderLineItemID);

    AddDisputeResponseType resp = (AddDisputeResponseType) execute(req);

    this.returnedDisputeID = resp.getDisputeID();
    return this.getReturnedDisputeID();
  }

  /**
   * Gets the AddDisputeRequestType.disputeExplanation.
   * @return DisputeExplanationCodeType
   */
  public DisputeExplanationCodeType getDisputeExplanation()
  {
    return this.disputeExplanation;
  }

  /**
   * Sets the AddDisputeRequestType.disputeExplanation.
   * @param disputeExplanation DisputeExplanationCodeType
   */
  public void setDisputeExplanation(DisputeExplanationCodeType disputeExplanation)
  {
    this.disputeExplanation = disputeExplanation;
  }

  /**
   * Gets the AddDisputeRequestType.disputeReason.
   * @return DisputeReasonCodeType
   */
  public DisputeReasonCodeType getDisputeReason()
  {
    return this.disputeReason;
  }

  /**
   * Sets the AddDisputeRequestType.disputeReason.
   * @param disputeReason DisputeReasonCodeType
   */
  public void setDisputeReason(DisputeReasonCodeType disputeReason)
  {
    this.disputeReason = disputeReason;
  }

  /**
   * Gets the AddDisputeRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the AddDisputeRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the AddDisputeRequestType.orderLineItemID.
   * @return String
   */
  public String getOrderLineItemID()
  {
    return this.orderLineItemID;
  }

  /**
   * Sets the AddDisputeRequestType.orderLineItemID.
   * @param orderLineItemID String
   */
  public void setOrderLineItemID(String orderLineItemID)
  {
    this.orderLineItemID = orderLineItemID;
  }

  /**
   * Gets the AddDisputeRequestType.transactionID.
   * @return String
   */
  public String getTransactionID()
  {
    return this.transactionID;
  }

  /**
   * Sets the AddDisputeRequestType.transactionID.
   * @param transactionID String
   */
  public void setTransactionID(String transactionID)
  {
    this.transactionID = transactionID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddDisputeResponseType.returnedDisputeID.
   * 
   * @return String
   */
  public String getReturnedDisputeID()
  {
    return this.returnedDisputeID;
  }

}

