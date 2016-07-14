
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreItemListLayoutCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreItemListLayoutCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListView"/>
 *     &lt;enumeration value="GalleryView"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreItemListLayoutCodeType")
@XmlEnum
public enum StoreItemListLayoutCodeType {


    /**
     * 
     * 						Displays item list as a single column, with smaller item pictures.
     * 					
     * 
     */
    @XmlEnumValue("ListView")
    LIST_VIEW("ListView"),

    /**
     * 
     * 						Displays item list in two columns, with larger item pictures.
     * 					
     * 
     */
    @XmlEnumValue("GalleryView")
    GALLERY_VIEW("GalleryView"),

    /**
     * 
     * 					   (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreItemListLayoutCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreItemListLayoutCodeType fromValue(String v) {
        for (StoreItemListLayoutCodeType c: StoreItemListLayoutCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
