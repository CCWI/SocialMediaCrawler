
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sunday"/>
 *     &lt;enumeration value="Monday"/>
 *     &lt;enumeration value="Tuesday"/>
 *     &lt;enumeration value="Wednesday"/>
 *     &lt;enumeration value="Thursday"/>
 *     &lt;enumeration value="Friday"/>
 *     &lt;enumeration value="Saturday"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DayOfWeekCodeType")
@XmlEnum
public enum DayOfWeekCodeType {


    /**
     * 
     * 						Sunday
     * 					
     * 
     */
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),

    /**
     * 
     * 						Monday
     * 					
     * 
     */
    @XmlEnumValue("Monday")
    MONDAY("Monday"),

    /**
     * 
     * 						Tuesday
     * 					
     * 
     */
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),

    /**
     * 
     * 						Wednesday
     * 					
     * 
     */
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),

    /**
     * 
     * 						Thursday
     * 					
     * 
     */
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),

    /**
     * 
     * 						Friday
     * 					
     * 
     */
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),

    /**
     * 
     * 						Saturday
     * 					
     * 
     */
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DayOfWeekCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekCodeType fromValue(String v) {
        for (DayOfWeekCodeType c: DayOfWeekCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
