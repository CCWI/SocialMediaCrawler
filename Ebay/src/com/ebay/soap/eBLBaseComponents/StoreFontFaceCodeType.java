
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreFontFaceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreFontFaceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Arial"/>
 *     &lt;enumeration value="Courier"/>
 *     &lt;enumeration value="Times"/>
 *     &lt;enumeration value="Verdana"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreFontFaceCodeType")
@XmlEnum
public enum StoreFontFaceCodeType {


    /**
     * 
     * 						Arial font.
     * 					
     * 
     */
    @XmlEnumValue("Arial")
    ARIAL("Arial"),

    /**
     * 
     * 						Courier font.
     * 					
     * 
     */
    @XmlEnumValue("Courier")
    COURIER("Courier"),

    /**
     * 
     * 						Times New Roman font.
     * 					
     * 
     */
    @XmlEnumValue("Times")
    TIMES("Times"),

    /**
     * 
     * 						Verdana font.
     * 					
     * 
     */
    @XmlEnumValue("Verdana")
    VERDANA("Verdana"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreFontFaceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreFontFaceCodeType fromValue(String v) {
        for (StoreFontFaceCodeType c: StoreFontFaceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
