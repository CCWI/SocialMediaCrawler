
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchasePurposeTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchasePurposeTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="BuyNowItem"/>
 *     &lt;enumeration value="ShoppingCart"/>
 *     &lt;enumeration value="AuctionItem"/>
 *     &lt;enumeration value="GiftCertificates"/>
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Donation"/>
 *     &lt;enumeration value="eBayBilling"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PurchasePurposeTypeCodeType")
@XmlEnum
public enum PurchasePurposeTypeCodeType {


    /**
     * 
     * 						Custom Code
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("BuyNowItem")
    BUY_NOW_ITEM("BuyNowItem"),
    @XmlEnumValue("ShoppingCart")
    SHOPPING_CART("ShoppingCart"),
    @XmlEnumValue("AuctionItem")
    AUCTION_ITEM("AuctionItem"),
    @XmlEnumValue("GiftCertificates")
    GIFT_CERTIFICATES("GiftCertificates"),
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("Donation")
    DONATION("Donation"),
    @XmlEnumValue("eBayBilling")
    E_BAY_BILLING("eBayBilling"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PurchasePurposeTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchasePurposeTypeCodeType fromValue(String v) {
        for (PurchasePurposeTypeCodeType c: PurchasePurposeTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
