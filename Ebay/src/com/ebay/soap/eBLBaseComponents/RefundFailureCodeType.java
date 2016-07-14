
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundFailureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundFailureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaypalBillingAgreementCanceled"/>
 *     &lt;enumeration value="PaypalRiskDeclinesTransaction"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundFailureCodeType")
@XmlEnum
public enum RefundFailureCodeType {


    /**
     * 
     * 					 The refund attempt failed because the seller's billing agreement with PayPal has
     * 					 been cancelled. 
     * 					 <br/><br/>
     *            <span class="tablenote">
     *            <strong>Note:</strong> The new eBay payment process for German and 
     * 						Austrian sites has been put on hold indefinitely.
     *            </span>
     * 					
     * 
     */
    @XmlEnumValue("PaypalBillingAgreementCanceled")
    PAYPAL_BILLING_AGREEMENT_CANCELED("PaypalBillingAgreementCanceled"),

    /**
     * 
     * 					 The refund attempt failed because because the PayPayl Risk team declined the 
     * 					 transaction. The seller should log in to their PayPal account to proceed with the
     * 					 refund request. 
     * 					 <br/><br/>
     *            <span class="tablenote">
     *            <strong>Note:</strong> The new eBay payment process for German and 
     * 						Austrian sites has been put on hold indefinitely.
     *            </span>
     * 					
     * 
     */
    @XmlEnumValue("PaypalRiskDeclinesTransaction")
    PAYPAL_RISK_DECLINES_TRANSACTION("PaypalRiskDeclinesTransaction"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundFailureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundFailureCodeType fromValue(String v) {
        for (RefundFailureCodeType c: RefundFailureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
