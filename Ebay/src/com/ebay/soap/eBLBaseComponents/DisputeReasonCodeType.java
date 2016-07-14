
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerHasNotPaid"/>
 *     &lt;enumeration value="TransactionMutuallyCanceled"/>
 *     &lt;enumeration value="ItemNotReceived"/>
 *     &lt;enumeration value="SignificantlyNotAsDescribed"/>
 *     &lt;enumeration value="NoRefund"/>
 *     &lt;enumeration value="ReturnPolicyUnpaidItem"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeReasonCodeType")
@XmlEnum
public enum DisputeReasonCodeType {


    /**
     * 
     * 						The seller has opened a case against the buyer because the buyer has not paid for
     * 						the order line item. A seller can open an Unpaid Item case as early as two days after 
     * 						the end of the auction listing. An exception to this rule occurs when the seller 
     * 						allows combined payment orders. If the seller does allow the buyer to combine orders 
     * 						and make one payment for those orders, the seller would not be able to open an Unpaid
     * 						Item case until after the time period to combine orders expires.
     * 						<br>
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotPaid")
    BUYER_HAS_NOT_PAID("BuyerHasNotPaid"),

    /**
     * 
     * 						With the mutual consent of the buyer, the seller is canceling the order line item.
     * 					
     * 
     */
    @XmlEnumValue("TransactionMutuallyCanceled")
    TRANSACTION_MUTUALLY_CANCELED("TransactionMutuallyCanceled"),

    /**
     * 
     * 						The buyer has opened a case against the seller because the item has not been 
     * 						received by the buyer. A buyer can open an Item Not Received case after the 
     * 						Estimated Delivery Date of the item has passed, or 7 days after payment if the 
     * 						Estimated Delivery Date wasn't given by the seller. This value cannot be used in 
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceived")
    ITEM_NOT_RECEIVED("ItemNotReceived"),

    /**
     * 
     * 						The buyer has opened a case against the seller because the item was received but
     * 						does not match the item description in the listing. A buyer can open an Item
     * 						Significantly Not As Described case immediately after receiving the item. This value
     * 						cannot be used in <b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("SignificantlyNotAsDescribed")
    SIGNIFICANTLY_NOT_AS_DESCRIBED("SignificantlyNotAsDescribed"),

    /**
     * 
     * 						The item was returned but no refund was given. This value cannot be used in
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("NoRefund")
    NO_REFUND("NoRefund"),

    /**
     * 
     * 						Item was returned and seller was not paid. This value cannot be used in 
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyUnpaidItem")
    RETURN_POLICY_UNPAID_ITEM("ReturnPolicyUnpaidItem"),

    /**
     * 
     * 					Reserved for future or internal use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeReasonCodeType fromValue(String v) {
        for (DisputeReasonCodeType c: DisputeReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
