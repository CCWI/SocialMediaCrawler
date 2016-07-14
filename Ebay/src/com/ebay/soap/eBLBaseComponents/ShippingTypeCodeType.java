
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="FlatDomesticCalculatedInternational"/>
 *     &lt;enumeration value="CalculatedDomesticFlatInternational"/>
 *     &lt;enumeration value="FreightFlat"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingTypeCodeType")
@XmlEnum
public enum ShippingTypeCodeType {


    /**
     * 
     * 						Flat shipping model: the seller establishes the cost
     * 						of shipping and cost of shipping insurance, regardless of
     * 						what any buyer-selected shipping service might charge the
     * 						seller.
     * 					
     * 
     */
    @XmlEnumValue("Flat")
    FLAT("Flat"),

    /**
     * 
     * 						Calculated shipping model: the cost of shipping is
     * 						determined in large part by the seller-offered and
     * 						buyer-selected shipping service. The seller might assess an
     * 						additional fee via PackagingHandlingCosts.
     * 					
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * 
     * 						Freight shipping model. Available only for US domestic shipping. The cost of shipping is determined by a third party, FreightQuote.com, based on the item location (zip code).
     * 						<br/><br/>
     * 						Currently, Freight can be specified only on input via eBay Web site, not via API.
     * 					
     * 
     */
    @XmlEnumValue("Freight")
    FREIGHT("Freight"),

    /**
     * 
     * 						Free shipping.
     * 						This field is output-only so if you want to use AddItem to specify a free
     * 						Shipping Cost, specify 0 in
     * 						Item.ShippingDetails.ShippingServiceOptions.ShippingServiceCost.
     * 					
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * 
     * 						The seller did not specify the shipping type.
     * 					
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * 
     * 						The seller specified one or more flat domestic shipping services
     * 						and one or more calculated international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("FlatDomesticCalculatedInternational")
    FLAT_DOMESTIC_CALCULATED_INTERNATIONAL("FlatDomesticCalculatedInternational"),

    /**
     * 
     * 						The seller specified one or more calculated domestic shipping services
     * 						and one or more flat international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("CalculatedDomesticFlatInternational")
    CALCULATED_DOMESTIC_FLAT_INTERNATIONAL("CalculatedDomesticFlatInternational"),

    /**
     * 
     * 						Freight shipping model: freight shipping may be used when flat or calculated shipping cannot be used due to the greater weight of the item.
     * 						<br/><br/>
     * 						Currently, FreightFlat is available only for the US, UK, AU, CA and CAFR sites, and only for domestic shipping. On the US site, FreightFlat applies to shipping with carriers that are not affiliated with eBay. For details about freight shipping, see "Specifying Freight Shipping" in the Shipping chapter of the User's Guide.
     * 					
     * 
     */
    @XmlEnumValue("FreightFlat")
    FREIGHT_FLAT("FreightFlat"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTypeCodeType fromValue(String v) {
        for (ShippingTypeCodeType c: ShippingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
