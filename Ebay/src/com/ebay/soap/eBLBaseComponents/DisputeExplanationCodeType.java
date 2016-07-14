
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeExplanationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeExplanationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerHasNotResponded"/>
 *     &lt;enumeration value="BuyerRefusedToPay"/>
 *     &lt;enumeration value="BuyerNotClearedToPay"/>
 *     &lt;enumeration value="BuyerReturnedItemForRefund"/>
 *     &lt;enumeration value="UnableToResolveTerms"/>
 *     &lt;enumeration value="BuyerNoLongerWantsItem"/>
 *     &lt;enumeration value="BuyerPurchasingMistake"/>
 *     &lt;enumeration value="ShipCountryNotSupported"/>
 *     &lt;enumeration value="ShippingAddressNotConfirmed"/>
 *     &lt;enumeration value="PaymentMethodNotSupported"/>
 *     &lt;enumeration value="BuyerNoLongerRegistered"/>
 *     &lt;enumeration value="OtherExplanation"/>
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="UPIAssistance"/>
 *     &lt;enumeration value="BuyerPaymentNotReceivedOrCleared"/>
 *     &lt;enumeration value="SellerDoesntShipToCountry"/>
 *     &lt;enumeration value="BuyerNotPaid"/>
 *     &lt;enumeration value="UPIAssistanceDisabled"/>
 *     &lt;enumeration value="SellerRanOutOfStock"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeExplanationCodeType")
@XmlEnum
public enum DisputeExplanationCodeType {


    /**
     * 
     * 						This value indicates that the buyer has not paid for the order line item, and has 
     * 						not responded to the seller regarding payment. This value is allowed when the 
     * 						<b>DisputeReason</b> value is <b>BuyerHasNotPaid</b>.
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotResponded")
    BUYER_HAS_NOT_RESPONDED("BuyerHasNotResponded"),

    /**
     * 
     * 						This value indicates that the buyer has not paid for the order line item, and
     * 						according to the seller, has refused to pay for the order line item. This value is
     * 						allowed when the <b>DisputeReason</b> value is
     * 						<b>BuyerHasNotPaid</b>. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerRefusedToPay")
    BUYER_REFUSED_TO_PAY("BuyerRefusedToPay"),

    /**
     * 
     * 						This value indicates that the buyer has not paid for the order line item, and
     * 						is not cleared by eBay to pay. This value is allowed when the
     * 						<b>DisputeReason</b> value is
     * 						<b>BuyerHasNotPaid</b>. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerNotClearedToPay")
    BUYER_NOT_CLEARED_TO_PAY("BuyerNotClearedToPay"),

    /**
     * 
     * 						This value indicates that the buyer has returned the item, and seller has agreed to
     * 						cancel the order and issue a refund to the buyer. This value is allowed when the
     * 						<b>DisputeReason</b> value is <b>TransactionMutuallyCanceled</b>.
     * 					
     * 
     */
    @XmlEnumValue("BuyerReturnedItemForRefund")
    BUYER_RETURNED_ITEM_FOR_REFUND("BuyerReturnedItemForRefund"),

    /**
     * 
     * 						This value indicates that the buyer and seller were unable to resolve a disagreement
     * 						over terms, and the seller is willing to cancel the order line item. This value is allowed when the
     * 						<b>DisputeReason</b> value is <b>TransactionMutuallyCanceled</b>.
     * 					
     * 
     */
    @XmlEnumValue("UnableToResolveTerms")
    UNABLE_TO_RESOLVE_TERMS("UnableToResolveTerms"),

    /**
     * 
     * 						This value indicates that the buyer no longer wants the item (buyer remorse), and
     * 						the seller is willing to cancel the order line item. This value is allowed when the
     * 						<b>DisputeReason</b> value is 
     * 						<b>TransactionMutuallyCanceled</b>. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerNoLongerWantsItem")
    BUYER_NO_LONGER_WANTS_ITEM("BuyerNoLongerWantsItem"),

    /**
     * 
     * 						This value indicates that the buyer made a mistake by purchasing the item, and
     * 						the seller is willing to cancel the order line item. This value is allowed when the
     * 						<b>DisputeReason</b> value is 
     * 						<b>TransactionMutuallyCanceled</b>. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerPurchasingMistake")
    BUYER_PURCHASING_MISTAKE("BuyerPurchasingMistake"),

    /**
     * 
     * 						This value is deprecated, and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("ShipCountryNotSupported")
    SHIP_COUNTRY_NOT_SUPPORTED("ShipCountryNotSupported"),

    /**
     * 
     * 						This value indicates that the buyer is requesting shipment of the item to an
     * 						unconfirmed (not on file with eBay) address. This value is allowed when the
     * 						<b>DisputeReason</b> value is <b>BuyerHasNotPaid</b> or
     * 						<b>TransactionMutuallyCanceled</b>. 
     * 					
     * 
     */
    @XmlEnumValue("ShippingAddressNotConfirmed")
    SHIPPING_ADDRESS_NOT_CONFIRMED("ShippingAddressNotConfirmed"),

