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

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the AddSellingManagerProduct call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>SellingManagerProductDetails</code> - Contains product information that the seller has recorded, such as a product
 * description and inventory and restocking details.
 * <br> <B>Input property:</B> <code>FolderID</code> - Unique identifier of the folder. This ID is created when the folder is added and is returned by the
 * <b>AddSellingManagerInventoryFolder</b> call.
 * <br> <B>Input property:</B> <code>SellingManagerProductSpecifics</code> - Specifies an eBay category associated with the product,
 * defines Item Specifics that are relevant to the product,
 * and defines variations available for the product
 * (which may be used to create multivariation listings).
 * <br> <B>Output property:</B> <code>ReturnedSellingManagerProductDetails</code> - The details of the product.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class AddSellingManagerProductCall extends com.ebay.sdk.ApiCall
{
  
  private SellingManagerProductDetailsType sellingManagerProductDetails = null;
  private Long folderID = null;
  private SellingManagerProductSpecificsType sellingManagerProductSpecifics = null;
  private SellingManagerProductDetailsType returnedSellingManagerProductDetails=null;


  /**
   * Constructor.
   */
  public AddSellingManagerProductCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public AddSellingManagerProductCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Creates a Selling Manager product. Sellers use Selling Manager products to store SYI forms for use
   * as listing templates.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The SellingManagerProductDetailsType object.
   */
  public SellingManagerProductDetailsType addSellingManagerProduct()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    AddSellingManagerProductRequestType req;
    req = new AddSellingManagerProductRequestType();
    if (this.sellingManagerProductDetails != null)
      req.setSellingManagerProductDetails(this.sellingManagerProductDetails);
    if (this.folderID != null)
      req.setFolderID(this.folderID);
    if (this.sellingManagerProductSpecifics != null)
      req.setSellingManagerProductSpecifics(this.sellingManagerProductSpecifics);

    AddSellingManagerProductResponseType resp = (AddSellingManagerProductResponseType) execute(req);

    this.returnedSellingManagerProductDetails = resp.getSellingManagerProductDetails();
    return this.getReturnedSellingManagerProductDetails();
  }

  /**
   * Gets the AddSellingManagerProductRequestType.folderID.
   * @return Long
   */
  public Long getFolderID()
  {
    return this.folderID;
  }

  /**
   * Sets the AddSellingManagerProductRequestType.folderID.
   * @param folderID Long
   */
  public void setFolderID(Long folderID)
  {
    this.folderID = folderID;
  }

  /**
   * Gets the AddSellingManagerProductRequestType.sellingManagerProductDetails.
   * @return SellingManagerProductDetailsType
   */
  public SellingManagerProductDetailsType getSellingManagerProductDetails()
  {
    return this.sellingManagerProductDetails;
  }

  /**
   * Sets the AddSellingManagerProductRequestType.sellingManagerProductDetails.
   * @param sellingManagerProductDetails SellingManagerProductDetailsType
   */
  public void setSellingManagerProductDetails(SellingManagerProductDetailsType sellingManagerProductDetails)
  {
    this.sellingManagerProductDetails = sellingManagerProductDetails;
  }

  /**
   * Gets the AddSellingManagerProductRequestType.sellingManagerProductSpecifics.
   * @return SellingManagerProductSpecificsType
   */
  public SellingManagerProductSpecificsType getSellingManagerProductSpecifics()
  {
    return this.sellingManagerProductSpecifics;
  }

  /**
   * Sets the AddSellingManagerProductRequestType.sellingManagerProductSpecifics.
   * @param sellingManagerProductSpecifics SellingManagerProductSpecificsType
   */
  public void setSellingManagerProductSpecifics(SellingManagerProductSpecificsType sellingManagerProductSpecifics)
  {
    this.sellingManagerProductSpecifics = sellingManagerProductSpecifics;
  }

  /**
   * Valid after executing the API.
   * Gets the returned AddSellingManagerProductResponseType.returnedSellingManagerProductDetails.
   * 
   * @return SellingManagerProductDetailsType
   */
  public SellingManagerProductDetailsType getReturnedSellingManagerProductDetails()
  {
    return this.returnedSellingManagerProductDetails;
  }

}

