
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreFontSizeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreFontSizeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="XXS"/>
 *     &lt;enumeration value="XS"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="XL"/>
 *     &lt;enumeration value="XXL"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreFontSizeCodeType")
@XmlEnum
public enum StoreFontSizeCodeType {


    /**
     * 
     * 						Extra extra small.
     * 					
     * 
     */
    XXS("XXS"),

    /**
     * 
     * 						Extra small.
     * 					
     * 
     */
    XS("XS"),

    /**
     * 
     * 						Small.
     * 					
     * 
     */
    S("S"),

    /**
     * 
     * 						Medium.
     * 					
     * 
     */
    M("M"),

    /**
     * 
     * 						Large.
     * 					
     * 
     */
    L("L"),

    /**
     * 
     * 						Extra large.
     * 					
     * 
     */
    XL("XL"),

    /**
     * 
     * 						Extra extra large.
     * 					
     * 
     */
    XXL("XXL"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreFontSizeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreFontSizeCodeType fromValue(String v) {
        for (StoreFontSizeCodeType c: StoreFontSizeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
