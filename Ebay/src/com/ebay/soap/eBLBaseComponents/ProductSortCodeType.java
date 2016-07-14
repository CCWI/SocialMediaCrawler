
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PopularityAsc"/>
 *     &lt;enumeration value="PopularityDesc"/>
 *     &lt;enumeration value="RatingAsc"/>
 *     &lt;enumeration value="RatingDesc"/>
 *     &lt;enumeration value="ReviewCountAsc"/>
 *     &lt;enumeration value="ReviewCountDesc"/>
 *     &lt;enumeration value="ItemCountAsc"/>
 *     &lt;enumeration value="ItemCountDesc"/>
 *     &lt;enumeration value="TitleAsc"/>
 *     &lt;enumeration value="TitleDesc"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductSortCodeType")
@XmlEnum
public enum ProductSortCodeType {


    /**
     * 
     * 						
     * 						Sort by product popularity (as determined by eBay),
     * 						and return the most popular products first.
     * 					
     * 
     */
    @XmlEnumValue("PopularityAsc")
    POPULARITY_ASC("PopularityAsc"),

    /**
     * 
     * 						
     * 						Sort by product popularity (as determined by eBay),
     * 						and return the least popular products first.
     * 					
     * 
     */
    @XmlEnumValue("PopularityDesc")
    POPULARITY_DESC("PopularityDesc"),

    /**
     * 
     * 						
     * 						Sort by average rating, and return the lowest rated
     * 						products first.
     * 					
     * 
     */
    @XmlEnumValue("RatingAsc")
    RATING_ASC("RatingAsc"),

    /**
     * 
     * 						
     * 						Sort by average rating, and return the highest rated
     * 						products first.
     * 					
     * 
     */
    @XmlEnumValue("RatingDesc")
    RATING_DESC("RatingDesc"),

    /**
     * 
     * 						
     * 						Sort by the number of reviews, and return products with
     * 						the fewest reviews first.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCountAsc")
    REVIEW_COUNT_ASC("ReviewCountAsc"),

    /**
     * 
     * 						
     * 						Sort by the number of reviews, and return products with
     * 						the most reviews first.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCountDesc")
    REVIEW_COUNT_DESC("ReviewCountDesc"),

    /**
     * 
     * 						
     * 						Sort by the number of active items listed with this product,
     * 						and return products with the fewest items first.
     * 					
     * 
     */
    @XmlEnumValue("ItemCountAsc")
    ITEM_COUNT_ASC("ItemCountAsc"),

    /**
     * 
     * 						
     * 						Sort by the number of active items listed with this product,
     * 						and return products with the most items first.
     * 					
     * 
     */
    @XmlEnumValue("ItemCountDesc")
    ITEM_COUNT_DESC("ItemCountDesc"),

    /**
     * 
     * 						
     * 						Sort by the product title, and return products in ascending order.
     * 						For example, with Western character sets, this means alphabetical order
     * 						(e.g., A to Z), where titles that start with the word "A" appear
     * 						before titles that start with the word "The".
     * 					
     * 
     */
    @XmlEnumValue("TitleAsc")
    TITLE_ASC("TitleAsc"),

    /**
     * 
     * 						
     * 						Sort by the product title, and return products in reverse order
     * 						(e.g., Z to A).
     * 					
     * 
     */
    @XmlEnumValue("TitleDesc")
    TITLE_DESC("TitleDesc"),

    /**
     * 
     * 						
     * 						Reserved for values that are not available in the version of the schema
     * 						you are using. If eBay adds a new value to this code type as of a
     * 						particular version, we return CustomCode when you specify a
     * 						lower request version.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSortCodeType fromValue(String v) {
        for (ProductSortCodeType c: ProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
