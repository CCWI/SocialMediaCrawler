
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URLTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URLTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ViewItemURL"/>
 *     &lt;enumeration value="ViewUserURL"/>
 *     &lt;enumeration value="MyeBayURL"/>
 *     &lt;enumeration value="MyeBayBiddingURL"/>
 *     &lt;enumeration value="MyeBayNotWonURL"/>
 *     &lt;enumeration value="MyeBayWonURL"/>
 *     &lt;enumeration value="MyeBayWatchingURL"/>
 *     &lt;enumeration value="eBayStoreURL"/>
 *     &lt;enumeration value="SmallLogoURL"/>
 *     &lt;enumeration value="MediumLogoURL"/>
 *     &lt;enumeration value="LargeLogoURL"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "URLTypeCodeType")
@XmlEnum
public enum URLTypeCodeType {


    /**
     * 
     * 						URL Prefix for viewing a particular listing. Just add an item id.
     * 					
     * 
     */
    @XmlEnumValue("ViewItemURL")
    VIEW_ITEM_URL("ViewItemURL"),

    /**
     * 
     * 						URL Prefix for viewing the feedback for a particular userid. Just add a userid.
     * 					
     * 
     */
    @XmlEnumValue("ViewUserURL")
    VIEW_USER_URL("ViewUserURL"),

    /**
     * 
     * 						Full URL for an eBay login page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayURL")
    MYE_BAY_URL("MyeBayURL"),

    /**
     * 
     * 						Full URL for viewing the items on which the user is bidding.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayBiddingURL")
    MYE_BAY_BIDDING_URL("MyeBayBiddingURL"),

    /**
     * 
     * 						Full URL for viewing the items on which the user bid but did not win.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayNotWonURL")
    MYE_BAY_NOT_WON_URL("MyeBayNotWonURL"),

    /**
     * 
     * 						Full URL for viewing the items on which the user bid and also won.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayWonURL")
    MYE_BAY_WON_URL("MyeBayWonURL"),

    /**
     * 
     * 						Full URL for viewing the items the user is currently watching.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayWatchingURL")
    MYE_BAY_WATCHING_URL("MyeBayWatchingURL"),

    /**
     * 
     * 						Full URL for eBay Stores.
     * 					
     * 
     */
    @XmlEnumValue("eBayStoreURL")
    E_BAY_STORE_URL("eBayStoreURL"),

    /**
     * 
     * 						Full URL for the small version of the "An eBay Marketplace" logo.
     * 					
     * 
     */
    @XmlEnumValue("SmallLogoURL")
    SMALL_LOGO_URL("SmallLogoURL"),

    /**
     * 
     * 						Full URL for the medium version of the "An eBay Marketplace" logo.
     * 					
     * 
     */
    @XmlEnumValue("MediumLogoURL")
    MEDIUM_LOGO_URL("MediumLogoURL"),

    /**
     * 
     * 						Full URL for the large version of the "An eBay Marketplace" logo.
     * 					
     * 
     */
    @XmlEnumValue("LargeLogoURL")
    LARGE_LOGO_URL("LargeLogoURL"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    URLTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URLTypeCodeType fromValue(String v) {
        for (URLTypeCodeType c: URLTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
