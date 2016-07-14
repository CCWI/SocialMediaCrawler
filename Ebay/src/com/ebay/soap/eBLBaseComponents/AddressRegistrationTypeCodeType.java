
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressRegistrationTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressRegistrationTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="ShipmentToResidential"/>
 *     &lt;enumeration value="ShipmentToBusiness"/>
 *     &lt;enumeration value="ShipmentFrom"/>
 *     &lt;enumeration value="NumTypes"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AddressRegistrationTypeCodeType")
@XmlEnum
public enum AddressRegistrationTypeCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("ShipmentToResidential")
    SHIPMENT_TO_RESIDENTIAL("ShipmentToResidential"),
    @XmlEnumValue("ShipmentToBusiness")
    SHIPMENT_TO_BUSINESS("ShipmentToBusiness"),
    @XmlEnumValue("ShipmentFrom")
    SHIPMENT_FROM("ShipmentFrom"),
    @XmlEnumValue("NumTypes")
    NUM_TYPES("NumTypes"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						(out) For GetUserAddress paypal migration.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AddressRegistrationTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressRegistrationTypeCodeType fromValue(String v) {
        for (AddressRegistrationTypeCodeType c: AddressRegistrationTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
