
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerSoldListingsPropertyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerSoldListingsPropertyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotPaidNotShipped"/>
 *     &lt;enumeration value="PaidNotShipped"/>
 *     &lt;enumeration value="PrintShippingLabel"/>
 *     &lt;enumeration value="PaidShipped"/>
 *     &lt;enumeration value="PaidNoFeedback"/>
 *     &lt;enumeration value="PaymentReminderSendError"/>
 *     &lt;enumeration value="PaymentReceivedNotificationSendError"/>
 *     &lt;enumeration value="RequestForShippingAddressSendError"/>
 *     &lt;enumeration value="ShippingNotificationSendError"/>
 *     &lt;enumeration value="PersonalizedEmailsSendError"/>
 *     &lt;enumeration value="WinningBuyerNotificationSendError"/>
 *     &lt;enumeration value="FeeCreditRequest"/>
 *     &lt;enumeration value="PayPalPayment"/>
 *     &lt;enumeration value="FeedbackMessageNotSent"/>
 *     &lt;enumeration value="FeedbackReminderSendError"/>
 *     &lt;enumeration value="NotShipped"/>
 *     &lt;enumeration value="UnpaidItemReminder"/>
 *     &lt;enumeration value="EscrowCancelled"/>
 *     &lt;enumeration value="EscrowCompleted"/>
 *     &lt;enumeration value="EscrowInitiated"/>
 *     &lt;enumeration value="EscrowManageRefund"/>
 *     &lt;enumeration value="EscrowReleasePayment"/>
 *     &lt;enumeration value="EscrowShipToBuyer"/>
 *     &lt;enumeration value="EscrowSoldAll"/>
 *     &lt;enumeration value="ShippedAndAwaitingFeedback"/>
 *     &lt;enumeration value="InternationalSale"/>
 *     &lt;enumeration value="eBayGivingWorksDonationOwed"/>
 *     &lt;enumeration value="PaymentOverDue"/>
 *     &lt;enumeration value="PadiWithPaisaPayEscrow"/>
 *     &lt;enumeration value="CustomEmailTemplate1SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate2SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate3SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate4SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate5SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate6SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate7SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate8SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate9SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate10SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate11SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate12SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate13SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate14SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate15SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate16SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate17SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate18SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate19SendError"/>
 *     &lt;enumeration value="CustomEmailTemplate20SendError"/>
 *     &lt;enumeration value="ResponseRequiredForReturnCase"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerSoldListingsPropertyTypeCodeType")
@XmlEnum
public enum SellingManagerSoldListingsPropertyTypeCodeType {


    /**
     * 
     * 						Item is not paid and not shipped.
     * 					
     * 
     */
    @XmlEnumValue("NotPaidNotShipped")
    NOT_PAID_NOT_SHIPPED("NotPaidNotShipped"),

    /**
     * 
     * 						Item is paid but not shipped.
     * 					
     * 
     */
    @XmlEnumValue("PaidNotShipped")
    PAID_NOT_SHIPPED("PaidNotShipped"),

    /**
     * 
     * 						Item is paid but not shipped.
     * 					
     * 
     */
    @XmlEnumValue("PrintShippingLabel")
    PRINT_SHIPPING_LABEL("PrintShippingLabel"),

    /**
     * 
     * 						Item is paid for and is shipped.
     * 					
     * 
     */
    @XmlEnumValue("PaidShipped")
    PAID_SHIPPED("PaidShipped"),

    /**
     * 
     * 						An alert has been issued about a listing that is paid with no feedback left.
     * 					
     * 
     */
    @XmlEnumValue("PaidNoFeedback")
    PAID_NO_FEEDBACK("PaidNoFeedback"),

    /**
     * 
     * 						Payment Reminder emails not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReminderSendError")
    PAYMENT_REMINDER_SEND_ERROR("PaymentReminderSendError"),

    /**
     * 
     * 						Payment received notification not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReceivedNotificationSendError")
    PAYMENT_RECEIVED_NOTIFICATION_SEND_ERROR("PaymentReceivedNotificationSendError"),

    /**
     * 
     * 						Request shipping address emails not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("RequestForShippingAddressSendError")
    REQUEST_FOR_SHIPPING_ADDRESS_SEND_ERROR("RequestForShippingAddressSendError"),

    /**
     * 
     * 						Request shipping address emails not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("ShippingNotificationSendError")
    SHIPPING_NOTIFICATION_SEND_ERROR("ShippingNotificationSendError"),

    /**
     * 
     * 						Personalized emails not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("PersonalizedEmailsSendError")
    PERSONALIZED_EMAILS_SEND_ERROR("PersonalizedEmailsSendError"),

    /**
     * 
     * 						Winning Buyer Notification not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("WinningBuyerNotificationSendError")
    WINNING_BUYER_NOTIFICATION_SEND_ERROR("WinningBuyerNotificationSendError"),

    /**
     * 
     * 						Final value fee credit requests can be filed.
     * 					
     * 
     */
    @XmlEnumValue("FeeCreditRequest")
    FEE_CREDIT_REQUEST("FeeCreditRequest"),

