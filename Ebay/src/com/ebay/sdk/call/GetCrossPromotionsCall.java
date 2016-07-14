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
 * Wrapper class of the GetCrossPromotions call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The unique ID of the referring item. The cross-promoted
 * items will supplement this item.
 * <br> <B>Input property:</B> <code>PromotionMethod</code> - The cross-promotion method you want to use for the
 * returned list, either UpSell or CrossSell.
 * <br> <B>Input property:</B> <code>PromotionViewMode</code> - The role of the person requesting to view the cross-promoted
 * items, either seller or buyer. Default is buyer.
 * <br> <B>Output property:</B> <code>ReturnedCrossPromotion</code> - eBay Store Cross Promotions are no longer supported in the Trading API, so the
 * <b>CrossPromotion</b> container will either not be returned, or, if it
 * is returned, the data in the container may not be accurate. A list of cross-promoted
 * items defined for a specific referring item. The list is either upsell or cross-sell
 * items, according to the value of <b>PromotionMethod</b> in 
 * <b>GetCrossPromotionsRequest</b>.
 * <br>
 * Not applicable to Half.com.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetCrossPromotionsCall extends com.ebay.sdk.ApiCall
{
  
  private String itemID = null;
  private PromotionMethodCodeType promotionMethod = null;
  private TradingRoleCodeType promotionViewMode = null;
  private CrossPromotionsType returnedCrossPromotion=null;


  /**
   * Constructor.
   */
  public GetCrossPromotionsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetCrossPromotionsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * <b>No longer recommended.</b> The eBay Store Cross Promotions are no longer
   * supported in the Trading API. Retrieves a list of upsell or cross-sell items associated
   * with the specified Item ID.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getCrossPromotions()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetCrossPromotionsRequestType req;
    req = new GetCrossPromotionsRequestType();

    if( this.itemID == null )
      throw new SdkException("ItemID property is not set.");
    if( this.promotionMethod == null )
      throw new SdkException("PromotionMethod property is not set.");

    if (this.itemID != null)
      req.setItemID(this.itemID);
    if (this.promotionMethod != null)
      req.setPromotionMethod(this.promotionMethod);
    if (this.promotionViewMode != null)
      req.setPromotionViewMode(this.promotionViewMode);

    GetCrossPromotionsResponseType resp = (GetCrossPromotionsResponseType) execute(req);

    this.returnedCrossPromotion = resp.getCrossPromotion();

  }

  /**
   * Gets the GetCrossPromotionsRequestType.itemID.
   * @return String
   */
  public String getItemID()
  {
    return this.itemID;
  }

  /**
   * Sets the GetCrossPromotionsRequestType.itemID.
   * @param itemID String
   */
  public void setItemID(String itemID)
  {
    this.itemID = itemID;
  }

  /**
   * Gets the GetCrossPromotionsRequestType.promotionMethod.
   * @return PromotionMethodCodeType
   */
  public PromotionMethodCodeType getPromotionMethod()
  {
    return this.promotionMethod;
  }

  /**
   * Sets the GetCrossPromotionsRequestType.promotionMethod.
   * @param promotionMethod PromotionMethodCodeType
   */
  public void setPromotionMethod(PromotionMethodCodeType promotionMethod)
  {
    this.promotionMethod = promotionMethod;
  }

  /**
   * Gets the GetCrossPromotionsRequestType.promotionViewMode.
   * @return TradingRoleCodeType
   */
  public TradingRoleCodeType getPromotionViewMode()
  {
    return this.promotionViewMode;
  }

  /**
   * Sets the GetCrossPromotionsRequestType.promotionViewMode.
   * @param promotionViewMode TradingRoleCodeType
   */
  public void setPromotionViewMode(TradingRoleCodeType promotionViewMode)
  {
    this.promotionViewMode = promotionViewMode;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCrossPromotionsResponseType.returnedCrossPromotion.
   * 
   * @return CrossPromotionsType
   */
  public CrossPromotionsType getReturnedCrossPromotion()
  {
    return this.returnedCrossPromotion;
  }

}

