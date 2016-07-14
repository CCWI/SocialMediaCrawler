
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBaySubscriptionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EBaySubscriptionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerAssistant"/>
 *     &lt;enumeration value="SellerAssistantPro"/>
 *     &lt;enumeration value="EBayStoreBasic"/>
 *     &lt;enumeration value="EBayStoreFeatured"/>
 *     &lt;enumeration value="EBayStoreAnchor"/>
 *     &lt;enumeration value="SellingManager"/>
 *     &lt;enumeration value="SellingManagerPro"/>
 *     &lt;enumeration value="PictureManagerLevel1"/>
 *     &lt;enumeration value="PictureManagerLevel2"/>
 *     &lt;enumeration value="PictureManagerLevel3"/>
 *     &lt;enumeration value="PictureManagerLevel4"/>
 *     &lt;enumeration value="PictureManagerLevel5"/>
 *     &lt;enumeration value="PictureManagerLevel6"/>
 *     &lt;enumeration value="PictureManagerLevel7"/>
 *     &lt;enumeration value="SellerReportsBasic"/>
 *     &lt;enumeration value="SellerReportsPlus"/>
 *     &lt;enumeration value="FileExchange"/>
 *     &lt;enumeration value="LocalMarketSpecialty"/>
 *     &lt;enumeration value="LocalMarketRegular"/>
 *     &lt;enumeration value="LocalMarketPremium"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EBaySubscriptionTypeCodeType")
@XmlEnum
public enum EBaySubscriptionTypeCodeType {


    /**
     * 
     * 
     */
    @XmlEnumValue("SellerAssistant")
    SELLER_ASSISTANT("SellerAssistant"),
    @XmlEnumValue("SellerAssistantPro")
    SELLER_ASSISTANT_PRO("SellerAssistantPro"),
    @XmlEnumValue("EBayStoreBasic")
    E_BAY_STORE_BASIC("EBayStoreBasic"),
    @XmlEnumValue("EBayStoreFeatured")
    E_BAY_STORE_FEATURED("EBayStoreFeatured"),
    @XmlEnumValue("EBayStoreAnchor")
    E_BAY_STORE_ANCHOR("EBayStoreAnchor"),
    @XmlEnumValue("SellingManager")
    SELLING_MANAGER("SellingManager"),
    @XmlEnumValue("SellingManagerPro")
    SELLING_MANAGER_PRO("SellingManagerPro"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel1")
    PICTURE_MANAGER_LEVEL_1("PictureManagerLevel1"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel2")
    PICTURE_MANAGER_LEVEL_2("PictureManagerLevel2"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel3")
    PICTURE_MANAGER_LEVEL_3("PictureManagerLevel3"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel4")
    PICTURE_MANAGER_LEVEL_4("PictureManagerLevel4"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel5")
    PICTURE_MANAGER_LEVEL_5("PictureManagerLevel5"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel6")
    PICTURE_MANAGER_LEVEL_6("PictureManagerLevel6"),

    /**
     * 
     * 			  This value is no longer applicable because Picture Manager has been EOLed. 
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel7")
    PICTURE_MANAGER_LEVEL_7("PictureManagerLevel7"),
    @XmlEnumValue("SellerReportsBasic")
    SELLER_REPORTS_BASIC("SellerReportsBasic"),
    @XmlEnumValue("SellerReportsPlus")
    SELLER_REPORTS_PLUS("SellerReportsPlus"),
    @XmlEnumValue("FileExchange")
    FILE_EXCHANGE("FileExchange"),

    /**
     * 
     * 						Allowed categories are Motorcycles, Powersports, and Other Vehicles.
     * 					 
     * 
     */
    @XmlEnumValue("LocalMarketSpecialty")
    LOCAL_MARKET_SPECIALTY("LocalMarketSpecialty"),

    /**
     * 
     * 						In addition to the categories allowed by LocalMarketSpecialty, allows
     * 						Passenger Vehicles. Includes five sub-types. See LocalMarketRegularSubscriptionDefinitionType for details.
     * 					 
     * 
     */
    @XmlEnumValue("LocalMarketRegular")
    LOCAL_MARKET_REGULAR("LocalMarketRegular"),

    /**
     * 
     * 						Allows same categories as LocalMarketRegular.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketPremium")
    LOCAL_MARKET_PREMIUM("LocalMarketPremium"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    EBaySubscriptionTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EBaySubscriptionTypeCodeType fromValue(String v) {
        for (EBaySubscriptionTypeCodeType c: EBaySubscriptionTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
