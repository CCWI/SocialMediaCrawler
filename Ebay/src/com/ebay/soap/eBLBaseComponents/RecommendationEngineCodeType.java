
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationEngineCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecommendationEngineCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListingAnalyzer"/>
 *     &lt;enumeration value="SIFFTAS"/>
 *     &lt;enumeration value="ProductPricing"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="SuggestedAttributes"/>
 *     &lt;enumeration value="ItemSpecifics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RecommendationEngineCodeType")
@XmlEnum
public enum RecommendationEngineCodeType {


    /**
     * 
     * 						(in) Listing Analyzer engine; Returns tips related to fields
     * 						that a seller wants to specify in a listing.
     * 					
     * 
     */
    @XmlEnumValue("ListingAnalyzer")
    LISTING_ANALYZER("ListingAnalyzer"),

    /**
     * 
     * 						(in) Reserved for internal or future use.
     * 					
     * 
     */
    SIFFTAS("SIFFTAS"),

    /**
     * 
     * 						(in) Product Pricing engine. Returns average start and sold prices
     * 						of completed items that were listed a specified product ID.
     * 					
     * 
     */
    @XmlEnumValue("ProductPricing")
    PRODUCT_PRICING("ProductPricing"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						(in) Suggested Attributes engine. Returns suggested attributes
     * 						and catalog products (for Pre-filled Item Information) that have been
     * 						used by other sellers who listed similar items in the same category.
     * 					
     * 
     */
    @XmlEnumValue("SuggestedAttributes")
    SUGGESTED_ATTRIBUTES("SuggestedAttributes"),

    /**
     * 
     * 						(in) Custom Item Specifics engine. Returns the most popular
     * 						names and values to use for custom Item Specifics based the
     * 						requested category (and the Title, if specified).
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecifics")
    ITEM_SPECIFICS("ItemSpecifics");
    private final String value;

    RecommendationEngineCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationEngineCodeType fromValue(String v) {
        for (RecommendationEngineCodeType c: RecommendationEngineCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
