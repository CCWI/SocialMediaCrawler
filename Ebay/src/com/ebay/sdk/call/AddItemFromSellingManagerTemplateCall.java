/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Long;
import java.lang.String;
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the AddItemFromSellingManagerTemplate call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>SaleTemplateID</code> - The ID of the template you are using to list an item.
 * You can obtain a SaleTemplateID by calling GetSellingManagerInventory.
 * <br> <B>Input property:</B> <code>ScheduleTime</code> - Start time for the listing.
 * <br> <B>Input property:</B> <code>Item</code> - <b>Currently, only the
 * following can be specified as children of this
 * container: payment methods,
 * the PayPal email address, and CategoryMappingAllowed. </b>
 * This container is intended for specifying
 * item values that differ from values in the
 * template specified in the SaleTemplateID field.
 * However, currently, the only children that
 * are allowed for this container are payment methods and
 * a PayPal email address.
 * <br> <B>Output property:</B> <code>ReturnedItemID</code> - The unique identifier for the listing that was created by the 
 * AddItemFromSellingManagerTemplate request.
 * <br> <B>Output property:</B> <code>ReturnedStartTime</code> - Start time for the listing that was created by the 
 * AddItemFromSellingManagerTemplate request.
 * <br> <B>Output property:</B> <code>ReturnedEndTime</code> - End time for the listing that was created by the 
 * AddItemFromSellingManagerTemplate request. 
 * This value is equal to the start time plus the listing duration.
 * <br> <B>Output property:</B> <code>ReturnedFees</code> - Child elements contain the estimated listing fees for the new item listing.
 * The fees do not include the Final Value Fee (FVF), which cannot be determined
 * until an item is sold.
 * <br> <B>Output property:</B> <code>ReturnedCategoryID</code> - ID of the primary category in which the item was listed.
 * Only returned if you set Item.CategoryMappingAllowed to true in the request
 * and the ID you passed in PrimaryCategory was mapped to a new ID by eBay.
 * If the primary category has not changed or it has expired with no replacement,
 * CategoryID does not return a value.
 * Not applicable to Half.com.
 * <br> <B>Output property:</B> <code>ReturnedCategory2ID</code> - ID of the secondary category in which the item was listed.
 * Only returned if you set Item.CategoryMappingAllowed to true in the request
 * and the ID you passed in SecondaryCategory was mapped to a new ID by eBay.
 * If the secondary category has not changed or it has expired with no replacement,
 * Category2ID does not return a value.
 * Not applicable to Half.com.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddItemFromSellingManagerTemplateCall extends com.ebay.sdk.ApiCall
{
  
  private Long saleTemplateID = null;
  private Calendar scheduleTime = null;
  private ItemType item = null;
  private String returnedItemID=null;
  private Calendar returnedStartTime=null;
  private Calendar returnedEndTime=null;
  private FeesType returnedFees=null;
  private String returnedCategoryID=null;
  private String returnedCategory2ID=null;


  /**
   * Constructor.
   */
  public AddItemFromSellingManagerTemplateCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddItemFromSellingManagerTemplateCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Creates listings from Selling Manager templates.
   * This call is subject to change without notice; the
   * deprecation process is inapplicable to this call.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The String object.
   */
  public String addItemFromSellingManagerTemplate()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddItemFromSellingManagerTemplateRequestType req;
    req = new AddItemFromSellingManagerTemplateRequestType();
    if (this.saleTemplateID != null)
      req.setSaleTemplateID(this.saleTemplateID);
    if (this.scheduleTime != null)
      req.setScheduleTime(this.scheduleTime);
    if (this.item != null)
      req.setItem(this.item);

    AddItemFromSellingManagerTemplateResponseType resp = (AddItemFromSellingManagerTemplateResponseType) execute(req);

    this.returnedItemID = resp.getItemID();
    this.returnedStartTime = resp.getStartTime();
    this.returnedEndTime = resp.getEndTime();
    this.returnedFees = resp.getFees();
    this.returnedCategoryID = resp.getCategoryID();
    this.returnedCategory2ID = resp.getCategory2ID();
    return this.getReturnedItemID();
  }

  /**
   * Gets the AddItemFromSellingManagerTemplateRequestType.item.
   * @return ItemType
   */
  public ItemType getItem()
  {
    return this.item;
  }

  /**
   * Sets the AddItemFromSellingManagerTemplateRequestType.item.
   * @param item ItemType
   */
  public void setItem(ItemType item)
  {
    this.item = item;
  }

  /**
   * Gets the AddItemFromSellingManagerTemplateRequestType.saleTemplateID.
   * @return Long
   */
  public Long getSaleTemplateID()
  {
    return this.saleTemplateID;
  }

  /**
   * Sets the AddItemFromSellingManagerTemplateRequestType.saleTemplateID.
   * @param saleTemplateID Long
   */
  public void setSaleTemplateID(Long saleTemplateID)
  {
    this.saleTemplateID = saleTemplateID;
  }

  /**
   * Gets the AddItemFromSellingManagerTemplateRequestType.scheduleTime.
   * @return Calendar
   */
  public Calendar getScheduleTime()
  {
    return this.scheduleTime;
  }

  /**
   * Sets the AddItemFromSellingManagerTemplateRequestType.scheduleTime.
   * @param scheduleTime Calendar
   */
  public void setScheduleTime(Calendar scheduleTime)
  {
    this.scheduleTime = scheduleTime;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedCategory2ID.
   * 
   * @return String
   */
  public String getReturnedCategory2ID()
  {
    return this.returnedCategory2ID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedCategoryID.
   * 
   * @return String
   */
  public String getReturnedCategoryID()
  {
    return this.returnedCategoryID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedEndTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedEndTime()
  {
    return this.returnedEndTime;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedFees.
   * 
   * @return FeesType
   */
  public FeesType getReturnedFees()
  {
    return this.returnedFees;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedItemID.
   * 
   * @return String
   */
  public String getReturnedItemID()
  {
    return this.returnedItemID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddItemFromSellingManagerTemplateResponseType.returnedStartTime.
   * 
   * @return Calendar
   */
  public Calendar getReturnedStartTime()
  {
    return this.returnedStartTime;
  }

}

