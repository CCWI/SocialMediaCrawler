
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAutoRelistOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAutoRelistOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RelistImmediately"/>
 *     &lt;enumeration value="RelistAfterDaysHours"/>
 *     &lt;enumeration value="RelistAtSpecificTimeOfDay"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAutoRelistOptionCodeType")
@XmlEnum
public enum SellingManagerAutoRelistOptionCodeType {


    /**
     * 
     * 						If this value is set, the item is relisted immediately after the original listing ends.
     * 					
     * 
     */
    @XmlEnumValue("RelistImmediately")
    RELIST_IMMEDIATELY("RelistImmediately"),

    /**
     * 
     * 						If this value is set, the item is relisted after a specified number of days and/or hours. If this value is set, the <b>RelistAfterDays</b> and/or the <b>RelistAfterHours</b> fields must also be set.
     * 					
     * 
     */
    @XmlEnumValue("RelistAfterDaysHours")
    RELIST_AFTER_DAYS_HOURS("RelistAfterDaysHours"),

    /**
     * 
     * 						If this value is set, the item is relisted at a specific time of day, either the day when the listing ends (if the specified time has not passed), or the day after (if the specified time has already passed on that day). If this value is set, the <b>RelistAtSpecificTimeOfDay</b> field must also be set.
     * 					
     * 
     */
    @XmlEnumValue("RelistAtSpecificTimeOfDay")
    RELIST_AT_SPECIFIC_TIME_OF_DAY("RelistAtSpecificTimeOfDay"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAutoRelistOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAutoRelistOptionCodeType fromValue(String v) {
        for (SellingManagerAutoRelistOptionCodeType c: SellingManagerAutoRelistOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
