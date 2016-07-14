
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeRecordTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeRecordTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UnpaidItem"/>
 *     &lt;enumeration value="ItemNotReceived"/>
 *     &lt;enumeration value="HalfDispute"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeRecordTypeCodeType")
@XmlEnum
public enum DisputeRecordTypeCodeType {


    /**
     * 
     * 							(out) An Unpaid Item dispute.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItem")
    UNPAID_ITEM("UnpaidItem"),

    /**
     * 
     * 						(out) An Item Not Received dispute.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceived")
    ITEM_NOT_RECEIVED("ItemNotReceived"),

    /**
     * 
     * 						One type come from Half.com.
     * 					
     * 
     */
    @XmlEnumValue("HalfDispute")
    HALF_DISPUTE("HalfDispute"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeRecordTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeRecordTypeCodeType fromValue(String v) {
        for (DisputeRecordTypeCodeType c: DisputeRecordTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
