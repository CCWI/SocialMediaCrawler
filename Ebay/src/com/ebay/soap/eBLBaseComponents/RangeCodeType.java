
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RangeCodeType")
@XmlEnum
public enum RangeCodeType {


    /**
     * 
     * 						
     * 						High end of the range.
     * 					
     * 
     */
    @XmlEnumValue("High")
    HIGH("High"),

    /**
     * 
     * 						
     * 						Low end of the range.
     * 					
     * 
     */
    @XmlEnumValue("Low")
    LOW("Low"),

    /**
     * 
     * 						
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RangeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeCodeType fromValue(String v) {
        for (RangeCodeType c: RangeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
