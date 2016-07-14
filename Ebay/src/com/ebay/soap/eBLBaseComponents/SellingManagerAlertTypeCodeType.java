
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAlertTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAlertTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Automation"/>
 *     &lt;enumeration value="PaisaPay"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAlertTypeCodeType")
@XmlEnum
public enum SellingManagerAlertTypeCodeType {


    /**
     * 
     * 						Indicates that an alert related to a sold listing has been issued.
     * 					
     * 
     */
    @XmlEnumValue("Sold")
    SOLD("Sold"),

    /**
     * 
     * 						Indicates that an alert related to inventory has been issued.
     * 					
     * 
     */
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),

    /**
     * 
     * 						Indicates that an automation alert has been sent because a listing did
     * 						not conform to listing automation rules.
     * 					
     * 
     */
    @XmlEnumValue("Automation")
    AUTOMATION("Automation"),

    /**
     * 
     * 						Indicates that an alert related to PaisaPay, a payment method used for eBay
     * 						India, has been issued.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPay")
    PAISA_PAY("PaisaPay"),

    /**
     * 
     * 						Indicates that an alert has been issued for negative feedback received, bad
     * 						email, or an unpaid item dispute.
     * 					
     * 
     */
    @XmlEnumValue("General")
    GENERAL("General"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAlertTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAlertTypeCodeType fromValue(String v) {
        for (SellingManagerAlertTypeCodeType c: SellingManagerAlertTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
