
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerEmailTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerEmailTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ManualEntry"/>
 *     &lt;enumeration value="WinningBuyerEmail"/>
 *     &lt;enumeration value="PaymentReminderEmail"/>
 *     &lt;enumeration value="PaymentReceivedEmail"/>
 *     &lt;enumeration value="RequestForShippingAddressEmail"/>
 *     &lt;enumeration value="FeedbackReminderEmail"/>
 *     &lt;enumeration value="ShipmentSentEmail"/>
 *     &lt;enumeration value="PersonalizedEmail"/>
 *     &lt;enumeration value="InvoiceNotification"/>
 *     &lt;enumeration value="CustomEmailTemplate1"/>
 *     &lt;enumeration value="CustomEmailTemplate2"/>
 *     &lt;enumeration value="CustomEmailTemplate3"/>
 *     &lt;enumeration value="CustomEmailTemplate4"/>
 *     &lt;enumeration value="CustomEmailTemplate5"/>
 *     &lt;enumeration value="CustomEmailTemplate6"/>
 *     &lt;enumeration value="CustomEmailTemplate7"/>
 *     &lt;enumeration value="CustomEmailTemplate8"/>
 *     &lt;enumeration value="CustomEmailTemplate9"/>
 *     &lt;enumeration value="CustomEmailTemplate10"/>
 *     &lt;enumeration value="CustomEmailTemplate11"/>
 *     &lt;enumeration value="CustomEmailTemplate12"/>
 *     &lt;enumeration value="CustomEmailTemplate13"/>
 *     &lt;enumeration value="CustomEmailTemplate14"/>
 *     &lt;enumeration value="CustomEmailTemplate15"/>
 *     &lt;enumeration value="CustomEmailTemplate16"/>
 *     &lt;enumeration value="CustomEmailTemplate17"/>
 *     &lt;enumeration value="CustomEmailTemplate18"/>
 *     &lt;enumeration value="CustomEmailTemplate19"/>
 *     &lt;enumeration value="CustomEmailTemplate20"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerEmailTypeCodeType")
@XmlEnum
public enum SellingManagerEmailTypeCodeType {


    /**
     * 
     * 						Email logged manually. For example, the seller manually adds an entry to
     * 						track email sent to a buyer offline.
     * 					
     * 
     */
    @XmlEnumValue("ManualEntry")
    MANUAL_ENTRY("ManualEntry"),

    /**
     * 
     * 						Winning Buyer Notification.
     * 					
     * 
     */
    @XmlEnumValue("WinningBuyerEmail")
    WINNING_BUYER_EMAIL("WinningBuyerEmail"),

    /**
     * 
     * 						Payment Reminder emails.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReminderEmail")
    PAYMENT_REMINDER_EMAIL("PaymentReminderEmail"),

    /**
     * 
     * 						Payment received notification.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReceivedEmail")
    PAYMENT_RECEIVED_EMAIL("PaymentReceivedEmail"),

    /**
     * 
     * 						Request shipping address email.
     * 					
     * 
     */
    @XmlEnumValue("RequestForShippingAddressEmail")
    REQUEST_FOR_SHIPPING_ADDRESS_EMAIL("RequestForShippingAddressEmail"),

    /**
     * 
     * 						Feedback Reminder emails.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReminderEmail")
    FEEDBACK_REMINDER_EMAIL("FeedbackReminderEmail"),

    /**
     * 
     * 						Shipment sent email.
     * 					
     * 
     */
    @XmlEnumValue("ShipmentSentEmail")
    SHIPMENT_SENT_EMAIL("ShipmentSentEmail"),

    /**
     * 
     * 						Personalized emails.
     * 					
     * 
     */
    @XmlEnumValue("PersonalizedEmail")
    PERSONALIZED_EMAIL("PersonalizedEmail"),

    /**
     * 
     * 						Invoice notification emails.
     * 					
     * 
     */
    @XmlEnumValue("InvoiceNotification")
    INVOICE_NOTIFICATION("InvoiceNotification"),

    /**
     * 
     * 						Custom email template 1.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate1")
    CUSTOM_EMAIL_TEMPLATE_1("CustomEmailTemplate1"),

    /**
     * 
     * 						Custom email template 2.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate2")
    CUSTOM_EMAIL_TEMPLATE_2("CustomEmailTemplate2"),

    /**
     * 
     * 						Custom email template 3.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate3")
    CUSTOM_EMAIL_TEMPLATE_3("CustomEmailTemplate3"),

    /**
     * 
     * 						Custom email template 4.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate4")
    CUSTOM_EMAIL_TEMPLATE_4("CustomEmailTemplate4"),

    /**
     * 
     * 						Custom email template 5.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate5")
    CUSTOM_EMAIL_TEMPLATE_5("CustomEmailTemplate5"),

    /**
     * 
     * 						Custom email template 6.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate6")
    CUSTOM_EMAIL_TEMPLATE_6("CustomEmailTemplate6"),

    /**
     * 
     * 						Custom email template 7.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate7")
    CUSTOM_EMAIL_TEMPLATE_7("CustomEmailTemplate7"),

    /**
     * 
     * 						Custom email template 8.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate8")
    CUSTOM_EMAIL_TEMPLATE_8("CustomEmailTemplate8"),

    /**
     * 
     * 						Custom email template 9.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate9")
    CUSTOM_EMAIL_TEMPLATE_9("CustomEmailTemplate9"),

    /**
     * 
     * 						Custom email template 10.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate10")
    CUSTOM_EMAIL_TEMPLATE_10("CustomEmailTemplate10"),

    /**
     * 
     * 						Custom email template 11.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate11")
    CUSTOM_EMAIL_TEMPLATE_11("CustomEmailTemplate11"),

    /**
     * 
     * 						Custom email template 12.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate12")
    CUSTOM_EMAIL_TEMPLATE_12("CustomEmailTemplate12"),

    /**
     * 
     * 						Custom email template 13.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate13")
    CUSTOM_EMAIL_TEMPLATE_13("CustomEmailTemplate13"),

    /**
     * 
     * 						Custom email template 14.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate14")
    CUSTOM_EMAIL_TEMPLATE_14("CustomEmailTemplate14"),

    /**
     * 
     * 						Custom email template 15.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate15")
    CUSTOM_EMAIL_TEMPLATE_15("CustomEmailTemplate15"),

    /**
     * 
     * 						Custom email template 16.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate16")
    CUSTOM_EMAIL_TEMPLATE_16("CustomEmailTemplate16"),

    /**
     * 
     * 						Custom email template 17.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate17")
    CUSTOM_EMAIL_TEMPLATE_17("CustomEmailTemplate17"),

    /**
     * 
     * 						Custom email template 18.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate18")
    CUSTOM_EMAIL_TEMPLATE_18("CustomEmailTemplate18"),

    /**
     * 
     * 						Custom email template 19.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate19")
    CUSTOM_EMAIL_TEMPLATE_19("CustomEmailTemplate19"),

    /**
     * 
     * 						Custom email template 20.
     * 					
     * 
     */
    @XmlEnumValue("CustomEmailTemplate20")
    CUSTOM_EMAIL_TEMPLATE_20("CustomEmailTemplate20"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerEmailTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerEmailTypeCodeType fromValue(String v) {
        for (SellingManagerEmailTypeCodeType c: SellingManagerEmailTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
