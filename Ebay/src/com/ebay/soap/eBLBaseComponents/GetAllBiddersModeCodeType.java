
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllBiddersModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAllBiddersModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ViewAll"/>
 *     &lt;enumeration value="EndedListing"/>
 *     &lt;enumeration value="SecondChanceEligibleEndedListing"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GetAllBiddersModeCodeType")
@XmlEnum
public enum GetAllBiddersModeCodeType {


    /**
     * 
     * 						(in) Returns all bidders for an ended or still-active
     * 						listing. It may be used by any user.
     * 					
     * 
     */
    @XmlEnumValue("ViewAll")
    VIEW_ALL("ViewAll"),

    /**
     * 
     * 						(in) Returns all non-winning bidders for ended
     * 						listings only. It may be used only by a seller.
     * 					
     * 
     */
    @XmlEnumValue("EndedListing")
    ENDED_LISTING("EndedListing"),

    /**
     * 
     * 						(in) Returns all non-winning bidders for an ended listing
     * 						who have not yet received a Second Chance Offer and noted
     * 						interest in receiving a Second Chance Offer. It may be used
     * 						only by a seller.
     * 					
     * 
     */
    @XmlEnumValue("SecondChanceEligibleEndedListing")
    SECOND_CHANCE_ELIGIBLE_ENDED_LISTING("SecondChanceEligibleEndedListing"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GetAllBiddersModeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAllBiddersModeCodeType fromValue(String v) {
        for (GetAllBiddersModeCodeType c: GetAllBiddersModeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
