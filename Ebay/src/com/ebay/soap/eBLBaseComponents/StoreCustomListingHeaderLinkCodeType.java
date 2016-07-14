
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreCustomListingHeaderLinkCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreCustomListingHeaderLinkCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AboutMePage"/>
 *     &lt;enumeration value="CustomPage"/>
 *     &lt;enumeration value="CustomCategory"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreCustomListingHeaderLinkCodeType")
@XmlEnum
public enum StoreCustomListingHeaderLinkCodeType {


    /**
     * 
     * 						No type.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Link is to an About Me page.
     * 					
     * 
     */
    @XmlEnumValue("AboutMePage")
    ABOUT_ME_PAGE("AboutMePage"),

    /**
     * 
     * 						Link is to a custom page.
     * 					
     * 
     */
    @XmlEnumValue("CustomPage")
    CUSTOM_PAGE("CustomPage"),

    /**
     * 
     * 						Link is to a custom category.
     * 					
     * 
     */
    @XmlEnumValue("CustomCategory")
    CUSTOM_CATEGORY("CustomCategory"),

    /**
     * 
     * 					   (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreCustomListingHeaderLinkCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreCustomListingHeaderLinkCodeType fromValue(String v) {
        for (StoreCustomListingHeaderLinkCodeType c: StoreCustomListingHeaderLinkCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
