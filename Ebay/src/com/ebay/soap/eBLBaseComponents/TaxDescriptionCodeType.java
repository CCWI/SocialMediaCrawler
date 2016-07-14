
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDescriptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxDescriptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="ElectronicWasteRecyclingFee"/>
 *     &lt;enumeration value="TireRecyclingFee"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaxDescriptionCodeType")
@XmlEnum
public enum TaxDescriptionCodeType {


    /**
     * 
     * 						A standard sales tax charge.
     * 					
     * 
     */
    @XmlEnumValue("SalesTax")
    SALES_TAX("SalesTax"),

    /**
     * 
     * 						A charge for an electronic waste recycling fee.
     * 					
     * 
     */
    @XmlEnumValue("ElectronicWasteRecyclingFee")
    ELECTRONIC_WASTE_RECYCLING_FEE("ElectronicWasteRecyclingFee"),

    /**
     * 
     * 						A charge for a tire recycling fee.
     * 					
     * 
     */
    @XmlEnumValue("TireRecyclingFee")
    TIRE_RECYCLING_FEE("TireRecyclingFee"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxDescriptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxDescriptionCodeType fromValue(String v) {
        for (TaxDescriptionCodeType c: TaxDescriptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
