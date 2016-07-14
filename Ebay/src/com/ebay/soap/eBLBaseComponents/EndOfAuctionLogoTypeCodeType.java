
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfAuctionLogoTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndOfAuctionLogoTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="WinningBidderNotice"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="Customized"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EndOfAuctionLogoTypeCodeType")
@XmlEnum
public enum EndOfAuctionLogoTypeCodeType {


    /**
     * 
     * 					 The PayPal Winning Bidder Notice logo.
     * 					
     * 
     */
    @XmlEnumValue("WinningBidderNotice")
    WINNING_BIDDER_NOTICE("WinningBidderNotice"),

    /**
     * 
     * 					 The seller's eBay Store logo.
     * 					
     * 
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * 
     * 					 A custom logo specified in LogoURL.
     * 					
     * 
     */
    @XmlEnumValue("Customized")
    CUSTOMIZED("Customized"),

    /**
     * 
     * 					  (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Indicates that no logo has been specified for use in
     * 						the end of auction (EOA) email.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    EndOfAuctionLogoTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndOfAuctionLogoTypeCodeType fromValue(String v) {
        for (EndOfAuctionLogoTypeCodeType c: EndOfAuctionLogoTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
