
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSpecificSourceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSpecificSourceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemSpecific"/>
 *     &lt;enumeration value="Attribute"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemSpecificSourceCodeType")
@XmlEnum
public enum ItemSpecificSourceCodeType {


    /**
     * 
     * 						The Item Specific was originally stored with custom
     * 						Item Specifics fields. (For example, the seller used
     * 						the ItemSpecifics node in AddItem.)
     * 						This is the default setting if Source isn't returned.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecific")
    ITEM_SPECIFIC("ItemSpecific"),

    /**
     * 
     * 						The Item Specific was originally stored with eBay's
     * 						system-defined (ID-based) attributes format. (For example,
     * 						the seller used the AttributeSetArray node in AddItem 
     * 						at a time when the category supported Attributes.)
     * 					
     * 
     */
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),

    /**
     * 
     * 						The Item Specific is prefilled from a product catalog. (For example,
     * 						the seller used ExternalProductID or ProductID in AddItem.)
     * 					
     * 
     */
    @XmlEnumValue("Product")
    PRODUCT("Product"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemSpecificSourceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSpecificSourceCodeType fromValue(String v) {
        for (ItemSpecificSourceCodeType c: ItemSpecificSourceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
