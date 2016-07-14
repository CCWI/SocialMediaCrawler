
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnpaidItemCaseOpenTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnpaidItemCaseOpenTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UnpaidItemCaseOpenTypeCodeType")
@XmlEnum
public enum UnpaidItemCaseOpenTypeCodeType {


    /**
     * 
     *                       This value indicates that the Unpaid Item case was opened automatically 
     *                       through eBay's Unpaid Item Assistant feature.
     *                     
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * 
     *                       This value indicates that the seller opened an Unpaid Item case manually
     * 											through the Resolution Center or by using the Trading API's 
     * 											<strong>AddDispute</strong> call.
     *                     
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     *                      This value is reserved for future or internal use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UnpaidItemCaseOpenTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnpaidItemCaseOpenTypeCodeType fromValue(String v) {
        for (UnpaidItemCaseOpenTypeCodeType c: UnpaidItemCaseOpenTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
