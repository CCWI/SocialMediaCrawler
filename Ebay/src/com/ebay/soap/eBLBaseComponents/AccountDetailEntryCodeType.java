
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailEntryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountDetailEntryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="FeeInsertion"/>
 *     &lt;enumeration value="FeeBold"/>
 *     &lt;enumeration value="FeeFeatured"/>
 *     &lt;enumeration value="FeeCategoryFeatured"/>
 *     &lt;enumeration value="FeeFinalValue"/>
 *     &lt;enumeration value="PaymentCheck"/>
 *     &lt;enumeration value="PaymentCC"/>
 *     &lt;enumeration value="CreditCourtesy"/>
 *     &lt;enumeration value="CreditNoSale"/>
 *     &lt;enumeration value="CreditPartialSale"/>
 *     &lt;enumeration value="RefundCC"/>
 *     &lt;enumeration value="RefundCheck"/>
 *     &lt;enumeration value="FinanceCharge"/>
 *     &lt;enumeration value="AWDebit"/>
 *     &lt;enumeration value="AWCredit"/>
 *     &lt;enumeration value="AWMemo"/>
 *     &lt;enumeration value="CreditDuplicateListing"/>
 *     &lt;enumeration value="FeePartialSale"/>
 *     &lt;enumeration value="PaymentElectronicTransferReversal"/>
 *     &lt;enumeration value="PaymentCCOnce"/>
 *     &lt;enumeration value="FeeReturnedCheck"/>
 *     &lt;enumeration value="FeeRedepositCheck"/>
 *     &lt;enumeration value="PaymentCash"/>
 *     &lt;enumeration value="CreditInsertion"/>
 *     &lt;enumeration value="CreditBold"/>
 *     &lt;enumeration value="CreditFeatured"/>
 *     &lt;enumeration value="CreditCategoryFeatured"/>
 *     &lt;enumeration value="CreditFinalValue"/>
 *     &lt;enumeration value="FeeNSFCheck"/>
 *     &lt;enumeration value="FeeReturnCheckClose"/>
 *     &lt;enumeration value="Memo"/>
 *     &lt;enumeration value="PaymentMoneyOrder"/>
 *     &lt;enumeration value="CreditCardOnFile"/>
 *     &lt;enumeration value="CreditCardNotOnFile"/>
 *     &lt;enumeration value="Invoiced"/>
 *     &lt;enumeration value="InvoicedCreditCard"/>
 *     &lt;enumeration value="CreditTransferFrom"/>
 *     &lt;enumeration value="DebitTransferTo"/>
 *     &lt;enumeration value="InvoiceCreditBalance"/>
 *     &lt;enumeration value="eBayDebit"/>
 *     &lt;enumeration value="eBayCredit"/>
 *     &lt;enumeration value="PromotionalCredit"/>
 *     &lt;enumeration value="CCNotOnFilePerCustReq"/>
 *     &lt;enumeration value="CreditInsertionFee"/>
 *     &lt;enumeration value="CCPaymentRejected"/>
 *     &lt;enumeration value="FeeGiftIcon"/>
 *     &lt;enumeration value="CreditGiftIcon"/>
 *     &lt;enumeration value="FeeGallery"/>
 *     &lt;enumeration value="FeeFeaturedGallery"/>
 *     &lt;enumeration value="CreditGallery"/>
 *     &lt;enumeration value="CreditFeaturedGallery"/>
 *     &lt;enumeration value="ItemMoveFee"/>
 *     &lt;enumeration value="OutageCredit"/>
 *     &lt;enumeration value="CreditPSA"/>
 *     &lt;enumeration value="CreditPCGS"/>
 *     &lt;enumeration value="FeeReserve"/>
 *     &lt;enumeration value="CreditReserve"/>
 *     &lt;enumeration value="eBayVISACredit"/>
 *     &lt;enumeration value="BBAdminCredit"/>
 *     &lt;enumeration value="BBAdminDebit"/>
 *     &lt;enumeration value="ReferrerCredit"/>
 *     &lt;enumeration value="ReferrerDebit"/>
 *     &lt;enumeration value="SwitchCurrency"/>
 *     &lt;enumeration value="PaymentGiftCertificate"/>
 *     &lt;enumeration value="PaymentWireTransfer"/>
 *     &lt;enumeration value="PaymentHomeBanking"/>
 *     &lt;enumeration value="PaymentElectronicTransfer"/>
 *     &lt;enumeration value="PaymentAdjustmentCredit"/>
 *     &lt;enumeration value="PaymentAdjustmentDebit"/>
 *     &lt;enumeration value="Chargeoff"/>
 *     &lt;enumeration value="ChargeoffRecovery"/>
 *     &lt;enumeration value="ChargeoffBankruptcy"/>
 *     &lt;enumeration value="ChargeoffSuspended"/>
 *     &lt;enumeration value="ChargeoffDeceased"/>
 *     &lt;enumeration value="ChargeoffOther"/>
 *     &lt;enumeration value="ChargeoffWacko"/>
 *     &lt;enumeration value="FinanceChargeReversal"/>
 *     &lt;enumeration value="FVFCreditReversal"/>
 *     &lt;enumeration value="ForeignFundsConvert"/>
 *     &lt;enumeration value="ForeignFundsCheckReversal"/>
 *     &lt;enumeration value="EOMRestriction"/>
 *     &lt;enumeration value="AllFeesCredit"/>
 *     &lt;enumeration value="SetOnHold"/>
 *     &lt;enumeration value="RevertUserState"/>
 *     &lt;enumeration value="DirectDebitOnFile"/>
 *     &lt;enumeration value="DirectDebitNotOnFile"/>
 *     &lt;enumeration value="PaymentDirectDebit"/>
 *     &lt;enumeration value="DirectDebitReversal"/>
 *     &lt;enumeration value="DirectDebitReturnedItem"/>
 *     &lt;enumeration value="FeeHighlight"/>
 *     &lt;enumeration value="CreditHighlight"/>
 *     &lt;enumeration value="BulkUserSuspension"/>
 *     &lt;enumeration value="FeeRealEstate30DaysListing"/>
 *     &lt;enumeration value="CreditRealEstate30DaysListing"/>
 *     &lt;enumeration value="TradingLimitOverrideOn"/>
 *     &lt;enumeration value="TradingLimitOverrideOff"/>
 *     &lt;enumeration value="EquifaxRealtimeFee"/>
 *     &lt;enumeration value="CreditEquifaxRealtimeFee"/>
 *     &lt;enumeration value="PaymentEquifaxDebit"/>
 *     &lt;enumeration value="PaymentEquifaxCredit"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="AutoTraderOn"/>
 *     &lt;enumeration value="AutoTraderOff"/>
 *     &lt;enumeration value="PaperInvoiceOn"/>
 *     &lt;enumeration value="PaperInvoiceOff"/>
 *     &lt;enumeration value="AccountStateSwitch"/>
 *     &lt;enumeration value="FVFCreditReversalAutomatic"/>
 *     &lt;enumeration value="CreditSoftOutage"/>
 *     &lt;enumeration value="LACatalogFee"/>
 *     &lt;enumeration value="LAExtraItem"/>
 *     &lt;enumeration value="LACatalogItemFeeRefund"/>
 *     &lt;enumeration value="LACatalogInsertionRefund"/>
 *     &lt;enumeration value="LAFinalValueFee"/>
 *     &lt;enumeration value="LAFinalValueFeeRefund"/>
 *     &lt;enumeration value="LABuyerPremiumPercentageFee"/>
 *     &lt;enumeration value="LABuyerPremiumPercentageFeeRefund"/>
 *     &lt;enumeration value="LAAudioVideoFee"/>
 *     &lt;enumeration value="LAAudioVideoFeeRefund"/>
 *     &lt;enumeration value="FeeIPIXPhoto"/>
 *     &lt;enumeration value="FeeIPIXSlideShow"/>
 *     &lt;enumeration value="CreditIPIXPhoto"/>
 *     &lt;enumeration value="CreditIPIXSlideShow"/>
 *     &lt;enumeration value="FeeTenDayAuction"/>
 *     &lt;enumeration value="CreditTenDayAuction"/>
 *     &lt;enumeration value="TemporaryCredit"/>
 *     &lt;enumeration value="TemporaryCreditReversal"/>
 *     &lt;enumeration value="SubscriptionAABasic"/>
 *     &lt;enumeration value="SubscriptionAAPro"/>
 *     &lt;enumeration value="CreditAABasic"/>
 *     &lt;enumeration value="CreditAAPro"/>
 *     &lt;enumeration value="FeeLargePicture"/>
 *     &lt;enumeration value="CreditLargePicture"/>
 *     &lt;enumeration value="FeePicturePack"/>
 *     &lt;enumeration value="CreditPicturePackPartial"/>
 *     &lt;enumeration value="CreditPicturePackFull"/>
 *     &lt;enumeration value="SubscriptioneBayStores"/>
 *     &lt;enumeration value="CrediteBayStores"/>
 *     &lt;enumeration value="FeeInsertionFixedPrice"/>
 *     &lt;enumeration value="CreditInsertionFixedPrice"/>
 *     &lt;enumeration value="FeeFinalValueFixedPrice"/>
 *     &lt;enumeration value="CreditFinalValueFixedPrice"/>
 *     &lt;enumeration value="ElectronicInvoiceOn"/>
 *     &lt;enumeration value="ElectronicInvoiceOff"/>
 *     &lt;enumeration value="FlagDDDDPending"/>
 *     &lt;enumeration value="FlagDDPaymentConfirmed"/>
 *     &lt;enumeration value="FixedPriceDurationFee"/>
 *     &lt;enumeration value="FixedPriceDurationCredit"/>
 *     &lt;enumeration value="BuyItNowFee"/>
 *     &lt;enumeration value="BuyItNowCredit"/>
 *     &lt;enumeration value="FeeSchedule"/>
 *     &lt;enumeration value="CreditSchedule"/>
 *     &lt;enumeration value="SubscriptionSMBasic"/>
 *     &lt;enumeration value="SubscriptionSMBasicPro"/>
 *     &lt;enumeration value="CreditSMBasic"/>
 *     &lt;enumeration value="CreditSMBasicPro"/>
 *     &lt;enumeration value="StoresGTCFee"/>
 *     &lt;enumeration value="StoresGTCCredit"/>
 *     &lt;enumeration value="ListingDesignerFee"/>
 *     &lt;enumeration value="ListingDesignerCredit"/>
 *     &lt;enumeration value="ExtendedAuctionFee"/>
 *     &lt;enumeration value="ExtendedAcutionCredit"/>
 *     &lt;enumeration value="PayPalOTPSucc"/>
 *     &lt;enumeration value="PayPalOTPPend"/>
 *     &lt;enumeration value="PayPalFailed"/>
 *     &lt;enumeration value="PayPalChargeBack"/>
 *     &lt;enumeration value="ChargeBack"/>
 *     &lt;enumeration value="ChargeBackReversal"/>
 *     &lt;enumeration value="PayPalRefund"/>
 *     &lt;enumeration value="BonusPointsAddition"/>
 *     &lt;enumeration value="BonusPointsReduction"/>
 *     &lt;enumeration value="BonusPointsPaymentAutomatic"/>
 *     &lt;enumeration value="BonusPointsPaymentManual"/>
 *     &lt;enumeration value="BonusPointsPaymentReversal"/>
 *     &lt;enumeration value="BonusPointsCashPayout"/>
 *     &lt;enumeration value="VATCredit"/>
 *     &lt;enumeration value="VATDebit"/>
 *     &lt;enumeration value="VATStatusChangePending"/>
 *     &lt;enumeration value="VATStatusChangeApproved"/>
 *     &lt;enumeration value="VATStatusChange_Denied"/>
 *     &lt;enumeration value="VATStatusDeletedByCSR"/>
 *     &lt;enumeration value="VATStatusDeletedByUser"/>
 *     &lt;enumeration value="SMProListingDesignerFee"/>
 *     &lt;enumeration value="SMProListingDesignerCredit"/>
 *     &lt;enumeration value="StoresSuccessfulListingFee"/>
 *     &lt;enumeration value="StoresSuccessfulListingFeeCredit"/>
 *     &lt;enumeration value="StoresReferralFee"/>
 *     &lt;enumeration value="StoresReferralCredit"/>
 *     &lt;enumeration value="SubtitleFee"/>
 *     &lt;enumeration value="SubtitleFeeCredit"/>
 *     &lt;enumeration value="eBayStoreInventorySubscriptionCredit"/>
 *     &lt;enumeration value="AutoPmntReqExempt"/>
 *     &lt;enumeration value="AutoPmntReqRein"/>
 *     &lt;enumeration value="PictureManagerSubscriptionFee"/>
 *     &lt;enumeration value="PictureManagerSubscriptionFeeCredit"/>
 *     &lt;enumeration value="SellerReportsBasicFee"/>
 *     &lt;enumeration value="SellerReportsBasicCredit"/>
 *     &lt;enumeration value="SellerReportsPlusFee"/>
 *     &lt;enumeration value="SellerReportsPlusCredit"/>
 *     &lt;enumeration value="PaypalOnFile"/>
 *     &lt;enumeration value="PaypalOnFileByCSR"/>
 *     &lt;enumeration value="PaypalOffFile"/>
 *     &lt;enumeration value="BorderFee"/>
 *     &lt;enumeration value="BorderFeeCredit"/>
 *     &lt;enumeration value="FeeSearchableMobileDE"/>
 *     &lt;enumeration value="SalesReportsPlusFee"/>
 *     &lt;enumeration value="SalesReportsPlusCredit"/>
 *     &lt;enumeration value="CreditSearchableMobileDE"/>
 *     &lt;enumeration value="EmailMarketingFee"/>
 *     &lt;enumeration value="EmailMarketingCredit"/>
 *     &lt;enumeration value="FeePictureShow"/>
 *     &lt;enumeration value="CreditPictureShow"/>
 *     &lt;enumeration value="ProPackBundleFee"/>
 *     &lt;enumeration value="ProPackBundleFeeCredit"/>
 *     &lt;enumeration value="BasicUpgradePackBundleFee"/>
 *     &lt;enumeration value="BasicUpgradePackBundleFeeCredit"/>
 *     &lt;enumeration value="ValuePackBundleFee"/>
 *     &lt;enumeration value="ValuePackBundleFeeCredit"/>
 *     &lt;enumeration value="ProPackPlusBundleFee"/>
 *     &lt;enumeration value="ProPackPlusBundleFeeCredit"/>
 *     &lt;enumeration value="FinalEntry"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ExtendedDurationFee"/>
 *     &lt;enumeration value="ExtendedDurationFeeCredit"/>
 *     &lt;enumeration value="InternationalListingFee"/>
 *     &lt;enumeration value="InternationalListingCredit"/>
 *     &lt;enumeration value="MarketplaceResearchExpiredSubscriptionFee"/>
 *     &lt;enumeration value="MarketplaceResearchExpiredSubscriptionFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchBasicSubscriptionFee"/>
 *     &lt;enumeration value="MarketplaceResearchBasicSubscriptionFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchProSubscriptionFee"/>
 *     &lt;enumeration value="BasicBundleFee"/>
 *     &lt;enumeration value="BasicBundleFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchProSubscriptionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalSubscriptionFee"/>
 *     &lt;enumeration value="VehicleLocalSubscriptionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalInsertionFee"/>
 *     &lt;enumeration value="VehicleLocalInsertionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalFinalValueFee"/>
 *     &lt;enumeration value="VehicleLocalFinalValueFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalGTCFee"/>
 *     &lt;enumeration value="VehicleLocalGTCFeeCredit"/>
 *     &lt;enumeration value="eBayMotorsProFee"/>
 *     &lt;enumeration value="CrediteBayMotorsProFee"/>
 *     &lt;enumeration value="eBayMotorsProFeatureFee"/>
 *     &lt;enumeration value="CrediteBayMotorsProFeatureFee"/>
 *     &lt;enumeration value="FeeGalleryPlus"/>
 *     &lt;enumeration value="CreditGalleryPlus"/>
 *     &lt;enumeration value="PrivateListing"/>
 *     &lt;enumeration value="CreditPrivateListing"/>
 *     &lt;enumeration value="ImmoProFee"/>
 *     &lt;enumeration value="CreditImmoProFee"/>
 *     &lt;enumeration value="ImmoProFeatureFee"/>
 *     &lt;enumeration value="CreditImmoProFeatureFee"/>
 *     &lt;enumeration value="RealEstateProFee"/>
 *     &lt;enumeration value="CreditRealEstateProFee"/>
 *     &lt;enumeration value="RealEstateProFeatureFee"/>
 *     &lt;enumeration value="CreditRealEstateProFeatureFee"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="CreditFinalValueShipping"/>
 *     &lt;enumeration value="FeeFinalValueShipping"/>
 *     &lt;enumeration value="FeeReturnShipping"/>
 *     &lt;enumeration value="CreditReturnShipping"/>
 *     &lt;enumeration value="FeeGlobalShippingProgram"/>
 *     &lt;enumeration value="CreditGlobalShippingProgram"/>
 *     &lt;enumeration value="FeeAuctionEndEarly"/>
 *     &lt;enumeration value="CreditAuctionEndEarly"/>
 *     &lt;enumeration value="FeeFedExShippingLabel"/>
 *     &lt;enumeration value="CreditFedExShippingLabel"/>
 *     &lt;enumeration value="FeeReturnRefund"/>
 *     &lt;enumeration value="CreditReturnRefund"/>
 *     &lt;enumeration value="FeeStoresSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="CreditStoresSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="FeeVehicleSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="CreditVehicleSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="FeeVehicleSubscription"/>
 *     &lt;enumeration value="CreditVehicleSubscription"/>
 *     &lt;enumeration value="FeeAUPostShippingLabel"/>
 *     &lt;enumeration value="CreditAUPostShippingLabel"/>
 *     &lt;enumeration value="FeeAPACFedExShippingLabel"/>
 *     &lt;enumeration value="CreditAPACFedExShippingLabel"/>
 *     &lt;enumeration value="FeeAPACTNTShippingLabel"/>
 *     &lt;enumeration value="CreditAPACTNTShippingLabel"/>
 *     &lt;enumeration value="FeeEBPReimbursement"/>
 *     &lt;enumeration value="CreditEBPReimbursement"/>
 *     &lt;enumeration value="FeePromotedListingFeature"/>
 *     &lt;enumeration value="CreditPromotedListingFeature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccountDetailEntryCodeType")
