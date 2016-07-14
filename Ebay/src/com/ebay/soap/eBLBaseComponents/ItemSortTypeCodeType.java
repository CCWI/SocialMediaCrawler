
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemID"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="StartPrice"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="BidCount"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="SellerUserID"/>
 *     &lt;enumeration value="TimeLeft"/>
 *     &lt;enumeration value="ListingDuration"/>
 *     &lt;enumeration value="ListingType"/>
 *     &lt;enumeration value="CurrentPrice"/>
 *     &lt;enumeration value="ReservePrice"/>
 *     &lt;enumeration value="MaxBid"/>
 *     &lt;enumeration value="BidderCount"/>
 *     &lt;enumeration value="HighBidderUserID"/>
 *     &lt;enumeration value="BuyerUserID"/>
 *     &lt;enumeration value="BuyerPostalCode"/>
 *     &lt;enumeration value="BuyerEmail"/>
 *     &lt;enumeration value="SellerEmail"/>
 *     &lt;enumeration value="TotalPrice"/>
 *     &lt;enumeration value="WatchCount"/>
 *     &lt;enumeration value="BestOfferCount"/>
 *     &lt;enumeration value="QuestionCount"/>
 *     &lt;enumeration value="ShippingServiceCost"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="UserID"/>
 *     &lt;enumeration value="QuantitySold"/>
 *     &lt;enumeration value="BestOffer"/>
 *     &lt;enumeration value="QuantityAvailable"/>
 *     &lt;enumeration value="QuantityPurchased"/>
 *     &lt;enumeration value="WonPlatform"/>
 *     &lt;enumeration value="SoldPlatform"/>
 *     &lt;enumeration value="ListingDurationDescending"/>
 *     &lt;enumeration value="ListingTypeDescending"/>
 *     &lt;enumeration value="CurrentPriceDescending"/>
 *     &lt;enumeration value="ReservePriceDescending"/>
 *     &lt;enumeration value="MaxBidDescending"/>
 *     &lt;enumeration value="BidderCountDescending"/>
 *     &lt;enumeration value="HighBidderUserIDDescending"/>
 *     &lt;enumeration value="BuyerUserIDDescending"/>
 *     &lt;enumeration value="BuyerPostalCodeDescending"/>
 *     &lt;enumeration value="BuyerEmailDescending"/>
 *     &lt;enumeration value="SellerEmailDescending"/>
 *     &lt;enumeration value="TotalPriceDescending"/>
 *     &lt;enumeration value="WatchCountDescending"/>
 *     &lt;enumeration value="QuestionCountDescending"/>
 *     &lt;enumeration value="ShippingServiceCostDescending"/>
 *     &lt;enumeration value="FeedbackReceivedDescending"/>
 *     &lt;enumeration value="FeedbackLeftDescending"/>
 *     &lt;enumeration value="UserIDDescending"/>
 *     &lt;enumeration value="QuantitySoldDescending"/>
 *     &lt;enumeration value="BestOfferCountDescending"/>
 *     &lt;enumeration value="QuantityAvailableDescending"/>
 *     &lt;enumeration value="QuantityPurchasedDescending"/>
 *     &lt;enumeration value="BestOfferDescending"/>
 *     &lt;enumeration value="ItemIDDescending"/>
 *     &lt;enumeration value="PriceDescending"/>
 *     &lt;enumeration value="StartPriceDescending"/>
 *     &lt;enumeration value="TitleDescending"/>
 *     &lt;enumeration value="BidCountDescending"/>
 *     &lt;enumeration value="QuantityDescending"/>
 *     &lt;enumeration value="StartTimeDescending"/>
 *     &lt;enumeration value="EndTimeDescending"/>
 *     &lt;enumeration value="SellerUserIDDescending"/>
 *     &lt;enumeration value="TimeLeftDescending"/>
 *     &lt;enumeration value="WonPlatformDescending"/>
 *     &lt;enumeration value="SoldPlatformDescending"/>
 *     &lt;enumeration value="LeadCount"/>
 *     &lt;enumeration value="NewLeadCount"/>
 *     &lt;enumeration value="LeadCountDescending"/>
 *     &lt;enumeration value="NewLeadCountDescending"/>
 *     &lt;enumeration value="ClassifiedAdPayPerLeadFee"/>
 *     &lt;enumeration value="ClassifiedAdPayPerLeadFeeDescending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemSortTypeCodeType")
