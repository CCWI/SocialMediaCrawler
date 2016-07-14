
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransactionStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTransactionStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Succeeded"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentTransactionStatusCodeType")
@XmlEnum
public enum PaymentTransactionStatusCodeType {


    /**
     * 	
     * 						This value indicates that the payment transaction failed.
     * 					
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * 
     * 						This value indicates that the payment transaction succeeded.
     * 					
     * 
     */
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    /**
     * 
     * 						This value indicates that the payment transaction is pending.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentTransactionStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTransactionStatusCodeType fromValue(String v) {
        for (PaymentTransactionStatusCodeType c: PaymentTransactionStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
