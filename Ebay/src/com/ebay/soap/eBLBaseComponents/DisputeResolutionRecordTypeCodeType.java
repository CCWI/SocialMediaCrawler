
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionRecordTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionRecordTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="StrikeBuyer"/>
 *     &lt;enumeration value="SuspendBuyer"/>
 *     &lt;enumeration value="RestrictBuyer"/>
 *     &lt;enumeration value="FVFCredit"/>
 *     &lt;enumeration value="InsertionFeeCredit"/>
 *     &lt;enumeration value="AppealBuyerStrike"/>
 *     &lt;enumeration value="UnsuspendBuyer"/>
 *     &lt;enumeration value="UnrestrictBuyer"/>
 *     &lt;enumeration value="ReverseFVFCredit"/>
 *     &lt;enumeration value="ReverseInsertionFeeCredit"/>
 *     &lt;enumeration value="GenerateCSTicketForSuspend"/>
 *     &lt;enumeration value="FVFCreditNotGranted"/>
 *     &lt;enumeration value="ItemNotReceivedClaimFiled"/>
 *     &lt;enumeration value="UnpaidItemRelisted"/>
 *     &lt;enumeration value="UnpaidItemRevised"/>
 *     &lt;enumeration value="FVFOnShippingCredit"/>
 *     &lt;enumeration value="FVFOnShippingCreditNotGranted"/>
 *     &lt;enumeration value="ReverseFVFOnShippingCredit"/>
 *     &lt;enumeration value="FeatureFeeCredit"/>
 *     &lt;enumeration value="FeatureFeeNotCredit"/>
 *     &lt;enumeration value="ReverseFeatureFeeCredit"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeResolutionRecordTypeCodeType")
@XmlEnum
public enum DisputeResolutionRecordTypeCodeType {


    /**
     * 
     * 						The buyer received an Unpaid Item Strike.
     * 					
     * 
     */
    @XmlEnumValue("StrikeBuyer")
    STRIKE_BUYER("StrikeBuyer"),

    /**
     * 
     * 						The buyer is suspended and unable to use the eBay site.
     * 					
     * 
     */
    @XmlEnumValue("SuspendBuyer")
    SUSPEND_BUYER("SuspendBuyer"),

    /**
     * 
     * 						The buyer is restricted and unable to bid or purchase items.
     * 					
     * 
     */
    @XmlEnumValue("RestrictBuyer")
    RESTRICT_BUYER("RestrictBuyer"),

    /**
     * 
     * 						The seller received a Final Value Fee credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCredit")
    FVF_CREDIT("FVFCredit"),

    /**
     * 
     * 						The seller's listing fee was credited.
     * 					
     * 
     */
    @XmlEnumValue("InsertionFeeCredit")
    INSERTION_FEE_CREDIT("InsertionFeeCredit"),

    /**
     * 
     * 						The buyer's Unpaid Item Strike was appealed.
     * 					
     * 
     */
    @XmlEnumValue("AppealBuyerStrike")
    APPEAL_BUYER_STRIKE("AppealBuyerStrike"),

    /**
     * 
     * 						The restriction on the buyer was lifted.
     * 					
     * 
     */
    @XmlEnumValue("UnsuspendBuyer")
    UNSUSPEND_BUYER("UnsuspendBuyer"),

    /**
     * 
     * 						The restriction on the buyer was lifted.
     * 					
     * 
     */
    @XmlEnumValue("UnrestrictBuyer")
    UNRESTRICT_BUYER("UnrestrictBuyer"),

    /**
     * 
     * 						The seller's Final Value Fee credit was reversed.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFVFCredit")
    REVERSE_FVF_CREDIT("ReverseFVFCredit"),

    /**
     * 
     * 						The seller's listing fee was reversed.
     * 					
     * 
     */
    @XmlEnumValue("ReverseInsertionFeeCredit")
    REVERSE_INSERTION_FEE_CREDIT("ReverseInsertionFeeCredit"),

    /**
     * 
     * 						The buyer is given a ticket.
     * 					
     * 
     */
    @XmlEnumValue("GenerateCSTicketForSuspend")
    GENERATE_CS_TICKET_FOR_SUSPEND("GenerateCSTicketForSuspend"),

    /**
     * 
     * 						The seller did not receive a Final Value Fee credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditNotGranted")
    FVF_CREDIT_NOT_GRANTED("FVFCreditNotGranted"),

    /**
     * 
     * 						The buyer did not received the item, and the buyer filed a claim.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceivedClaimFiled")
    ITEM_NOT_RECEIVED_CLAIM_FILED("ItemNotReceivedClaimFiled"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemRelisted")
    UNPAID_ITEM_RELISTED("UnpaidItemRelisted"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemRevised")
    UNPAID_ITEM_REVISED("UnpaidItemRevised"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("FVFOnShippingCredit")
    FVF_ON_SHIPPING_CREDIT("FVFOnShippingCredit"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("FVFOnShippingCreditNotGranted")
    FVF_ON_SHIPPING_CREDIT_NOT_GRANTED("FVFOnShippingCreditNotGranted"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFVFOnShippingCredit")
    REVERSE_FVF_ON_SHIPPING_CREDIT("ReverseFVFOnShippingCredit"),

    /**
     * 
     * 						Credit amount for feature fees.
     * 					
     * 
     */
    @XmlEnumValue("FeatureFeeCredit")
    FEATURE_FEE_CREDIT("FeatureFeeCredit"),

    /**
     * 
     * 						Amount not returned or credited for feature fees. Item price.
     * 					
     * 
     */
    @XmlEnumValue("FeatureFeeNotCredit")
    FEATURE_FEE_NOT_CREDIT("FeatureFeeNotCredit"),

    /**
     * 
     * 						Amount reversed on credit card for feature fees.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFeatureFeeCredit")
    REVERSE_FEATURE_FEE_CREDIT("ReverseFeatureFeeCredit"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeResolutionRecordTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeResolutionRecordTypeCodeType fromValue(String v) {
        for (DisputeResolutionRecordTypeCodeType c: DisputeResolutionRecordTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
