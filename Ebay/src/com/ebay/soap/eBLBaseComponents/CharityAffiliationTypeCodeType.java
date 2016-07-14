
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharityAffiliationTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharityAffiliationTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Community"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CharityAffiliationTypeCodeType")
@XmlEnum
public enum CharityAffiliationTypeCodeType {


    /**
     * 
     * 					  (out)	The specified nonprofit charity organization has a community affiliation.
     * 					
     * 
     */
    @XmlEnumValue("Community")
    COMMUNITY("Community"),

    /**
     * 
     * 					  (out) The specified nonprofit charity organization has direct affiliation.
     * 					
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * 
     * 					  (out)	The specified nonprofit charity organization is no longer affiliated.
     * 					
     * 
     */
    @XmlEnumValue("Remove")
    REMOVE("Remove"),

    /**
     * 
     * 						 (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharityAffiliationTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharityAffiliationTypeCodeType fromValue(String v) {
        for (CharityAffiliationTypeCodeType c: CharityAffiliationTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
