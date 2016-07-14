
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationSpecificsRuleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariationSpecificsRuleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VariationSpecificsRuleCodeType")
@XmlEnum
public enum VariationSpecificsRuleCodeType {


    /**
     * 
     * 						The recommended name (and values, if any) can be used 
     * 						either in the Item Specifics or VariationSpecifics context
     * 						in listing calls. 
     * 						This is the default for variation-enabled categories.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						The recommended name/values can't be used in VariationSpecifics 
     * 						(but they can be used in ItemSpecifics). Typically, this occurs
     * 						when the category doesn't support variations, or if the category 
     * 						requires the name to be the same for all variations
     * 						in the listing.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VariationSpecificsRuleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariationSpecificsRuleCodeType fromValue(String v) {
        for (VariationSpecificsRuleCodeType c: VariationSpecificsRuleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
