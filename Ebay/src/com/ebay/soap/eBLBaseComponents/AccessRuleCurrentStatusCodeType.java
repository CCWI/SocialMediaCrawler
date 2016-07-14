
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessRuleCurrentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessRuleCurrentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="HourlyLimitExceeded"/>
 *     &lt;enumeration value="DailyLimitExceeded"/>
 *     &lt;enumeration value="PeriodicLimitExceeded"/>
 *     &lt;enumeration value="HourlySoftLimitExceeded"/>
 *     &lt;enumeration value="DailySoftLimitExceeded"/>
 *     &lt;enumeration value="PeriodicSoftLimitExceeded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccessRuleCurrentStatusCodeType")
@XmlEnum
public enum AccessRuleCurrentStatusCodeType {


    /**
     * 
     * 						This value indicates that usage limits do not apply to the corresponding API call.
     * 					
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * 					 This value indicates that your application has exceeded its hourly hard call limit for the corresponding API call.
     * 					
     * 
     */
    @XmlEnumValue("HourlyLimitExceeded")
    HOURLY_LIMIT_EXCEEDED("HourlyLimitExceeded"),

    /**
     * 
     * 						This value indicates that your application has exceeded its daily hard call limit for the corresponding API call.
     * 					
     * 
     */
    @XmlEnumValue("DailyLimitExceeded")
    DAILY_LIMIT_EXCEEDED("DailyLimitExceeded"),

    /**
     * 
     * 						This value indicates that your application has exceeded its periodic hard call limit for the corresponding API call. The period is defined in the <b>ApiAccessRule.Period</b> field and can be a calendar month or a specific number of days.
     * 					
     * 
     */
    @XmlEnumValue("PeriodicLimitExceeded")
    PERIODIC_LIMIT_EXCEEDED("PeriodicLimitExceeded"),

    /**
     * 
     * 						This value indicates that your application has exceeded its hourly soft call limit for the corresponding API call.
     * 					
     * 
     */
    @XmlEnumValue("HourlySoftLimitExceeded")
    HOURLY_SOFT_LIMIT_EXCEEDED("HourlySoftLimitExceeded"),

    /**
     * 
     * 						This value indicates that your application has exceeded its daily soft call limit for the corresponding API call.
     * 					
     * 
     */
    @XmlEnumValue("DailySoftLimitExceeded")
    DAILY_SOFT_LIMIT_EXCEEDED("DailySoftLimitExceeded"),

    /**
     * 
     * 						This value indicates that your application has exceeded its periodic soft call limit for the corresponding API call. The period is defined in the <b>ApiAccessRule.Period</b> field and can be a calendar month or a specific number of days.
     * 					
     * 
     */
    @XmlEnumValue("PeriodicSoftLimitExceeded")
    PERIODIC_SOFT_LIMIT_EXCEEDED("PeriodicSoftLimitExceeded"),

    /**
     * 
     * 					 Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccessRuleCurrentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessRuleCurrentStatusCodeType fromValue(String v) {
        for (AccessRuleCurrentStatusCodeType c: AccessRuleCurrentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
