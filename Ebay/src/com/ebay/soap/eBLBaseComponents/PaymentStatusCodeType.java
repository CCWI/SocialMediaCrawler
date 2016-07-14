
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoPaymentFailure"/>
 *     &lt;enumeration value="BuyerECheckBounced"/>
 *     &lt;enumeration value="BuyerCreditCardFailed"/>
 *     &lt;enumeration value="BuyerFailedPaymentReportedBySeller"/>
 *     &lt;enumeration value="PayPalPaymentInProcess"/>
 *     &lt;enumeration value="PaymentInProcess"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentStatusCodeType")
@XmlEnum
public enum PaymentStatusCodeType {


    /**
     * 
     * 						This value indicates that the buyer's payment for the order has cleared. A 
     * 						<b>CheckoutStatus.eBayPaymentStatus</b> value of 'NoPaymentFailure' 
     * 						and a <b>CheckoutStatus.Status</b> value of 'Complete' indicates that 
     * 						checkout is complete.
     * 					
     * 
     */
    @XmlEnumValue("NoPaymentFailure")
    NO_PAYMENT_FAILURE("NoPaymentFailure"),

    /**
     * 
     * 						This value indicates that the buyer's eCheck bounced. This value is only applicable 
     * 						if the seller accepts eChecks as a form of payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerECheckBounced")
    BUYER_E_CHECK_BOUNCED("BuyerECheckBounced"),

    /**
     * 
     * 						This value indicates that the buyer's payment via a credit card failed. This value
     * 						is only applicable if the seller accepts credit cards as a form of payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCreditCardFailed")
    BUYER_CREDIT_CARD_FAILED("BuyerCreditCardFailed"),

    /**
     * 
     * 						This value indicates that the seller reported the buyer's payment as failed.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFailedPaymentReportedBySeller")
    BUYER_FAILED_PAYMENT_REPORTED_BY_SELLER("BuyerFailedPaymentReportedBySeller"),

    /**
     * 
     * 						This value indicates that the buyer's PayPal payment is in process. This value
     * 						is only applicable if the buyer has selected PayPal as the payment method.
     * 					
     * 
     */
    @XmlEnumValue("PayPalPaymentInProcess")
    PAY_PAL_PAYMENT_IN_PROCESS("PayPalPaymentInProcess"),

    /**
     * 
     * 						This value indicates that the buyer's non-PayPal payment is in process. This value
     * 						is only applicable if the buyer has selected a payment method other than PayPal.
     * 					
     * 
     */
    @XmlEnumValue("PaymentInProcess")
    PAYMENT_IN_PROCESS("PaymentInProcess"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusCodeType fromValue(String v) {
        for (PaymentStatusCodeType c: PaymentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
