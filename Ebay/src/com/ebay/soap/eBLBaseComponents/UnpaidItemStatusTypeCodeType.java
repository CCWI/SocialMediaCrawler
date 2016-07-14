
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnpaidItemStatusTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnpaidItemStatusTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FinalValueFeeDenied"/>
 *     &lt;enumeration value="FinalValueFeeCredited"/>
 *     &lt;enumeration value="FinalValueFeeEligible"/>
 *     &lt;enumeration value="AwaitingSellerResponse"/>
 *     &lt;enumeration value="AwaitingBuyerResponse"/>
 *     &lt;enumeration value="UnpaidItemFiled"/>
 *     &lt;enumeration value="UnpaidItemEligible"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UnpaidItemStatusTypeCodeType")
@XmlEnum
public enum UnpaidItemStatusTypeCodeType {


    /**
     * 
     * 						Final value fee denied.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeDenied")
    FINAL_VALUE_FEE_DENIED("FinalValueFeeDenied"),

    /**
     * 
     * 						Final value fee credited.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeCredited")
    FINAL_VALUE_FEE_CREDITED("FinalValueFeeCredited"),

    /**
     * 
     * 						 Eligible for final value fee.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeEligible")
    FINAL_VALUE_FEE_ELIGIBLE("FinalValueFeeEligible"),

    /**
     * 
     * 						 Awaiting seller response.
     * 					
     * 
     */
    @XmlEnumValue("AwaitingSellerResponse")
    AWAITING_SELLER_RESPONSE("AwaitingSellerResponse"),

    /**
     * 
     * 						Awaiting buyer response.
     * 					
     * 
     */
    @XmlEnumValue("AwaitingBuyerResponse")
    AWAITING_BUYER_RESPONSE("AwaitingBuyerResponse"),

    /**
     * 
     * 						 Unpaid item filed.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemFiled")
    UNPAID_ITEM_FILED("UnpaidItemFiled"),

    /**
     * 
     * 						Eligible for unpaid item.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemEligible")
    UNPAID_ITEM_ELIGIBLE("UnpaidItemEligible"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UnpaidItemStatusTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnpaidItemStatusTypeCodeType fromValue(String v) {
        for (UnpaidItemStatusTypeCodeType c: UnpaidItemStatusTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
