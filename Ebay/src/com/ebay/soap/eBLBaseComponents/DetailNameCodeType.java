
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailNameCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailNameCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CountryDetails"/>
 *     &lt;enumeration value="CurrencyDetails"/>
 *     &lt;enumeration value="PaymentOptionDetails"/>
 *     &lt;enumeration value="RegionDetails"/>
 *     &lt;enumeration value="ShippingLocationDetails"/>
 *     &lt;enumeration value="ShippingServiceDetails"/>
 *     &lt;enumeration value="SiteDetails"/>
 *     &lt;enumeration value="TaxJurisdiction"/>
 *     &lt;enumeration value="URLDetails"/>
 *     &lt;enumeration value="TimeZoneDetails"/>
 *     &lt;enumeration value="RegionOfOriginDetails"/>
 *     &lt;enumeration value="DispatchTimeMaxDetails"/>
 *     &lt;enumeration value="ItemSpecificDetails"/>
 *     &lt;enumeration value="UnitOfMeasurementDetails"/>
 *     &lt;enumeration value="ShippingPackageDetails"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ShippingCarrierDetails"/>
 *     &lt;enumeration value="ListingStartPriceDetails"/>
 *     &lt;enumeration value="ReturnPolicyDetails"/>
 *     &lt;enumeration value="BuyerRequirementDetails"/>
 *     &lt;enumeration value="ListingFeatureDetails"/>
 *     &lt;enumeration value="VariationDetails"/>
 *     &lt;enumeration value="ExcludeShippingLocationDetails"/>
 *     &lt;enumeration value="RecoupmentPolicyDetails"/>
 *     &lt;enumeration value="ShippingCategoryDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DetailNameCodeType")
@XmlEnum
public enum DetailNameCodeType {


    /**
     * 
     * 						This value is specified to list the country code and associated name of each country supported by the eBay system.
     * 					
     * 
     */
    @XmlEnumValue("CountryDetails")
    COUNTRY_DETAILS("CountryDetails"),

    /**
     * 
     * 						This value is specified to list the currencies supported by the eBay system.
     * 					
     * 
     */
    @XmlEnumValue("CurrencyDetails")
    CURRENCY_DETAILS("CurrencyDetails"),

    /**
     * 
     * 						Not functional. Do not use this value.
     * 					
     * 
     */
    @XmlEnumValue("PaymentOptionDetails")
    PAYMENT_OPTION_DETAILS("PaymentOptionDetails"),

    /**
     * 
     * 						Not functional. Do not use this value.
     * 					
     * 
     */
    @XmlEnumValue("RegionDetails")
    REGION_DETAILS("RegionDetails"),

    /**
     * 
     * 						This value is specified to list the regions and locations supported by eBay's shipping services.
     * 					
     * 
     */
    @XmlEnumValue("ShippingLocationDetails")
    SHIPPING_LOCATION_DETAILS("ShippingLocationDetails"),

    /**
     * 
     * 						This value is specified to list the shipping services supported by the specified eBay site.
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceDetails")
    SHIPPING_SERVICE_DETAILS("ShippingServiceDetails"),

    /**
     * 
     * 						This value is specified to list the available eBay sites and their associated SiteID values.
     * 					
     * 
     */
    @XmlEnumValue("SiteDetails")
    SITE_DETAILS("SiteDetails"),

    /**
     * 
     * 						This value is specified to list the different tax jurisdictions supported by the specified eBay site.
     * 					
     * 
     */
    @XmlEnumValue("TaxJurisdiction")
    TAX_JURISDICTION("TaxJurisdiction"),

    /**
     * 
     * 						This value is specified to list the different eBay URLs associated with the specified eBay site.
     * 					
     * 
     */
    @XmlEnumValue("URLDetails")
    URL_DETAILS("URLDetails"),

    /**
     * 
     * 						This value is specified to list the details of the time zones supported by the eBay system.
     * 					
     * 
     */
    @XmlEnumValue("TimeZoneDetails")
    TIME_ZONE_DETAILS("TimeZoneDetails"),

