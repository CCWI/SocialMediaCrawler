
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Prefilled"/>
 *     &lt;enumeration value="SelectionOnly"/>
 *     &lt;enumeration value="FreeText"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SelectionModeCodeType")
@XmlEnum
public enum SelectionModeCodeType {


    /**
     * 
     * 						Automatic criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * 
     * 						Manual criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     * 						In listing requests, do not specify the name or value because
     * 						they will be filled in by eBay.
     * 						In GetItemRecommendations, this indicates that the Item Specific
     * 						will be pre-filled from a catalog, based on a product ID
     * 						that you passed in the request. They should be presented as
     * 						read-only to the seller. If you specify a prefilled value in
     * 						your listing request when you list with a catalog product, 
     * 						eBay drops the value and uses the value from the catalog instead.
     * 					
     * 
     */
    @XmlEnumValue("Prefilled")
    PREFILLED("Prefilled"),

    /**
     * 
     * 						In listing requests, only specify a value that eBay has 
     * 						recommended. That is, select from the list of recommended values;
     * 						don't specify your own custom details. If you specify a different value, the listing request may return errors. Rarely used.
     * 					
     * 
     */
    @XmlEnumValue("SelectionOnly")
    SELECTION_ONLY("SelectionOnly"),

    /**
     * 
     * 						In listing requests, specify any name or value, or select from the 
     * 						list of recommended values, if present. This is used in most cases.
     * 					
     * 
     */
    @XmlEnumValue("FreeText")
    FREE_TEXT("FreeText"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SelectionModeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionModeCodeType fromValue(String v) {
        for (SelectionModeCodeType c: SelectionModeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
