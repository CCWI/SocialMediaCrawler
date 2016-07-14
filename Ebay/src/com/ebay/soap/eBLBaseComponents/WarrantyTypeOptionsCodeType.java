
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyTypeOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantyTypeOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReplacementWarranty"/>
 *     &lt;enumeration value="DealerWarranty"/>
 *     &lt;enumeration value="ManufacturerWarranty"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarrantyTypeOptionsCodeType")
@XmlEnum
public enum WarrantyTypeOptionsCodeType {


    /**
     * 
     * 						The item will be replaced, if under warranty.
     * 					
     * 
     */
    @XmlEnumValue("ReplacementWarranty")
    REPLACEMENT_WARRANTY("ReplacementWarranty"),

    /**
     * 
     * 						The warranty is offered by the dealer.
     * 					
     * 
     */
    @XmlEnumValue("DealerWarranty")
    DEALER_WARRANTY("DealerWarranty"),

    /**
     * 
     * 						The warranty is offered by the manufacturer.
     * 					
     * 
     */
    @XmlEnumValue("ManufacturerWarranty")
    MANUFACTURER_WARRANTY("ManufacturerWarranty"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WarrantyTypeOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantyTypeOptionsCodeType fromValue(String v) {
        for (WarrantyTypeOptionsCodeType c: WarrantyTypeOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