@XmlEnum
public enum ItemSortTypeCodeType {


    /**
     * 
     * 						Sort by Item ID (ascending).
     * 					
     * 
     */
    @XmlEnumValue("ItemID")
    ITEM_ID("ItemID"),

    /**
     * 
     * 						Sort by price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("Price")
    PRICE("Price"),

    /**
     * 
     * 						Sort by start price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("StartPrice")
    START_PRICE("StartPrice"),

    /**
     * 
     * 						Sort by item title (ascending).
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						Sort by number of bids on the item (ascending).
     * 					
     * 
     */
    @XmlEnumValue("BidCount")
    BID_COUNT("BidCount"),

    /**
     * 
     * 						Sort by quantity (ascending).
     * 					
     * 
     */
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),

    /**
     * 
     * 						Sort by listing start time (ascending).
     * 					
     * 
     */
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),

    /**
     * 
     * 						Sort by listing end time (ascending).
     * 					
     * 
     */
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),

    /**
     * 
     * 						Sort by the seller's user ID, in alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("SellerUserID")
    SELLER_USER_ID("SellerUserID"),

    /**
     * 
     * 						Sort by the time left for the item's listing,
     * 						in ascending order: active items, good-til-cancelled items,
     * 						and completed items.
     * 					
     * 
     */
    @XmlEnumValue("TimeLeft")
    TIME_LEFT("TimeLeft"),

    /**
     * 
     * 						Sort by listing duration (ascending).
     * 					
     * 
     */
    @XmlEnumValue("ListingDuration")
    LISTING_DURATION("ListingDuration"),

    /**
     * 
     * 						Sort by listing type (ascending).
     * 					
     * 
     */
    @XmlEnumValue("ListingType")
    LISTING_TYPE("ListingType"),

    /**
     * 
     * 						Sort by current price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("CurrentPrice")
    CURRENT_PRICE("CurrentPrice"),

    /**
     * 
     * 						Sort by reserve price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("ReservePrice")
    RESERVE_PRICE("ReservePrice"),

    /**
     * 
     * 						Sort by maximum bid price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("MaxBid")
    MAX_BID("MaxBid"),

    /**
     * 
     * 						Sort by number of bidders (ascending).
     * 					
     * 
     */
    @XmlEnumValue("BidderCount")
    BIDDER_COUNT("BidderCount"),

    /**
     * 
     * 						Sort by the user ID of the highest bidder (ascending).
     * 					
     * 
     */
    @XmlEnumValue("HighBidderUserID")
    HIGH_BIDDER_USER_ID("HighBidderUserID"),

    /**
     * 
     * 						Sort by the user ID of the buyer (ascending).
     * 					
     * 
     */
    @XmlEnumValue("BuyerUserID")
    BUYER_USER_ID("BuyerUserID"),

    /**
     * 
     * 						Sort by the buyer's postal code (ascending).
     * 					
     * 
     */
    @XmlEnumValue("BuyerPostalCode")
    BUYER_POSTAL_CODE("BuyerPostalCode"),

    /**
     * 
     * 						Sort by the buyer's email address, in alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmail")
    BUYER_EMAIL("BuyerEmail"),

    /**
     * 
     * 						Sort by the seller's email address, in alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("SellerEmail")
    SELLER_EMAIL("SellerEmail"),

    /**
     * 
     * 						Sort by total price (ascending).
     * 					
     * 
     */
    @XmlEnumValue("TotalPrice")
    TOTAL_PRICE("TotalPrice"),

    /**
     * 
     * 						Sort by the number of items being watched (ascending). The WatchCount of an item is the number of watches that buyers have placed on an item using their eBay accounts.
     * 					
     * 
     */
    @XmlEnumValue("WatchCount")
    WATCH_COUNT("WatchCount"),

    /**
     * 
     * 						Sort by the number of Best Offers (ascending).
     * 					
     * 
     */
    @XmlEnumValue("BestOfferCount")
    BEST_OFFER_COUNT("BestOfferCount"),

    /**
     * 
     * 						Sort by the number of questions (ascending).
     * 					
     * 
     */
    @XmlEnumValue("QuestionCount")
    QUESTION_COUNT("QuestionCount"),

    /**
     * 
     * 						Sort by the cost indicated for shipping (ascending).
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceCost")
    SHIPPING_SERVICE_COST("ShippingServiceCost"),

    /**
     * 
     * 						Sort by type of feedback received, positive, negative, or neutral.
     * 						In ascending order - negative, neutral, positive.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						Sort by type of feedback received, positive, negative, or neutral.
     * 						In ascending order - negative, neutral, positive.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						Sort by user ID, in alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("UserID")
    USER_ID("UserID"),

    /**
     * 
     * 						Sort by the number of items sold (ascending).
     * 					
     * 
     */
    @XmlEnumValue("QuantitySold")
    QUANTITY_SOLD("QuantitySold"),

    /**
     * 
     * 						Sort items with Best Offers first.
     * 					
     * 
     */
    @XmlEnumValue("BestOffer")
    BEST_OFFER("BestOffer"),

    /**
     * 
     * 						Sort by the number of items available (ascending).
     * 					
     * 
     */
    @XmlEnumValue("QuantityAvailable")
    QUANTITY_AVAILABLE("QuantityAvailable"),

    /**
     * 
     * 						Sort by the number of items purchased (ascending).
     * 					
     * 
     */
    @XmlEnumValue("QuantityPurchased")
    QUANTITY_PURCHASED("QuantityPurchased"),

    /**
     * 
     * 						Sort by the platform on which the item was won (eBay items last).
     * 					
     * 
     */
    @XmlEnumValue("WonPlatform")
    WON_PLATFORM("WonPlatform"),

    /**
     * 
     * 						Sort by the platform on which the item was sold (eBay items last).
     * 					
     * 
     */
    @XmlEnumValue("SoldPlatform")
    SOLD_PLATFORM("SoldPlatform"),

    /**
     * 
     * 						Sort by the duration of the listing (descending).
     * 					
     * 
     */
    @XmlEnumValue("ListingDurationDescending")
    LISTING_DURATION_DESCENDING("ListingDurationDescending"),

    /**
     * 
     * 						Sort by the listing type (descending).
     * 					
     * 
     */
    @XmlEnumValue("ListingTypeDescending")
    LISTING_TYPE_DESCENDING("ListingTypeDescending"),

    /**
     * 
     * 						Sort by the current price of the listed item (descending).
     * 					
     * 
     */
    @XmlEnumValue("CurrentPriceDescending")
    CURRENT_PRICE_DESCENDING("CurrentPriceDescending"),

    /**
     * 
     * 						Sort by the listing's reserve price (descending).
     * 					
     * 
     */
    @XmlEnumValue("ReservePriceDescending")
    RESERVE_PRICE_DESCENDING("ReservePriceDescending"),

    /**
     * 
     * 						Sort by the highest bid on the item (descending).
     * 					
     * 
     */
    @XmlEnumValue("MaxBidDescending")
    MAX_BID_DESCENDING("MaxBidDescending"),

    /**
     * 
     * 						Sort by number of bidders (descending).
     * 					
     * 
     */
    @XmlEnumValue("BidderCountDescending")
    BIDDER_COUNT_DESCENDING("BidderCountDescending"),

    /**
     * 
     * 						Sort by the user ID of the highest bidder (descending).
     * 					
     * 
     */
    @XmlEnumValue("HighBidderUserIDDescending")
    HIGH_BIDDER_USER_ID_DESCENDING("HighBidderUserIDDescending"),

    /**
     * 
     * 						Sort by the user ID of the buyer, in reverse
     * 					alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("BuyerUserIDDescending")
    BUYER_USER_ID_DESCENDING("BuyerUserIDDescending"),

    /**
     * 
     * 						Sort by the buyer's postal code, in descending
     * 						order.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPostalCodeDescending")
    BUYER_POSTAL_CODE_DESCENDING("BuyerPostalCodeDescending"),

    /**
     * 
     * 						Sort by the buyer's email address, in
     * 						reverse alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmailDescending")
    BUYER_EMAIL_DESCENDING("BuyerEmailDescending"),

    /**
     * 
     * 						Sort by the seller's email address,
     * 						in reverse alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("SellerEmailDescending")
    SELLER_EMAIL_DESCENDING("SellerEmailDescending"),

    /**
     * 
     * 						Sort by the total price of the order, (descending).
     * 					
     * 
     */
    @XmlEnumValue("TotalPriceDescending")
    TOTAL_PRICE_DESCENDING("TotalPriceDescending"),

    /**
     * 
     * 						Sort by watch count (descending).
     * 					
     * 
     */
    @XmlEnumValue("WatchCountDescending")
    WATCH_COUNT_DESCENDING("WatchCountDescending"),

    /**
     * 
     * 						Sort by number of questions (descending).
     * 					
     * 
     */
    @XmlEnumValue("QuestionCountDescending")
    QUESTION_COUNT_DESCENDING("QuestionCountDescending"),

    /**
     * 
     * 						Sort by the cost of shipping (descending).
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceCostDescending")
    SHIPPING_SERVICE_COST_DESCENDING("ShippingServiceCostDescending"),

    /**
     * 
     * 						Sort by type of feedback received, positive, negative, or neutral.
     * 						In descending order - positive, neutral, negative.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedDescending")
    FEEDBACK_RECEIVED_DESCENDING("FeedbackReceivedDescending"),

    /**
     * 
     * 						Sort by type of feedback received, positive, negative, or neutral.
     * 						In descending order - positive, neutral, negative.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeftDescending")
    FEEDBACK_LEFT_DESCENDING("FeedbackLeftDescending"),

    /**
     * 
     * 						Sort by user ID, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("UserIDDescending")
    USER_ID_DESCENDING("UserIDDescending"),

    /**
     * 
     * 						Sort by the number of items sold, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("QuantitySoldDescending")
    QUANTITY_SOLD_DESCENDING("QuantitySoldDescending"),

    /**
     * 
     * 						Sort items by the number of Best Offers on an item, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferCountDescending")
    BEST_OFFER_COUNT_DESCENDING("BestOfferCountDescending"),

    /**
     * 
     * 						Sort items by the number there are available, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("QuantityAvailableDescending")
    QUANTITY_AVAILABLE_DESCENDING("QuantityAvailableDescending"),

    /**
     * 
     * 						Sort items by the number that have been purchased, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("QuantityPurchasedDescending")
    QUANTITY_PURCHASED_DESCENDING("QuantityPurchasedDescending"),

    /**
     * 
     * 						Sort items with Best Offers last.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferDescending")
    BEST_OFFER_DESCENDING("BestOfferDescending"),

    /**
     * 
     * 						Sort by Item ID (descending).
     * 					
     * 
     */
    @XmlEnumValue("ItemIDDescending")
    ITEM_ID_DESCENDING("ItemIDDescending"),

    /**
     * 
     * 						Sort by price (descending).
     * 					
     * 
     */
    @XmlEnumValue("PriceDescending")
    PRICE_DESCENDING("PriceDescending"),

    /**
     * 
     * 						Sort by start price (descending).
     * 					
     * 
     */
    @XmlEnumValue("StartPriceDescending")
    START_PRICE_DESCENDING("StartPriceDescending"),

    /**
     * 
     * 						Sort by item title (descending).
     * 					
     * 
     */
    @XmlEnumValue("TitleDescending")
    TITLE_DESCENDING("TitleDescending"),

    /**
     * 
     * 						Sort by number of bids on the item (descending).
     * 					
     * 
     */
    @XmlEnumValue("BidCountDescending")
    BID_COUNT_DESCENDING("BidCountDescending"),

    /**
     * 
     * 						Sort by the quantity of items sold (descending).
     * 					
     * 
     */
    @XmlEnumValue("QuantityDescending")
    QUANTITY_DESCENDING("QuantityDescending"),

    /**
     * 
     * 						Sort by listing start time (descending).
     * 					
     * 
     */
    @XmlEnumValue("StartTimeDescending")
    START_TIME_DESCENDING("StartTimeDescending"),

    /**
     * 
     * 						Sort by listing end time (descending).
     * 					
     * 
     */
    @XmlEnumValue("EndTimeDescending")
    END_TIME_DESCENDING("EndTimeDescending"),

    /**
     * 
     * 						Sort by seller user ID, in reverse alphabetical order.
     * 					
     * 
     */
    @XmlEnumValue("SellerUserIDDescending")
    SELLER_USER_ID_DESCENDING("SellerUserIDDescending"),

    /**
     * 
     * 						Sort by time left on the listing, in descending
     * 						order: completed items, good-til-cancelled items,
     * 						and active items.
     * 					
     * 
     */
    @XmlEnumValue("TimeLeftDescending")
    TIME_LEFT_DESCENDING("TimeLeftDescending"),

    /**
     * 
     * 						Sort by the platform on which the item was won.
     * 					
     * 
     */
    @XmlEnumValue("WonPlatformDescending")
    WON_PLATFORM_DESCENDING("WonPlatformDescending"),

    /**
     * 
     * 						Sort by the platform on which the item was sold.
     * 					
     * 
     */
    @XmlEnumValue("SoldPlatformDescending")
    SOLD_PLATFORM_DESCENDING("SoldPlatformDescending"),

    /**
     * 
     * 						Sort by the lead (emails) count (ascending).
     * 					
     * 
     */
    @XmlEnumValue("LeadCount")
    LEAD_COUNT("LeadCount"),

    /**
     * 
     * 						Sort by the new lead (new emails) count (ascending).
     * 					
     * 
     */
    @XmlEnumValue("NewLeadCount")
    NEW_LEAD_COUNT("NewLeadCount"),

    /**
     * 
     * 						Sort by the lead count (descending).
     * 					
     * 
     */
    @XmlEnumValue("LeadCountDescending")
    LEAD_COUNT_DESCENDING("LeadCountDescending"),

    /**
     * 
     * 						Sort by the new contact count (descending).
     * 					
     * 
     */
    @XmlEnumValue("NewLeadCountDescending")
    NEW_LEAD_COUNT_DESCENDING("NewLeadCountDescending"),

    /**
     * 
     * 						The pay-per-lead feature is no longer available, so this value is no longer 
     * 						applicable.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPayPerLeadFee")
    CLASSIFIED_AD_PAY_PER_LEAD_FEE("ClassifiedAdPayPerLeadFee"),

    /**
     * 
     * 						The pay-per-lead feature is no longer available, so this value is no longer 
     * 						applicable.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPayPerLeadFeeDescending")
    CLASSIFIED_AD_PAY_PER_LEAD_FEE_DESCENDING("ClassifiedAdPayPerLeadFeeDescending"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSortTypeCodeType fromValue(String v) {
        for (ItemSortTypeCodeType c: ItemSortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
