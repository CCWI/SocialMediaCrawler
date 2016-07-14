
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreHeaderStyleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreHeaderStyleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Minimized"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreHeaderStyleCodeType")
@XmlEnum
public enum StoreHeaderStyleCodeType {


    /**
     * 
     * 						The full Store header is used.
     * 					
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * 
     * 						A minimized Store header is used.
     * 					
     * 
     */
    @XmlEnumValue("Minimized")
    MINIMIZED("Minimized"),

    /**
     * 
     * 					   (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreHeaderStyleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreHeaderStyleCodeType fromValue(String v) {
        for (StoreHeaderStyleCodeType c: StoreHeaderStyleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
