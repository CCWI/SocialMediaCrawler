
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WirelessCarrierIDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessCarrierIDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cingular"/>
 *     &lt;enumeration value="TMobile"/>
 *     &lt;enumeration value="Sprint"/>
 *     &lt;enumeration value="Nextel"/>
 *     &lt;enumeration value="Verizon"/>
 *     &lt;enumeration value="CincinnatiBell"/>
 *     &lt;enumeration value="Dobson"/>
 *     &lt;enumeration value="Alltel"/>
 *     &lt;enumeration value="Leap"/>
 *     &lt;enumeration value="USCellular"/>
 *     &lt;enumeration value="Movistar"/>
 *     &lt;enumeration value="Amena"/>
 *     &lt;enumeration value="Vodafone"/>
 *     &lt;enumeration value="ATT"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WirelessCarrierIDCodeType")
@XmlEnum
public enum WirelessCarrierIDCodeType {

    @XmlEnumValue("Cingular")
    CINGULAR("Cingular"),
    @XmlEnumValue("TMobile")
    T_MOBILE("TMobile"),
    @XmlEnumValue("Sprint")
    SPRINT("Sprint"),
    @XmlEnumValue("Nextel")
    NEXTEL("Nextel"),
    @XmlEnumValue("Verizon")
    VERIZON("Verizon"),
    @XmlEnumValue("CincinnatiBell")
    CINCINNATI_BELL("CincinnatiBell"),
    @XmlEnumValue("Dobson")
    DOBSON("Dobson"),
    @XmlEnumValue("Alltel")
    ALLTEL("Alltel"),
    @XmlEnumValue("Leap")
    LEAP("Leap"),
    @XmlEnumValue("USCellular")
    US_CELLULAR("USCellular"),
    @XmlEnumValue("Movistar")
    MOVISTAR("Movistar"),
    @XmlEnumValue("Amena")
    AMENA("Amena"),
    @XmlEnumValue("Vodafone")
    VODAFONE("Vodafone"),
    ATT("ATT"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WirelessCarrierIDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessCarrierIDCodeType fromValue(String v) {
        for (WirelessCarrierIDCodeType c: WirelessCarrierIDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
