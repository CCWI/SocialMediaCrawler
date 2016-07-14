
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAutoRelistTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAutoRelistTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RelistOnceIfNotSold"/>
 *     &lt;enumeration value="RelistContinuouslyUntilSold"/>
 *     &lt;enumeration value="RelistContinuously"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAutoRelistTypeCodeType")
@XmlEnum
public enum SellingManagerAutoRelistTypeCodeType {


    /**
     * 
     * 						If the item is unsold, relist the item once.
     * 					
     * 
     */
    @XmlEnumValue("RelistOnceIfNotSold")
    RELIST_ONCE_IF_NOT_SOLD("RelistOnceIfNotSold"),

    /**
     * 
     * 						Relist the item continuously, until it is sold.
     * 					
     * 
     */
    @XmlEnumValue("RelistContinuouslyUntilSold")
    RELIST_CONTINUOUSLY_UNTIL_SOLD("RelistContinuouslyUntilSold"),

    /**
     * 
     * 						Relist the item continuously.
     * 					
     * 
     */
    @XmlEnumValue("RelistContinuously")
    RELIST_CONTINUOUSLY("RelistContinuously"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAutoRelistTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAutoRelistTypeCodeType fromValue(String v) {
        for (SellingManagerAutoRelistTypeCodeType c: SellingManagerAutoRelistTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
