
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchandizingPrefCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchandizingPrefCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OptIn"/>
 *     &lt;enumeration value="OptOut"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MerchandizingPrefCodeType")
@XmlEnum
public enum MerchandizingPrefCodeType {


    /**
     * 
     * 						
     * 						Seller allows item cross-promotion.
     * 					
     * 
     */
    @XmlEnumValue("OptIn")
    OPT_IN("OptIn"),

    /**
     * 
     * 						
     * 						Seller does not allow item cross-promotion.
     * 					
     * 
     */
    @XmlEnumValue("OptOut")
    OPT_OUT("OptOut"),

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

    MerchandizingPrefCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchandizingPrefCodeType fromValue(String v) {
        for (MerchandizingPrefCodeType c: MerchandizingPrefCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
