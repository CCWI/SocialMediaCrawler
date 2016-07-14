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

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the AddSellingManagerTemplate call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>Item</code> - Contains the data in your template, i.e. the data needed to
 * list an item. The item data you specify will be used
 * when you list items from the template you are adding.
 * <br> <B>Input property:</B> <code>SaleTemplateName</code> - The name you provide for the template. If you don't specify
 * a name, then <b>Item.Title</b> is used as the name.
 * <br> <B>Input property:</B> <code>ProductID</code> - The ID of the product with which the template will be associated.
 * Before calling <b>AddSellingManagerTemplate</b>, you can obtain a product ID
 * from the response of an <b>AddSellingManagerProduct</b> call.
 * That is, after you add a product using <b>AddSellingManagerProduct</b>, a product ID is
 * returned in the <b>SellingManagerProductDetails.ProductID</b> field.
 * The <b>GetSellingManagerTemplates</b>
 * call also returns product IDs.
 * Alternatively, you can obtain information about a user's existing
 * products, including the product IDs, by calling <b>GetSellingManagerInventory</b>.
 * <br> <B>Output property:</B> <code>ReturnedCategoryID</code> - ID of the primary category in which the item would be listed.
 * <br> <B>Output property:</B> <code>ReturnedCategory2ID</code> - ID of the secondary category (if any) in which the item would be listed.
 * <br> <B>Output property:</B> <code>ReturnedSaleTemplateID</code> - The ID of the Selling Manager template. Store this value, for use in 
 * other Selling Manager calls.
 * <br> <B>Output property:</B> <code>ReturnedSaleTemplateGroupID</code> - Ignore this value. For the output value that indicates the 
 * ID of the product associated with the template, 
 * use SellingManagerProductDetails.ProductID.
 * <br> <B>Output property:</B> <code>ReturnedSaleTemplateName</code> - The name of the template, as it will appear in Selling Manager Pro. 
 * This name is the input value you provided in the SaleTemplateName field. 
 * If you didn't specify a value for
 * SaleTemplateName, then Item.Title is used as the name.
 * <br> <B>Output property:</B> <code>ReturnedSellingManagerProductDetails</code> - The details of the product with which the template is associated.
 * <br> <B>Output property:</B> <code>ReturnedFees</code> - Child elements contain the estimated listing fees for the new listing template.
 * Note that the fee will only be charged when an item is created from the template.
 * The fees do not include the Final Value Fee (FVF), which cannot be determined
 * until an item is sold.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddSellingManagerTemplateCall extends com.ebay.sdk.ApiCall
{
  
  private ItemType item = null;
  private String saleTemplateName = null;
  private Long productID = null;
  private Long returnedCategoryID=null;
  private Long returnedCategory2ID=null;
  private Long returnedSaleTemplateID=null;
  private Long returnedSaleTemplateGroupID=null;
  private String returnedSaleTemplateName=null;
  private SellingManagerProductDetailsType returnedSellingManagerProductDetails=null;
  private FeesType returnedFees=null;


  /**
   * Constructor.
   */
  public AddSellingManagerTemplateCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddSellingManagerTemplateCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Adds a Selling Manager template.
   * One product can have up to 20 templates associated with it.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The Long object.
   */
  public Long addSellingManagerTemplate()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddSellingManagerTemplateRequestType req;
    req = new AddSellingManagerTemplateRequestType();
    if (this.item != null)
      req.setItem(this.item);
    if (this.saleTemplateName != null)
      req.setSaleTemplateName(this.saleTemplateName);
    if (this.productID != null)
      req.setProductID(this.productID);

    AddSellingManagerTemplateResponseType resp = (AddSellingManagerTemplateResponseType) execute(req);

    this.returnedCategoryID = resp.getCategoryID();
    this.returnedCategory2ID = resp.getCategory2ID();
    this.returnedSaleTemplateID = resp.getSaleTemplateID();
    this.returnedSaleTemplateGroupID = resp.getSaleTemplateGroupID();
    this.returnedSaleTemplateName = resp.getSaleTemplateName();
    this.returnedSellingManagerProductDetails = resp.getSellingManagerProductDetails();
    this.returnedFees = resp.getFees();
    return this.getReturnedCategoryID();
  }

  /**
   * Gets the AddSellingManagerTemplateRequestType.item.
   * @return ItemType
   */
  public ItemType getItem()
  {
    return this.item;
  }

  /**
   * Sets the AddSellingManagerTemplateRequestType.item.
   * @param item ItemType
   */
  public void setItem(ItemType item)
  {
    this.item = item;
  }

  /**
   * Gets the AddSellingManagerTemplateRequestType.productID.
   * @return Long
   */
  public Long getProductID()
  {
    return this.productID;
  }

  /**
   * Sets the AddSellingManagerTemplateRequestType.productID.
   * @param productID Long
   */
  public void setProductID(Long productID)
  {
    this.productID = productID;
  }

  /**
   * Gets the AddSellingManagerTemplateRequestType.saleTemplateName.
   * @return String
   */
  public String getSaleTemplateName()
  {
    return this.saleTemplateName;
  }

  /**
   * Sets the AddSellingManagerTemplateRequestType.saleTemplateName.
   * @param saleTemplateName String
   */
  public void setSaleTemplateName(String saleTemplateName)
  {
    this.saleTemplateName = saleTemplateName;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedCategory2ID.
   * 
   * @return Long
   */
  public Long getReturnedCategory2ID()
  {
    return this.returnedCategory2ID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedCategoryID.
   * 
   * @return Long
   */
  public Long getReturnedCategoryID()
  {
    return this.returnedCategoryID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedFees.
   * 
   * @return FeesType
   */
  public FeesType getReturnedFees()
  {
    return this.returnedFees;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedSaleTemplateGroupID.
   * 
   * @return Long
   */
  public Long getReturnedSaleTemplateGroupID()
  {
    return this.returnedSaleTemplateGroupID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedSaleTemplateID.
   * 
   * @return Long
   */
  public Long getReturnedSaleTemplateID()
  {
    return this.returnedSaleTemplateID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedSaleTemplateName.
   * 
   * @return String
   */
  public String getReturnedSaleTemplateName()
  {
    return this.returnedSaleTemplateName;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerTemplateResponseType.returnedSellingManagerProductDetails.
   * 
   * @return SellingManagerProductDetailsType
   */
  public SellingManagerProductDetailsType getReturnedSellingManagerProductDetails()
  {
    return this.returnedSellingManagerProductDetails;
  }

}

