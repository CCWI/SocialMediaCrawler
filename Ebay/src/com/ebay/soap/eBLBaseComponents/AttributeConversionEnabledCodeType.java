
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeConversionEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeConversionEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AttributeConversionEnabledCodeType")
@XmlEnum
public enum AttributeConversionEnabledCodeType {


    /**
     * 
     * 						Please note that we no longer recommend passing both ID-based 
     * 						attributes and custom Item specifics in the same request.<br>
     * 						<br>
     * 						eBay has not converted the category from ID-based attributes to 
     * 						only support custom Item Specifics. AddItem and related calls 
     * 						may support passing both formats in the same request (if the 
     * 						category supports both formats.)
     * 					
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * 						eBay has converted the category from ID-based attributes to 
     * 						only support custom Item Specifics. With this setting:<br>
     * 						<br>
     * 						You can pass one format or the other in the same AddItem request,
     * 						but you can't pass both formats together. If you pass in ID-based 
     * 						attributes in the AddItem family of calls, eBay will convert them to 
     * 						custom Item Specifics on your behalf.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						eBay has converted the category from ID-based attributes to 
     * 						only support custom Item Specifics. ID-based attributes are 
     * 						no longer supported. AddItem and related calls 
     * 						will fail if you pass ID-based attributes in the request.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AttributeConversionEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeConversionEnabledCodeType fromValue(String v) {
        for (AttributeConversionEnabledCodeType c: AttributeConversionEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