@XmlEnum
public enum AccountDetailEntryCodeType {


    /**
     * 
     * 					 The reason for the charge is unknown.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 					  The fee for listing an item for sale on eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeInsertion")
    FEE_INSERTION("FeeInsertion"),

    /**
     * 
     * 					 The fee for a listing title in boldface font.
     * 					
     * 
     */
    @XmlEnumValue("FeeBold")
    FEE_BOLD("FeeBold"),

    /**
     * 
     * 					  The fee for adding an optional feature to a listing,
     * 					  such as a reserve fee or a listing upgrade fee.
     * 					
     * 
     */
    @XmlEnumValue("FeeFeatured")
    FEE_FEATURED("FeeFeatured"),

    /**
     * 
     * 					 (out)
     * 					
     * 
     */
    @XmlEnumValue("FeeCategoryFeatured")
    FEE_CATEGORY_FEATURED("FeeCategoryFeatured"),

    /**
     * 
     * 					 The fee charged when a listed item sells. The fee
     * 					 is a percentage of the final sale price.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValue")
    FEE_FINAL_VALUE("FeeFinalValue"),

    /**
     * 
     * 					A payment by check made by a seller to eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCheck")
    PAYMENT_CHECK("PaymentCheck"),

    /**
     * 
     * 					A payment by credit card made by a seller to eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCC")
    PAYMENT_CC("PaymentCC"),

    /**
     * 
     * 					 (out)
     * 					
     * 
     */
    @XmlEnumValue("CreditCourtesy")
    CREDIT_COURTESY("CreditCourtesy"),

