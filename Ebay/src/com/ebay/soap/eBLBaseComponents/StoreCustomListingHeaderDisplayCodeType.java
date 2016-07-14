
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreCustomListingHeaderDisplayCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreCustomListingHeaderDisplayCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="FullAndLeftNavigationBar"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreCustomListingHeaderDisplayCodeType")
@XmlEnum
public enum StoreCustomListingHeaderDisplayCodeType {


    /**
     * 
     * 						No custom listing header is displayed.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						The full custom listing header is displayed.
     * 					
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * 
     * 						The full custom listing header and the left navigation bar is displayed.
     * 					
     * 
     */
    @XmlEnumValue("FullAndLeftNavigationBar")
    FULL_AND_LEFT_NAVIGATION_BAR("FullAndLeftNavigationBar"),

    /**
     * 
     * 					  (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreCustomListingHeaderDisplayCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreCustomListingHeaderDisplayCodeType fromValue(String v) {
        for (StoreCustomListingHeaderDisplayCodeType c: StoreCustomListingHeaderDisplayCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
