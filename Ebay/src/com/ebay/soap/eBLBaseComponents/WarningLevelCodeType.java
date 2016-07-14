
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarningLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarningLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarningLevelCodeType")
@XmlEnum
public enum WarningLevelCodeType {


    /**
     * 
     * 					Do not return warnings when the application passes
     * 					unrecognized or deprecated elements in a request.
     * 					This is the default value if WarningLevel is not specified.
     *  					
     * 
     */
    @XmlEnumValue("Low")
    LOW("Low"),

    /**
     * 
     * 					Return warnings when the application passes
     * 					unrecognized or deprecated elements in a request.
     * 					
     * 
     */
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    WarningLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarningLevelCodeType fromValue(String v) {
        for (WarningLevelCodeType c: WarningLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
