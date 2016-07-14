
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeSortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeSortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DisputeCreatedTimeAscending"/>
 *     &lt;enumeration value="DisputeCreatedTimeDescending"/>
 *     &lt;enumeration value="DisputeStatusAscending"/>
 *     &lt;enumeration value="DisputeStatusDescending"/>
 *     &lt;enumeration value="DisputeCreditEligibilityAscending"/>
 *     &lt;enumeration value="DisputeCreditEligibilityDescending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeSortTypeCodeType")
@XmlEnum
public enum DisputeSortTypeCodeType {


    /**
     * 
     * 					(in) Sort by the time the dispute was created, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					(in) Sort by the time the dispute was created, in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreatedTimeAscending")
    DISPUTE_CREATED_TIME_ASCENDING("DisputeCreatedTimeAscending"),

    /**
     * 
     * 					(in) Sort by the time the dispute was created, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreatedTimeDescending")
    DISPUTE_CREATED_TIME_DESCENDING("DisputeCreatedTimeDescending"),

    /**
     * 
     * 					(in) Sort by the dispute status, in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeStatusAscending")
    DISPUTE_STATUS_ASCENDING("DisputeStatusAscending"),

    /**
     * 
     * 					(in) Sort by the dispute status, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeStatusDescending")
    DISPUTE_STATUS_DESCENDING("DisputeStatusDescending"),

    /**
     * 
     * 					(in) Sort by whether the dispute is eligible for
     * 					Final Value Fee credit, in ascending
     * 					order. Ineligible disputes are listed before eligible disputes.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreditEligibilityAscending")
    DISPUTE_CREDIT_ELIGIBILITY_ASCENDING("DisputeCreditEligibilityAscending"),

    /**
     * 
     * 					(in) Sort by whether the dispute is eligible for
     * 					Final Value Fee credit, in descending
     * 					order. Eligible disputes are listed before ineligible disputes.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreditEligibilityDescending")
    DISPUTE_CREDIT_ELIGIBILITY_DESCENDING("DisputeCreditEligibilityDescending"),

    /**
     * 
     * 											(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeSortTypeCodeType fromValue(String v) {
        for (DisputeSortTypeCodeType c: DisputeSortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
