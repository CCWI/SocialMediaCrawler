
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAccountStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayPalAccountStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="HighRestricted"/>
 *     &lt;enumeration value="LowRestricted"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="WireOff"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PayPalAccountStatusCodeType")
@XmlEnum
public enum PayPalAccountStatusCodeType {


    /**
     * 
     * 						Account is active.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						Account is closed.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						Account is highly restricted.
     * 					
     * 
     */
    @XmlEnumValue("HighRestricted")
    HIGH_RESTRICTED("HighRestricted"),

    /**
     * 
     * 						Account restriction is low.
     * 					
     * 
     */
    @XmlEnumValue("LowRestricted")
    LOW_RESTRICTED("LowRestricted"),

    /**
     * 
     * 						Account is locked.
     * 					
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),
    @XmlEnumValue("WireOff")
    WIRE_OFF("WireOff"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    PayPalAccountStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayPalAccountStatusCodeType fromValue(String v) {
        for (PayPalAccountStatusCodeType c: PayPalAccountStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
