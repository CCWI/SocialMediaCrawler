
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidderTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidderTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AllBidder"/>
 *     &lt;enumeration value="HighBidder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BidderTypeCodeType")
@XmlEnum
public enum BidderTypeCodeType {


    /**
     * 
     * 						
     * 						(in) Retrieve all bidders for ended or open listings.
     * 					
     * 
     */
    @XmlEnumValue("AllBidder")
    ALL_BIDDER("AllBidder"),

    /**
     * 
     * 						
     * 						(in) Retrieve all high bidders.
     * 					
     * 
     */
    @XmlEnumValue("HighBidder")
    HIGH_BIDDER("HighBidder"),

    /**
     * 
     * 						
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidderTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidderTypeCodeType fromValue(String v) {
        for (BidderTypeCodeType c: BidderTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
