
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviseReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReviseReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ProStores"/>
 *     &lt;enumeration value="SystemRevise"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReviseReasonCodeType")
@XmlEnum
public enum ReviseReasonCodeType {


    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						The Item is revised in prostores.
     * 					
     * 
     */
    @XmlEnumValue("ProStores")
    PRO_STORES("ProStores"),

    /**
     * 
     * 						The Item is revised internally by eBay system.
     * 					
     * 
     */
    @XmlEnumValue("SystemRevise")
    SYSTEM_REVISE("SystemRevise");
    private final String value;

    ReviseReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReviseReasonCodeType fromValue(String v) {
        for (ReviseReasonCodeType c: ReviseReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
