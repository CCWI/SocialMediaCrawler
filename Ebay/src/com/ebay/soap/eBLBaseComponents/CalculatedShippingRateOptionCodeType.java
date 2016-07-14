
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatedShippingRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculatedShippingRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CombinedItemWeight"/>
 *     &lt;enumeration value="IndividualItemWeight"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CalculatedShippingRateOptionCodeType")
@XmlEnum
public enum CalculatedShippingRateOptionCodeType {


    /**
     * 
     * 						Calculate the Actual Shipping Rate from Combined Item Weight
     * 					
     * 
     */
    @XmlEnumValue("CombinedItemWeight")
    COMBINED_ITEM_WEIGHT("CombinedItemWeight"),

    /**
     * 
     * 						Calculate the Actual Shipping Rate from Individual Item Weight
     * 					
     * 
     */
    @XmlEnumValue("IndividualItemWeight")
    INDIVIDUAL_ITEM_WEIGHT("IndividualItemWeight"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CalculatedShippingRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedShippingRateOptionCodeType fromValue(String v) {
        for (CalculatedShippingRateOptionCodeType c: CalculatedShippingRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
