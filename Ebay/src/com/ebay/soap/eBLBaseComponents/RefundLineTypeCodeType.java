
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundLineTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundLineTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PurchasePrice"/>
 *     &lt;enumeration value="ShippingPrice"/>
 *     &lt;enumeration value="Additional"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundLineTypeCodeType")
@XmlEnum
public enum RefundLineTypeCodeType {


    /**
     * 
     * 					 The refund was applied to the purchase price.
     * 					
     * 
     */
    @XmlEnumValue("PurchasePrice")
    PURCHASE_PRICE("PurchasePrice"),

    /**
     * 
     * 					 The refund was applied to the shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("ShippingPrice")
    SHIPPING_PRICE("ShippingPrice"),

    /**
     * 
     * 					 An additional refund (not accounted for in the original order costs) was issued.
     * 					
     * 
     */
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundLineTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundLineTypeCodeType fromValue(String v) {
        for (RefundLineTypeCodeType c: RefundLineTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
