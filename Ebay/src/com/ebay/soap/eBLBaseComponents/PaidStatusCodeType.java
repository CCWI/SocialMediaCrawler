
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaidStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaidStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotPaid"/>
 *     &lt;enumeration value="BuyerHasNotCompletedCheckout"/>
 *     &lt;enumeration value="PaymentPendingWithPayPal"/>
 *     &lt;enumeration value="PaidWithPayPal"/>
 *     &lt;enumeration value="MarkedAsPaid"/>
 *     &lt;enumeration value="PaymentPendingWithEscrow"/>
 *     &lt;enumeration value="PaidWithEscrow"/>
 *     &lt;enumeration value="EscrowPaymentCancelled"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPay"/>
 *     &lt;enumeration value="PaidWithPaisaPay"/>
 *     &lt;enumeration value="PaymentPending"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaidWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayNotPaid"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="WaitingForCODPayment"/>
 *     &lt;enumeration value="PaidCOD"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Paid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaidStatusCodeType")
@XmlEnum
public enum PaidStatusCodeType {


    /**
     * 
     * 						The buyer has not completed checkout, but has not paid through PayPal or
     * 						PaisaPay (but please also see the documentation for PaymentHoldStatus and its applicable values).
     * 						The buyer might have paid using another method, but the payment
     * 						might not have been received or cleared.
     * 						Important: Please see the documentation for PaymentHoldStatus and its applicable values.
     * 						PaymentHoldStatus contains the current status of a hold on a PayPal payment.
     * 					
     * 
     */
    @XmlEnumValue("NotPaid")
    NOT_PAID("NotPaid"),

    /**
     * 
     * 						The buyer has not completed the checkout process and so has not made payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotCompletedCheckout")
    BUYER_HAS_NOT_COMPLETED_CHECKOUT("BuyerHasNotCompletedCheckout"),

    /**
     * 
     * 						The buyer has made a PayPal payment, but the seller has not yet received it.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPayPal")
    PAYMENT_PENDING_WITH_PAY_PAL("PaymentPendingWithPayPal"),

    /**
     * 
     * 						The buyer has made a PayPal payment, and the payment is complete.
     * 						But please also see the documentation for PaymentHoldStatus and its applicable values.
     * 						PaymentHoldStatus contains the current status of a hold on a PayPal payment.
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPayPal")
    PAID_WITH_PAY_PAL("PaidWithPayPal"),

    /**
     * 
     * 						The order is marked as paid by either buyer or seller.
     * 					
     * 
     */
    @XmlEnumValue("MarkedAsPaid")
    MARKED_AS_PAID("MarkedAsPaid"),

    /**
     * 
     * 						The buyer has made an escrow payment, but the seller has not yet received it.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithEscrow")
    PAYMENT_PENDING_WITH_ESCROW("PaymentPendingWithEscrow"),

    /**
     * 
     * 						The buyer has made an escrow payment, and the seller has received payment.
     * 					
     * 
     */
    @XmlEnumValue("PaidWithEscrow")
    PAID_WITH_ESCROW("PaidWithEscrow"),

    /**
     * 
     * 						The buyer has made an escrow payment, but has cancelled the payment.
     * 					
     * 
     */
    @XmlEnumValue("EscrowPaymentCancelled")
    ESCROW_PAYMENT_CANCELLED("EscrowPaymentCancelled"),

    /**
     * 
     * 						The buyer has paid with PaisaPay, but the payment is still being processed.
     * 						The seller has not yet received payment.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPay")
    PAYMENT_PENDING_WITH_PAISA_PAY("PaymentPendingWithPaisaPay"),

    /**
     * 
     * 						The buyer has paid with PaisaPay, and the payment is complete.
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPay")
    PAID_WITH_PAISA_PAY("PaidWithPaisaPay"),

    /**
     * 
     * 						The buyer has made a payment other than PayPal, escrow, or PaisaPay, but the
     * 						payment is still being processed.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPending")
    PAYMENT_PENDING("PaymentPending"),

    /**
     * 
     * 						Payment Pending With PaisaPay Escrow
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPayEscrow")
    PAYMENT_PENDING_WITH_PAISA_PAY_ESCROW("PaymentPendingWithPaisaPayEscrow"),

    /**
     * 
     * 						Paid With PaisaPay Escrow
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPayEscrow")
    PAID_WITH_PAISA_PAY_ESCROW("PaidWithPaisaPayEscrow"),

    /**
     * 
     * 						Paisa Pay Not Paid
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayNotPaid")
    PAISA_PAY_NOT_PAID("PaisaPayNotPaid"),

    /**
     * 
     * 						Refunded
     * 					
     * 
     */
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),

    /**
     * 
     * 						WaitingForCODPayment
     * 					
     * 
     */
    @XmlEnumValue("WaitingForCODPayment")
    WAITING_FOR_COD_PAYMENT("WaitingForCODPayment"),

    /**
     * 
     * 						PaidCOD
     * 					
     * 
     */
    @XmlEnumValue("PaidCOD")
    PAID_COD("PaidCOD"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Paid
     * 					
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid");
    private final String value;

    PaidStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatusCodeType fromValue(String v) {
        for (PaidStatusCodeType c: PaidStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
