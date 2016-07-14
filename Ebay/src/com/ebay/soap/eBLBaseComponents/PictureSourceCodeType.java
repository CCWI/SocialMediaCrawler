
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureSourceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureSourceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="PictureManager"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureSourceCodeType")
@XmlEnum
public enum PictureSourceCodeType {


    /**
     * 
     * 						(out) The PictureURL images are hosted by eBay Picture Services
     * 						and the seller is not a Picture Manager subscriber.
     * 					
     * 
     */
    EPS("EPS"),

    /**
     * 
     * 						
     * 						(out) The PictureURL images are hosted by eBay Picture Manager
     * 						and the seller is a Picture Manager subscriber.
     * 					
     * 
     */
    @XmlEnumValue("PictureManager")
    PICTURE_MANAGER("PictureManager"),

    /**
     * 
     * 						(out) The PictureURL images are not hosted by eBay.
     * 					
     * 
     */
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureSourceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureSourceCodeType fromValue(String v) {
        for (PictureSourceCodeType c: PictureSourceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
