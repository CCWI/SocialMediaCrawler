
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyDurationOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantyDurationOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Months_1"/>
 *     &lt;enumeration value="Months_3"/>
 *     &lt;enumeration value="Months_6"/>
 *     &lt;enumeration value="Years_1"/>
 *     &lt;enumeration value="Years_2"/>
 *     &lt;enumeration value="Years_3"/>
 *     &lt;enumeration value="Years_MoreThan3"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarrantyDurationOptionsCodeType")
@XmlEnum
public enum WarrantyDurationOptionsCodeType {


    /**
     * 
     * 						1 month
     * 					
     * 
     */
    @XmlEnumValue("Months_1")
    MONTHS_1("Months_1"),

    /**
     * 
     * 						3 months
     * 					
     * 
     */
    @XmlEnumValue("Months_3")
    MONTHS_3("Months_3"),

    /**
     * 
     * 						6 months
     * 					
     * 
     */
    @XmlEnumValue("Months_6")
    MONTHS_6("Months_6"),

    /**
     * 
     * 						1 year
     * 					
     * 
     */
    @XmlEnumValue("Years_1")
    YEARS_1("Years_1"),

    /**
     * 
     * 						2 years
     * 					
     * 
     */
    @XmlEnumValue("Years_2")
    YEARS_2("Years_2"),

    /**
     * 
     * 						3 years
     * 					
     * 
     */
    @XmlEnumValue("Years_3")
    YEARS_3("Years_3"),

    /**
     * 
     * 						More than 3 years
     * 					
     * 
     */
    @XmlEnumValue("Years_MoreThan3")
    YEARS_MORE_THAN_3("Years_MoreThan3"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WarrantyDurationOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantyDurationOptionsCodeType fromValue(String v) {
        for (WarrantyDurationOptionsCodeType c: WarrantyDurationOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