    /**
     * 
     * 						If true, indicates that the PayPal Payment Received alert has been issued.
     * 					
     * 
     */
    @XmlEnumValue("PayPalPayment")
    PAY_PAL_PAYMENT("PayPalPayment"),

    /**
     * 
     * 						Automated feedback message is not sent.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackMessageNotSent")
    FEEDBACK_MESSAGE_NOT_SENT("FeedbackMessageNotSent"),

    /**
     * 
     * 						Feedback Reminder emails not sent due to system error.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReminderSendError")
    FEEDBACK_REMINDER_SEND_ERROR("FeedbackReminderSendError"),

    /**
     * 
     * 						Item is not shipped.
     * 					
     * 
     */
    @XmlEnumValue("NotShipped")
    NOT_SHIPPED("NotShipped"),

    /**
     * 
     * 						Listing eligible for unpaid item reminder
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemReminder")
    UNPAID_ITEM_REMINDER("UnpaidItemReminder"),

    /**
     * 
     * 						Escrow status is Cancelled.
     * 					
     * 
     */
    @XmlEnumValue("EscrowCancelled")
    ESCROW_CANCELLED("EscrowCancelled"),

    /**
     * 
     * 						Escrow status is Completed.
     * 					
     * 
     */
    @XmlEnumValue("EscrowCompleted")
    ESCROW_COMPLETED("EscrowCompleted"),

    /**
     * 
     * 						Escrow status is Initiated.
     * 					
     * 
     */
    @XmlEnumValue("EscrowInitiated")
    ESCROW_INITIATED("EscrowInitiated"),

    /**
     * 
     * 						Escrow status is in refund state.
     * 					
     * 
     */
    @XmlEnumValue("EscrowManageRefund")
    ESCROW_MANAGE_REFUND("EscrowManageRefund"),

    /**
     * 
     * 						Item is shipped and Escrow status is in Release payment.
     * 					
     * 
     */
    @XmlEnumValue("EscrowReleasePayment")
    ESCROW_RELEASE_PAYMENT("EscrowReleasePayment"),

    /**
     * 
     * 						Payment is confirmed and item can be shipped to buyer.
     * 					
     * 
     */
    @XmlEnumValue("EscrowShipToBuyer")
    ESCROW_SHIP_TO_BUYER("EscrowShipToBuyer"),

    /**
     * 
     * 						All Escrow states.
     * 					
     * 
     */
    @XmlEnumValue("EscrowSoldAll")
    ESCROW_SOLD_ALL("EscrowSoldAll"),

    /**
     * 
     * 						Item is shipped and feedback is not yet received.
     * 					
     * 
     */
    @XmlEnumValue("ShippedAndAwaitingFeedback")
    SHIPPED_AND_AWAITING_FEEDBACK("ShippedAndAwaitingFeedback"),

    /**
     * 
     * 						New international sale.
     * 					
     * 
     */
    @XmlEnumValue("InternationalSale")
    INTERNATIONAL_SALE("InternationalSale"),

    /**
     * 
     * 						Charity filter.
     * 					
     * 
     */
    @XmlEnumValue("eBayGivingWorksDonationOwed")
    E_BAY_GIVING_WORKS_DONATION_OWED("eBayGivingWorksDonationOwed"),

    /**
     * 
     * 						Payment is overdue.
     * 					
     * 
     */
    @XmlEnumValue("PaymentOverDue")
    PAYMENT_OVER_DUE("PaymentOverDue"),

    /**
     * 
     * 						Payment is done with PaisaPay Escrow.
     * 					
     * 
     */
    @XmlEnumValue("PadiWithPaisaPayEscrow")
    PADI_WITH_PAISA_PAY_ESCROW("PadiWithPaisaPayEscrow"),

