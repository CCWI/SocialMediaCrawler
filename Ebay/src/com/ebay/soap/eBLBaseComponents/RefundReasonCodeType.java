
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CannotShipProduct"/>
 *     &lt;enumeration value="WrongItemShipped"/>
 *     &lt;enumeration value="ItemBadQuality"/>
 *     &lt;enumeration value="ItemDamaged"/>
 *     &lt;enumeration value="BuyerRemorse"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundReasonCodeType")
@XmlEnum
public enum RefundReasonCodeType {


    /**
     * 
     * 						Seller is unable to ship the product to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CannotShipProduct")
    CANNOT_SHIP_PRODUCT("CannotShipProduct"),

    /**
     * 
     * 						Seller shipped the wrong item to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("WrongItemShipped")
    WRONG_ITEM_SHIPPED("WrongItemShipped"),

    /**
     * 
     * 						The buyer returned the item due to its quality.
     * 					
     * 
     */
    @XmlEnumValue("ItemBadQuality")
    ITEM_BAD_QUALITY("ItemBadQuality"),

    /**
     * 
     * 						The buyer returned the item due to damage.
     * 					
     * 
     */
    @XmlEnumValue("ItemDamaged")
    ITEM_DAMAGED("ItemDamaged"),

    /**
     * 
     * 						The buyer decided they did not want the item.
     * 					
     * 
     */
    @XmlEnumValue("BuyerRemorse")
    BUYER_REMORSE("BuyerRemorse"),

    /**
     * 
     * 						The seller has another reason for issuing a Half.com refund.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundReasonCodeType fromValue(String v) {
        for (RefundReasonCodeType c: RefundReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
