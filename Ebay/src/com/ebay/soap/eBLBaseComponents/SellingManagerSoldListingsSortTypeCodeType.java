
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerSoldListingsSortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerSoldListingsSortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SalesRecordID"/>
 *     &lt;enumeration value="BuyerEmail"/>
 *     &lt;enumeration value="SaleFormat"/>
 *     &lt;enumeration value="CustomLabel"/>
 *     &lt;enumeration value="TotalPrice"/>
 *     &lt;enumeration value="SaleDate"/>
 *     &lt;enumeration value="PaidDate"/>
 *     &lt;enumeration value="EmailsSent"/>
 *     &lt;enumeration value="CheckoutState"/>
 *     &lt;enumeration value="PaidState"/>
 *     &lt;enumeration value="ShippedState"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="ShippedDate"/>
 *     &lt;enumeration value="BuyerPostalCode"/>
 *     &lt;enumeration value="DaysSinceSale"/>
 *     &lt;enumeration value="StartPrice"/>
 *     &lt;enumeration value="ReservePrice"/>
 *     &lt;enumeration value="SoldOn"/>
 *     &lt;enumeration value="ShippingCost"/>
 *     &lt;enumeration value="ListedOn"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerSoldListingsSortTypeCodeType")
@XmlEnum
public enum SellingManagerSoldListingsSortTypeCodeType {


    /**
     * 
     * 						Sorts listings by sales Record ID.
     * 					
     * 
     */
    @XmlEnumValue("SalesRecordID")
    SALES_RECORD_ID("SalesRecordID"),

    /**
     * 
     * 						Sorts listings by Buyer email or ID.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmail")
    BUYER_EMAIL("BuyerEmail"),

    /**
     * 
     * 						Sorts listings by sale format.
     * 					
     * 
     */
    @XmlEnumValue("SaleFormat")
    SALE_FORMAT("SaleFormat"),

    /**
     * 
     * 						Sorts listings by Custom label.
     * 					
     * 
     */
    @XmlEnumValue("CustomLabel")
    CUSTOM_LABEL("CustomLabel"),

    /**
     * 
     * 						Sorts listings by Total Price.
     * 					
     * 
     */
    @XmlEnumValue("TotalPrice")
    TOTAL_PRICE("TotalPrice"),

    /**
     * 
     * 						Sorts listings by Sale Date.
     * 					
     * 
     */
    @XmlEnumValue("SaleDate")
    SALE_DATE("SaleDate"),

    /**
     * 
     * 						Sorts listings by Paid Date.
     * 					
     * 
     */
    @XmlEnumValue("PaidDate")
    PAID_DATE("PaidDate"),

    /**
     * 
     * 						Sorts listings by Emails sent.
     * 					
     * 
     */
    @XmlEnumValue("EmailsSent")
    EMAILS_SENT("EmailsSent"),

    /**
     * 
     * 						Sorts listings by Checkout status.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutState")
    CHECKOUT_STATE("CheckoutState"),

    /**
     * 
     * 						Sorts by Paid status.
     * 					
     * 
     */
    @XmlEnumValue("PaidState")
    PAID_STATE("PaidState"),

    /**
     * 
     * 						Sorts by Shipped state.
     * 					
     * 
     */
    @XmlEnumValue("ShippedState")
    SHIPPED_STATE("ShippedState"),

    /**
     * 
     * 						Sorts by feedback left.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						Sorts by FeedbackReceived.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						Sorts by Shipped Date.
     * 					
     * 
     */
    @XmlEnumValue("ShippedDate")
    SHIPPED_DATE("ShippedDate"),

    /**
     * 
     * 						Sorts by buyer Postal code.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPostalCode")
    BUYER_POSTAL_CODE("BuyerPostalCode"),

    /**
     * 
     * 						Sorts by Days since sale.
     * 					
     * 
     */
    @XmlEnumValue("DaysSinceSale")
    DAYS_SINCE_SALE("DaysSinceSale"),

    /**
     * 
     * 						Sort by Start price.
     * 					
     * 
     */
    @XmlEnumValue("StartPrice")
    START_PRICE("StartPrice"),

    /**
     * 
     * 						Sort by ReservePrice.
     * 					
     * 
     */
    @XmlEnumValue("ReservePrice")
    RESERVE_PRICE("ReservePrice"),

    /**
     * 
     * 						Sorts by Sold site.
     * 					
     * 
     */
    @XmlEnumValue("SoldOn")
    SOLD_ON("SoldOn"),

    /**
     * 
     * 						Sorts by Shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCost")
    SHIPPING_COST("ShippingCost"),

    /**
     * 
     * 						Sorts by Listed site.
     * 					
     * 
     */
    @XmlEnumValue("ListedOn")
    LISTED_ON("ListedOn"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerSoldListingsSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerSoldListingsSortTypeCodeType fromValue(String v) {
        for (SellingManagerSoldListingsSortTypeCodeType c: SellingManagerSoldListingsSortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
