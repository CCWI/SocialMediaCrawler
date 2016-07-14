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
 * Wrapper class of the RespondToWantItNowPost call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The unique identifier of an item listed on the eBay site.
 * <br> <B>Input property:</B> <code>PostID</code> - The unique identifier of a Want It Now post on the eBay site.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class RespondToWantItNowPostCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private String postID = null;


  /**
   * Constructor.
   */
  public RespondToWantItNowPostCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public RespondToWantItNowPostCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Enables a seller to respond to a Want It Now post with an item listed on the eBay
   * site. Responses appear on the Want It Now post page, with the item title, the
   * price of the item, the number of bids on the item, and the time left before the
   * listing ends. If the item has a picture, the picture is also included on the Want
   * It Now post page.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void respondToWantItNowPost()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    RespondToWantItNowPostRequestType req;
    req = new RespondToWantItNowPostRequestType();
    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.postID != null)
      req.setPostID(this.postID);

    RespondToWantItNowPostResponseType resp = (RespondToWantItNowPostResponseType) execute(req);


  }

  /**
   * Gets the RespondToWantItNowPostRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the RespondToWantItNowPostRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the RespondToWantItNowPostRequestType.postID.
   * @return String
   */
  public String getPostID()
  {
    return this.postID;
  }

  /**
   * Sets the RespondToWantItNowPostRequestType.postID.
   * @param postID String
   */
  public void setPostID(String postID)
  {
    this.postID = postID;
  }

}

