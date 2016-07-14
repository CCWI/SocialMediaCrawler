
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacteristicsSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacteristicsSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Multi"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CharacteristicsSearchCodeType")
@XmlEnum
public enum CharacteristicsSearchCodeType {


    /**
     * 
     * 						This field is <b>deprecated</b>.
     * 					
     * 
     */
    @XmlEnumValue("Single")
    SINGLE("Single"),

    /**
     * 
     * 						This field is <b>deprecated</b>.
     * 					
     * 
     */
    @XmlEnumValue("Multi")
    MULTI("Multi"),

    /**
     * 
     * 						This field is <b>deprecated</b>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharacteristicsSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharacteristicsSearchCodeType fromValue(String v) {
        for (CharacteristicsSearchCodeType c: CharacteristicsSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
