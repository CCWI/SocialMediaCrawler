
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionSchemeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionSchemeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemToItem"/>
 *     &lt;enumeration value="ItemToStoreCat"/>
 *     &lt;enumeration value="StoreToStoreCat"/>
 *     &lt;enumeration value="ItemToDefaultRule"/>
 *     &lt;enumeration value="DefaultRule"/>
 *     &lt;enumeration value="CategoryProximity"/>
 *     &lt;enumeration value="RelatedCategoryRule"/>
 *     &lt;enumeration value="DefaultUpSellLogic"/>
 *     &lt;enumeration value="DefaultCrossSellLogic"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PromotionSchemeCodeType")
@XmlEnum
public enum PromotionSchemeCodeType {


    /**
     * 
     * 						
     * 						The seller specifies individual items in the store that are
     * 						promoted when a buyer views, bids on, or purchases a store item.
     * 					
     * 
     */
    @XmlEnumValue("ItemToItem")
    ITEM_TO_ITEM("ItemToItem"),

    /**
     * 
     * 						
     * 						The seller specifies a store category from which items are promoted
     * 						when a buyer views, bids on, or purchases an individual item in the store.
     * 					
     * 
     */
    @XmlEnumValue("ItemToStoreCat")
    ITEM_TO_STORE_CAT("ItemToStoreCat"),

    /**
     * 
     * 						
     * 						The seller specifies referring and promoted categories, both from
     * 						the store. When a buyer views or acts on any item from that category, items
     * 						from the promoted category are also displayed.
     * 					
     * 
     */
    @XmlEnumValue("StoreToStoreCat")
    STORE_TO_STORE_CAT("StoreToStoreCat"),

    /**
     * 
     * 						
     * 						The seller specifies a referring item and defines promoted items
     * 						selected from a store category, eBay category, or keywords.
     * 					
     * 
     */
    @XmlEnumValue("ItemToDefaultRule")
    ITEM_TO_DEFAULT_RULE("ItemToDefaultRule"),

    /**
     * 
     * 						
     * 						The seller specifies a store category or eBay category, with
     * 						optional keywords, for referring items and one for promoted items. When a
     * 						referring item is selected from the category and keywords, items from the
     * 						promoted category and keywords are also displayed.
     * 					
     * 
     */
    @XmlEnumValue("DefaultRule")
    DEFAULT_RULE("DefaultRule"),

    /**
     * 
     * 						
     * 						This scheme is returned as a backfill scheme used to promote items.
     * 					
     * 
     */
    @XmlEnumValue("CategoryProximity")
    CATEGORY_PROXIMITY("CategoryProximity"),

    /**
     * 
     * 						
     * 						This scheme is returned as related category scheme used to promote
     * 						items.
     * 					
     * 
     */
    @XmlEnumValue("RelatedCategoryRule")
    RELATED_CATEGORY_RULE("RelatedCategoryRule"),

    /**
     * 
     * 						
     * 						This scheme is returned as a backfill scheme used to promote items.
     * 					
     * 
     */
    @XmlEnumValue("DefaultUpSellLogic")
    DEFAULT_UP_SELL_LOGIC("DefaultUpSellLogic"),

    /**
     * 
     * 						
     * 						This scheme is returned as a backfill scheme used to promote items.
     * 					
     * 
     */
    @XmlEnumValue("DefaultCrossSellLogic")
    DEFAULT_CROSS_SELL_LOGIC("DefaultCrossSellLogic"),

    /**
     * 
     * 						
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionSchemeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionSchemeCodeType fromValue(String v) {
        for (PromotionSchemeCodeType c: PromotionSchemeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
