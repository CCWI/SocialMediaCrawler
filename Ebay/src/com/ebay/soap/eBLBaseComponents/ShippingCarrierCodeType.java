
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingCarrierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCarrierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UPS"/>
 *     &lt;enumeration value="USPS"/>
 *     &lt;enumeration value="FedEx"/>
 *     &lt;enumeration value="DeutschePost"/>
 *     &lt;enumeration value="DHL"/>
 *     &lt;enumeration value="Hermes"/>
 *     &lt;enumeration value="iLoxx"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ColiposteDomestic"/>
 *     &lt;enumeration value="ColiposteInternational"/>
 *     &lt;enumeration value="Chronopost"/>
 *     &lt;enumeration value="Correos"/>
 *     &lt;enumeration value="Seur"/>
 *     &lt;enumeration value="Nacex"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingCarrierCodeType")
@XmlEnum
public enum ShippingCarrierCodeType {


    /**
     * 
     * 						United Parcel Service.
     * 						<br><br>
     * 						For UPS Mail Innovations (for CompleteSale call requests only),
     * 						specify the value UPS-MI.
     * 					
     * 
     */
    UPS("UPS"),

    /**
     * 
     * 						U.S. Postal Service.
     * 					
     * 
     */
    USPS("USPS"),

    /**
     * 
     * 							Fedex
     * 						For FedEx SmartPost (for CompleteSale call requests only),
     * 						specify the value FedEx.
     * 					
     * 
     */
    @XmlEnumValue("FedEx")
    FED_EX("FedEx"),

    /**
     * 
     * 						Deutsche Post.
     * 					
     * 
     */
    @XmlEnumValue("DeutschePost")
    DEUTSCHE_POST("DeutschePost"),

    /**
     * 
     * 						DHL service
     * 					
     * 
     */
    DHL("DHL"),

    /**
     * 
     * 						Hermes
     * 					
     * 
     */
    @XmlEnumValue("Hermes")
    HERMES("Hermes"),

    /**
     * 
     * 						iLoxx
     * 					
     * 
     */
    @XmlEnumValue("iLoxx")
    I_LOXX("iLoxx"),

    /**
     * 
     * 						Other postal service
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						Coliposte Domestic
     * 					
     * 
     */
    @XmlEnumValue("ColiposteDomestic")
    COLIPOSTE_DOMESTIC("ColiposteDomestic"),

    /**
     * 
     * 						Coliposte International
     * 					
     * 
     */
    @XmlEnumValue("ColiposteInternational")
    COLIPOSTE_INTERNATIONAL("ColiposteInternational"),

    /**
     * 
     * 						Chronopost
     * 					
     * 
     */
    @XmlEnumValue("Chronopost")
    CHRONOPOST("Chronopost"),

    /**
     * 
     * 						Correos
     * 					
     * 
     */
    @XmlEnumValue("Correos")
    CORREOS("Correos"),

    /**
     * 
     * 						Seur (reserved for future use)
     * 					
     * 
     */
    @XmlEnumValue("Seur")
    SEUR("Seur"),

    /**
     * 
     * 						Nacex
     * 					
     * 
     */
    @XmlEnumValue("Nacex")
    NACEX("Nacex"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingCarrierCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCarrierCodeType fromValue(String v) {
        for (ShippingCarrierCodeType c: ShippingCarrierCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