    /**
     * 
     * 						Not functional. Do not use this value.
     * 					
     * 
     */
    @XmlEnumValue("RegionOfOriginDetails")
    REGION_OF_ORIGIN_DETAILS("RegionOfOriginDetails"),

    /**
     * 
     * 						This value is specified to list the handling time values (in number of business days) that the seller can set on a listing. The seller must ship an order line item within this time or risk getting a seller defect. 
     * 					
     * 
     */
    @XmlEnumValue("DispatchTimeMaxDetails")
    DISPATCH_TIME_MAX_DETAILS("DispatchTimeMaxDetails"),

    /**
     * 
     * 						This value is specified to list maximum thresholds when using Item Specifics.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecificDetails")
    ITEM_SPECIFIC_DETAILS("ItemSpecificDetails"),

    /**
     * 
     * 					This value is specified to list the suggested unit-of-measurement strings to use with Item Specifics descriptions.
     * 				
     * 
     */
    @XmlEnumValue("UnitOfMeasurementDetails")
    UNIT_OF_MEASUREMENT_DETAILS("UnitOfMeasurementDetails"),

    /**
     * 
     * 						This value is specified to list the various shipping packages supported by the specified site.
     * 					
     * 
     */
    @XmlEnumValue("ShippingPackageDetails")
    SHIPPING_PACKAGE_DETAILS("ShippingPackageDetails"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value is specified to list the shipping carriers supported by the specified site.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCarrierDetails")
    SHIPPING_CARRIER_DETAILS("ShippingCarrierDetails"),

    /**
     * 
     * 						This value is specified to list the minimum starting prices for the supported types of eBay listings.
     * 					
     * 
     */
    @XmlEnumValue("ListingStartPriceDetails")
    LISTING_START_PRICE_DETAILS("ListingStartPriceDetails"),

    /**
     * 
     * 						This value is specified to list the return policy values that can be passed in through the <b>ReturnPolicy</b> container of an Add/Revise/Relist API call.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyDetails")
    RETURN_POLICY_DETAILS("ReturnPolicyDetails"),

    /**
     * 
     * 						This value is specified to list the Buyer Requirement values that can be passed in through the <b>BuyerRequirementDetails</b> container of an Add/Revise/Relist API call.
     * 					
     * 
     */
    @XmlEnumValue("BuyerRequirementDetails")
    BUYER_REQUIREMENT_DETAILS("BuyerRequirementDetails"),

    /**
     * 
     * 						This value is specified to list the listing features/upgrades that are enabled or disabled for the specified site.
     * 					
     * 
     */
    @XmlEnumValue("ListingFeatureDetails")
    LISTING_FEATURE_DETAILS("ListingFeatureDetails"),

    /**
     * 
     * 						This value is specified to list the maximum thresholds when using multi-variation listings.
     * 					
     * 
     */
    @XmlEnumValue("VariationDetails")
    VARIATION_DETAILS("VariationDetails"),

    /**
     * 
     * 						This value is specified to list the geographical regions and individual countries that can be passed in to the <b>ShippingDetails.ExcludeShipToLocation</b> field in an Add/Revise/Relist API call. Multiple <b>ShippingDetails.ExcludeShipToLocation</b> can be used, and any region or country value that is passed in to one of these fields will exclude that region or country as a "ship-to" location.
     * 					
     * 
     */
    @XmlEnumValue("ExcludeShippingLocationDetails")
    EXCLUDE_SHIPPING_LOCATION_DETAILS("ExcludeShippingLocationDetails"),

    /**
     * 
     * 						This value is specified to list whether or not a recoupment policy is enforced on either the listing site or the seller's registration site.
     * 					
     * 
     */
    @XmlEnumValue("RecoupmentPolicyDetails")
    RECOUPMENT_POLICY_DETAILS("RecoupmentPolicyDetails"),

    /**
     * 
     * 						This value is specified to list the shipping service categories (Standard, Expedited, Economy) supported for the site.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCategoryDetails")
    SHIPPING_CATEGORY_DETAILS("ShippingCategoryDetails");
    private final String value;

    DetailNameCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailNameCodeType fromValue(String v) {
        for (DetailNameCodeType c: DetailNameCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
