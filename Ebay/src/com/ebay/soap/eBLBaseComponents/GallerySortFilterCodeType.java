
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GallerySortFilterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GallerySortFilterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ShowAnyItems"/>
 *     &lt;enumeration value="ShowItemsWithGalleryImagesFirst"/>
 *     &lt;enumeration value="ShowOnlyItemsWithGalleryImages"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GallerySortFilterCodeType")
@XmlEnum
public enum GallerySortFilterCodeType {


    /**
     * 
     * 					Show any items, in no particular order.
     * 					
     * 
     */
    @XmlEnumValue("ShowAnyItems")
    SHOW_ANY_ITEMS("ShowAnyItems"),

    /**
     * 
     * 					Show items with gallery images first, before
     * 					other items.
     * 					
     * 
     */
    @XmlEnumValue("ShowItemsWithGalleryImagesFirst")
    SHOW_ITEMS_WITH_GALLERY_IMAGES_FIRST("ShowItemsWithGalleryImagesFirst"),

    /**
     * 
     * 					Show only items with gallery images.
     * 					
     * 
     */
    @XmlEnumValue("ShowOnlyItemsWithGalleryImages")
    SHOW_ONLY_ITEMS_WITH_GALLERY_IMAGES("ShowOnlyItemsWithGalleryImages"),

    /**
     * 
     * 					Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GallerySortFilterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GallerySortFilterCodeType fromValue(String v) {
        for (GallerySortFilterCodeType c: GallerySortFilterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
