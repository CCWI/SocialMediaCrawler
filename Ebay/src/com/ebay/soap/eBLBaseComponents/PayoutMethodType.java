
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoutMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PAYPAL"/>
 *     &lt;enumeration value="EFT"/>
 *     &lt;enumeration value="MONEYBOOKERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayoutMethodType")
@XmlEnum
public enum PayoutMethodType {


    /**
     * 
     * 						This value indicates that the seller wants eBay to distribute payouts to their PayPal account.
     * 					
     * 
     */
    PAYPAL,

    /**
     * 
     * 						This value indicates that the seller wants eBay to distribute payouts to their bank account via EFT 
     * 						(Electronic Funds Transfer).
     * 					
     * 
     */
    EFT,

    /**
     * 
     * 						This value indicates that the seller wants eBay to distribute payouts to their Moneybookers (Skrill)
     * 						account.
     * 					
     * 
     */
    MONEYBOOKERS;

    public String value() {
        return name();
    }

    public static PayoutMethodType fromValue(String v) {
        return valueOf(v);
    }

}
