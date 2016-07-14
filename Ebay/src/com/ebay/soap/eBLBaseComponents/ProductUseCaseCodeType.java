
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUseCaseCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductUseCaseCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AddItem"/>
 *     &lt;enumeration value="ReviseItem"/>
 *     &lt;enumeration value="RelistItem"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductUseCaseCodeType")
@XmlEnum
public enum ProductUseCaseCodeType {


    /**
     * 
     * 						(in) Use this code when calling GetProductSellingPages
     * 						before adding an item. This retrieves the latest product ID and the corresponding characteristic meta-data.
     * 					
     * 
     */
    @XmlEnumValue("AddItem")
    ADD_ITEM("AddItem"),

    /**
     * 
     * 						(in) Use this code when calling GetProductSellingPages
     * 						before revising an item that already contains product information.
     * 						If the product ID or data has changed, the original
     * 						product ID that you passed in and the data associated with that original version of the
     * 						product is returned. This is useful because the original Pre-filled Item Information
     * 						is used when you call ReviseItem.
     * 					
     * 
     */
    @XmlEnumValue("ReviseItem")
    REVISE_ITEM("ReviseItem"),

    /**
     * 
     * 						(in) Use this code when calling GetProductSellingPages
     * 						before relisting an item that already contains product information.
     * 						This retrieves the latest product ID and the
     * 						corresponding characteristic meta-data (same data as AddItem).
     * 					
     * 
     */
    @XmlEnumValue("RelistItem")
    RELIST_ITEM("RelistItem"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductUseCaseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductUseCaseCodeType fromValue(String v) {
        for (ProductUseCaseCodeType c: ProductUseCaseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
