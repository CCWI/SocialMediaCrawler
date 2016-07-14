
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionalSaleTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionalSaleTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PriceDiscountOnly"/>
 *     &lt;enumeration value="FreeShippingOnly"/>
 *     &lt;enumeration value="PriceDiscountAndFreeShipping"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PromotionalSaleTypeCodeType")
@XmlEnum
public enum PromotionalSaleTypeCodeType {


    /**
     * 
     * 						Sale offers price discount only.
     * 					
     * 
     */
    @XmlEnumValue("PriceDiscountOnly")
    PRICE_DISCOUNT_ONLY("PriceDiscountOnly"),

    /**
     * 
     * 						Sale offers free shipping only.
     * 					
     * 
     */
    @XmlEnumValue("FreeShippingOnly")
    FREE_SHIPPING_ONLY("FreeShippingOnly"),

    /**
     * 
     * 						Sale offers both price discount and free shipping.
     * 					
     * 
     */
    @XmlEnumValue("PriceDiscountAndFreeShipping")
    PRICE_DISCOUNT_AND_FREE_SHIPPING("PriceDiscountAndFreeShipping"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionalSaleTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionalSaleTypeCodeType fromValue(String v) {
        for (PromotionalSaleTypeCodeType c: PromotionalSaleTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
