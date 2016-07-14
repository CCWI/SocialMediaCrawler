
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessRuleStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessRuleStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RuleOff"/>
 *     &lt;enumeration value="RuleOn"/>
 *     &lt;enumeration value="ApplicationBlocked"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccessRuleStatusCodeType")
@XmlEnum
public enum AccessRuleStatusCodeType {


    /**
     * 
     * 						The rule is turned off, and no rule validation
     * 						was performed.
     * 					
     * 
     */
    @XmlEnumValue("RuleOff")
    RULE_OFF("RuleOff"),

    /**
     * 
     * 						The rule is turned on, and rule validation was
     * 						performed.
     * 					
     * 
     */
    @XmlEnumValue("RuleOn")
    RULE_ON("RuleOn"),

    /**
     * 
     * 						The application is blocked from making
     * 						requests to the call named in this rule.
     * 					
     * 
     */
    @XmlEnumValue("ApplicationBlocked")
    APPLICATION_BLOCKED("ApplicationBlocked"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccessRuleStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessRuleStatusCodeType fromValue(String v) {
        for (AccessRuleStatusCodeType c: AccessRuleStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
