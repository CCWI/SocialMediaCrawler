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
 * Wrapper class of the GetPromotionRules call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The unique ID of the item for which to retrieve promotion rules.
 * Mutually exclusive with StoreCategoryID.
 * <br> <B>Input property:</B> <code>StoreCategoryID</code> - The unique ID of the store category for which to retrieve promotion rules.
 * Mutually exclusive with ItemID.
 * <br> <B>Input property:</B> <code>PromotionMethod</code> - The type of promotion. (CrossSell: items that are related to or
 * useful in combination with this item. UpSell: items that are more
 * expensive than or of higher quality than this item.)
 * <br> <B>Output property:</B> <code>ReturnedPromotionRule</code> - An array of promotion rules associated with the item or store category
 * specified in the request.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetPromotionRulesCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private Long storeCategoryID = null;
  private PromotionMethodCodeType promotionMethod = null;
  private PromotionRuleType[] returnedPromotionRule=null;


  /**
   * Constructor.
   */
  public GetPromotionRulesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetPromotionRulesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * <b>No longer recommended.</b> eBay Store Cross Promotions are no
   * longer supported in the Trading API. Retrieves all promotion rules associated with the specified item or store category.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getPromotionRules()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetPromotionRulesRequestType req;
    req = new GetPromotionRulesRequestType();

    if( this.promotionMethod == null )
      throw new SdkException("PromotionMethod property is not set.");

    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.storeCategoryID != null)
      req.setStoreCategoryID(this.storeCategoryID);
    if (this.promotionMethod != null)
      req.setPromotionMethod(this.promotionMethod);

    GetPromotionRulesResponseType resp = (GetPromotionRulesResponseType) execute(req);

    this.returnedPromotionRule = (resp.getPromotionRuleArray() == null? null: resp.getPromotionRuleArray().getPromotionRule());

  }

  /**
   * Gets the GetPromotionRulesRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the GetPromotionRulesRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the GetPromotionRulesRequestType.promotionMethod.
   * @return PromotionMethodCodeType
   */
  public PromotionMethodCodeType getPromotionMethod()
  {
    return this.promotionMethod;
  }

  /**
   * Sets the GetPromotionRulesRequestType.promotionMethod.
   * @param promotionMethod PromotionMethodCodeType
   */
  public void setPromotionMethod(PromotionMethodCodeType promotionMethod)
  {
    this.promotionMethod = promotionMethod;
  }

  /**
   * Gets the GetPromotionRulesRequestType.storeCategoryID.
   * @return Long
   */
  public Long getStoreCategoryID()
  {
    return this.storeCategoryID;
  }

  /**
   * Sets the GetPromotionRulesRequestType.storeCategoryID.
   * @param storeCategoryID Long
   */
  public void setStoreCategoryID(Long storeCategoryID)
  {
    this.storeCategoryID = storeCategoryID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetPromotionRulesResponseType.returnedPromotionRule.
   * 
   * @return PromotionRuleType[]
   */
  public PromotionRuleType[] getReturnedPromotionRule()
  {
    return this.returnedPromotionRule;
  }

}

