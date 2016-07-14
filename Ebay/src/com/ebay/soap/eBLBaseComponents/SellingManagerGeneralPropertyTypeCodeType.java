
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerGeneralPropertyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerGeneralPropertyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NegativeFeedbackReceived"/>
 *     &lt;enumeration value="UnpaidItemDispute"/>
 *     &lt;enumeration value="BadEmailTemplate"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerGeneralPropertyTypeCodeType")
@XmlEnum
public enum SellingManagerGeneralPropertyTypeCodeType {


    /**
     * 
     * 						Items that received negative feeback.
     * 					
     * 
     */
    @XmlEnumValue("NegativeFeedbackReceived")
    NEGATIVE_FEEDBACK_RECEIVED("NegativeFeedbackReceived"),

    /**
     * 
     * 						Unpaid item disputes require your response.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemDispute")
    UNPAID_ITEM_DISPUTE("UnpaidItemDispute"),

    /**
     * 
     * 						Emails not set because of HTML or active content.
     * 					
     * 
     */
    @XmlEnumValue("BadEmailTemplate")
    BAD_EMAIL_TEMPLATE("BadEmailTemplate"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerGeneralPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerGeneralPropertyTypeCodeType fromValue(String v) {
        for (SellingManagerGeneralPropertyTypeCodeType c: SellingManagerGeneralPropertyTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
