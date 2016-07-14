
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestOfferStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BestOfferStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Retracted"/>
 *     &lt;enumeration value="AdminEnded"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Countered"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="PendingBuyerPayment"/>
 *     &lt;enumeration value="PendingBuyerConfirmation"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BestOfferStatusCodeType")
@XmlEnum
public enum BestOfferStatusCodeType {


    /**
     * 
     * 						This value indicates that the buyer's Best Offer on an item is awaiting the 
     * 						seller's response (accept, decline, counter offer). A buyer's Best Offer expires 
     * 						after 48 hours without a seller's response.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best offer was
     * 						accepted by the seller, or that the seller's counter offer was accepted by the 
     * 						buyer.
     * 					
     * 
     */
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best offer was
     * 						declined by the seller, or that the seller's counter offer was declined by the 
     * 						buyer.
     * 					
     * 
     */
    @XmlEnumValue("Declined")
    DECLINED("Declined"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best Offer expired due
     * 						to the passing of 48 hours with no seller response (accept, decline, counter
     * 						offer), or that the seller's counter offer expired due to the passing of 48 hours 
     * 						with no buyer response (accept, decline, another Best Offer).
     * 					
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer has retracted the Best
     * 						Offer, or that the seller has retracted the counter offer.
     * 					
     * 
     */
    @XmlEnumValue("Retracted")
    RETRACTED("Retracted"),

    /**
     * 
     * 						This value indicates that the Best Offer was ended by an eBay administrator.
     * 					
     * 
     */
    @XmlEnumValue("AdminEnded")
    ADMIN_ENDED("AdminEnded"),

    /**
     * 
     * 						Depending on context, this value can indicate that a buyer's Best Offer or 
     * 						a seller's counter offer is in the active state. The 'Active' value can also be 
     * 						used in the GetBestOffers request to retrieve only the Best Offers in the 
     * 						active state.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer has triggered a counter offer from 
     * 						the seller.
     * 					
     * 
     */
    @XmlEnumValue("Countered")
    COUNTERED("Countered"),

    /**
     * 
     * 						This value is used in the GetBestOffers request to retrieve all Best Offers in 
     * 						all states.
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     * 						This value indicates that the buyer has accepted the seller's counter offer, but
     * 						the seller is still awaiting on payment from the buyer. If the buyer does not pay
     * 						within 48 hours, the counter offer will expire.
     * 					
     * 
     */
    @XmlEnumValue("PendingBuyerPayment")
    PENDING_BUYER_PAYMENT("PendingBuyerPayment"),

    /**
     * 
     * 						This value indicates that the seller is waiting on the buyer to commit to buying 
     * 						the item at the counter offer price.
     * 					
     * 
     */
    @XmlEnumValue("PendingBuyerConfirmation")
    PENDING_BUYER_CONFIRMATION("PendingBuyerConfirmation"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BestOfferStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BestOfferStatusCodeType fromValue(String v) {
        for (BestOfferStatusCodeType c: BestOfferStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
