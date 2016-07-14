
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingFlowCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingFlowCodeType">
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
@XmlType(name = "ListingFlowCodeType")
@XmlEnum
public enum ListingFlowCodeType {


    /**
     * 
     * 						(in) AddItem (Sell Your Item) listing flow.
     * 					
     * 
     */
    @XmlEnumValue("AddItem")
    ADD_ITEM("AddItem"),

    /**
     * 
     * 						(in) ReviseItem (Revise Your Item) listing flow.
     * 					
     * 
     */
    @XmlEnumValue("ReviseItem")
    REVISE_ITEM("ReviseItem"),

    /**
     * 
     * 						(in) RelistItem listing flow.
     * 					
     * 
     */
    @XmlEnumValue("RelistItem")
    RELIST_ITEM("RelistItem"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingFlowCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingFlowCodeType fromValue(String v) {
        for (ListingFlowCodeType c: ListingFlowCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
