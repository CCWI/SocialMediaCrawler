
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreCustomHeaderLayoutCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreCustomHeaderLayoutCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoHeader"/>
 *     &lt;enumeration value="CustomHeaderShown"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreCustomHeaderLayoutCodeType")
@XmlEnum
public enum StoreCustomHeaderLayoutCodeType {


    /**
     * 
     * 						Specifies that the Store does not have a custom header.
     * 					
     * 
     */
    @XmlEnumValue("NoHeader")
    NO_HEADER("NoHeader"),

    /**
     * 
     * 						Specifies that the Store does have a custom header.
     * 					
     * 
     */
    @XmlEnumValue("CustomHeaderShown")
    CUSTOM_HEADER_SHOWN("CustomHeaderShown"),

    /**
     * 
     * 					   (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreCustomHeaderLayoutCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreCustomHeaderLayoutCodeType fromValue(String v) {
        for (StoreCustomHeaderLayoutCodeType c: StoreCustomHeaderLayoutCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