    /**
     * 
     * 						Failed to send custom email template 1.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate1SendError")
    CUSTOM_EMAIL_TEMPLATE_1_SEND_ERROR("CustomEmailTemplate1SendError"),

    /**
     * 
     * 						Failed to send custom email template 2.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate2SendError")
    CUSTOM_EMAIL_TEMPLATE_2_SEND_ERROR("CustomEmailTemplate2SendError"),

    /**
     * 
     * 						Failed to send custom email template 3.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate3SendError")
    CUSTOM_EMAIL_TEMPLATE_3_SEND_ERROR("CustomEmailTemplate3SendError"),

    /**
     * 
     * 						Failed to send custom email template 4.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate4SendError")
    CUSTOM_EMAIL_TEMPLATE_4_SEND_ERROR("CustomEmailTemplate4SendError"),

    /**
     * 
     * 						Failed to send custom email template 5.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate5SendError")
    CUSTOM_EMAIL_TEMPLATE_5_SEND_ERROR("CustomEmailTemplate5SendError"),

    /**
     * 
     * 						Failed to send custom email template 6.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate6SendError")
    CUSTOM_EMAIL_TEMPLATE_6_SEND_ERROR("CustomEmailTemplate6SendError"),

    /**
     * 
     * 						Failed to send custom email template 7.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate7SendError")
    CUSTOM_EMAIL_TEMPLATE_7_SEND_ERROR("CustomEmailTemplate7SendError"),

    /**
     * 
     * 						Failed to send custom email template 8.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate8SendError")
    CUSTOM_EMAIL_TEMPLATE_8_SEND_ERROR("CustomEmailTemplate8SendError"),

    /**
     * 
     * 						Failed to send custom email template 9.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate9SendError")
    CUSTOM_EMAIL_TEMPLATE_9_SEND_ERROR("CustomEmailTemplate9SendError"),

    /**
     * 
     * 						Failed to send custom email template 10.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate10SendError")
    CUSTOM_EMAIL_TEMPLATE_10_SEND_ERROR("CustomEmailTemplate10SendError"),

    /**
     * 
     * 						Failed to send custom email template 11.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate11SendError")
    CUSTOM_EMAIL_TEMPLATE_11_SEND_ERROR("CustomEmailTemplate11SendError"),

    /**
     * 
     * 						Failed to send custom email template 12.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate12SendError")
    CUSTOM_EMAIL_TEMPLATE_12_SEND_ERROR("CustomEmailTemplate12SendError"),

    /**
     * 
     * 						Failed to send custom email template 13.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate13SendError")
    CUSTOM_EMAIL_TEMPLATE_13_SEND_ERROR("CustomEmailTemplate13SendError"),

    /**
     * 
     * 						Failed to send custom email template 14.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate14SendError")
    CUSTOM_EMAIL_TEMPLATE_14_SEND_ERROR("CustomEmailTemplate14SendError"),

    /**
     * 
     * 						Failed to send custom email template 15.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate15SendError")
    CUSTOM_EMAIL_TEMPLATE_15_SEND_ERROR("CustomEmailTemplate15SendError"),

    /**
     * 
     * 						Failed to send custom email template 16.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate16SendError")
    CUSTOM_EMAIL_TEMPLATE_16_SEND_ERROR("CustomEmailTemplate16SendError"),

    /**
     * 
     * 						Failed to send custom email template 17.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate17SendError")
    CUSTOM_EMAIL_TEMPLATE_17_SEND_ERROR("CustomEmailTemplate17SendError"),

    /**
     * 
     * 						Failed to send custom email template 18.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate18SendError")
    CUSTOM_EMAIL_TEMPLATE_18_SEND_ERROR("CustomEmailTemplate18SendError"),

    /**
     * 
     * 						Failed to send custom email template 19.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate19SendError")
    CUSTOM_EMAIL_TEMPLATE_19_SEND_ERROR("CustomEmailTemplate19SendError"),

    /**
     * 
     * 						Failed to send custom email template 20.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate20SendError")
    CUSTOM_EMAIL_TEMPLATE_20_SEND_ERROR("CustomEmailTemplate20SendError"),

    /**
     * 
     * 						Reserved for future use. If a buyer requests to return an item, the seller's response is required.
     * 					
     * 
     */
    @XmlEnumValue("ResponseRequiredForReturnCase")
    RESPONSE_REQUIRED_FOR_RETURN_CASE("ResponseRequiredForReturnCase"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerSoldListingsPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerSoldListingsPropertyTypeCodeType fromValue(String v) {
        for (SellingManagerSoldListingsPropertyTypeCodeType c: SellingManagerSoldListingsPropertyTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
