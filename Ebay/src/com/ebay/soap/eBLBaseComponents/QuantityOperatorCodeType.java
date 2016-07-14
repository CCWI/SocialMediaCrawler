
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityOperatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="LessThanOrEqual"/>
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="GreaterThanOrEqual"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "QuantityOperatorCodeType")
@XmlEnum
public enum QuantityOperatorCodeType {


    /**
     * 
     * 						Used by QuantityOperator to specify that you are seeking quantities less than Quantity.
     * 					
     * 
     */
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),

    /**
     * 
     * 						Used by QuantityOperator to specify that you are seeking quantities less than or equal to Quantity.
     * 					
     * 
     */
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),

    /**
     * 
     * 						Used by QuantityOperator to specify that you are seeking quantities equal to Quantity.
     * 					
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * 
     * 						Used by QuantityOperator to specify that you are seeking quantities greater than Quantity.
     * 					
     * 
     */
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),

    /**
     * 
     * 						Used by QuantityOperator to specify that you are seeking quantities greater than or equal to Quantity.
     * 					
     * 
     */
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuantityOperatorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityOperatorCodeType fromValue(String v) {
        for (QuantityOperatorCodeType c: QuantityOperatorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
