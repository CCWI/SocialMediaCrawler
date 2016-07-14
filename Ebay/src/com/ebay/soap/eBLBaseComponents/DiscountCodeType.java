
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Percentage"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DiscountCodeType")
@XmlEnum
public enum DiscountCodeType {


    /**
     * 
     * 						Specifies discount type as percentage.
     * 					
     * 
     */
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),

    /**
     * 
     * 						Specifies discount type as a fixed amount. Discount will be in the 
     * 						currency of the original listing.
     * 					
     * 
     */
    @XmlEnumValue("Price")
    PRICE("Price"),

    /**
     * 
     * 						Future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DiscountCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountCodeType fromValue(String v) {
        for (DiscountCodeType c: DiscountCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
