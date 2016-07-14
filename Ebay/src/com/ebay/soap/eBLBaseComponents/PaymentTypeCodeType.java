
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="SellerDeniedPayment"/>
 *     &lt;enumeration value="AdminReversal"/>
 *     &lt;enumeration value="AllOther"/>
 *     &lt;enumeration value="RentalExtension"/>
 *     &lt;enumeration value="RentalBuyout"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentTypeCodeType")
@XmlEnum
public enum PaymentTypeCodeType {


    /**
     * 
     * 						(out) The buyer paid the seller.
     * 						Applicable to Half.com.
     * 					
     * 
     */
    @XmlEnumValue("Sale")
    SALE("Sale"),

    /**
     * 
     * 						(out) The seller issued a refund to the buyer.
     * 						Applicable to Half.com.
     * 					
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     * 						For eBay internal use.
     * 					
     * 
     */
    @XmlEnumValue("SellerDeniedPayment")
    SELLER_DENIED_PAYMENT("SellerDeniedPayment"),

    /**
     * 
     * 						For eBay internal use.
     * 					
     * 
     */
    @XmlEnumValue("AdminReversal")
    ADMIN_REVERSAL("AdminReversal"),

    /**
     * 
     * 						All other payment types.
     * 					
     * 
     */
    @XmlEnumValue("AllOther")
    ALL_OTHER("AllOther"),

    /**
     * 
     * 						(out) The buyer paid the seller for a rental extension.
     * 						Applicable to Half.com only.
     * 					
     * 
     */
    @XmlEnumValue("RentalExtension")
    RENTAL_EXTENSION("RentalExtension"),

    /**
     * 
     * 						(out) The buyer paid the seller for a rental buyout.
     * 						Applicable to Half.com only.
     * 					
     * 
     */
    @XmlEnumValue("RentalBuyout")
    RENTAL_BUYOUT("RentalBuyout"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeCodeType fromValue(String v) {
        for (PaymentTypeCodeType c: PaymentTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
