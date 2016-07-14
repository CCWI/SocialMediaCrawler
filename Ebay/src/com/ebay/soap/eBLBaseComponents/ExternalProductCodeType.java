
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalProductCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalProductCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="ProductID"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="MPN"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ExternalProductCodeType")
@XmlEnum
public enum ExternalProductCodeType {


    /**
     * 
     * 						
     * 						ExternalProductID.Value contains an ISBN value.
     * 						Required when you pass an ISBN as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						
     * 						ExternalProductID.Value contains a UPC value.
     * 						Required when you pass a UPC as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						
     * 						ExternalProductID.Value contains an eBay catalog product ID.
     * 						Required when you pass an eBay product ID
     * 						as the external product ID.
     * 					
     * 
     */
    @XmlEnumValue("ProductID")
    PRODUCT_ID("ProductID"),

    /**
     * 
     * 						
     * 						ExternalProductID.Value contains an EAN value.
     * 						Required when you pass an EAN as the external product ID.
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						
     * 						ExternalProductID.Value contains a set of keywords that uniquely identify the product.
     * 						Only applicable when listing event ticket.
     * 						See the eBay Web Services guide for information about valid
     * 						ticket keywords for an external product ID.
     * 						Required when you pass a set of keywords as the external product ID.
     * 					
     * 
     */
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),

    /**
     * 
     * 						
     * 						Reserved for future use.
     * 					
     * 
     */
    MPN("MPN"),

    /**
     * 
     * 						
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ExternalProductCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalProductCodeType fromValue(String v) {
        for (ExternalProductCodeType c: ExternalProductCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
