
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ModifyActionCodeType")
@XmlEnum
public enum ModifyActionCodeType {


    /**
     * 
     * 						For <b>SetPromotionalSale</b>, this value is used in the request to
     * 						create a new promotional sale.
     * 						<br/><br/>
     * 						For <b>SetPromotionalSaleListings</b>, this value is used in the request
     * 						to apply an existing promotional sale to one or more active items or to an entire 
     * 						category of active items.
     * 						<br/><br/>
     * 						For <b>SetShippingDiscounts</b>, this value is used in the request
     * 						to create a new shipping discount profile.
     * 					
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     * 						For <b>SetPromotionalSale</b>, this value is used in the request to
     * 						delete an existing promotional sale.
     * 						<br/><br/>
     * 						For <b>SetPromotionalSaleListings</b>, this value is used in the request
     * 						to remove one or more active items from an existing promotional sale. This value 
     * 						cannot be used if a <b>CategoryID</b> is specified in the request. 
     * 						<br/><br/>
     * 						For <b>SetShippingDiscounts</b>, this value is used in the request
     * 						to delete an existing shipping discount profile.
     * 					
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 						For <b>SetPromotionalSale</b>, this value is used in the request to
     * 						modify an existing promotional sale.
     * 						<br/><br/>
     * 						For <b>SetShippingDiscounts</b>, this value is used in the request
     * 						to modify an existing shipping discount profile.
     * 					
     * 
     */
    @XmlEnumValue("Update")
    UPDATE("Update"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ModifyActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModifyActionCodeType fromValue(String v) {
        for (ModifyActionCodeType c: ModifyActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
