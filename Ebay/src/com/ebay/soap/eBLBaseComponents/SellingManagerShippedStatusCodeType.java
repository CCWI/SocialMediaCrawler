
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerShippedStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerShippedStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="Unshipped"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerShippedStatusCodeType")
@XmlEnum
public enum SellingManagerShippedStatusCodeType {


    /**
     * 
     * 						The shipped status is "shipped."
     * 					
     * 
     */
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),

    /**
     * 
     * 						The shipped status is "unshipped."
     * 					
     * 
     */
    @XmlEnumValue("Unshipped")
    UNSHIPPED("Unshipped"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerShippedStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerShippedStatusCodeType fromValue(String v) {
        for (SellingManagerShippedStatusCodeType c: SellingManagerShippedStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
