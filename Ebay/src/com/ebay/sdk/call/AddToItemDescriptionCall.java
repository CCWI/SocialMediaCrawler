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
 * Wrapper class of the AddToItemDescription call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - Unique item ID that identifies the target item listing, the description
 * of which is appended with the text specified in Description.
 * <br> <B>Input property:</B> <code>Description</code> - Specifies the text to append to the end of the listing's description.
 * Text appended to a listing's description must abide by the rules
 * applicable to this data (such as no JavaScript) as is the case when
 * first listing the item.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddToItemDescriptionCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private String description = null;


  /**
   * Constructor.
   */
  public AddToItemDescriptionCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddToItemDescriptionCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Appends a horizontal rule, then a message about what time the
   * addition was made by the seller, and then the seller-specified text.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void addToItemDescription()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddToItemDescriptionRequestType req;
    req = new AddToItemDescriptionRequestType();

    if( this.itemID == null )
      throw new SdkException("ItemID property is not set.");
    if( this.description == null )
      throw new SdkException("Description property is not set.");

    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.description != null)
      req.setDescription(this.description);

    AddToItemDescriptionResponseType resp = (AddToItemDescriptionResponseType) execute(req);


  }

  /**
   * Gets the AddToItemDescriptionRequestType.description.
   * @return String
   */
  public String getDescription()
  {
    return this.description;
  }

  /**
   * Sets the AddToItemDescriptionRequestType.description.
   * @param description String
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Gets the AddToItemDescriptionRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the AddToItemDescriptionRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

}

