
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatShippingRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlatShippingRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ChargeAmountForEachAdditionalItem"/>
 *     &lt;enumeration value="DeductAmountFromEachAdditionalItem"/>
 *     &lt;enumeration value="ShipAdditionalItemsFree"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FlatShippingRateOptionCodeType")
@XmlEnum
public enum FlatShippingRateOptionCodeType {


    /**
     * 
     * 						
     * 						Charge highest shipping cost for the first item and
     * 						X amount for each
     * 						additional item.
     * 					
     * 
     */
    @XmlEnumValue("ChargeAmountForEachAdditionalItem")
    CHARGE_AMOUNT_FOR_EACH_ADDITIONAL_ITEM("ChargeAmountForEachAdditionalItem"),

    /**
     * 
     * 						
     * 						Charge highest shipping cost for the first item and deduct X amount from the
     * 						shipping cost of each additional item.
     * 					
     * 
     */
    @XmlEnumValue("DeductAmountFromEachAdditionalItem")
    DEDUCT_AMOUNT_FROM_EACH_ADDITIONAL_ITEM("DeductAmountFromEachAdditionalItem"),

    /**
     * 
     * 						
     * 						Charge highest shipping cost for the first item and ship each additional item free.
     * 					
     * 
     */
    @XmlEnumValue("ShipAdditionalItemsFree")
    SHIP_ADDITIONAL_ITEMS_FREE("ShipAdditionalItemsFree"),

    /**
     * 
     * 						
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FlatShippingRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlatShippingRateOptionCodeType fromValue(String v) {
        for (FlatShippingRateOptionCodeType c: FlatShippingRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
