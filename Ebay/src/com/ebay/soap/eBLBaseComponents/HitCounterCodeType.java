
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HitCounterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HitCounterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoHitCounter"/>
 *     &lt;enumeration value="HonestyStyle"/>
 *     &lt;enumeration value="GreenLED"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="BasicStyle"/>
 *     &lt;enumeration value="RetroStyle"/>
 *     &lt;enumeration value="HiddenStyle"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "HitCounterCodeType")
@XmlEnum
public enum HitCounterCodeType {


    /**
     * 
     * 						No hit counter. The number of page views will not be available.
     * 					
     * 
     */
    @XmlEnumValue("NoHitCounter")
    NO_HIT_COUNTER("NoHitCounter"),

    /**
     * 
     * 						A basic style hit counter (US only). Non-US sites will return errors if they use HonestyStyle as input, and should use BasicStyle instead.
     * 					
     * 
     */
    @XmlEnumValue("HonestyStyle")
    HONESTY_STYLE("HonestyStyle"),

    /**
     * 
     * 						A green LED, computer-style hit counter (US only). Non-US sites will return errors if they use GreenLED as input, and should use RetroStyle instead.
     * 					
     * 
     */
    @XmlEnumValue("GreenLED")
    GREEN_LED("GreenLED"),

    /**
     * 
     * 						A hidden hit counter (US only). The number of page views will only be available to
     * 						the item's seller. For faster "View Item" page loads, use HiddenStyle.
     * 					
     * 
     */
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),

    /**
     * 
     * 							A basic style hit counter.
     * 					
     * 
     */
    @XmlEnumValue("BasicStyle")
    BASIC_STYLE("BasicStyle"),

    /**
     * 
     * 						 A retro, computer-style hit counter.
     * 					
     * 
     */
    @XmlEnumValue("RetroStyle")
    RETRO_STYLE("RetroStyle"),

    /**
     * 
     * 						A hidden hit counter. The number of page views will only be available to
     * 						the item's seller.
     * 					
     * 
     */
    @XmlEnumValue("HiddenStyle")
    HIDDEN_STYLE("HiddenStyle"),

    /**
     * 
     * 							Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    HitCounterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitCounterCodeType fromValue(String v) {
        for (HitCounterCodeType c: HitCounterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
