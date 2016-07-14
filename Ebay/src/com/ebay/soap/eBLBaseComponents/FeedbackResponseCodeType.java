
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackResponseCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackResponseCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Reply"/>
 *     &lt;enumeration value="FollowUp"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeedbackResponseCodeType")
@XmlEnum
public enum FeedbackResponseCodeType {


    /**
     * 
     * 						A reply to feedback left by another user.
     * 					
     * 
     */
    @XmlEnumValue("Reply")
    REPLY("Reply"),

    /**
     * 
     * 						A follow-up to a feedback comment left for another user.
     * 					
     * 
     */
    @XmlEnumValue("FollowUp")
    FOLLOW_UP("FollowUp"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackResponseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackResponseCodeType fromValue(String v) {
        for (FeedbackResponseCodeType c: FeedbackResponseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