    /**
     * 
     * 						This value is deprecated, and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("PaymentMethodNotSupported")
    PAYMENT_METHOD_NOT_SUPPORTED("PaymentMethodNotSupported"),

    /**
     * 
     * 						This value is deprecated, and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("BuyerNoLongerRegistered")
    BUYER_NO_LONGER_REGISTERED("BuyerNoLongerRegistered"),

    /**
     * 
     * 						This value can be used when no other explanation in <b>
     * 						DisputeExplanationCodeType</b> is appropriate for the situation. This value is
     * 						allowed when the <b>DisputeReason</b> value is
     * 						<b>BuyerHasNotPaid</b> or
     * 						<b>TransactionMutuallyCanceled</b>.
     * 					
     * 
     */
    @XmlEnumValue("OtherExplanation")
    OTHER_EXPLANATION("OtherExplanation"),

    /**
     * 
     * 						This value can be used when no other explanation in 
     * 						<b>DisputeExplanationCodeType</b> is appropriate for the situation. This
     * 						value is allowed when the <b>DisputeReason</b> value is 
     * 						<b>ItemNotReceived</b> or <b>SignificantlyNotAsDescribed</b>.
     * 						This value cannot be used in <b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),

    /**
     * 
     * 						This value indicates that the Unpaid Item case was opened by eBay through the Unpaid
     * 						Item Assistance mechanism. This value cannot be used in
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistance")
    UPI_ASSISTANCE("UPIAssistance"),

    /**
     * 
     * 						This value indicates that the buyer has not paid the seller for the order line item,
     * 						or has paid the seller but the payment has not cleared. This value is allowed when
     * 						the <b>DisputeReason</b> value is <b>BuyerHasNotPaid</b>.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPaymentNotReceivedOrCleared")
    BUYER_PAYMENT_NOT_RECEIVED_OR_CLEARED("BuyerPaymentNotReceivedOrCleared"),

    /**
     * 
     * 						This value indicates that the buyer is requesting shipment of the item to a country
     * 						that is on the seller's ship-to exclusion list. This value is allowed when the
     * 						<b>DisputeReason</b> value is <b>BuyerHasNotPaid</b> or 
     * 						<b>TransactionMutuallyCanceled</b>.
     * 					
     * 
     */
    @XmlEnumValue("SellerDoesntShipToCountry")
    SELLER_DOESNT_SHIP_TO_COUNTRY("SellerDoesntShipToCountry"),

    /**
     * 
     * 						This value indicates that the buyer has not paid for the order line item. This value
     * 						is allowed when the <b>DisputeReason</b> value is 
     * 						<b>BuyerHasNotPaid</b>.
     * 					
     * 
     */
    @XmlEnumValue("BuyerNotPaid")
    BUYER_NOT_PAID("BuyerNotPaid"),

    /**
     * 
     * 						This value indicates that the Unpaid Item case was opened by eBay through the Unpaid
     * 						Item Assistance mechanism, and then was subsequently converted to a manual dispute,
     * 						either by the seller or by eBay. This value cannot be used in
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistanceDisabled")
    UPI_ASSISTANCE_DISABLED("UPIAssistanceDisabled"),

    /**
     * 
     * 						 This value indicates that the seller ran out of stock on the item, cannot fulfill
     * 						 the order, and has to cancel the order line item. This value is allowed when the
     * 						 <b>DisputeReason</b> value is 
     * 						 <b>TransactionMutuallyCanceled</b>.
     * 				    
     * 
     */
    @XmlEnumValue("SellerRanOutOfStock")
    SELLER_RAN_OUT_OF_STOCK("SellerRanOutOfStock"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeExplanationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeExplanationCodeType fromValue(String v) {
        for (DisputeExplanationCodeType c: DisputeExplanationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
