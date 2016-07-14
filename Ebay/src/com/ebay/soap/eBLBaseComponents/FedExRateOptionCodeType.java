
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FedExRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FedExRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FedExStandardList"/>
 *     &lt;enumeration value="FedExCounter"/>
 *     &lt;enumeration value="FedExDiscounted"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FedExRateOptionCodeType")
@XmlEnum
public enum FedExRateOptionCodeType {


    /**
     * 
     * 						FedEx Standard List Rates
     * 					
     * 
     */
    @XmlEnumValue("FedExStandardList")
    FED_EX_STANDARD_LIST("FedExStandardList"),

    /**
     * 
     * 						FedEx Counter Rates
     * 					
     * 
     */
    @XmlEnumValue("FedExCounter")
    FED_EX_COUNTER("FedExCounter"),

    /**
     * 
     * 						FedEx Discounted Rates
     * 					
     * 
     */
    @XmlEnumValue("FedExDiscounted")
    FED_EX_DISCOUNTED("FedExDiscounted"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FedExRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FedExRateOptionCodeType fromValue(String v) {
        for (FedExRateOptionCodeType c: FedExRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