    /**
     * 
     * 					 (out)
     * 					
     * 
     */
    @XmlEnumValue("CreditNoSale")
    CREDIT_NO_SALE("CreditNoSale"),

    /**
     * 
     * 					 (out)
     * 					
     * 
     */
    @XmlEnumValue("CreditPartialSale")
    CREDIT_PARTIAL_SALE("CreditPartialSale"),

    /**
     * 
     * 					 A refund made by eBay to the seller's credit card.
     * 					
     * 
     */
    @XmlEnumValue("RefundCC")
    REFUND_CC("RefundCC"),

    /**
     * 
     * 					A refund made by eBay to the seller by check.
     * 					
     * 
     */
    @XmlEnumValue("RefundCheck")
    REFUND_CHECK("RefundCheck"),

    /**
     * 
     * 					A finance charge made to the seller's account, for example,
     * 					the monthly finance charge added to an account whose balance has not been
     * 					paid.
     * 					
     * 
     */
    @XmlEnumValue("FinanceCharge")
    FINANCE_CHARGE("FinanceCharge"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AWDebit")
    AW_DEBIT("AWDebit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AWCredit")
    AW_CREDIT("AWCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AWMemo")
    AW_MEMO("AWMemo"),

    /**
     * 
     * 					A credit made by eBay for a duplicate listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditDuplicateListing")
    CREDIT_DUPLICATE_LISTING("CreditDuplicateListing"),

    /**
     * 
     * 					A fee charged by eBay for a partial sale.
     * 					
     * 
     */
    @XmlEnumValue("FeePartialSale")
    FEE_PARTIAL_SALE("FeePartialSale"),

    /**
     * 
     * 					A reversal of an electronic transfer payment.
     * 					
     * 
     */
    @XmlEnumValue("PaymentElectronicTransferReversal")
    PAYMENT_ELECTRONIC_TRANSFER_REVERSAL("PaymentElectronicTransferReversal"),

    /**
     * 
     * 					A one-time payment to the account made by
     * 					credit card.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCCOnce")
    PAYMENT_CC_ONCE("PaymentCCOnce"),

    /**
     * 
     * 					A fee charged by eBay for a returned check.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnedCheck")
    FEE_RETURNED_CHECK("FeeReturnedCheck"),

    /**
     * 
     * 					A fee charged by eBay when a check must be redeposited
     * 					to collect funds.
     * 					
     * 
     */
    @XmlEnumValue("FeeRedepositCheck")
    FEE_REDEPOSIT_CHECK("FeeRedepositCheck"),

    /**
     * 
     * 					A cash payment made on the seller's account.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCash")
    PAYMENT_CASH("PaymentCash"),

    /**
     * 
     * 					A credit issued by eBay for an insertion fee.
     * 					If a listed item does not sell or results in an
     * 					Unpaid Item (UPI) dispute, the seller can relist
     * 					the item. If the item sells the second time, eBay
     * 					credits the insertion fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertion")
    CREDIT_INSERTION("CreditInsertion"),

    /**
     * 
     * 					A credit issued by eBay for the Bold listing fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditBold")
    CREDIT_BOLD("CreditBold"),

    /**
     * 
     * 					A credit issued by eBay for the Featured listing fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditFeatured")
    CREDIT_FEATURED("CreditFeatured"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("CreditCategoryFeatured")
    CREDIT_CATEGORY_FEATURED("CreditCategoryFeatured"),

    /**
     * 
     * 					A credit issued by eBay for the Final Value Fee.
     * 					Issued as a result of an Unpaid Item dispute, under
     * 					some circumstances.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValue")
    CREDIT_FINAL_VALUE("CreditFinalValue"),

    /**
     * 
     * 					A fee charged by eBay when the seller's check does not clear
     * 					due to insufficient funds.
     * 					
     * 
     */
    @XmlEnumValue("FeeNSFCheck")
    FEE_NSF_CHECK("FeeNSFCheck"),

    /**
     * 
     * 					A fee charged by eBay when the seller's check does not clear
     * 					because the account has been closed.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnCheckClose")
    FEE_RETURN_CHECK_CLOSE("FeeReturnCheckClose"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("Memo")
    MEMO("Memo"),

    /**
     * 
     * 					A payment made to the account by money order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentMoneyOrder")
    PAYMENT_MONEY_ORDER("PaymentMoneyOrder"),

    /**
     * 
     * 					An automatic monthly charge of the seller's invoice
     * 					amount made by eBay to a credit card the seller has placed
     * 					on file.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardOnFile")
    CREDIT_CARD_ON_FILE("CreditCardOnFile"),

    /**
     * 
     * 					A one-time payment made by a credit card
     * 					that is not on file with eBay for automatic monthly
     * 					payments.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardNotOnFile")
    CREDIT_CARD_NOT_ON_FILE("CreditCardNotOnFile"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("Invoiced")
    INVOICED("Invoiced"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("InvoicedCreditCard")
    INVOICED_CREDIT_CARD("InvoicedCreditCard"),

    /**
     * 
     * 					A transfer from another account to this account,
     * 					resulting in a credit to this account.
     * 					
     * 
     */
    @XmlEnumValue("CreditTransferFrom")
    CREDIT_TRANSFER_FROM("CreditTransferFrom"),

    /**
     * 
     * 					A transfer from this account to another account,
     * 					resulting in a debit to this account.
     * 					
     * 
     */
    @XmlEnumValue("DebitTransferTo")
    DEBIT_TRANSFER_TO("DebitTransferTo"),

    /**
     * 
     * 					A credit balance for an account's invoice period,
     * 					meaning that the seller should not pay.
     * 					
     * 
     */
    @XmlEnumValue("InvoiceCreditBalance")
    INVOICE_CREDIT_BALANCE("InvoiceCreditBalance"),

    /**
     * 
     * 					An all-purpose code for debits that are manually applied to auctions,
     * 					for example, when the credit cannot be applied to an item number
     * 					
     * 
     */
    @XmlEnumValue("eBayDebit")
    E_BAY_DEBIT("eBayDebit"),

    /**
     * 
     * 					An all-purpose code for credits that are manually applied to auctions,
     * 					for example, when the credit cannot be applied to an item number
     * 					
     * 
     */
    @XmlEnumValue("eBayCredit")
    E_BAY_CREDIT("eBayCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PromotionalCredit")
    PROMOTIONAL_CREDIT("PromotionalCredit"),

    /**
     * 
     * 					A note that the credit card is not
     * 					on file at the customer's request.
     * 					
     * 
     */
    @XmlEnumValue("CCNotOnFilePerCustReq")
    CC_NOT_ON_FILE_PER_CUST_REQ("CCNotOnFilePerCustReq"),

    /**
     * 
     * 					A credit issued by eBay for an insertion
     * 					fee when an item is relisted.
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertionFee")
    CREDIT_INSERTION_FEE("CreditInsertionFee"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("CCPaymentRejected")
    CC_PAYMENT_REJECTED("CCPaymentRejected"),

    /**
     * 
     * 					A fee charged by eBay for adding a gift icon to
     * 					a listing. The gift icon highlights the item as a good
     * 					gift and might offer gift services, such as wrapping
     * 					or shipping.
     * 					
     * 
     */
    @XmlEnumValue("FeeGiftIcon")
    FEE_GIFT_ICON("FeeGiftIcon"),

    /**
     * 
     * 					A credit issued by eBay for the gift item
     * 					fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditGiftIcon")
    CREDIT_GIFT_ICON("CreditGiftIcon"),

    /**
     * 
     * 					A fee charged by eBay for listing an item
     * 					in the Picture Gallery. A buyer sees a picture of
     * 					the item when browsing a category, before moving to
     * 					the item's listing page.
     * 					
     * 
     */
    @XmlEnumValue("FeeGallery")
    FEE_GALLERY("FeeGallery"),

    /**
     * 
     * 					A fee charged by eBay for listing an item
     * 					in the Featured section at the top of the Picture Gallery
     * 					page.
     * 					
     * 
     */
    @XmlEnumValue("FeeFeaturedGallery")
    FEE_FEATURED_GALLERY("FeeFeaturedGallery"),

    /**
     * 
     * 					A credit issued by eBay for the Gallery fee
     * 					charged when the item was listed.
     * 					
     * 
     */
    @XmlEnumValue("CreditGallery")
    CREDIT_GALLERY("CreditGallery"),

    /**
     * 
     * 					A credit issued by eBay for the Featured Gallery
     * 					fee charged when the item was listed.
     * 					
     * 
     */
    @XmlEnumValue("CreditFeaturedGallery")
    CREDIT_FEATURED_GALLERY("CreditFeaturedGallery"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ItemMoveFee")
    ITEM_MOVE_FEE("ItemMoveFee"),

    /**
     * 
     * 					A credit issued by eBay when listings are not available
     * 					due to system downtime. The downtime can be a title search
     * 					outage or a hard outage. See the online help for details.
     * 					
     * 
     */
    @XmlEnumValue("OutageCredit")
    OUTAGE_CREDIT("OutageCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("CreditPSA")
    CREDIT_PSA("CreditPSA"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("CreditPCGS")
    CREDIT_PCGS("CreditPCGS"),

    /**
     * 
     * 					A fee charged by eBay when an item is listed with
     * 					a reserve price. The fee is credited when the auction
     * 					completes successfully.
     * 					
     * 
     */
    @XmlEnumValue("FeeReserve")
    FEE_RESERVE("FeeReserve"),

    /**
     * 
     * 					A credit issued by eBay for a reserve price auction
     * 					when the auction completes successfully.
     * 					
     * 
     */
    @XmlEnumValue("CreditReserve")
    CREDIT_RESERVE("CreditReserve"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("eBayVISACredit")
    E_BAY_VISA_CREDIT("eBayVISACredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("BBAdminCredit")
    BB_ADMIN_CREDIT("BBAdminCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("BBAdminDebit")
    BB_ADMIN_DEBIT("BBAdminDebit"),

    /**
     * 
     * 					A credit issued by eBay to a Store owner
     * 					who has promoted items outside of eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReferrerCredit")
    REFERRER_CREDIT("ReferrerCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ReferrerDebit")
    REFERRER_DEBIT("ReferrerDebit"),

    /**
     * 
     * 					A switch from one billing currency to another.
     * 					The billing currency can be USD, EUR, CAD, GBP, AUD,
     * 					JPY, or TWD.
     * 					
     * 
     */
    @XmlEnumValue("SwitchCurrency")
    SWITCH_CURRENCY("SwitchCurrency"),

    /**
     * 
     * 					A payment made to the account by gift certificate.
     * 					
     * 
     */
    @XmlEnumValue("PaymentGiftCertificate")
    PAYMENT_GIFT_CERTIFICATE("PaymentGiftCertificate"),

    /**
     * 
     * 					A payment made to the account by wire transfer.
     * 					
     * 
     */
    @XmlEnumValue("PaymentWireTransfer")
    PAYMENT_WIRE_TRANSFER("PaymentWireTransfer"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaymentHomeBanking")
    PAYMENT_HOME_BANKING("PaymentHomeBanking"),

    /**
     * 
     * 					A one-time payment made to the account by electronic
     * 					transfer.
     * 					
     * 
     */
    @XmlEnumValue("PaymentElectronicTransfer")
    PAYMENT_ELECTRONIC_TRANSFER("PaymentElectronicTransfer"),

    /**
     * 
     * 					A credit (addition) made by eBay to the seller's account
     * 					when a payment needs to be adjusted.
     * 					
     * 
     */
    @XmlEnumValue("PaymentAdjustmentCredit")
    PAYMENT_ADJUSTMENT_CREDIT("PaymentAdjustmentCredit"),

    /**
     * 
     * 					A debit (deduction) made by eBay to the seller's account
     * 					when a payment needs to be adjusted.
     * 					
     * 
     */
    @XmlEnumValue("PaymentAdjustmentDebit")
    PAYMENT_ADJUSTMENT_DEBIT("PaymentAdjustmentDebit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("Chargeoff")
    CHARGEOFF("Chargeoff"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffRecovery")
    CHARGEOFF_RECOVERY("ChargeoffRecovery"),

    /**
     * 
     * 					A writeoff of the account charge by eBay
     * 					because the seller has declared bankruptcy.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffBankruptcy")
    CHARGEOFF_BANKRUPTCY("ChargeoffBankruptcy"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffSuspended")
    CHARGEOFF_SUSPENDED("ChargeoffSuspended"),

    /**
     * 
     * 					A writeoff of the account charge by eBay
     * 					because the seller is deceased.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffDeceased")
    CHARGEOFF_DECEASED("ChargeoffDeceased"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffOther")
    CHARGEOFF_OTHER("ChargeoffOther"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffWacko")
    CHARGEOFF_WACKO("ChargeoffWacko"),

    /**
     * 
     * 					A reversal of a finance charge, made by eBay.
     * 					The finance charge is added if the seller does not pay
     * 					the monthly account balance on time.
     * 					
     * 
     */
    @XmlEnumValue("FinanceChargeReversal")
    FINANCE_CHARGE_REVERSAL("FinanceChargeReversal"),

    /**
     * 
     * 					A reversal of a Final Value Fee credit, resulting
     * 					in the fee being charged to the seller. The Final Value
     * 					Fee can be credited as a result of an Unpaid Item Dispute.
     * 					If the buyer later pays, the seller can request a reversal.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversal")
    FVF_CREDIT_REVERSAL("FVFCreditReversal"),

    /**
     * 
     * 					A fee charged for currency conversion.
     * 					
     * 
     */
    @XmlEnumValue("ForeignFundsConvert")
    FOREIGN_FUNDS_CONVERT("ForeignFundsConvert"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ForeignFundsCheckReversal")
    FOREIGN_FUNDS_CHECK_REVERSAL("ForeignFundsCheckReversal"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("EOMRestriction")
    EOM_RESTRICTION("EOMRestriction"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AllFeesCredit")
    ALL_FEES_CREDIT("AllFeesCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("SetOnHold")
    SET_ON_HOLD("SetOnHold"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("RevertUserState")
    REVERT_USER_STATE("RevertUserState"),

    /**
     * 
     * 					A monthly payment made by automatic direct debit to the
     * 					seller's checking account, when the account information
     * 					is on file.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitOnFile")
    DIRECT_DEBIT_ON_FILE("DirectDebitOnFile"),

    /**
     * 
     * 					A one-time payment made by direct debit to the seller's
     * 					checking account, when the account information is not on file,
     * 					but is provided for this payment.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitNotOnFile")
    DIRECT_DEBIT_NOT_ON_FILE("DirectDebitNotOnFile"),

    /**
     * 
     * 					A payment made by direct debit from the seller's
     * 					checking account when the seller has requested automatic
     * 					monthly invoice payments.
     * 					
     * 
     */
    @XmlEnumValue("PaymentDirectDebit")
    PAYMENT_DIRECT_DEBIT("PaymentDirectDebit"),

    /**
     * 
     * 					A reversal of a payment made by direct debit
     * 					from the seller's checking account.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitReversal")
    DIRECT_DEBIT_REVERSAL("DirectDebitReversal"),

    /**
     * 
     * 					A reversal of a payment made by direct debit
     * 					from a seller's checking account when an item is returned
     * 					by the buyer.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitReturnedItem")
    DIRECT_DEBIT_RETURNED_ITEM("DirectDebitReturnedItem"),

    /**
     * 
     * 					 A fee charged by eBay for adding a colored band to
     * 					 emphasize a listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeHighlight")
    FEE_HIGHLIGHT("FeeHighlight"),

    /**
     * 
     * 					A credit issued by eBay for a highlight fee on an
     * 					item's listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditHighlight")
    CREDIT_HIGHLIGHT("CreditHighlight"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("BulkUserSuspension")
    BULK_USER_SUSPENSION("BulkUserSuspension"),

    /**
     * 
     * 					A fee charged for a 30-day real estate
     * 					listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeRealEstate30DaysListing")
    FEE_REAL_ESTATE_30_DAYS_LISTING("FeeRealEstate30DaysListing"),

    /**
     * 
     * 					A credit for a 30-day real estate listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstate30DaysListing")
    CREDIT_REAL_ESTATE_30_DAYS_LISTING("CreditRealEstate30DaysListing"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("TradingLimitOverrideOn")
    TRADING_LIMIT_OVERRIDE_ON("TradingLimitOverrideOn"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("TradingLimitOverrideOff")
    TRADING_LIMIT_OVERRIDE_OFF("TradingLimitOverrideOff"),

    /**
     * 
     * 					A fee charged to sellers who do not provide a credit card
     * 					or checking account number to verify identify.
     * 					
     * 
     */
    @XmlEnumValue("EquifaxRealtimeFee")
    EQUIFAX_REALTIME_FEE("EquifaxRealtimeFee"),

    /**
     * 
     * 					A credit granted for an EquifaxRealtimeFee.
     * 					
     * 
     */
    @XmlEnumValue("CreditEquifaxRealtimeFee")
    CREDIT_EQUIFAX_REALTIME_FEE("CreditEquifaxRealtimeFee"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaymentEquifaxDebit")
    PAYMENT_EQUIFAX_DEBIT("PaymentEquifaxDebit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaymentEquifaxCredit")
    PAYMENT_EQUIFAX_CREDIT("PaymentEquifaxCredit"),

    /**
     * 
     * 					Two accounts with the same owner but different user IDs
     * 					have been merged into one.
     * 					
     * 
     */
    @XmlEnumValue("Merged")
    MERGED("Merged"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AutoTraderOn")
    AUTO_TRADER_ON("AutoTraderOn"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AutoTraderOff")
    AUTO_TRADER_OFF("AutoTraderOff"),

    /**
     * 
     * 					The option to send the seller paper invoices
     * 					has been turned on.
     * 					
     * 
     */
    @XmlEnumValue("PaperInvoiceOn")
    PAPER_INVOICE_ON("PaperInvoiceOn"),

    /**
     * 
     * 					The option to send the seller paper invoices
     * 					has been turned off.
     * 					
     * 
     */
    @XmlEnumValue("PaperInvoiceOff")
    PAPER_INVOICE_OFF("PaperInvoiceOff"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AccountStateSwitch")
    ACCOUNT_STATE_SWITCH("AccountStateSwitch"),

    /**
     * 
     * 					An automatic reversal of a Final Value Fee
     * 					credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversalAutomatic")
    FVF_CREDIT_REVERSAL_AUTOMATIC("FVFCreditReversalAutomatic"),

    /**
     * 
     * 					A credit granted by eBay when a title search
     * 					outage of one hour or longer occurs on the site.
     * 					
     * 
     */
    @XmlEnumValue("CreditSoftOutage")
    CREDIT_SOFT_OUTAGE("CreditSoftOutage"),

    /**
     * 
     * 					A fee charged for listing a lot (one or more items) in a
     * 					Live Auction catalog.
     * 					
     * 
     */
    @XmlEnumValue("LACatalogFee")
    LA_CATALOG_FEE("LACatalogFee"),

    /**
     * 
     * 					A fee charged for listing an extra item in a Live Auction.
     * 					
     * 
     */
    @XmlEnumValue("LAExtraItem")
    LA_EXTRA_ITEM("LAExtraItem"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("LACatalogItemFeeRefund")
    LA_CATALOG_ITEM_FEE_REFUND("LACatalogItemFeeRefund"),

    /**
     * 
     * 					A credit for listing an item in a Live Auction catalog.
     * 					
     * 
     */
    @XmlEnumValue("LACatalogInsertionRefund")
    LA_CATALOG_INSERTION_REFUND("LACatalogInsertionRefund"),

    /**
     * 
     * 					A Final Value Fee charged by eBay when a lot listed
     * 					on a Live Auction is sold.
     * 					
     * 
     */
    @XmlEnumValue("LAFinalValueFee")
    LA_FINAL_VALUE_FEE("LAFinalValueFee"),

    /**
     * 
     * 					A refund of a Final Value Fee that was charged
     * 					when a Live Auction lot was sold.
     * 					
     * 
     */
    @XmlEnumValue("LAFinalValueFeeRefund")
    LA_FINAL_VALUE_FEE_REFUND("LAFinalValueFeeRefund"),

    /**
     * 
     * 					A fee paid by the buyer to the auction house for
     * 					a purchase in a Live Auction.
     * 					
     * 
     */
    @XmlEnumValue("LABuyerPremiumPercentageFee")
    LA_BUYER_PREMIUM_PERCENTAGE_FEE("LABuyerPremiumPercentageFee"),

    /**
     * 
     * 					A refund of the fee paid by a buyer to the auction
     * 					house for a purchase in a Live Auction.
     * 					
     * 
     */
    @XmlEnumValue("LABuyerPremiumPercentageFeeRefund")
    LA_BUYER_PREMIUM_PERCENTAGE_FEE_REFUND("LABuyerPremiumPercentageFeeRefund"),

    /**
     * 
     * 					A fee charged for audio or video services provided
     * 					during the sale of lots at a Live Auction.
     * 					
     * 
     */
    @XmlEnumValue("LAAudioVideoFee")
    LA_AUDIO_VIDEO_FEE("LAAudioVideoFee"),

    /**
     * 
     * 					A refund for audio or video services provided at
     * 					a Live Auction.
     * 					
     * 
     */
    @XmlEnumValue("LAAudioVideoFeeRefund")
    LA_AUDIO_VIDEO_FEE_REFUND("LAAudioVideoFeeRefund"),

    /**
     * 
     * 					A fee charged for a panoramic 360-degree photo
     * 					in a listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeIPIXPhoto")
    FEE_IPIX_PHOTO("FeeIPIXPhoto"),

    /**
     * 
     * 					A fee charged for a slide show of panoramic 360-degree
     * 					photos.
     * 					
     * 
     */
    @XmlEnumValue("FeeIPIXSlideShow")
    FEE_IPIX_SLIDE_SHOW("FeeIPIXSlideShow"),

    /**
     * 
     * 					A credit granted to reverse an IPIX photo fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditIPIXPhoto")
    CREDIT_IPIX_PHOTO("CreditIPIXPhoto"),

    /**
     * 
     * 					A credit granted to reverse an IPIX slideshow fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditIPIXSlideShow")
    CREDIT_IPIX_SLIDE_SHOW("CreditIPIXSlideShow"),

    /**
     * 
     * 					A fee charged for listing an item for 10 days,
     * 					rather than one, three, five, or seven days.
     * 					
     * 
     */
    @XmlEnumValue("FeeTenDayAuction")
    FEE_TEN_DAY_AUCTION("FeeTenDayAuction"),

    /**
     * 
     * 					A credit granted to reverse a 10-day auction
     * 					fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditTenDayAuction")
    CREDIT_TEN_DAY_AUCTION("CreditTenDayAuction"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("TemporaryCredit")
    TEMPORARY_CREDIT("TemporaryCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("TemporaryCreditReversal")
    TEMPORARY_CREDIT_REVERSAL("TemporaryCreditReversal"),

    /**
     * 
     * 				      A fee charged for a subscription to Auction Assistant Basic.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionAABasic")
    SUBSCRIPTION_AA_BASIC("SubscriptionAABasic"),

    /**
     * 
     * 				      A fee charged for a subscription to Auction Assistant Pro.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionAAPro")
    SUBSCRIPTION_AA_PRO("SubscriptionAAPro"),

    /**
     * 
     * 				     A credit granted for a subscription fee charged for Auction Assistant Basic.
     * 					
     * 
     */
    @XmlEnumValue("CreditAABasic")
    CREDIT_AA_BASIC("CreditAABasic"),

    /**
     * 
     * 					A credit granted for a subscription fee charged for Auction Assistant Pro.
     * 					
     * 
     */
    @XmlEnumValue("CreditAAPro")
    CREDIT_AA_PRO("CreditAAPro"),

    /**
     * 
     * 					A fee charged by eBay for a supersized picture
     * 					in a listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeLargePicture")
    FEE_LARGE_PICTURE("FeeLargePicture"),

    /**
     * 
     * 					A credit issued by eBay for a supersized picture.
     * 					
     * 
     */
    @XmlEnumValue("CreditLargePicture")
    CREDIT_LARGE_PICTURE("CreditLargePicture"),

    /**
     * 
     * 					A fee charged by eBay for the Picture Pack feature.
     * 					The fee differs according to the number of pictures you
     * 					use. See the online help for details.
     * 					
     * 
     */
    @XmlEnumValue("FeePicturePack")
    FEE_PICTURE_PACK("FeePicturePack"),

    /**
     * 
     * 					 A partial credit issued by eBay for the Picture Pack fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditPicturePackPartial")
    CREDIT_PICTURE_PACK_PARTIAL("CreditPicturePackPartial"),

    /**
     * 
     * 					 A full credit issued by eBay for the Picture Pack fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditPicturePackFull")
    CREDIT_PICTURE_PACK_FULL("CreditPicturePackFull"),

    /**
     * 
     * 					 A monthly subscription fee charged for an eBay Store.
     * 					  The fee can be Basic, Featured, or Anchor.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptioneBayStores")
    SUBSCRIPTIONE_BAY_STORES("SubscriptioneBayStores"),

    /**
     * 
     * 					 A credit issued by eBay for the monthly fee charged
     * 					 for an eBay store.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayStores")
    CREDITE_BAY_STORES("CrediteBayStores"),

    /**
     * 
     * 					The fee charged by eBay for listing a Fixed Price item.
     * 					
     * 
     */
    @XmlEnumValue("FeeInsertionFixedPrice")
    FEE_INSERTION_FIXED_PRICE("FeeInsertionFixedPrice"),

    /**
     * 
     * 					A credit issued by eBay for listing a Fixed Price item.
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertionFixedPrice")
    CREDIT_INSERTION_FIXED_PRICE("CreditInsertionFixedPrice"),

    /**
     * 
     * 					 The Final Value Fee credit charged by eBay when
     * 					 a fixed price item sells.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValueFixedPrice")
    FEE_FINAL_VALUE_FIXED_PRICE("FeeFinalValueFixedPrice"),

    /**
     * 
     * 					A credit issued by eBay for the Final Value Fee
     * 					for a fixed price item.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValueFixedPrice")
    CREDIT_FINAL_VALUE_FIXED_PRICE("CreditFinalValueFixedPrice"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ElectronicInvoiceOn")
    ELECTRONIC_INVOICE_ON("ElectronicInvoiceOn"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ElectronicInvoiceOff")
    ELECTRONIC_INVOICE_OFF("ElectronicInvoiceOff"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("FlagDDDDPending")
    FLAG_DDDD_PENDING("FlagDDDDPending"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("FlagDDPaymentConfirmed")
    FLAG_DD_PAYMENT_CONFIRMED("FlagDDPaymentConfirmed"),

    /**
     * 
     * 					The fee charged by eBay for creating a Fixed Price
     * 					listing with a 10-day duration. Fixed Price listings
     * 					of 1, 3, 5, and 7 days are not charged this fee.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceDurationFee")
    FIXED_PRICE_DURATION_FEE("FixedPriceDurationFee"),

    /**
     * 
     * 					A credit issued by eBay for a Fixed Price listing
     * 					with a 10-day duration.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceDurationCredit")
    FIXED_PRICE_DURATION_CREDIT("FixedPriceDurationCredit"),

    /**
     * 
     * 					A fee charged by eBay for listing a Buy It Now item.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowFee")
    BUY_IT_NOW_FEE("BuyItNowFee"),

    /**
     * 
     * 					A credit issued by eBay for the fee charged for a
     * 					Buy It Now listing.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowCredit")
    BUY_IT_NOW_CREDIT("BuyItNowCredit"),

    /**
     * 
     * 					A fee for scheduling a listing to start at some
     * 					later time, up to 3 weeks after the listing is created.
     * 					
     * 
     */
    @XmlEnumValue("FeeSchedule")
    FEE_SCHEDULE("FeeSchedule"),

    /**
     * 
     * 					A credit made by eBay for the fee charged for
     * 					scheduling a listing to start after the listing is created.
     * 					
     * 
     */
    @XmlEnumValue("CreditSchedule")
    CREDIT_SCHEDULE("CreditSchedule"),

    /**
     * 
     * 					 The monthly subscription fee charged for
     * 					 Selling Manager Basic. The monthly charge is billed
     * 					 in advance.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionSMBasic")
    SUBSCRIPTION_SM_BASIC("SubscriptionSMBasic"),

    /**
     * 
     * 					The monthly subscription fee charged for
     * 					Selling Manager Pro. The monthly charge is billed
     * 					in advance.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionSMBasicPro")
    SUBSCRIPTION_SM_BASIC_PRO("SubscriptionSMBasicPro"),

    /**
     * 
     * 					A one-time credit for a free one-month
     * 					trial of Selling Manager Basic.
     * 					
     * 
     */
    @XmlEnumValue("CreditSMBasic")
    CREDIT_SM_BASIC("CreditSMBasic"),

    /**
     * 
     * 					A one-time credit for a free one-month
     * 					trial of Selling Manager Pro.
     * 					
     * 
     */
    @XmlEnumValue("CreditSMBasicPro")
    CREDIT_SM_BASIC_PRO("CreditSMBasicPro"),

    /**
     * 
     * 					The fee charged for a Good-Til-Cancelled
     * 					listing in an eBay Store. The charge is made once
     * 					each 30 days, until the listing ends.
     * 					
     * 
     */
    @XmlEnumValue("StoresGTCFee")
    STORES_GTC_FEE("StoresGTCFee"),

    /**
     * 
     * 					A credit for the fee charged for a Good-Til-Cancelled
     * 					listing in an eBay Store.
     * 					
     * 
     */
    @XmlEnumValue("StoresGTCCredit")
    STORES_GTC_CREDIT("StoresGTCCredit"),

    /**
     * 
     * 					The fee charged for using a Listing Designer theme and layout
     * 					template for a listing. The fee is displayed to the seller during
     * 					the listing process.
     * 					
     * 
     */
    @XmlEnumValue("ListingDesignerFee")
    LISTING_DESIGNER_FEE("ListingDesignerFee"),

    /**
     * 
     * 					A credit issued by eBay for a Listing Designer fee.
     * 					
     * 
     */
    @XmlEnumValue("ListingDesignerCredit")
    LISTING_DESIGNER_CREDIT("ListingDesignerCredit"),

    /**
     * 
     * 					The fee charged for listing an auction item
     * 					for 10 days.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedAuctionFee")
    EXTENDED_AUCTION_FEE("ExtendedAuctionFee"),

    /**
     * 
     * 					A credit for the fee charged for listing an
     * 					auction item for 10 days.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedAcutionCredit")
    EXTENDED_ACUTION_CREDIT("ExtendedAcutionCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PayPalOTPSucc")
    PAY_PAL_OTP_SUCC("PayPalOTPSucc"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PayPalOTPPend")
    PAY_PAL_OTP_PEND("PayPalOTPPend"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PayPalFailed")
    PAY_PAL_FAILED("PayPalFailed"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PayPalChargeBack")
    PAY_PAL_CHARGE_BACK("PayPalChargeBack"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeBack")
    CHARGE_BACK("ChargeBack"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("ChargeBackReversal")
    CHARGE_BACK_REVERSAL("ChargeBackReversal"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PayPalRefund")
    PAY_PAL_REFUND("PayPalRefund"),

    /**
     * 
     * 					An addition to the seller's eBay
     * 					Anything Points account. Each point is
     * 					equivalent to $0.01.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsAddition")
    BONUS_POINTS_ADDITION("BonusPointsAddition"),

    /**
     * 
     * 					A reduction to the seller's eBay
     * 					Anything Points account. Each point is
     * 					equivalent to $0.01.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsReduction")
    BONUS_POINTS_REDUCTION("BonusPointsReduction"),

    /**
     * 
     * 					An automatic payment of seller fees
     * 					from the seller's eBay Anything Points account.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentAutomatic")
    BONUS_POINTS_PAYMENT_AUTOMATIC("BonusPointsPaymentAutomatic"),

    /**
     * 
     * 					A one-time payment of seller fees from
     * 					the seller's eBay Anything Points account.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentManual")
    BONUS_POINTS_PAYMENT_MANUAL("BonusPointsPaymentManual"),

    /**
     * 
     * 					A reversal of a seller fee payment made
     * 					from the seller's eBay Anything Points account.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentReversal")
    BONUS_POINTS_PAYMENT_REVERSAL("BonusPointsPaymentReversal"),

    /**
     * 
     * 					A cash payment made from the seller's eBay
     * 					Anything Points account and credited to the seller's
     * 					account.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsCashPayout")
    BONUS_POINTS_CASH_PAYOUT("BonusPointsCashPayout"),

    /**
     * 
     * 					A credit (return) to your account of Value-Added Tax
     * 					previously paid.
     * 					
     * 
     */
    @XmlEnumValue("VATCredit")
    VAT_CREDIT("VATCredit"),

    /**
     * 
     * 					 A debit to your account for a Value-Added Tax charge.
     * 					
     * 
     */
    @XmlEnumValue("VATDebit")
    VAT_DEBIT("VATDebit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChangePending")
    VAT_STATUS_CHANGE_PENDING("VATStatusChangePending"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChangeApproved")
    VAT_STATUS_CHANGE_APPROVED("VATStatusChangeApproved"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChange_Denied")
    VAT_STATUS_CHANGE_DENIED("VATStatusChange_Denied"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("VATStatusDeletedByCSR")
    VAT_STATUS_DELETED_BY_CSR("VATStatusDeletedByCSR"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("VATStatusDeletedByUser")
    VAT_STATUS_DELETED_BY_USER("VATStatusDeletedByUser"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("SMProListingDesignerFee")
    SM_PRO_LISTING_DESIGNER_FEE("SMProListingDesignerFee"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("SMProListingDesignerCredit")
    SM_PRO_LISTING_DESIGNER_CREDIT("SMProListingDesignerCredit"),

    /**
     * 
     * 					Used for Store Inventory listings, which are no longer supported on any eBay site.
     * 					
     * 
     */
    @XmlEnumValue("StoresSuccessfulListingFee")
    STORES_SUCCESSFUL_LISTING_FEE("StoresSuccessfulListingFee"),

    /**
     * 
     * 					A credit for a StoresSuccessfulListingFee.
     * 					
     * 
     */
    @XmlEnumValue("StoresSuccessfulListingFeeCredit")
    STORES_SUCCESSFUL_LISTING_FEE_CREDIT("StoresSuccessfulListingFeeCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("StoresReferralFee")
    STORES_REFERRAL_FEE("StoresReferralFee"),

    /**
     * 
     * 					A credit posted to a seller's account
     * 					for sale of Stores Inventory items by buyers
     * 					referred to the seller's Store by printed materials
     * 					and emails outside eBay.
     * 					
     * 
     */
    @XmlEnumValue("StoresReferralCredit")
    STORES_REFERRAL_CREDIT("StoresReferralCredit"),

    /**
     * 
     * 					The fee charged for adding a subtitle
     * 					to a listing. The subtitle adds information
     * 					to the title.
     * 					
     * 
     */
    @XmlEnumValue("SubtitleFee")
    SUBTITLE_FEE("SubtitleFee"),

    /**
     * 
     * 					A credit of the fee charged for adding a
     * 					subtitle to a listing.
     * 					
     * 
     */
    @XmlEnumValue("SubtitleFeeCredit")
    SUBTITLE_FEE_CREDIT("SubtitleFeeCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("eBayStoreInventorySubscriptionCredit")
    E_BAY_STORE_INVENTORY_SUBSCRIPTION_CREDIT("eBayStoreInventorySubscriptionCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AutoPmntReqExempt")
    AUTO_PMNT_REQ_EXEMPT("AutoPmntReqExempt"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("AutoPmntReqRein")
    AUTO_PMNT_REQ_REIN("AutoPmntReqRein"),

    /**
     * 
     * 					The monthly fee charged for subscribing to
     * 					Picture Manager. The fee varies according to
     * 					the level of subscription.
     * 					
     * 
     */
    @XmlEnumValue("PictureManagerSubscriptionFee")
    PICTURE_MANAGER_SUBSCRIPTION_FEE("PictureManagerSubscriptionFee"),

    /**
     * 
     * 					A credit granted for a Picture Manager subscription
     * 					fee.
     * 					
     * 
     */
    @XmlEnumValue("PictureManagerSubscriptionFeeCredit")
    PICTURE_MANAGER_SUBSCRIPTION_FEE_CREDIT("PictureManagerSubscriptionFeeCredit"),

    /**
     * 
     * 					A fee charged for a basic subscription to Seller Reports.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsBasicFee")
    SELLER_REPORTS_BASIC_FEE("SellerReportsBasicFee"),

    /**
     * 
     * 					A credit granted for a basic subscription to Seller Reports.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsBasicCredit")
    SELLER_REPORTS_BASIC_CREDIT("SellerReportsBasicCredit"),

    /**
     * 
     * 					A fee charged for a subscription to Seller Reports Plus.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsPlusFee")
    SELLER_REPORTS_PLUS_FEE("SellerReportsPlusFee"),

    /**
     * 
     * 					A credit granted for a subscription to Seller Reports Plus.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsPlusCredit")
    SELLER_REPORTS_PLUS_CREDIT("SellerReportsPlusCredit"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaypalOnFile")
    PAYPAL_ON_FILE("PaypalOnFile"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaypalOnFileByCSR")
    PAYPAL_ON_FILE_BY_CSR("PaypalOnFileByCSR"),

    /**
     * 
     * 					(out)
     * 					
     * 
     */
    @XmlEnumValue("PaypalOffFile")
    PAYPAL_OFF_FILE("PaypalOffFile"),

    /**
     * 
     * 					The fee for adding a border that outlines a listing with a frame.
     * 					
     * 
     */
    @XmlEnumValue("BorderFee")
    BORDER_FEE("BorderFee"),

    /**
     * 
     * 					A credit for the border fee charged for a listing.
     * 					
     * 
     */
    @XmlEnumValue("BorderFeeCredit")
    BORDER_FEE_CREDIT("BorderFeeCredit"),

    /**
     * 
     * 					A fee charged to a seller for upgrading
     * 					a listing from eBay Germany's Car, Motorcycle,
     * 					and Special Vehicle categories so that it is also
     * 					searchable on the mobile.de classifieds site.
     * 					
     * 
     */
    @XmlEnumValue("FeeSearchableMobileDE")
    FEE_SEARCHABLE_MOBILE_DE("FeeSearchableMobileDE"),

    /**
     * 
     * 					A monthly subscription fee charged for
     * 					Sales Reports Plus.
     * 					
     * 
     */
    @XmlEnumValue("SalesReportsPlusFee")
    SALES_REPORTS_PLUS_FEE("SalesReportsPlusFee"),

    /**
     * 
     * 					A credit granted for a Sales Reports Plus
     * 					monthly subscription fee.
     * 					
     * 
     */
    @XmlEnumValue("SalesReportsPlusCredit")
    SALES_REPORTS_PLUS_CREDIT("SalesReportsPlusCredit"),

    /**
     * 
     * 					A credit granted for upgrading a listing
     * 					to make it searchable on the mobile.de platform.
     * 					
     * 
     */
    @XmlEnumValue("CreditSearchableMobileDE")
    CREDIT_SEARCHABLE_MOBILE_DE("CreditSearchableMobileDE"),

    /**
     * 
     * 					A fee charged to owners of eBay Stores
     * 					who have a sent a marketing email to buyers,
     * 					for the number of email recipients over
     * 					the Store's monthly free allocation. The
     * 					monthly allocation varies according to the type
     * 					of Store.
     * 					
     * 
     */
    @XmlEnumValue("EmailMarketingFee")
    EMAIL_MARKETING_FEE("EmailMarketingFee"),

    /**
     * 
     * 					A credit granted for an email marketing fee.
     * 					
     * 
     */
    @XmlEnumValue("EmailMarketingCredit")
    EMAIL_MARKETING_CREDIT("EmailMarketingCredit"),

    /**
     * 
     * 					A fee charged for the Picture Show
     * 					service, which lets buyers browse or see a slide
     * 					show of 2 or more pictures at the top of the
     * 					item page.
     * 					
     * 
     */
    @XmlEnumValue("FeePictureShow")
    FEE_PICTURE_SHOW("FeePictureShow"),

    /**
     * 
     * 					A credit granted for a Picture Show fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditPictureShow")
    CREDIT_PICTURE_SHOW("CreditPictureShow"),

    /**
     * 
     * 					A fee charged for the ProPackBundle feature pack (currently available to US and Canada eBay motor vehicle sellers).
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundleFee")
    PRO_PACK_BUNDLE_FEE("ProPackBundleFee"),

    /**
     * 
     * 					A credit granted by eBay for the ProPackBundle feature pack (currently available to US and Canada eBay motor vehicle sellers).
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundleFeeCredit")
    PRO_PACK_BUNDLE_FEE_CREDIT("ProPackBundleFeeCredit"),

    /**
     * 
     * 					A fee charged by eBay for the BasicUpgradePackBundle feature pack.
     * 					No longer applicable to any sites (but formerly applicable to the
     * 					Australia site, site ID 15).
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundleFee")
    BASIC_UPGRADE_PACK_BUNDLE_FEE("BasicUpgradePackBundleFee"),

    /**
     * 
     * 					A credit granted by eBay for the BasicUpgradePackBundle feature pack.
     * 					No longer applicable to any sites (but formerly applicable to the
     * 					Australia site, site ID 15).
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundleFeeCredit")
    BASIC_UPGRADE_PACK_BUNDLE_FEE_CREDIT("BasicUpgradePackBundleFeeCredit"),

    /**
     * 
     * 					A fee charged by eBay for the ValuePackBundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundleFee")
    VALUE_PACK_BUNDLE_FEE("ValuePackBundleFee"),

    /**
     * 
     * 					A credit granted by eBay for the ValuePackBundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundleFeeCredit")
    VALUE_PACK_BUNDLE_FEE_CREDIT("ValuePackBundleFeeCredit"),

    /**
     * 
     * 					A fee charged by eBay for the ProPackPlusBundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundleFee")
    PRO_PACK_PLUS_BUNDLE_FEE("ProPackPlusBundleFee"),

    /**
     * 
     * 					A credit granted by eBay for the ProPackPlusBundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundleFeeCredit")
    PRO_PACK_PLUS_BUNDLE_FEE_CREDIT("ProPackPlusBundleFeeCredit"),

    /**
     * 
     * 					The final entry in an account before it is closed
     * 					or merged with another account.
     * 					
     * 
     */
    @XmlEnumValue("FinalEntry")
    FINAL_ENTRY("FinalEntry"),

    /**
     * 
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						A fee charged for extended listing duration.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedDurationFee")
    EXTENDED_DURATION_FEE("ExtendedDurationFee"),

    /**
     * 
     * 						A credit granted by eBay for extended listing duration.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedDurationFeeCredit")
    EXTENDED_DURATION_FEE_CREDIT("ExtendedDurationFeeCredit"),

    /**
     * 
     * 					  The fee for an international listing.
     * 					
     * 
     */
    @XmlEnumValue("InternationalListingFee")
    INTERNATIONAL_LISTING_FEE("InternationalListingFee"),

    /**
     * 
     * 					  A credit issued by eBay for an international listing.
     * 					
     * 
     */
    @XmlEnumValue("InternationalListingCredit")
    INTERNATIONAL_LISTING_CREDIT("InternationalListingCredit"),

    /**
     * 
     * 					  A MarketPlace Research fee for expired subscriptions.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchExpiredSubscriptionFee")
    MARKETPLACE_RESEARCH_EXPIRED_SUBSCRIPTION_FEE("MarketplaceResearchExpiredSubscriptionFee"),

    /**
     * 
     * 					  A MarketPlace Research credit for expired subscriptions.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchExpiredSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_EXPIRED_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchExpiredSubscriptionFeeCredit"),

    /**
     * 
     * 					  A MarketPlace Research basic subscription fee.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchBasicSubscriptionFee")
    MARKETPLACE_RESEARCH_BASIC_SUBSCRIPTION_FEE("MarketplaceResearchBasicSubscriptionFee"),

    /**
     * 
     * 					  A MarketPlace Research basic subscription credit.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchBasicSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_BASIC_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchBasicSubscriptionFeeCredit"),

    /**
     * 
     * 					  A MarketPlace Research pro subscription fee.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchProSubscriptionFee")
    MARKETPLACE_RESEARCH_PRO_SUBSCRIPTION_FEE("MarketplaceResearchProSubscriptionFee"),

    /**
     * 
     * 					  Basic bundle fee.
     * 					
     * 
     */
    @XmlEnumValue("BasicBundleFee")
    BASIC_BUNDLE_FEE("BasicBundleFee"),

    /**
     * 
     * 					  Basic bundle fee credit.
     * 					
     * 
     */
    @XmlEnumValue("BasicBundleFeeCredit")
    BASIC_BUNDLE_FEE_CREDIT("BasicBundleFeeCredit"),

    /**
     * 
     * 					  A MarketPlace Research pro subscription fee credit.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchProSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_PRO_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchProSubscriptionFeeCredit"),

    /**
     * 
     * 					  A Vehicle Local subscription fee.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalSubscriptionFee")
    VEHICLE_LOCAL_SUBSCRIPTION_FEE("VehicleLocalSubscriptionFee"),

    /**
     * 
     * 					  A Vehicle Local subscription fee credit.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalSubscriptionFeeCredit")
    VEHICLE_LOCAL_SUBSCRIPTION_FEE_CREDIT("VehicleLocalSubscriptionFeeCredit"),

    /**
     * 
     * 					  A Vehicle Local insertion fee.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalInsertionFee")
    VEHICLE_LOCAL_INSERTION_FEE("VehicleLocalInsertionFee"),

    /**
     * 
     * 					  A Vehicle Local insertion fee credit.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalInsertionFeeCredit")
    VEHICLE_LOCAL_INSERTION_FEE_CREDIT("VehicleLocalInsertionFeeCredit"),

    /**
     * 
     * 					  A Vehicle Local final value fee.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalFinalValueFee")
    VEHICLE_LOCAL_FINAL_VALUE_FEE("VehicleLocalFinalValueFee"),

    /**
     * 
     * 					  A Vehicle Local final value fee credit.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalFinalValueFeeCredit")
    VEHICLE_LOCAL_FINAL_VALUE_FEE_CREDIT("VehicleLocalFinalValueFeeCredit"),

    /**
     * 
     * 					  A Vehicle Local GTC fee.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalGTCFee")
    VEHICLE_LOCAL_GTC_FEE("VehicleLocalGTCFee"),

    /**
     * 
     * 					  A Vehicle Local GTC fee credit.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalGTCFeeCredit")
    VEHICLE_LOCAL_GTC_FEE_CREDIT("VehicleLocalGTCFeeCredit"),

    /**
     * 
     * 						eBay Motors Pro fee. Applies to eBay Motors Pro registered dealer
     * 						applications only.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProFee")
    E_BAY_MOTORS_PRO_FEE("eBayMotorsProFee"),

    /**
     * 
     * 						eBay Motors Pro fee credit. Applies to eBay Motors Pro registered
     * 						dealer applications only.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayMotorsProFee")
    CREDITE_BAY_MOTORS_PRO_FEE("CrediteBayMotorsProFee"),

    /**
     * 
     * 						eBay Motors Pro feature fee. Applies to eBay Motors Pro registered
     * 						dealer applications only.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProFeatureFee")
    E_BAY_MOTORS_PRO_FEATURE_FEE("eBayMotorsProFeatureFee"),

    /**
     * 
     * 						eBay Motors Pro feature fee credit. Applies to eBay Motors Pro
     * 						registered dealer applications only.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayMotorsProFeatureFee")
    CREDITE_BAY_MOTORS_PRO_FEATURE_FEE("CrediteBayMotorsProFeatureFee"),

    /**
     * 
     * 						A fee charged by eBay for listing an item with the
     * 						Gallery Plus feature enabled. This feature cannot be removed
     * 						with ReviseItem or RelistItem. However, if the feature is
     * 						upgraded, for example, to Gallery Featured, the fee for
     * 						Gallery Plus is refunded and a fee for Gallery Feature is
     * 						charged instead.
     * 					
     * 
     */
    @XmlEnumValue("FeeGalleryPlus")
    FEE_GALLERY_PLUS("FeeGalleryPlus"),

    /**
     * 
     * 						A credit issued by eBay when refunding the fee for
     * 						enabling the Gallery Plus feature. A Gallery Plus credit may
     * 						be issued if, for example, a user upgrades their feature
     * 						with ReviseItem or RelistItem to Gallery Featured. In this
     * 						case, the original Gallery Plus fee is refunded and a
     * 						Gallery Featured fee is charged instead.
     * 					
     * 
     */
    @XmlEnumValue("CreditGalleryPlus")
    CREDIT_GALLERY_PLUS("CreditGalleryPlus"),
    @XmlEnumValue("PrivateListing")
    PRIVATE_LISTING("PrivateListing"),
    @XmlEnumValue("CreditPrivateListing")
    CREDIT_PRIVATE_LISTING("CreditPrivateListing"),

    /**
     * 
     * 						eBay ImmoPro Fee
     * 					
     * 
     */
    @XmlEnumValue("ImmoProFee")
    IMMO_PRO_FEE("ImmoProFee"),

    /**
     * 
     * 						Credit eBay ImmoPro Fee
     * 					
     * 
     */
    @XmlEnumValue("CreditImmoProFee")
    CREDIT_IMMO_PRO_FEE("CreditImmoProFee"),

    /**
     * 
     * 						eBay ImmoPro Feature Fee
     * 					
     * 
     */
    @XmlEnumValue("ImmoProFeatureFee")
    IMMO_PRO_FEATURE_FEE("ImmoProFeatureFee"),

    /**
     * 
     * 						Credit eBay ImmoPro Feature Fee
     * 					
     * 
     */
    @XmlEnumValue("CreditImmoProFeatureFee")
    CREDIT_IMMO_PRO_FEATURE_FEE("CreditImmoProFeatureFee"),

    /**
     * 
     * 						eBay Real Estate Pro Fee
     * 					
     * 
     */
    @XmlEnumValue("RealEstateProFee")
    REAL_ESTATE_PRO_FEE("RealEstateProFee"),

    /**
     * 
     * 						Credit eBay Real Estate Pro Fee
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstateProFee")
    CREDIT_REAL_ESTATE_PRO_FEE("CreditRealEstateProFee"),

    /**
     * 
     * 						eBay Real Estate Pro Feature Fee
     * 					
     * 
     */
    @XmlEnumValue("RealEstateProFeatureFee")
    REAL_ESTATE_PRO_FEATURE_FEE("RealEstateProFeatureFee"),

    /**
     * 
     * 						Credit eBay Real Estate Pro Feature Fee
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstateProFeatureFee")
    CREDIT_REAL_ESTATE_PRO_FEATURE_FEE("CreditRealEstateProFeatureFee"),

    /**
     * 
     * 						PowerSeller, PowerSeller shipping, Top-rated seller,
     * 						eBay Stores subscription, or other subscription discount against the
     * 						final value fee, insertion fee, subscription fee, late payment fee,
     * 						or other fee. See AccountEntry.Title for an explanation of the
     * 						discount and the percentage that was applied.
     * 					
     * 
     */
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValueShipping")
    CREDIT_FINAL_VALUE_SHIPPING("CreditFinalValueShipping"),

    /**
     * 
     * 					 
     * 					 Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValueShipping")
    FEE_FINAL_VALUE_SHIPPING("FeeFinalValueShipping"),

    /**
     * 
     * 					The fee charged for Return Shipping.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnShipping")
    FEE_RETURN_SHIPPING("FeeReturnShipping"),

    /**
     * 
     * 					A credit issued by eBay against a Return Shipping charge.
     * 					Issued as a result of an Unpaid Item dispute, under
     * 					some circumstances.
     * 					
     * 
     */
    @XmlEnumValue("CreditReturnShipping")
    CREDIT_RETURN_SHIPPING("CreditReturnShipping"),

    /**
     * 
     * 					The fee charged by eBay for the Global Shipping Program.
     * 					
     * 
     */
    @XmlEnumValue("FeeGlobalShippingProgram")
    FEE_GLOBAL_SHIPPING_PROGRAM("FeeGlobalShippingProgram"),

    /**
     * 
     * 					Credit issued by eBay for charged Global Shipping Program Fee
     * 					
     * 
     */
    @XmlEnumValue("CreditGlobalShippingProgram")
    CREDIT_GLOBAL_SHIPPING_PROGRAM("CreditGlobalShippingProgram"),

    /**
     * 
     * 					A fee charged to the seller's account if the seller ends an auction (with bids) 
     * 					early.
     * 					
     * 
     */
    @XmlEnumValue("FeeAuctionEndEarly")
    FEE_AUCTION_END_EARLY("FeeAuctionEndEarly"),

    /**
     * 
     * 					A credit issued by eBay to the seller's account if a duplicate auction 
     * 					listing is ended administratively by eBay. A seller is only eligible for this 
     * 					credit if the auction listing had zero bids and was never surfaced in Search.
     * 					
     * 
     */
    @XmlEnumValue("CreditAuctionEndEarly")
    CREDIT_AUCTION_END_EARLY("CreditAuctionEndEarly"),

    /**
     * 
     * 					The fee charged to the seller for printing out and using a FedEx shipping
     * 					label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeFedExShippingLabel")
    FEE_FED_EX_SHIPPING_LABEL("FeeFedExShippingLabel"),

    /**
     * 
     * 					A credit issued by eBay to reimburse the seller for a FedEx shipping label. In
     * 					some cases, this credit may be issued to the seller as a result of an Unpaid Item
     * 					case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditFedExShippingLabel")
    CREDIT_FED_EX_SHIPPING_LABEL("CreditFedExShippingLabel"),

    /**
     * 
     * 						This fee is charged to the seller's account if eBay is forced to refund the buyer
     * 						in a case where the buyer has used the eBay US Managed Returns process and return
     * 						shipped the item to the seller, but the seller has not issued a refund to the buyer
     * 						within seven business days after receiving the returned item. 
     * 						<br/><br/>
     * 						This value is equal to the refund ("CreditReturnRefund") issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnRefund")
    FEE_RETURN_REFUND("FeeReturnRefund"),

    /**
     * 
     * 						A credit issued to the buyer's account by eBay in a case where the buyer has used the eBay US
     * 						Managed Returns process and return shipped the item to the seller, but the seller 
     * 						has not issued a refund to the buyer within seven business days after receiving the 
     * 						returned item. The buyer credit amounts to the total purchase price (plus any 
     * 						shipping costs if the item was "not as described") minus the seller's restocking 
     * 						fee if one was specified under the return policy of the listing.
     * 						<br/><br/>
     * 						eBay then charges this expense to the seller's account, and this charge is 
     * 						attached to the "FeeReturnRefund" value. 
     * 					
     * 
     */
    @XmlEnumValue("CreditReturnRefund")
    CREDIT_RETURN_REFUND("CreditReturnRefund"),

    /**
     * 
     * 					(out) The fee charged for early termination of an eBay Stores subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeStoresSubscriptionEarlyTermination")
    FEE_STORES_SUBSCRIPTION_EARLY_TERMINATION("FeeStoresSubscriptionEarlyTermination"),

    /**
     * 
     * 					(out) A credit issued by eBay for early termination of an eBay Stores subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditStoresSubscriptionEarlyTermination")
    CREDIT_STORES_SUBSCRIPTION_EARLY_TERMINATION("CreditStoresSubscriptionEarlyTermination"),

    /**
     * 
     * 					(out) The fee charged for early termination of a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeVehicleSubscriptionEarlyTermination")
    FEE_VEHICLE_SUBSCRIPTION_EARLY_TERMINATION("FeeVehicleSubscriptionEarlyTermination"),

    /**
     * 
     * 					(out) A credit issued by eBay for early termination of a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditVehicleSubscriptionEarlyTermination")
    CREDIT_VEHICLE_SUBSCRIPTION_EARLY_TERMINATION("CreditVehicleSubscriptionEarlyTermination"),

    /**
     * 
     * 					 (out) A monthly subscription fee charged for a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeVehicleSubscription")
    FEE_VEHICLE_SUBSCRIPTION("FeeVehicleSubscription"),

    /**
     * 
     * 					 (out) A credit issued by eBay for the monthly fee charged for a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditVehicleSubscription")
    CREDIT_VEHICLE_SUBSCRIPTION("CreditVehicleSubscription"),

    /**
     * 
     * 					(out) The fee charged to the seller for printing out and using an AU Post shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeAUPostShippingLabel")
    FEE_AU_POST_SHIPPING_LABEL("FeeAUPostShippingLabel"),

    /**
     * 
     * 					(out) A credit issued by eBay to reimburse the seller for an AU Post shipping label. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAUPostShippingLabel")
    CREDIT_AU_POST_SHIPPING_LABEL("CreditAUPostShippingLabel"),

    /**
     * 
     * 					(out) The fee charged to the seller for printing out and using an APAC FedEx shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeAPACFedExShippingLabel")
    FEE_APAC_FED_EX_SHIPPING_LABEL("FeeAPACFedExShippingLabel"),

    /**
     * 
     * 					(out) A credit issued by eBay to reimburse the seller for an APAC FedEx shipping label. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAPACFedExShippingLabel")
    CREDIT_APAC_FED_EX_SHIPPING_LABEL("CreditAPACFedExShippingLabel"),

    /**
     * 
     * 					(out) The fee charged to the seller for printing out and using an APAC TNT shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeAPACTNTShippingLabel")
    FEE_APACTNT_SHIPPING_LABEL("FeeAPACTNTShippingLabel"),

    /**
     * 
     * 					(out) A credit issued by eBay to reimburse the seller for an APAC TNT shipping label. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAPACTNTShippingLabel")
    CREDIT_APACTNT_SHIPPING_LABEL("CreditAPACTNTShippingLabel"),

    /**
     * 
     * 					(out) The fee charged for eBay Buyer Protection reimbursement.
     * 					
     * 
     */
    @XmlEnumValue("FeeEBPReimbursement")
    FEE_EBP_REIMBURSEMENT("FeeEBPReimbursement"),

    /**
     * 
     * 					(out) A credit issued by eBay for eBay Buyer Protection reimbursement.
     * 					
     * 
     */
    @XmlEnumValue("CreditEBPReimbursement")
    CREDIT_EBP_REIMBURSEMENT("CreditEBPReimbursement"),

    /**
     * 
     * 					(out) The fee charged for the Promoted Listing feature.
     * 					
     * 
     */
    @XmlEnumValue("FeePromotedListingFeature")
    FEE_PROMOTED_LISTING_FEATURE("FeePromotedListingFeature"),

    /**
     * 
     * 					(out) A credit issued by eBay for the Promoted Listing feature.
     * 					
     * 
     */
    @XmlEnumValue("CreditPromotedListingFeature")
    CREDIT_PROMOTED_LISTING_FEATURE("CreditPromotedListingFeature");
    private final String value;

    AccountDetailEntryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountDetailEntryCodeType fromValue(String v) {
        for (AccountDetailEntryCodeType c: AccountDetailEntryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
