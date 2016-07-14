/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Boolean;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetUserPreferences call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ShowBidderNoticePreferences</code> - If included and set to true, the seller's preference for receiving contact
 * information for unsuccessful bidders is returned in the response.
 * <br> <B>Input property:</B> <code>ShowCombinedPaymentPreferences</code> - If included and set to true, the seller's combined payment preferences are
 * returned in the response. These preferences are used to allow Combined Invoice
 * orders.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * The <strong>CombinedPaymentPreferences.CombinedPaymentOption</strong> field is the only
 * preference that should be managed with the <strong>GetUserPreferences</strong> and
 * <strong>SetUserPreferences</strong> calls. All other combined payment preferences should be
 * managed with the <strong>SetDiscountProfiles</strong> and <strong>GetDiscountProfiles</strong> calls.
 * </span>
 * <br> <B>Input property:</B> <code>ShowCrossPromotionPreferences</code> - This container should no longer be used as eBay Store Cross Promotions are no
 * longer supported in the Trading API. 
 * <br> <B>Input property:</B> <code>ShowSellerPaymentPreferences</code> - If included and set to true, the seller's payment preferences are returned
 * in the response.
 * <br> <B>Input property:</B> <code>ShowEndOfAuctionEmailPreferences</code> - If included and set to true, the seller's preferences for the end-of-auction
 * email sent to the winning bidder is returned in the response. These
 * preferences are only applicable for auction listings.
 * <br> <B>Input property:</B> <code>ShowSellerFavoriteItemPreferences</code> - If included and set to true, the seller's favorite item preferences are
 * returned in the response.
 * <br> <B>Input property:</B> <code>ShowProStoresPreferences</code> - If included and set to true, the seller's ProStores preferences are
 * returned in the response.
 * <br> <B>Input property:</B> <code>ShowEmailShipmentTrackingNumberPreference</code> - If included and set to true, the seller's preference for sending an email to
 * the buyer with the shipping tracking number is returned in the response.
 * <br> <B>Input property:</B> <code>ShowRequiredShipPhoneNumberPreference</code> - If included and set to true, the seller's preference for requiring that the
 * buyer supply a shipping phone number upon checkout is returned in the
 * response. Some shipping carriers require the receiver's phone number.
 * <br> <B>Input property:</B> <code>ShowSellerExcludeShipToLocationPreference</code> - If included and set to true, all of the seller's excluded shipping locations
 * are returned in the response. The returned list mirrors the seller's current
 * Exclude shipping locations list in My eBay's Shipping Preferences. An
 * excluded shipping location in My eBay can be an entire geographical region
 * (such as Middle East) or only an individual country (such as Iraq). Sellers
 * can override these default settings for an individual listing by using the
 * Item.ShippingDetails.ExcludeShipToLocation field in the AddItem family of
 * calls.
 * <br> <B>Input property:</B> <code>ShowUnpaidItemAssistancePreference</code> - If included and set to true, the seller's Unpaid Item Assistant preferences
 * are returned in the response. The Unpaid Item Assistant automatically opens
 * an Unpaid Item dispute on the behalf of the seller.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * To return the list of buyers excluded from the Unpaid Item Assistant
 * mechanism, the ShowUnpaidItemAssistanceExclusionList field must also be
 * included and set to true in the request. Excluded buyers can be viewed in
 * the UnpaidItemAssistancePreferences.ExcludedUser field.
 * </span>
 * <br> <B>Input property:</B> <code>ShowPurchaseReminderEmailPreferences</code> - If included and set to true, the seller's preference for sending a purchase
 * reminder email to buyers is returned in the response.
 * <br> <B>Input property:</B> <code>ShowUnpaidItemAssistanceExclusionList</code> - If included and set to true, the list of eBay user IDs on the Unpaid Item
 * Assistant Excluded User list is returned through the
 * UnpaidItemAssistancePreferences.ExcludedUser field in the response. For
 * excluded users, an Unpaid Item dispute is not automatically filed through
 * the UPI Assistance mechanism. The Excluded User list is managed through the
 * SetUserPreferences call.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * To return the list of buyers excluded from the Unpaid Item Assistant
 * mechanism, the ShowUnpaidItemAssistancePreference field must also be
 * included and set to true in the request.
 * </span>
 * <br> <B>Input property:</B> <code>ShowSellerProfilePreferences</code> - If this flag is included and set to true, the seller's Business Policies profile information is
 * returned in the response. This information includes a flag that indicates whether or
 * not the seller has opted into Business Policies, as well as Business Policies profiles
 * (payment, shipping, and return policy) active on the seller's account.
 * <br> <B>Input property:</B> <code>ShowSellerReturnPreferences</code> - If this flag is included and set to true, the <b>SellerReturnPreferences</b> container is returned in the response and indicates whether or not the seller has opted in to eBay Managed Returns.
 * <br><br>
 * eBay Managed Returns are currently only available on the US and UK sites. 
 * <br> <B>Input property:</B> <code>ShowGlobalShippingProgramPreference</code> - If this flag is included and set to true, the seller's preference for offering the Global Shipping Program to international buyers will be returned in <strong>OfferGlobalShippingProgramPreference</strong>.
 * <br> <B>Input property:</B> <code>ShowDispatchCutoffTimePreferences</code> - If this flag is included and set to true, the seller's same day handling cut off time is returned in <strong>DispatchCutoffTimePreference.CutoffTime</strong>.
 * <br> <B>Input property:</B> <code>ShowGlobalShippingProgramListingPreference</code> - If this flag is included and set to <code>true</code>, the <strong>GlobalShippingProgramListingPreference</strong> field is returned. A returned value of <code>true</code> indicates that the seller's new listings will enable the Global Shipping Program by default.
 * <br> <B>Input property:</B> <code>ShowOverrideGSPServiceWithIntlServicePreference</code> - If this flag is included and set to <code>true</code>, the <strong>OverrideGSPServiceWithIntlServicePreference</strong> field is returned. A returned value of <code>true</code> indicates that for the seller's listings that specify an international shipping service for any Global Shipping-eligible country, the specified service will take precedence and be the listing's default international shipping option for buyers in that country, rather than the Global Shipping Program. 
 * <br/><br/>
 * A returned value of <code>false</code> indicates that the Global Shipping program will take precedence over any international shipping service as the default option in Global Shipping-eligible listings for shipping to any Global Shipping-eligible country.
 * <br> <B>Input property:</B> <code>ShowPickupDropoffPreferences</code> - If this flag is included and set to <code>true</code>, the <strong>PickupDropoffSellerPreference</strong> field is returned. A returned value of <code>true</code> indicates that the seller's new listings will enable the Click and Collect feature by default. With the Click and Collect feature, a buyer can purchase certain items on eBay and collect them at a local store. Buyers are notified by eBay once their items are available. The Click and Collect feature is only available to large merchants on the eBay UK (site ID - 3) and eBay Australia (Site ID - 15) sites.
 * <br> <B>Input property:</B> <code>ShowOutOfStockControlPreference</code> - If true, the seller's preferences related to the Out-of-Stock feature will be returned. This feature is set using the 
 * <a href="SetUserPreferences.html#Request.OutOfStockControlPreference">SetUserPreferences</a> call.
 * <br/>
 * <br> <B>Output property:</B> <code>ReturnedBidderNoticePreferences</code> - Container consisting of the seller's preference for receiving contact information for unsuccessful bidders. This container is returned when <b>ShowBidderNoticePreferences</b> is included and set to 'true' in the request. This preference is only applicable for auction listings. 
 * <br> <B>Output property:</B> <code>ReturnedCombinedPaymentPreferences</code> - ../../../../guides/ebayfeatures/Development/Listing-AnItem.html#CombinedInvoice
 * <br> <B>Output property:</B> <code>ReturnedCrossPromotionPreferences</code> - This container is no longer supported as eBay Store Cross Promotions are no longer supported in the Trading API. This container will be removed from the Trading WSDL and API Call Reference docs in a future release. 
 * <br> <B>Output property:</B> <code>ReturnedSellerPaymentPreferences</code> - Container consisting of the seller's payment preferences. This container is returned when <b>ShowSellerPaymentPreferences</b> is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedSellerFavoriteItemPreferences</code> - Container consisting of the seller's preferences for displaying items on a buyer's Favorite Sellers' Items page or Favorite Sellers' Items digest. This container is returned when <b>ShowSellerFavoriteItemPreferences</b> is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedEndOfAuctionEmailPreferences</code> - Container consisting of the seller's preferences for the end-of-auction email sent to the winning bidder. This container is returned when <b>ShowEndOfAuctionEmailPreferences</b> is included and set to 'true' in the request. These preferences are only applicable for auction listings. 
 * <br> <B>Output property:</B> <code>ReturnedEmailShipmentTrackingNumberPreference</code> - Container consisting of the seller's preference for sending an email to the buyer with the shipment tracking number. This container is returned when <b>ShowEmailShipmentTrackingNumberPreference</b> is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedRequiredShipPhoneNumberPreference</code> - Container consisting of the seller's preference for requiring that the buyer supply a shipping phone number upon checkout. Some shipping carriers require the receiver's phone number. This container is returned when <b>ShowRequiredShipPhoneNumberPreference</b> is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedProStoresPreference</code> - Container consisting of the seller's ProStores preferences. This container is returned when <b>ShowProStoresPreference</b> is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedUnpaidItemAssistancePreferences</code> - Container consisting of a seller's Unpaid Item Assistant preferences. The Unpaid Item Assistant automatically opens an Unpaid Item dispute on the behalf of the seller. This container is returned if <b>ShowUnpaidItemAssistancePreference</b> is included and set to 'true' in the request. 
 * <br><br>
 * <span class="tablenote"><b>Note:</b>
 * To return the list of buyers excluded from the Unpaid Item Assistant mechanism, the <b>ShowUnpaidItemAssistanceExclusionList</b> field must also be included and set to 'true' in the request. Excluded buyers can be viewed in the <b>UnpaidItemAssistancePreferences.ExcludedUser</b> field. 
 * </span>							
 * <br> <B>Output property:</B> <code>ReturnedSellerExcludeShipToLocationPreferences</code> - Container consisting of a list of the seller's excluded shipping locations. The returned list mirrors the seller's current Exclude shipping locations list in My eBay's shipping preferences. An excluded shipping location in My eBay can be an entire geographical region (such as Middle East) or only an individual country (such as Iraq). Sellers can override these default settings for an individual listing by using the <b>Item.ShippingDetails.ExcludeShipToLocation</b> field in the Add/Revise/Relist calls. This container is returned if the <b>ShowSellerExcludeShipToLocationPreference</b> field is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedPurchaseReminderEmailPreferences</code> - Container consisting of a seller's preference for sending a purchase reminder email to buyers. This container is returned if the <b>ShowPurchaseReminderEmailPreferences</b> field is included and set to 'true' in the request. 
 * <br> <B>Output property:</B> <code>ReturnedSellerThirdPartyCheckoutDisabled</code> - This flag is set with the <b>SellerThirdPartyCheckoutDisabled</b> field of the <b>SetUserPreferences</b> call, and is used to disable the use of a third-party application to handle the checkout flow for a seller. If true, Third-Party Checkout is disabled and any checkout flow initiated on the seller's application is redirected to the eBay checkout flow. This field is only returned if the <b>SellerThirdPartyCheckoutDisabled</b> field has been set with the <b>SetUserPreferences</b> call. 
 * <br> <B>Output property:</B> <code>ReturnedSellerProfilePreferences</code> - Parent response container consisting of high-level information for all Business Policies defined for the user's account. This container is returned if <b>ShowSellerProfilePreferences</b> is included and set to 'true' in the <b>GetUserPreferences</b> request (and one or more Business Policies are defined for the user's account). 
 * <br> <B>Output property:</B> <code>ReturnedSellerReturnPreferences</code> - Container consisting of the <b>OptedIn</b> flag that indicates whether or not the seller has opted in to eBay Managed Returns. This container is only returned if <b>ShowSellerReturnPreferences</b> is included and set to 'true' in the request.
 * <br> <B>Output property:</B> <code>ReturnedOfferGlobalShippingProgramPreference</code> - This flag indicates whether the seller has opted in to the Global Shipping Program and is able to offer global shipping to international buyers. Returned when <b>ShowGlobalShippingProgramPreference</b> is included and set to 'true'. 
 * <br> <B>Output property:</B> <code>ReturnedDispatchCutoffTimePreference</code> - Contains information about a seller's order cut off time preferences for same-day shipping. If the seller specifies a value of '0' in <b>Item.DispatchTimeMax</b> to offer same-day handling when listing an item, the seller's shipping time commitment depends on the order cut off time set for the listing site, as indicated by <b>DispatchCutoffTimePreference.CutoffTime</b>. 
 * <br> <B>Output property:</B> <code>ReturnedGlobalShippingProgramListingPreference</code> - If the <b>ShowGlobalShippingProgramListingPreference</b> field is submitted and set to 'true', this flag is returned. A returned value of 'true' indicates that the seller's new listings will enable the Global Shipping Program by default. 							
 * <br> <B>Output property:</B> <code>ReturnedOverrideGSPServiceWithIntlServicePreference</code> - If the <b>ShowOverrideGSPServiceWithIntlServicePreference</b> field is submitted and set to 'true', this flag is returned. A returned value of 'true' indicates that for the seller's listings that specify an international shipping service for any Global Shipping-eligible country, the specified service will take precedence and be the listing's default international shipping option for buyers in that country, rather than the Global Shipping Program.
 * <br/><br/>
 * A returned value of 'false' indicates that the Global Shipping program will take precedence over any international shipping service as the default option in Global Shipping-eligible listings for shipping to any Global Shipping-eligible country. 
 * <br> <B>Output property:</B> <code>ReturnedPickupDropoffSellerPreference</code> - This boolean field is returned if the <b>ShowPickupDropoffPreferences</b> field is included and set to 'true' in the request. This field will be returned as 'true' if the seller has enabled the Click and Collect feature at the account level. All of the seller's new listings will enable the Click and Collect feature by default. With the Click and Collect feature, a buyer can purchase certain items on eBay and collect them at a local store. Buyers are notified by eBay once their items are available. The Click and Collect feature is only available to large merchants on the eBay UK (site ID - 3) and eBay Australia (Site ID - 15) sites.
 * <br> <B>Output property:</B> <code>ReturnedOutOfStockControlPreference</code> - This boolean field is returned if the <b>ShowOutOfStockControlPreference</b> field is included and set to 'true' in the request. This field will be returned as 'true' if the seller has set <a href SetUserPreferences.html#Request.OutOfStockControlPreference">SetUserPreferences.OutOfStockControlPreference> to 'true'.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetUserPreferencesCall extends com.ebay.sdk.ApiCall
{
  
  private Boolean showBidderNoticePreferences = null;
  private Boolean showCombinedPaymentPreferences = null;
  private Boolean showCrossPromotionPreferences = null;
  private Boolean showSellerPaymentPreferences = null;
  private Boolean showEndOfAuctionEmailPreferences = null;
  private Boolean showSellerFavoriteItemPreferences = null;
  private Boolean showProStoresPreferences = null;
  private Boolean showEmailShipmentTrackingNumberPreference = null;
  private Boolean showRequiredShipPhoneNumberPreference = null;
  private Boolean showSellerExcludeShipToLocationPreference = null;
  private Boolean showUnpaidItemAssistancePreference = null;
  private Boolean showPurchaseReminderEmailPreferences = null;
  private Boolean showUnpaidItemAssistanceExclusionList = null;
  private Boolean showSellerProfilePreferences = null;
  private Boolean showSellerReturnPreferences = null;
  private Boolean showGlobalShippingProgramPreference = null;
  private Boolean showDispatchCutoffTimePreferences = null;
  private Boolean showGlobalShippingProgramListingPreference = null;
  private Boolean showOverrideGSPServiceWithIntlServicePreference = null;
  private Boolean showPickupDropoffPreferences = null;
  private Boolean showOutOfStockControlPreference = null;
  private BidderNoticePreferencesType returnedBidderNoticePreferences=null;
  private CombinedPaymentPreferencesType returnedCombinedPaymentPreferences=null;
  private CrossPromotionPreferencesType returnedCrossPromotionPreferences=null;
  private SellerPaymentPreferencesType returnedSellerPaymentPreferences=null;
  private SellerFavoriteItemPreferencesType returnedSellerFavoriteItemPreferences=null;
  private EndOfAuctionEmailPreferencesType returnedEndOfAuctionEmailPreferences=null;
  private Boolean returnedEmailShipmentTrackingNumberPreference=null;
  private Boolean returnedRequiredShipPhoneNumberPreference=null;
  private ProStoresCheckoutPreferenceType returnedProStoresPreference=null;
  private UnpaidItemAssistancePreferencesType returnedUnpaidItemAssistancePreferences=null;
  private SellerExcludeShipToLocationPreferencesType returnedSellerExcludeShipToLocationPreferences=null;
  private PurchaseReminderEmailPreferencesType returnedPurchaseReminderEmailPreferences=null;
  private Boolean returnedSellerThirdPartyCheckoutDisabled=null;
  private SellerProfilePreferencesType returnedSellerProfilePreferences=null;
  private SellerReturnPreferencesType returnedSellerReturnPreferences=null;
  private Boolean returnedOfferGlobalShippingProgramPreference=null;
  private DispatchCutoffTimePreferencesType returnedDispatchCutoffTimePreference=null;
  private Boolean returnedGlobalShippingProgramListingPreference=null;
  private Boolean returnedOverrideGSPServiceWithIntlServicePreference=null;
  private Boolean returnedPickupDropoffSellerPreference=null;
  private Boolean returnedOutOfStockControlPreference=null;


  /**
   * Constructor.
   */
  public GetUserPreferencesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetUserPreferencesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves the specified user preferences for the authenticated caller.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getUserPreferences()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetUserPreferencesRequestType req;
    req = new GetUserPreferencesRequestType();
    if (this.showBidderNoticePreferences != null)
      req.setShowBidderNoticePreferences(this.showBidderNoticePreferences.booleanValue());
    if (this.showCombinedPaymentPreferences != null)
      req.setShowCombinedPaymentPreferences(this.showCombinedPaymentPreferences.booleanValue());
    if (this.showCrossPromotionPreferences != null)
      req.setShowCrossPromotionPreferences(this.showCrossPromotionPreferences.booleanValue());
    if (this.showSellerPaymentPreferences != null)
      req.setShowSellerPaymentPreferences(this.showSellerPaymentPreferences.booleanValue());
    if (this.showEndOfAuctionEmailPreferences != null)
      req.setShowEndOfAuctionEmailPreferences(this.showEndOfAuctionEmailPreferences);
    if (this.showSellerFavoriteItemPreferences != null)
      req.setShowSellerFavoriteItemPreferences(this.showSellerFavoriteItemPreferences);
    if (this.showProStoresPreferences != null)
      req.setShowProStoresPreferences(this.showProStoresPreferences);
    if (this.showEmailShipmentTrackingNumberPreference != null)
      req.setShowEmailShipmentTrackingNumberPreference(this.showEmailShipmentTrackingNumberPreference);
    if (this.showRequiredShipPhoneNumberPreference != null)
      req.setShowRequiredShipPhoneNumberPreference(this.showRequiredShipPhoneNumberPreference);
    if (this.showSellerExcludeShipToLocationPreference != null)
      req.setShowSellerExcludeShipToLocationPreference(this.showSellerExcludeShipToLocationPreference);
    if (this.showUnpaidItemAssistancePreference != null)
      req.setShowUnpaidItemAssistancePreference(this.showUnpaidItemAssistancePreference);
    if (this.showPurchaseReminderEmailPreferences != null)
      req.setShowPurchaseReminderEmailPreferences(this.showPurchaseReminderEmailPreferences);
    if (this.showUnpaidItemAssistanceExclusionList != null)
      req.setShowUnpaidItemAssistanceExclusionList(this.showUnpaidItemAssistanceExclusionList);
    if (this.showSellerProfilePreferences != null)
      req.setShowSellerProfilePreferences(this.showSellerProfilePreferences);
    if (this.showSellerReturnPreferences != null)
      req.setShowSellerReturnPreferences(this.showSellerReturnPreferences);
    if (this.showGlobalShippingProgramPreference != null)
      req.setShowGlobalShippingProgramPreference(this.showGlobalShippingProgramPreference);
    if (this.showDispatchCutoffTimePreferences != null)
      req.setShowDispatchCutoffTimePreferences(this.showDispatchCutoffTimePreferences);
    if (this.showGlobalShippingProgramListingPreference != null)
      req.setShowGlobalShippingProgramListingPreference(this.showGlobalShippingProgramListingPreference);
    if (this.showOverrideGSPServiceWithIntlServicePreference != null)
      req.setShowOverrideGSPServiceWithIntlServicePreference(this.showOverrideGSPServiceWithIntlServicePreference);
    if (this.showPickupDropoffPreferences != null)
      req.setShowPickupDropoffPreferences(this.showPickupDropoffPreferences);
    if (this.showOutOfStockControlPreference != null)
      req.setShowOutOfStockControlPreference(this.showOutOfStockControlPreference);

    GetUserPreferencesResponseType resp = (GetUserPreferencesResponseType) execute(req);

    this.returnedBidderNoticePreferences = resp.getBidderNoticePreferences();
    this.returnedCombinedPaymentPreferences = resp.getCombinedPaymentPreferences();
    this.returnedCrossPromotionPreferences = resp.getCrossPromotionPreferences();
    this.returnedSellerPaymentPreferences = resp.getSellerPaymentPreferences();
    this.returnedSellerFavoriteItemPreferences = resp.getSellerFavoriteItemPreferences();
    this.returnedEndOfAuctionEmailPreferences = resp.getEndOfAuctionEmailPreferences();
    this.returnedEmailShipmentTrackingNumberPreference = resp.isEmailShipmentTrackingNumberPreference();
    this.returnedRequiredShipPhoneNumberPreference = resp.isRequiredShipPhoneNumberPreference();
    this.returnedProStoresPreference = resp.getProStoresPreference();
    this.returnedUnpaidItemAssistancePreferences = resp.getUnpaidItemAssistancePreferences();
    this.returnedSellerExcludeShipToLocationPreferences = resp.getSellerExcludeShipToLocationPreferences();
    this.returnedPurchaseReminderEmailPreferences = resp.getPurchaseReminderEmailPreferences();
    this.returnedSellerThirdPartyCheckoutDisabled = resp.isSellerThirdPartyCheckoutDisabled();
    this.returnedSellerProfilePreferences = resp.getSellerProfilePreferences();
    this.returnedSellerReturnPreferences = resp.getSellerReturnPreferences();
    this.returnedOfferGlobalShippingProgramPreference = resp.isOfferGlobalShippingProgramPreference();
    this.returnedDispatchCutoffTimePreference = resp.getDispatchCutoffTimePreference();
    this.returnedGlobalShippingProgramListingPreference = resp.isGlobalShippingProgramListingPreference();
    this.returnedOverrideGSPServiceWithIntlServicePreference = resp.isOverrideGSPServiceWithIntlServicePreference();
    this.returnedPickupDropoffSellerPreference = resp.isPickupDropoffSellerPreference();
    this.returnedOutOfStockControlPreference = resp.isOutOfStockControlPreference();

  }

  /**
   * Gets the GetUserPreferencesRequestType.showBidderNoticePreferences.
   * @return Boolean
   */
  public Boolean getShowBidderNoticePreferences()
  {
    return this.showBidderNoticePreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showBidderNoticePreferences.
   * @param showBidderNoticePreferences Boolean
   */
  public void setShowBidderNoticePreferences(Boolean showBidderNoticePreferences)
  {
    this.showBidderNoticePreferences = showBidderNoticePreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showCombinedPaymentPreferences.
   * @return Boolean
   */
  public Boolean getShowCombinedPaymentPreferences()
  {
    return this.showCombinedPaymentPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showCombinedPaymentPreferences.
   * @param showCombinedPaymentPreferences Boolean
   */
  public void setShowCombinedPaymentPreferences(Boolean showCombinedPaymentPreferences)
  {
    this.showCombinedPaymentPreferences = showCombinedPaymentPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showCrossPromotionPreferences.
   * @return Boolean
   */
  public Boolean getShowCrossPromotionPreferences()
  {
    return this.showCrossPromotionPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showCrossPromotionPreferences.
   * @param showCrossPromotionPreferences Boolean
   */
  public void setShowCrossPromotionPreferences(Boolean showCrossPromotionPreferences)
  {
    this.showCrossPromotionPreferences = showCrossPromotionPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showDispatchCutoffTimePreferences.
   * @return Boolean
   */
  public Boolean getShowDispatchCutoffTimePreferences()
  {
    return this.showDispatchCutoffTimePreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showDispatchCutoffTimePreferences.
   * @param showDispatchCutoffTimePreferences Boolean
   */
  public void setShowDispatchCutoffTimePreferences(Boolean showDispatchCutoffTimePreferences)
  {
    this.showDispatchCutoffTimePreferences = showDispatchCutoffTimePreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showEmailShipmentTrackingNumberPreference.
   * @return Boolean
   */
  public Boolean getShowEmailShipmentTrackingNumberPreference()
  {
    return this.showEmailShipmentTrackingNumberPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showEmailShipmentTrackingNumberPreference.
   * @param showEmailShipmentTrackingNumberPreference Boolean
   */
  public void setShowEmailShipmentTrackingNumberPreference(Boolean showEmailShipmentTrackingNumberPreference)
  {
    this.showEmailShipmentTrackingNumberPreference = showEmailShipmentTrackingNumberPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showEndOfAuctionEmailPreferences.
   * @return Boolean
   */
  public Boolean getShowEndOfAuctionEmailPreferences()
  {
    return this.showEndOfAuctionEmailPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showEndOfAuctionEmailPreferences.
   * @param showEndOfAuctionEmailPreferences Boolean
   */
  public void setShowEndOfAuctionEmailPreferences(Boolean showEndOfAuctionEmailPreferences)
  {
    this.showEndOfAuctionEmailPreferences = showEndOfAuctionEmailPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showGlobalShippingProgramListingPreference.
   * @return Boolean
   */
  public Boolean getShowGlobalShippingProgramListingPreference()
  {
    return this.showGlobalShippingProgramListingPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showGlobalShippingProgramListingPreference.
   * @param showGlobalShippingProgramListingPreference Boolean
   */
  public void setShowGlobalShippingProgramListingPreference(Boolean showGlobalShippingProgramListingPreference)
  {
    this.showGlobalShippingProgramListingPreference = showGlobalShippingProgramListingPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showGlobalShippingProgramPreference.
   * @return Boolean
   */
  public Boolean getShowGlobalShippingProgramPreference()
  {
    return this.showGlobalShippingProgramPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showGlobalShippingProgramPreference.
   * @param showGlobalShippingProgramPreference Boolean
   */
  public void setShowGlobalShippingProgramPreference(Boolean showGlobalShippingProgramPreference)
  {
    this.showGlobalShippingProgramPreference = showGlobalShippingProgramPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showOutOfStockControlPreference.
   * @return Boolean
   */
  public Boolean getShowOutOfStockControlPreference()
  {
    return this.showOutOfStockControlPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showOutOfStockControlPreference.
   * @param showOutOfStockControlPreference Boolean
   */
  public void setShowOutOfStockControlPreference(Boolean showOutOfStockControlPreference)
  {
    this.showOutOfStockControlPreference = showOutOfStockControlPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showOverrideGSPServiceWithIntlServicePreference.
   * @return Boolean
   */
  public Boolean getShowOverrideGSPServiceWithIntlServicePreference()
  {
    return this.showOverrideGSPServiceWithIntlServicePreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showOverrideGSPServiceWithIntlServicePreference.
   * @param showOverrideGSPServiceWithIntlServicePreference Boolean
   */
  public void setShowOverrideGSPServiceWithIntlServicePreference(Boolean showOverrideGSPServiceWithIntlServicePreference)
  {
    this.showOverrideGSPServiceWithIntlServicePreference = showOverrideGSPServiceWithIntlServicePreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showPickupDropoffPreferences.
   * @return Boolean
   */
  public Boolean getShowPickupDropoffPreferences()
  {
    return this.showPickupDropoffPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showPickupDropoffPreferences.
   * @param showPickupDropoffPreferences Boolean
   */
  public void setShowPickupDropoffPreferences(Boolean showPickupDropoffPreferences)
  {
    this.showPickupDropoffPreferences = showPickupDropoffPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showProStoresPreferences.
   * @return Boolean
   */
  public Boolean getShowProStoresPreferences()
  {
    return this.showProStoresPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showProStoresPreferences.
   * @param showProStoresPreferences Boolean
   */
  public void setShowProStoresPreferences(Boolean showProStoresPreferences)
  {
    this.showProStoresPreferences = showProStoresPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showPurchaseReminderEmailPreferences.
   * @return Boolean
   */
  public Boolean getShowPurchaseReminderEmailPreferences()
  {
    return this.showPurchaseReminderEmailPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showPurchaseReminderEmailPreferences.
   * @param showPurchaseReminderEmailPreferences Boolean
   */
  public void setShowPurchaseReminderEmailPreferences(Boolean showPurchaseReminderEmailPreferences)
  {
    this.showPurchaseReminderEmailPreferences = showPurchaseReminderEmailPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showRequiredShipPhoneNumberPreference.
   * @return Boolean
   */
  public Boolean getShowRequiredShipPhoneNumberPreference()
  {
    return this.showRequiredShipPhoneNumberPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showRequiredShipPhoneNumberPreference.
   * @param showRequiredShipPhoneNumberPreference Boolean
   */
  public void setShowRequiredShipPhoneNumberPreference(Boolean showRequiredShipPhoneNumberPreference)
  {
    this.showRequiredShipPhoneNumberPreference = showRequiredShipPhoneNumberPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showSellerExcludeShipToLocationPreference.
   * @return Boolean
   */
  public Boolean getShowSellerExcludeShipToLocationPreference()
  {
    return this.showSellerExcludeShipToLocationPreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showSellerExcludeShipToLocationPreference.
   * @param showSellerExcludeShipToLocationPreference Boolean
   */
  public void setShowSellerExcludeShipToLocationPreference(Boolean showSellerExcludeShipToLocationPreference)
  {
    this.showSellerExcludeShipToLocationPreference = showSellerExcludeShipToLocationPreference;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showSellerFavoriteItemPreferences.
   * @return Boolean
   */
  public Boolean getShowSellerFavoriteItemPreferences()
  {
    return this.showSellerFavoriteItemPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showSellerFavoriteItemPreferences.
   * @param showSellerFavoriteItemPreferences Boolean
   */
  public void setShowSellerFavoriteItemPreferences(Boolean showSellerFavoriteItemPreferences)
  {
    this.showSellerFavoriteItemPreferences = showSellerFavoriteItemPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showSellerPaymentPreferences.
   * @return Boolean
   */
  public Boolean getShowSellerPaymentPreferences()
  {
    return this.showSellerPaymentPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showSellerPaymentPreferences.
   * @param showSellerPaymentPreferences Boolean
   */
  public void setShowSellerPaymentPreferences(Boolean showSellerPaymentPreferences)
  {
    this.showSellerPaymentPreferences = showSellerPaymentPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showSellerProfilePreferences.
   * @return Boolean
   */
  public Boolean getShowSellerProfilePreferences()
  {
    return this.showSellerProfilePreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showSellerProfilePreferences.
   * @param showSellerProfilePreferences Boolean
   */
  public void setShowSellerProfilePreferences(Boolean showSellerProfilePreferences)
  {
    this.showSellerProfilePreferences = showSellerProfilePreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showSellerReturnPreferences.
   * @return Boolean
   */
  public Boolean getShowSellerReturnPreferences()
  {
    return this.showSellerReturnPreferences;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showSellerReturnPreferences.
   * @param showSellerReturnPreferences Boolean
   */
  public void setShowSellerReturnPreferences(Boolean showSellerReturnPreferences)
  {
    this.showSellerReturnPreferences = showSellerReturnPreferences;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showUnpaidItemAssistanceExclusionList.
   * @return Boolean
   */
  public Boolean getShowUnpaidItemAssistanceExclusionList()
  {
    return this.showUnpaidItemAssistanceExclusionList;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showUnpaidItemAssistanceExclusionList.
   * @param showUnpaidItemAssistanceExclusionList Boolean
   */
  public void setShowUnpaidItemAssistanceExclusionList(Boolean showUnpaidItemAssistanceExclusionList)
  {
    this.showUnpaidItemAssistanceExclusionList = showUnpaidItemAssistanceExclusionList;
  }

  /**
   * Gets the GetUserPreferencesRequestType.showUnpaidItemAssistancePreference.
   * @return Boolean
   */
  public Boolean getShowUnpaidItemAssistancePreference()
  {
    return this.showUnpaidItemAssistancePreference;
  }

  /**
   * Sets the GetUserPreferencesRequestType.showUnpaidItemAssistancePreference.
   * @param showUnpaidItemAssistancePreference Boolean
   */
  public void setShowUnpaidItemAssistancePreference(Boolean showUnpaidItemAssistancePreference)
  {
    this.showUnpaidItemAssistancePreference = showUnpaidItemAssistancePreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedBidderNoticePreferences.
   * 
   * @return BidderNoticePreferencesType
   */
  public BidderNoticePreferencesType getReturnedBidderNoticePreferences()
  {
    return this.returnedBidderNoticePreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedCombinedPaymentPreferences.
   * 
   * @return CombinedPaymentPreferencesType
   */
  public CombinedPaymentPreferencesType getReturnedCombinedPaymentPreferences()
  {
    return this.returnedCombinedPaymentPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedCrossPromotionPreferences.
   * 
   * @return CrossPromotionPreferencesType
   */
  public CrossPromotionPreferencesType getReturnedCrossPromotionPreferences()
  {
    return this.returnedCrossPromotionPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedDispatchCutoffTimePreference.
   * 
   * @return DispatchCutoffTimePreferencesType
   */
  public DispatchCutoffTimePreferencesType getReturnedDispatchCutoffTimePreference()
  {
    return this.returnedDispatchCutoffTimePreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedEmailShipmentTrackingNumberPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedEmailShipmentTrackingNumberPreference()
  {
    return this.returnedEmailShipmentTrackingNumberPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedEndOfAuctionEmailPreferences.
   * 
   * @return EndOfAuctionEmailPreferencesType
   */
  public EndOfAuctionEmailPreferencesType getReturnedEndOfAuctionEmailPreferences()
  {
    return this.returnedEndOfAuctionEmailPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedGlobalShippingProgramListingPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedGlobalShippingProgramListingPreference()
  {
    return this.returnedGlobalShippingProgramListingPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedOfferGlobalShippingProgramPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedOfferGlobalShippingProgramPreference()
  {
    return this.returnedOfferGlobalShippingProgramPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedOutOfStockControlPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedOutOfStockControlPreference()
  {
    return this.returnedOutOfStockControlPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedOverrideGSPServiceWithIntlServicePreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedOverrideGSPServiceWithIntlServicePreference()
  {
    return this.returnedOverrideGSPServiceWithIntlServicePreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedPickupDropoffSellerPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedPickupDropoffSellerPreference()
  {
    return this.returnedPickupDropoffSellerPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedProStoresPreference.
   * 
   * @return ProStoresCheckoutPreferenceType
   */
  public ProStoresCheckoutPreferenceType getReturnedProStoresPreference()
  {
    return this.returnedProStoresPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedPurchaseReminderEmailPreferences.
   * 
   * @return PurchaseReminderEmailPreferencesType
   */
  public PurchaseReminderEmailPreferencesType getReturnedPurchaseReminderEmailPreferences()
  {
    return this.returnedPurchaseReminderEmailPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedRequiredShipPhoneNumberPreference.
   * 
   * @return Boolean
   */
  public Boolean getReturnedRequiredShipPhoneNumberPreference()
  {
    return this.returnedRequiredShipPhoneNumberPreference;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerExcludeShipToLocationPreferences.
   * 
   * @return SellerExcludeShipToLocationPreferencesType
   */
  public SellerExcludeShipToLocationPreferencesType getReturnedSellerExcludeShipToLocationPreferences()
  {
    return this.returnedSellerExcludeShipToLocationPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerFavoriteItemPreferences.
   * 
   * @return SellerFavoriteItemPreferencesType
   */
  public SellerFavoriteItemPreferencesType getReturnedSellerFavoriteItemPreferences()
  {
    return this.returnedSellerFavoriteItemPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerPaymentPreferences.
   * 
   * @return SellerPaymentPreferencesType
   */
  public SellerPaymentPreferencesType getReturnedSellerPaymentPreferences()
  {
    return this.returnedSellerPaymentPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerProfilePreferences.
   * 
   * @return SellerProfilePreferencesType
   */
  public SellerProfilePreferencesType getReturnedSellerProfilePreferences()
  {
    return this.returnedSellerProfilePreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerReturnPreferences.
   * 
   * @return SellerReturnPreferencesType
   */
  public SellerReturnPreferencesType getReturnedSellerReturnPreferences()
  {
    return this.returnedSellerReturnPreferences;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedSellerThirdPartyCheckoutDisabled.
   * 
   * @return Boolean
   */
  public Boolean getReturnedSellerThirdPartyCheckoutDisabled()
  {
    return this.returnedSellerThirdPartyCheckoutDisabled;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetUserPreferencesResponseType.returnedUnpaidItemAssistancePreferences.
   * 
   * @return UnpaidItemAssistancePreferencesType
   */
  public UnpaidItemAssistancePreferencesType getReturnedUnpaidItemAssistancePreferences()
  {
    return this.returnedUnpaidItemAssistancePreferences;
  }

}

