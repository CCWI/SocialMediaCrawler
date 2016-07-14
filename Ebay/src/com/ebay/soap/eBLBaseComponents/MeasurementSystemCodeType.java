
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSystemCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementSystemCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MeasurementSystemCodeType")
@XmlEnum
public enum MeasurementSystemCodeType {


    /**
     * 
     * 						English system of measurement.
     * 					
     * 
     */
    @XmlEnumValue("English")
    ENGLISH("English"),

    /**
     * 
     * 						Metric system of measurement.
     * 					
     * 
     */
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystemCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementSystemCodeType fromValue(String v) {
        for (MeasurementSystemCodeType c: MeasurementSystemCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
