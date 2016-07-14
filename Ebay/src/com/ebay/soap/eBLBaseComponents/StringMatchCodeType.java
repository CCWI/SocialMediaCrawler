
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringMatchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringMatchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="Contains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StringMatchCodeType")
@XmlEnum
public enum StringMatchCodeType {


    /**
     * 
     * 							(in) Reserved for internal or future use.
     * 						
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 							(in) Matches strings that begin with the submitted
     * 							value. For example, submitting a CharityName value
     * 							of "heart" matches "Heart of Gold," but not "Open
     * 							Hearts." Default behavior if no value is
     * 							specified.
     * 						
     * 
     */
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),

    /**
     * 
     * 							(in) Matches strings that contain the submitted
     * 							value. For example, submitting a CharityName value
     * 							of "heart" matches both "Heart of Gold" and "Open
     * 							Hearts."
     * 						
     * 
     */
    @XmlEnumValue("Contains")
    CONTAINS("Contains");
    private final String value;

    StringMatchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringMatchCodeType fromValue(String v) {
        for (StringMatchCodeType c: StringMatchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
