
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreSubscriptionLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreSubscriptionLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Anchor"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreSubscriptionLevelCodeType")
@XmlEnum
public enum StoreSubscriptionLevelCodeType {


    /**
     * 
     * 					   This closes your eBay Store and cancels your eBay Store subscription.
     * 					   All of your current Online Auction and Fixed Price items will remain active
     * 					   until their ending date is reached or they are sold. All your Store pictures
     * 					   hosted on eBay will be deleted unless you have a Picture Manager
     * 					   subscription.
     * 					
     * 
     */
    @XmlEnumValue("Close")
    CLOSE("Close"),

    /**
     * 
     * 					   Basic level subscription.
     * 					
     * 
     */
    @XmlEnumValue("Basic")
    BASIC("Basic"),

    /**
     * 
     * 					   Featured level subscription.
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 					   Anchor level subscription.
     * 					
     * 
     */
    @XmlEnumValue("Anchor")
    ANCHOR("Anchor"),

    /**
     * 
     * 					   Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreSubscriptionLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreSubscriptionLevelCodeType fromValue(String v) {
        for (StoreSubscriptionLevelCodeType c: StoreSubscriptionLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
