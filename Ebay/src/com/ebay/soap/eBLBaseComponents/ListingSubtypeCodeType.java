
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingSubtypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingSubtypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ClassifiedAd"/>
 *     &lt;enumeration value="LocalMarketBestOfferOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingSubtypeCodeType")
@XmlEnum
public enum ListingSubtypeCodeType {


    /**
     * 
     * 					General classified ad listing subtype.
     *                <br/><br/>
     *                <span class="tablenote">
     *                <strong>Note:</strong> This value indicates a classified ad (or digital download) listing on <strong>ebay.com</strong> websites, not on <strong>ebayclassifieds.com</strong>. The ebayclassifieds.com site is not supported by the Trading API. For information about other differences between these two sites, see <a href="http://pages.ebay.com/help/sell/classified.html">Advertising with classified ads on eBay and eBay Classifieds</a>.
     *                </span>
     * 				
     * 
     */
    @XmlEnumValue("ClassifiedAd")
    CLASSIFIED_AD("ClassifiedAd"),

    /**
     * 
     * 					General LocalMarketBestOfferOnly listing subtype.
     * 				
     * 
     */
    @XmlEnumValue("LocalMarketBestOfferOnly")
    LOCAL_MARKET_BEST_OFFER_ONLY("LocalMarketBestOfferOnly"),

    /**
     * 
     * 					Reserved for internal or future use
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingSubtypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingSubtypeCodeType fromValue(String v) {
        for (ListingSubtypeCodeType c: ListingSubtypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
