
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerPictureDisplayTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureManagerPictureDisplayTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Thumbnail"/>
 *     &lt;enumeration value="BIBO"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Large"/>
 *     &lt;enumeration value="Supersize"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureManagerPictureDisplayTypeCodeType")
@XmlEnum
public enum PictureManagerPictureDisplayTypeCodeType {


    /**
     * 
     * 						
     * 						A small image, thumbnail size. Maximum size 96 pixels.
     * 					
     * 
     */
    @XmlEnumValue("Thumbnail")
    THUMBNAIL("Thumbnail"),

    /**
     * 
     * 						
     * 						A BIBO image. Maximum size 200 pixels.
     * 					
     * 
     */
    BIBO("BIBO"),

    /**
     * 
     * 						
     * 						A standard size image. Maximum size 400 pixels.
     * 					
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     * 						
     * 						A large image. Maximum size 500 pixels.
     * 					
     * 
     */
    @XmlEnumValue("Large")
    LARGE("Large"),

    /**
     * 
     * 						
     * 						A very large image. Maximum size 800 pixels.
     * 					
     * 
     */
    @XmlEnumValue("Supersize")
    SUPERSIZE("Supersize"),

    /**
     * 
     * 						
     * 						The original uploaded image.
     * 					
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original"),

    /**
     * 
     * 						
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureManagerPictureDisplayTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerPictureDisplayTypeCodeType fromValue(String v) {
        for (PictureManagerPictureDisplayTypeCodeType c: PictureManagerPictureDisplayTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
