
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OutBid"/>
 *     &lt;enumeration value="EndOfAuction"/>
 *     &lt;enumeration value="AuctionCheckoutComplete"/>
 *     &lt;enumeration value="CheckoutBuyerRequestsTotal"/>
 *     &lt;enumeration value="Feedback"/>
 *     &lt;enumeration value="FeedbackForSeller"/>
 *     &lt;enumeration value="FixedPriceTransaction"/>
 *     &lt;enumeration value="SecondChanceOffer"/>
 *     &lt;enumeration value="AskSellerQuestion"/>
 *     &lt;enumeration value="ItemListed"/>
 *     &lt;enumeration value="ItemRevised"/>
 *     &lt;enumeration value="BuyerResponseDispute"/>
 *     &lt;enumeration value="SellerOpenedDispute"/>
 *     &lt;enumeration value="SellerRespondedToDispute"/>
 *     &lt;enumeration value="SellerClosedDispute"/>
 *     &lt;enumeration value="BestOffer"/>
 *     &lt;enumeration value="MyMessagesAlertHeader"/>
 *     &lt;enumeration value="MyMessagesAlert"/>
 *     &lt;enumeration value="MyMessageseBayMessageHeader"/>
 *     &lt;enumeration value="MyMessageseBayMessage"/>
 *     &lt;enumeration value="MyMessagesM2MMessageHeader"/>
 *     &lt;enumeration value="MyMessagesM2MMessage"/>
 *     &lt;enumeration value="INRBuyerOpenedDispute"/>
 *     &lt;enumeration value="INRBuyerRespondedToDispute"/>
 *     &lt;enumeration value="INRBuyerClosedDispute"/>
 *     &lt;enumeration value="INRSellerRespondedToDispute"/>
 *     &lt;enumeration value="Checkout"/>
 *     &lt;enumeration value="WatchedItemEndingSoon"/>
 *     &lt;enumeration value="ItemClosed"/>
 *     &lt;enumeration value="ItemSuspended"/>
 *     &lt;enumeration value="ItemSold"/>
 *     &lt;enumeration value="ItemExtended"/>
 *     &lt;enumeration value="UserIDChanged"/>
 *     &lt;enumeration value="EmailAddressChanged"/>
 *     &lt;enumeration value="PasswordChanged"/>
 *     &lt;enumeration value="PasswordHintChanged"/>
 *     &lt;enumeration value="PaymentDetailChanged"/>
 *     &lt;enumeration value="AccountSuspended"/>
 *     &lt;enumeration value="AccountSummary"/>
 *     &lt;enumeration value="ThirdPartyCartCheckout"/>
 *     &lt;enumeration value="ItemRevisedAddCharity"/>
 *     &lt;enumeration value="ItemAddedToWatchList"/>
 *     &lt;enumeration value="ItemRemovedFromWatchList"/>
 *     &lt;enumeration value="ItemAddedToBidGroup"/>
 *     &lt;enumeration value="ItemRemovedFromBidGroup"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackStarChanged"/>
 *     &lt;enumeration value="BidPlaced"/>
 *     &lt;enumeration value="BidReceived"/>
 *     &lt;enumeration value="ItemWon"/>
 *     &lt;enumeration value="ItemLost"/>
 *     &lt;enumeration value="ItemUnsold"/>
 *     &lt;enumeration value="CounterOfferReceived"/>
 *     &lt;enumeration value="BestOfferDeclined"/>
 *     &lt;enumeration value="BestOfferPlaced"/>
 *     &lt;enumeration value="AddToWatchList"/>
 *     &lt;enumeration value="PlaceOffer"/>
 *     &lt;enumeration value="RemoveFromWatchList"/>
 *     &lt;enumeration value="AddToBidGroup"/>
 *     &lt;enumeration value="RemoveFromBidGroup"/>
 *     &lt;enumeration value="ItemsCanceled"/>
 *     &lt;enumeration value="TokenRevocation"/>
 *     &lt;enumeration value="BulkDataExchangeJobCompleted"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ItemMarkedShipped"/>
 *     &lt;enumeration value="ItemMarkedPaid"/>
 *     &lt;enumeration value="EBPMyResponseDue"/>
 *     &lt;enumeration value="EBPOtherPartyResponseDue"/>
 *     &lt;enumeration value="EBPEscalatedCase"/>
 *     &lt;enumeration value="EBPAppealedCase"/>
 *     &lt;enumeration value="EBPMyPaymentDue"/>
 *     &lt;enumeration value="EBPPaymentDone"/>
 *     &lt;enumeration value="EBPClosedAppeal"/>
 *     &lt;enumeration value="EBPClosedCase"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessage"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessageHeader"/>
 *     &lt;enumeration value="EBPOnHoldCase"/>
 *     &lt;enumeration value="ReadyToShip"/>
 *     &lt;enumeration value="ReadyForPayout"/>
 *     &lt;enumeration value="BidItemEndingSoon"/>
 *     &lt;enumeration value="ShoppingCartItemEndingSoon"/>
 *     &lt;enumeration value="ReturnCreated"/>
 *     &lt;enumeration value="ReturnWaitingForSellerInfo"/>
 *     &lt;enumeration value="ReturnSellerInfoOverdue"/>
 *     &lt;enumeration value="ReturnShipped"/>
 *     &lt;enumeration value="ReturnDelivered"/>
 *     &lt;enumeration value="ReturnRefundOverdue"/>
 *     &lt;enumeration value="ReturnClosed"/>
 *     &lt;enumeration value="ReturnEscalated"/>
 *     &lt;enumeration value="UnmatchedPaymentReceived"/>
 *     &lt;enumeration value="RefundSuccess"/>
 *     &lt;enumeration value="RefundFailure"/>
 *     &lt;enumeration value="PaymentReminder"/>
 *     &lt;enumeration value="EBNOrderPickedUp"/>
 *     &lt;enumeration value="EBNOrderCanceled"/>
 *     &lt;enumeration value="M2MMessageStatusChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationEventTypeCodeType")
