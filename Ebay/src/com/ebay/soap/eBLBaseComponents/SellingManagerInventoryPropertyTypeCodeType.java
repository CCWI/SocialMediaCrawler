
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerInventoryPropertyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerInventoryPropertyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ProductsOutOfStock"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="InActive"/>
 *     &lt;enumeration value="LowStock"/>
 *     &lt;enumeration value="WithListings"/>
 *     &lt;enumeration value="WithoutListings"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerInventoryPropertyTypeCodeType")
@XmlEnum
public enum SellingManagerInventoryPropertyTypeCodeType {


    /**
     * 
     * 						Products which are out of stock.
     * 					
     * 
     */
    @XmlEnumValue("ProductsOutOfStock")
    PRODUCTS_OUT_OF_STOCK("ProductsOutOfStock"),

    /**
     * 
     * 						Products that are active.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						Products that are inactive.
     * 					
     * 
     */
    @XmlEnumValue("InActive")
    IN_ACTIVE("InActive"),

    /**
     * 
     * 						Products in low stock.
     * 					
     * 
     */
    @XmlEnumValue("LowStock")
    LOW_STOCK("LowStock"),

    /**
     * 
     * 						Products with listings.
     * 					
     * 
     */
    @XmlEnumValue("WithListings")
    WITH_LISTINGS("WithListings"),

    /**
     * 
     * 						Products without listings.
     * 					
     * 
     */
    @XmlEnumValue("WithoutListings")
    WITHOUT_LISTINGS("WithoutListings"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerInventoryPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerInventoryPropertyTypeCodeType fromValue(String v) {
        for (SellingManagerInventoryPropertyTypeCodeType c: SellingManagerInventoryPropertyTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
