
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAutomationPropertyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAutomationPropertyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemListFailedAutomationRules"/>
 *     &lt;enumeration value="ItemRelistFailedAutomationRules"/>
 *     &lt;enumeration value="ItemListFailedSecondChanceOfferAutoRules"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAutomationPropertyTypeCodeType")
@XmlEnum
public enum SellingManagerAutomationPropertyTypeCodeType {


    /**
     * 
     * 						Item failed to be listed using automation rules.
     * 					
     * 
     */
    @XmlEnumValue("ItemListFailedAutomationRules")
    ITEM_LIST_FAILED_AUTOMATION_RULES("ItemListFailedAutomationRules"),

    /**
     * 
     * 						Relist item automation rule failed.
     * 					
     * 
     */
    @XmlEnumValue("ItemRelistFailedAutomationRules")
    ITEM_RELIST_FAILED_AUTOMATION_RULES("ItemRelistFailedAutomationRules"),

    /**
     * 
     * 						Item failed to be listed with Second Chance offer automation rule.
     * 					
     * 
     */
    @XmlEnumValue("ItemListFailedSecondChanceOfferAutoRules")
    ITEM_LIST_FAILED_SECOND_CHANCE_OFFER_AUTO_RULES("ItemListFailedSecondChanceOfferAutoRules"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAutomationPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAutomationPropertyTypeCodeType fromValue(String v) {
        for (SellingManagerAutomationPropertyTypeCodeType c: SellingManagerAutomationPropertyTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
