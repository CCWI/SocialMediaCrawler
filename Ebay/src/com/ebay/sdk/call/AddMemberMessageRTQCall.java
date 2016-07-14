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
 * Wrapper class of the AddMemberMessageRTQ call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The unique ID of the item about which the question was asked. This field
 * is not required in the request, if the request includes a RecipientID
 * in the MemberMessage container.
 * <br> <B>Input property:</B> <code>MemberMessage</code> - Container for the message. Includes the message body (which should answer
 * the question that an eBay user asks you (the seller) about an active
 * listing), plus other values related to the message.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddMemberMessageRTQCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private MemberMessageType memberMessage = null;


  /**
   * Constructor.
   */
  public AddMemberMessageRTQCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddMemberMessageRTQCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Enables a seller to reply to a question about an active item listing.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void addMemberMessageRTQ()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddMemberMessageRTQRequestType req;
    req = new AddMemberMessageRTQRequestType();
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.memberMessage != null)
      req.setMemberMessage(this.memberMessage);

    AddMemberMessageRTQResponseType resp = (AddMemberMessageRTQResponseType) execute(req);


  }

  /**
   * Gets the AddMemberMessageRTQRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the AddMemberMessageRTQRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the AddMemberMessageRTQRequestType.memberMessage.
   * @return MemberMessageType
   */
  public MemberMessageType getMemberMessage()
  {
    return this.memberMessage;
  }

  /**
   * Sets the AddMemberMessageRTQRequestType.memberMessage.
   * @param memberMessage MemberMessageType
   */
  public void setMemberMessage(MemberMessageType memberMessage)
  {
    this.memberMessage = memberMessage;
  }

}