@XmlEnum
public enum NotificationEventTypeCodeType {


    /**
     * 
     * 					  This notification is for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when another buyer has outbid
     * 						(placed a higher maximum bid) the subscribed buyer on an auction listing, and
     * 						the subscribed buyer is no longer the current high bidder.
     * 						<br><br>
     * 						This notification is only applicable for auction listings.
     * 					
     * 
     */
    @XmlEnumValue("OutBid")
    OUT_BID("OutBid"),

    /**
     * 
     * 						This notification is sent to all subscribed bidders of an auction item and to
     * 						the subscribed seller of the auction item as soon as the auction listing ends
     * 						with or without a winning bidder. This notification will also be sent to
     * 						subscribed bidders and the subscribed seller if a buyer ends the auction as a
     * 						result of using the auction listing's Buy It Now feature.
     * 						<br><br>
     * 						This notification is only applicable for auction listings.
     * 					
     * 
     */
    @XmlEnumValue("EndOfAuction")
    END_OF_AUCTION("EndOfAuction"),

    /**
     * 
     * 						This notification is sent to the subscribed seller when the winning bidder
     * 						or buyer has paid for the auction or fixed-price item and completed the checkout process.
     * 						<br><br>
     * 						For multiple line item orders, an <b>AuctionCheckoutComplete</b> notification is only generated for one of the line items in the order. In this case, the seller would look for the containing order number for the line item in the <b>Transaction.ContainingOrder.OrderID</b> field, and then make a <b>GetOrders</b> call (using the container order ID as an input filter) to retrieve complete information for the order.
     * 					
     * 
     */
    @XmlEnumValue("AuctionCheckoutComplete")
    AUCTION_CHECKOUT_COMPLETE("AuctionCheckoutComplete"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a buyer/winning bidder
     * 						is requesting a total price before paying for the item.
     * 						<br><br>
     * 						This notification is applicable for auction listings and for fixed-price listings
     * 						that do not require immediate payment.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutBuyerRequestsTotal")
    CHECKOUT_BUYER_REQUESTS_TOTAL("CheckoutBuyerRequestsTotal"),

    /**
     * 
     * 						This notification is sent to a subsribed buyer or seller when that buyer or seller
     * 						has left Feedback for the other party in the order, or has received Feedback from
     * 						the other party in the order.
     * 						<br><br>
     * 						This notification is applicable for all listing types and orders.
     * 					
     * 
     */
    @XmlEnumValue("Feedback")
    FEEDBACK("Feedback"),

    /**
     * 
     * 						This notification is deprecated.
     * 						<br><br>
     * 						Use the <b>Feedback</b> notification instead.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackForSeller")
    FEEDBACK_FOR_SELLER("FeedbackForSeller"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time a buyer purchases an item in a multiple-quantity, fixed-price listing. In the case of a single-quantity, fixed-price listing, the 'ItemSold' notification will be sent to the seller instead of 'FixedPriceTransaction'.
     * 						<br><br>
     * 						This notification is only applicable for multiple-quantity, fixed-price listings.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceTransaction")
    FIXED_PRICE_TRANSACTION("FixedPriceTransaction"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer who was unsuccessful in winning an auction item, but who is now receiving a Second Chance Offer from the seller of the original item. A seller may send a Second Chance Offer to a potential buyer if that seller was unable to complete the sale with the winning bidder or if that seller has duplicate items for sale.
     * 						<br><br>
     * 						This notification is only applicable for auction listings.
     * 					
     * 
     */
    @XmlEnumValue("SecondChanceOffer")
    SECOND_CHANCE_OFFER("SecondChanceOffer"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when an eBay user has used the Ask a question feature on the seller's active listing. An eBay user does not have to be an active bidder on an auction listing to ask a seller a question.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("AskSellerQuestion")
    ASK_SELLER_QUESTION("AskSellerQuestion"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time one of the subscribed seller's items is listed or relisted. This notification is also triggered when the Unpaid Item Assistant mechanism relists an item for the seller.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("ItemListed")
    ITEM_LISTED("ItemListed"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when one of the subscribed seller's items is revised.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("ItemRevised")
    ITEM_REVISED("ItemRevised"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time a buyer responds to an Unpaid Item or Cancel Transaction case that the subscribed seller has opened up against the buyer.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("BuyerResponseDispute")
    BUYER_RESPONSE_DISPUTE("BuyerResponseDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer if a seller opens up an Unpaid Item or Cancel Transaction case against the subscribed buyer.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("SellerOpenedDispute")
    SELLER_OPENED_DISPUTE("SellerOpenedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer each time a seller responds to an Item Not Received or (Item) Significantly Not As Described case that the subscribed buyer has opened up against the seller.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("SellerRespondedToDispute")
    SELLER_RESPONDED_TO_DISPUTE("SellerRespondedToDispute"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer and seller if the seller closes an Unpaid Item or Cancel Transaction case against the buyer.
     * 						<br><br>
     * 						This notification is applicable to auction and fixed-priced listings.
     * 					
     * 
     */
    @XmlEnumValue("SellerClosedDispute")
    SELLER_CLOSED_DISPUTE("SellerClosedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed seller if a potential buyer has made a best offer on a Best Offer-enabled fixed-price or Classified Ad listing.
     * 						<br><br>
     * 						This notification is applicable to fixed-priced, Classified Ad, and eBay Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("BestOffer")
    BEST_OFFER("BestOffer"),

    /**
     * 
     * 						This field was deprecated in 685, and is no longer returned. It was replaced with MyMessagesHighPriorityMessageHeader. SetNotificationPreferences requests for MyMessagesAlertHeader using versions lower than 685 will result in an informational warning. Such requests using versions 685 and higher will return an error response.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesAlertHeader")
    MY_MESSAGES_ALERT_HEADER("MyMessagesAlertHeader"),

    /**
     * 
     * 						This field was deprecated in 685, and is no longer returned. It was replaced with MyMessagesHighPriorityMessage. SetNotificationPreferences requests for MyMessagesAlert using versions lower than 685 will result in an informational warning. Such requests using versions 685 and higher will return an error response.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesAlert")
    MY_MESSAGES_ALERT("MyMessagesAlert"),

    /**
     * 
     * 						This notification is sent to a subscribed user or application when a message from eBay is sent to the user's My Messages. This notification type sends a GetMyMessages response at a detail level of ReturnHeaders. MyMessageseBayMessageHeader and MyMessageseBayMessage cannot be subscribed to at the same time or specified in the same call.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("MyMessageseBayMessageHeader")
    MY_MESSAGESE_BAY_MESSAGE_HEADER("MyMessageseBayMessageHeader"),

    /**
     * 
     * 						This notification is sent to a subscribed user or application when a message from eBay is sent to My Messages. This notification type sends a GetMyMessages response at a detail level of ReturnMessages. MyMessageseBayMessageHeader and MyMessageseBayMessage cannot be subscribed to at the same time or specified in the same call.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("MyMessageseBayMessage")
    MY_MESSAGESE_BAY_MESSAGE("MyMessageseBayMessage"),

    /**
     * 
     * 						This notification is sent to a subscribed user or application when a member to member (M2M) message is sent to My Messages. This notification type sends a GetMyMessages response at a detail level of ReturnHeaders. MyMessagesM2MMessageHeader and MyMessagesM2MMessage cannot be subscribed to at the same time or specified in the same call.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesM2MMessageHeader")
    MY_MESSAGES_M_2_M_MESSAGE_HEADER("MyMessagesM2MMessageHeader"),

    /**
     * 
     * 						This notification is sent to a subscribed user or application when a member to member (M2M) message is sent to My Messages. This notification type sends a GetMyMessages response at a detail level of ReturnMessages. MyMessagesM2MMessageHeader and MyMessagesM2MMessage cannot be subscribed to at the same time or specified in the same call.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesM2MMessage")
    MY_MESSAGES_M_2_M_MESSAGE("MyMessagesM2MMessage"),

    /**
     * 
     * 					  This notification is sent to a subscribed seller or application when a buyer opens up an Item Not Received case against the subscribed seller.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerOpenedDispute")
    INR_BUYER_OPENED_DISPUTE("INRBuyerOpenedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed seller or application when a buyer responds to an Item Not Received case opened against the subscribed seller.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerRespondedToDispute")
    INR_BUYER_RESPONDED_TO_DISPUTE("INRBuyerRespondedToDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed seller or application when a buyer closes an Item Not Received case opened against the subscribed seller.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerClosedDispute")
    INR_BUYER_CLOSED_DISPUTE("INRBuyerClosedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or application when a seller responds to an Item Not Received case opened by the subscribed buyer against that seller.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("INRSellerRespondedToDispute")
    INR_SELLER_RESPONDED_TO_DISPUTE("INRSellerRespondedToDispute"),

    /**
     * 
     * 						This notification is deprecated as it is applicable to eBay Express functionality, which no longer exists.
     * 					
     * 
     */
    @XmlEnumValue("Checkout")
    CHECKOUT("Checkout"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or application when the listing of the watched item is about to end. This notification has a
     * 						<b>TimeLeft</b> property that allows the buyer to specify when the notification is sent based on how much time is left before the listing ends.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("WatchedItemEndingSoon")
    WATCHED_ITEM_ENDING_SOON("WatchedItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to all subscribed parties of interest when a listing ends in one of the following two ways:
     * 						<ul>
     * 						<li>An auction listing ends without a winning bidder. </li>
     * 						<li>A fixed-price listing ends with no sales</li>
     * 						</ul>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("ItemClosed")
    ITEM_CLOSED("ItemClosed"),

    /**
     * 
     * 						This notification is sent to the subscribed seller and subscribed potential buyers if eBay has administratively ended a listing for whatever reason.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("ItemSuspended")
    ITEM_SUSPENDED("ItemSuspended"),

    /**
     * 
     * 						This notification is sent to the subscribed seller each time a seller's single-quantity, fixed-price listing ends with a sale. In the case of a multiple-quantity, fixed-price listing, the 'FixedPriceTransaction' notification will be sent to the seller instead of 'ItemSold'.
     * 						<br><br>
     * 						Applies to Sellers. This notification is only applicable for single-quantity, fixed-price listings.
     * 					
     * 
     */
    @XmlEnumValue("ItemSold")
    ITEM_SOLD("ItemSold"),

    /**
     * 
     * 						This notification is sent to the subscribed seller when the seller has
     * 						successfully extended the duration of a listing.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("ItemExtended")
    ITEM_EXTENDED("ItemExtended"),

    /**
     * 
     * 						This notification is sent to the subscribed user if the user has successfully
     * 						changed their eBay User ID.
     * 					
     * 
     */
    @XmlEnumValue("UserIDChanged")
    USER_ID_CHANGED("UserIDChanged"),

    /**
     * 
     * 						This notification is sent to the subscribed user if the user has successfully
     * 						changed their email address associated with their eBay account.
     * 						<br><br>
     * 						This notification is only available for SMS on the UK and Germany sites, and not
     * 						applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("EmailAddressChanged")
    EMAIL_ADDRESS_CHANGED("EmailAddressChanged"),

    /**
     * 
     * 						This notification is sent to the subscribed user if the user has successfully
     * 						changed their eBay password.
     * 						<br><br>
     * 						This notification is only available for SMS on the UK and Germany sites, and not
     * 						applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PasswordChanged")
    PASSWORD_CHANGED("PasswordChanged"),

    /**
     * 
     * 						This notification is sent to the subscribed user if the user has successfully
     * 						changed their password hint associated with their eBay account.
     * 						<br><br>
     * 						This notification is only available for SMS on the UK and Germany sites, and not
     * 						applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PasswordHintChanged")
    PASSWORD_HINT_CHANGED("PasswordHintChanged"),

    /**
     * 
     * 						This notification is sent to the subscribed seller if the seller has successfully
     * 						updated the payment information associated with their eBay account.
     * 						<br><br>
     * 						This notification is only available for SMS on the UK and Germany sites, and not
     * 						applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PaymentDetailChanged")
    PAYMENT_DETAIL_CHANGED("PaymentDetailChanged"),

    /**
     * 
     * 						This notification is sent to the subscribed user if the user's account has been
     * 						suspended.
     * 						<br><br>
     * 						This notification is only available for SMS on the UK and Germany sites, and not
     * 						applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("AccountSuspended")
    ACCOUNT_SUSPENDED("AccountSuspended"),

    /**
     * 
     * 						An informational alert about account activity.
     * 						A user can subscribe to receive an account activity summary via SMS.
     * 						The user can specify the period (time range) for the account summary and can
     * 						select how often the summary is to be sent. It is not triggered by an event
     * 						but rather by an eBay daemon process that monitors a schedule database.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("AccountSummary")
    ACCOUNT_SUMMARY("AccountSummary"),

    /**
     * 
     * 						This notification is deprecated since it is tied to eBay Express functionality,
     * 						which no longer exists.
     * 					
     * 
     */
    @XmlEnumValue("ThirdPartyCartCheckout")
    THIRD_PARTY_CART_CHECKOUT("ThirdPartyCartCheckout"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when the seller has successfully
     * 						revised an item by adding a charity that will receive a percentage of the
     * 						proceeds for any sales.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("ItemRevisedAddCharity")
    ITEM_REVISED_ADD_CHARITY("ItemRevisedAddCharity"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the user adds an item to
     * 						the Watch List.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemAddedToWatchList")
    ITEM_ADDED_TO_WATCH_LIST("ItemAddedToWatchList"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the user removes an item
     * 						from the Watch List.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemRemovedFromWatchList")
    ITEM_REMOVED_FROM_WATCH_LIST("ItemRemovedFromWatchList"),

    /**
     * 
     * 						This notification is deprecated as the Bid Assistant feature is no longer
     * 						available.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemAddedToBidGroup")
    ITEM_ADDED_TO_BID_GROUP("ItemAddedToBidGroup"),

    /**
     * 
     * 						This notification is deprecated as the Bid Assistant feature is no longer
     * 						available.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemRemovedFromBidGroup")
    ITEM_REMOVED_FROM_BID_GROUP("ItemRemovedFromBidGroup"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that buyer or seller
     * 						has left Feedback for the other party in the order.
     * 						<br><br>
     * 						This notification is applicable for all listing types and orders.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that buyer or
     * 						seller has received Feedback from the other party in the order.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when the user's
     * 						Feedback Star level changes.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackStarChanged")
    FEEDBACK_STAR_CHANGED("FeedbackStarChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the buyer places a bid for
     * 						on an auction item.
     * 					  <br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("BidPlaced")
    BID_PLACED("BidPlaced"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time the seller receives a
     * 						bid for an auction item.
     * 					  <br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("BidReceived")
    BID_RECEIVED("BidReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the buyer has won an auction
     * 						item due to having the highest bid when the auction listing closed.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemWon")
    ITEM_WON("ItemWon"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the buyer has lost an auction
     * 						item due to not having the highest bid when the auction listing closed.
     * 						<br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemLost")
    ITEM_LOST("ItemLost"),

    /**
     * 
     * 						This notification is sent to a subscribing seller when an auction listing ends
     * 						with no winning bidder or when a fixed-price listing ends with no sale(s).
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("ItemUnsold")
    ITEM_UNSOLD("ItemUnsold"),

    /**
     * 
     * 						This notification is sent to a subscribing buyer when a seller makes a counter
     * 						offer to the buyer's best offer. This notification is applicable to Best
     * 						Offer-enabled fixed-price or Classified Ad listings.
     * 					  <br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("CounterOfferReceived")
    COUNTER_OFFER_RECEIVED("CounterOfferReceived"),

    /**
     * 
     * 						This notification is sent to a subscribing buyer if a seller rejects the buyer's
     * 						best offer on an item opted into the Best Offer feature by the seller. This
     * 						notification is also sent to the buyer if the buyer rejects a seller's
     * 						counter offer.
     * 					  <br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferDeclined")
    BEST_OFFER_DECLINED("BestOfferDeclined"),

    /**
     * 
     * 						This notification is sent to a subscribing buyer who successfully places a best
     * 						offer on an item opted into the Best Offer feature by a seller.
     * 					  <br><br>
     * 						Applies to Buyers.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferPlaced")
    BEST_OFFER_PLACED("BestOfferPlaced"),

    /**
     * 
     * 						An informational alert sent to a user when an item is added to her or his watch list. DO NOT USE. This notification was REMOVED in 549.
     * 					
     * 
     */
    @XmlEnumValue("AddToWatchList")
    ADD_TO_WATCH_LIST("AddToWatchList"),

    /**
     * 
     * 						An informational alert sent to a user when he or she places an offer for an item. DO NOT USE. This notification was REMOVED in 549.
     * 					
     * 
     */
    @XmlEnumValue("PlaceOffer")
    PLACE_OFFER("PlaceOffer"),

    /**
     * 
     * 						An informational alert sent to a user when an item is removed from her or his watch list. DO NOT USE. This notification was REMOVED in 549.
     * 					
     * 
     */
    @XmlEnumValue("RemoveFromWatchList")
    REMOVE_FROM_WATCH_LIST("RemoveFromWatchList"),

    /**
     * 
     * 						An informational alert sent to a user when when an item is added to her or his bid group. DO NOT USE. This notification was REMOVED in 549.
     * 					
     * 
     */
    @XmlEnumValue("AddToBidGroup")
    ADD_TO_BID_GROUP("AddToBidGroup"),

    /**
     * 
     * 						An informational alert sent to a user when an item is removed from her or his bid group. DO NOT USE. This notification was REMOVED in 549.
     * 					
     * 
     */
    @XmlEnumValue("RemoveFromBidGroup")
    REMOVE_FROM_BID_GROUP("RemoveFromBidGroup"),

    /**
     * 
     * 						This event is not functional.
     * 					
     * 
     */
    @XmlEnumValue("ItemsCanceled")
    ITEMS_CANCELED("ItemsCanceled"),

    /**
     * 
     * 						This notification is sent to a subscribed user if their eBay user token (required
     * 						to make Trading API calls) has been revoked.
     * 						<br><br>
     * 						Applies to both Buyers and Sellers.
     * 					
     * 
     */
    @XmlEnumValue("TokenRevocation")
    TOKEN_REVOCATION("TokenRevocation"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a Bulk Data Exchange job completes.
     * 						<br><br>
     * 						Applies to Sellers.
     * 					
     * 
     */
    @XmlEnumValue("BulkDataExchangeJobCompleted")
    BULK_DATA_EXCHANGE_JOB_COMPLETED("BulkDataExchangeJobCompleted"),

    /**
     * 
     * 					  Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when an item is marked as
     * 						shipped by the seller.
     * 						<br><br>
     * 						Applies to Sellers and Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedShipped")
    ITEM_MARKED_SHIPPED("ItemMarkedShipped"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when an item is marked as
     * 						paid by the seller.
     * 						<br><br>
     * 						Applies to Sellers and Buyers.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedPaid")
    ITEM_MARKED_PAID("ItemMarkedPaid"),

    /**
     * 
     * 						This notification is sent to a subscribing buyer or seller (or application)
     * 						when a response to the eBP case is due from the call user. When a eBP case is
     * 						opened, this notification is only sent to the seller involved in the case and
     * 						not the buyer.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPMyResponseDue")
    EBP_MY_RESPONSE_DUE("EBPMyResponseDue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a response to the eBP case is due from the other party in the case.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPOtherPartyResponseDue")
    EBP_OTHER_PARTY_RESPONSE_DUE("EBPOtherPartyResponseDue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when an eBP case is escalated.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPEscalatedCase")
    EBP_ESCALATED_CASE("EBPEscalatedCase"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when the decision of an eBP case is appealed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPAppealedCase")
    EBP_APPEALED_CASE("EBPAppealedCase"),

    /**
     * 
     * 						This notification is sent to the subscribed seller (or application) when
     * 						payment (to eBay or buyer) is due.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPMyPaymentDue")
    EBP_MY_PAYMENT_DUE("EBPMyPaymentDue"),

    /**
     * 
     * 						This notification is sent to the subscribed seller (or application) when
     * 						payment (to eBay or buyer) is processed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPPaymentDone")
    EBP_PAYMENT_DONE("EBPPaymentDone"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when an appeal of an eBP case decision has been closed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPClosedAppeal")
    EBP_CLOSED_APPEAL("EBPClosedAppeal"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when an eBP case has been closed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPClosedCase")
    EBP_CLOSED_CASE("EBPClosedCase"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when a High Priority
     * 						Message (priority 1 or 2) is sent to My Messages. Only High Priority Message
     * 						will be sent back as part of the Notification payload. This notification type
     * 						sends a GetMyMessages response at a detail level of ReturnMessages.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesHighPriorityMessage")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE("MyMessagesHighPriorityMessage"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller
     * 						when a High Priority Message (priority 1 or 2) is sent to My Messages. Only
     * 						High Priority Messages will be sent back as part of the notification
     * 						payload. This notification type sends a GetMyMessages response at a detail level
     * 						of ReturnHeaders.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesHighPriorityMessageHeader")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE_HEADER("MyMessagesHighPriorityMessageHeader"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when an eBP case has been put on hold by eBay Customer Service.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPOnHoldCase")
    EBP_ON_HOLD_CASE("EBPOnHoldCase"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("ReadyToShip")
    READY_TO_SHIP("ReadyToShip"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("ReadyForPayout")
    READY_FOR_PAYOUT("ReadyForPayout"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer (or application) when a listing
     * 						that the buyer has bid on is about to end. This notification has a
     * 						<b>TimeLeft</b> property that allows the buyer to specify when the
     * 						notification is sent based on how much time is left before the listing ends.
     * 					
     * 
     */
    @XmlEnumValue("BidItemEndingSoon")
    BID_ITEM_ENDING_SOON("BidItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer (or application) when the
     * 						listing for an unpurchased item in the buyer's cart is about to end. This notification
     * 						has a <b>TimeLeft</b> property that allows the buyer to specify when
     * 						the notification is sent based on how much time is left before the listing ends.
     * 						<br><br>
     * 						This notification is for future use.
     * 					
     * 
     */
    @XmlEnumValue("ShoppingCartItemEndingSoon")
    SHOPPING_CART_ITEM_ENDING_SOON("ShoppingCartItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a return is created.
     * 					
     * 
     */
    @XmlEnumValue("ReturnCreated")
    RETURN_CREATED("ReturnCreated"),

    /**
     * 
     * 						This notification is sent to the subscribed seller (or application)
     * 						when a return is waiting for Seller information like RMA and Return Address.
     * 					
     * 
     */
    @XmlEnumValue("ReturnWaitingForSellerInfo")
    RETURN_WAITING_FOR_SELLER_INFO("ReturnWaitingForSellerInfo"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when Seller information like RMA and Return Address is overdue.
     * 					
     * 
     */
    @XmlEnumValue("ReturnSellerInfoOverdue")
    RETURN_SELLER_INFO_OVERDUE("ReturnSellerInfoOverdue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a return is shipped.
     * 					
     * 
     */
    @XmlEnumValue("ReturnShipped")
    RETURN_SHIPPED("ReturnShipped"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a return is delivered.
     * 					
     * 
     */
    @XmlEnumValue("ReturnDelivered")
    RETURN_DELIVERED("ReturnDelivered"),

    /**
     * 
     * 						This notification is sent to the subscribed seller (or application)
     * 						when refund is overdue on a return.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRefundOverdue")
    RETURN_REFUND_OVERDUE("ReturnRefundOverdue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a return is closed.
     * 					
     * 
     */
    @XmlEnumValue("ReturnClosed")
    RETURN_CLOSED("ReturnClosed"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller (or application)
     * 						when a return is escalated.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalated")
    RETURN_ESCALATED("ReturnEscalated"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("UnmatchedPaymentReceived")
    UNMATCHED_PAYMENT_RECEIVED("UnmatchedPaymentReceived"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("RefundSuccess")
    REFUND_SUCCESS("RefundSuccess"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("RefundFailure")
    REFUND_FAILURE("RefundFailure"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer (or application) when that buyer has yet to pay for their order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReminder")
    PAYMENT_REMINDER("PaymentReminder"),

    /**
     * 
     *             This notification is sent to a subscribed merchant (or application) when an eBay Now order has been picked up from the store by an eBay Now valet for delivery to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("EBNOrderPickedUp")
    EBN_ORDER_PICKED_UP("EBNOrderPickedUp"),

    /**
     * 
     *             This notification is sent to a subscribed merchant (or application) when an eBay Now order has been canceled.	The reason for an eBay Now order cancellation can be found by retrieving the order through the <b>GetOrders</b> and looking for the <b>Order.CancelReason</b> value.
     * 					
     * 
     */
    @XmlEnumValue("EBNOrderCanceled")
    EBN_ORDER_CANCELED("EBNOrderCanceled"),

    /**
     * 
     *             This notification is sent to a subscribed buyer or seller (or application) when a member-to-member (M2M) message is either deleted or marked as read in the InBox.
     * 					
     * 
     */
    @XmlEnumValue("M2MMessageStatusChange")
    M_2_M_MESSAGE_STATUS_CHANGE("M2MMessageStatusChange");
    private final String value;

    NotificationEventTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventTypeCodeType fromValue(String v) {
        for (NotificationEventTypeCodeType c: NotificationEventTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
