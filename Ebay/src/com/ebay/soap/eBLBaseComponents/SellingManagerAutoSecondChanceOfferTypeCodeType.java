
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAutoSecondChanceOfferTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAutoSecondChanceOfferTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BidsGreaterThanAmount"/>
 *     &lt;enumeration value="BidsGreaterThanCostPlusAmount"/>
 *     &lt;enumeration value="BidsGreaterThanCostPlusPercentage"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAutoSecondChanceOfferTypeCodeType")
@XmlEnum
public enum SellingManagerAutoSecondChanceOfferTypeCodeType {


    /**
     * 
     * 						Sends a second chance offer to all bidders who bid more than a specific amount.
     * 					
     * 
     */
    @XmlEnumValue("BidsGreaterThanAmount")
    BIDS_GREATER_THAN_AMOUNT("BidsGreaterThanAmount"),

    /**
     * 
     * 						Sends a second chance offer to all bidders who bid more than the cost plus a specific amount.
     * 					
     * 
     */
    @XmlEnumValue("BidsGreaterThanCostPlusAmount")
    BIDS_GREATER_THAN_COST_PLUS_AMOUNT("BidsGreaterThanCostPlusAmount"),

    /**
     * 
     * 						Sends a second chance offer to all bidders who bid more than the cost plus a specific percentage.
     * 					
     * 
     */
    @XmlEnumValue("BidsGreaterThanCostPlusPercentage")
    BIDS_GREATER_THAN_COST_PLUS_PERCENTAGE("BidsGreaterThanCostPlusPercentage"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAutoSecondChanceOfferTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAutoSecondChanceOfferTypeCodeType fromValue(String v) {
        for (SellingManagerAutoSecondChanceOfferTypeCodeType c: SellingManagerAutoSecondChanceOfferTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
