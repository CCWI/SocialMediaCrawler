
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidGroupItemStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidGroupItemStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CurrentBid"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Skipped"/>
 *     &lt;enumeration value="Ended"/>
 *     &lt;enumeration value="Won"/>
 *     &lt;enumeration value="GroupClosed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BidGroupItemStatusCodeType")
@XmlEnum
public enum BidGroupItemStatusCodeType {


    /**
     * 
     * 						
     * 						(out) The items in the group currently being bid on.
     * 					
     * 
     */
    @XmlEnumValue("CurrentBid")
    CURRENT_BID("CurrentBid"),

    /**
     * 
     * 						
     * 						(out) Items in the group that were not bid on because a user retracted a bid
     * 						and closed his group or because eBay Customer Support ended a group and all
     * 						the active and pending items within that group were cancelled.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						
     * 						(out) Items in the bid group that are currently active, but have not yet been
     * 						bid on.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						
     * 						(out) Items that have been skipped and not bid on (and bidded has ended).
     * 					
     * 
     */
    @XmlEnumValue("Skipped")
    SKIPPED("Skipped"),

    /**
     * 
     * 						
     * 							(out) Item has ended.
     * 					
     * 
     */
    @XmlEnumValue("Ended")
    ENDED("Ended"),

    /**
     * 
     * 						
     * 							(out) Item was purchased and has ended.
     * 					
     * 
     */
    @XmlEnumValue("Won")
    WON("Won"),

    /**
     * 
     * 						
     * 							(out) Item has ended.
     * 					
     * 
     */
    @XmlEnumValue("GroupClosed")
    GROUP_CLOSED("GroupClosed"),

    /**
     * 
     * 						
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidGroupItemStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidGroupItemStatusCodeType fromValue(String v) {
        for (BidGroupItemStatusCodeType c: BidGroupItemStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
