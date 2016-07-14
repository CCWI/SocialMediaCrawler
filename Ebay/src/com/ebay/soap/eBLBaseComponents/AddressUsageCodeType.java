
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUsageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUsageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DefaultShipping"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AddressUsageCodeType")
@XmlEnum
public enum AddressUsageCodeType {


    /**
     * 
     * 						This is default shipping address which is rendered to buyer on checkout.
     * 					
     * 
     */
    @XmlEnumValue("DefaultShipping")
    DEFAULT_SHIPPING("DefaultShipping"),

    /**
     * 
     * 						This is an address which is in user's address book.
     * 						It can be used at the time of checkout.
     * 					
     * 
     */
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),

    /**
     * 
     * 						This is not a valid address. Please use another address.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AddressUsageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressUsageCodeType fromValue(String v) {
        for (AddressUsageCodeType c: AddressUsageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
