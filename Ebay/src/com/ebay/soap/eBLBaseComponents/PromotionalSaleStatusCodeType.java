
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionalSaleStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionalSaleStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PromotionalSaleStatusCodeType")
@XmlEnum
public enum PromotionalSaleStatusCodeType {


    /**
     * 
     * 						The promotional sale is active. 
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						The promotional sale is scheduled. That is, the start time is in the future. 
     * 					
     * 
     */
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),

    /**
     * 
     * 						The status of the promotional sale is pending. When first scheduling a Sale,
     * 						if you select over 200 listings to be in any given Sale, it will take some
     * 						time for eBay to process the request.
     * 					
     * 
     */
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),

    /**
     * 
     * 						The promotional sale is inactive, the sale has ended. You can reschedule a
     * 						sale once it has ended, but you will need to wait at least 24 hours before it
     * 						can become active.
     * 					
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     * 						The promotional sale has been deleted. Deleted promotional sales cannot be 
     * 						updated or reactivated.
     * 					
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionalSaleStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionalSaleStatusCodeType fromValue(String v) {
        for (PromotionalSaleStatusCodeType c: PromotionalSaleStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
