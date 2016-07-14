
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingEnhancementsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingEnhancementsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Border"/>
 *     &lt;enumeration value="BoldTitle"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Highlight"/>
 *     &lt;enumeration value="HomePageFeatured"/>
 *     &lt;enumeration value="ProPackBundle"/>
 *     &lt;enumeration value="BasicUpgradePackBundle"/>
 *     &lt;enumeration value="ValuePackBundle"/>
 *     &lt;enumeration value="ProPackPlusBundle"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingEnhancementsCodeType")
@XmlEnum
public enum ListingEnhancementsCodeType {


    /**
     * 
     * 						If specified, the seller wants to add a border around the listing's pictures. Applicable listing fees apply.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Picture Border feature is no longer available on the US site.
     * 						</span>
     * 						<br>
     * 					
     * 
     */
    @XmlEnumValue("Border")
    BORDER("Border"),

    /**
     * 
     * 						If specified, the seller wants the title for the item's listing to
     * 						be in boldface type. Applicable listing fees apply.
     * 						Does not affect the item subtitle (Item.SubTitle), if any.
     * 						Not applicable to eBay Motors.
     * 					
     * 
     */
    @XmlEnumValue("BoldTitle")
    BOLD_TITLE("BoldTitle"),

    /**
     * 
     * 						Listing is a "Featured Plus" item. The item will display
     * 						prominently in the Featured Items section of its category list, and it will
     * 						stand out on search results pages. It will also display in the regular, non-
     * 						featured item list. Only available to users with a Feedback rating of 10 or
     * 						greater.
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 						Listing is highlighted in a different color in lists.
     * 					
     * 
     */
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight"),

    /**
     * 
     * 						Listing will have a chance to rotate into a special display
     * 						on eBay's Home page. Your item is very likely to show up on the Home page,
     * 						although eBay does not guarantee that your item will be highlighted
     * 						in this way. This is the highest level of visibility on eBay.
     * 						<br><br>
     * 						Not applicable for eBay Motors. In order to feature the listing
     * 						on eBay Motors home page, use PictureDetails.GalleryType.Featured instead. See
     * 						GalleryTypeCodeType for more information.
     * 					
     * 
     */
    @XmlEnumValue("HomePageFeatured")
    HOME_PAGE_FEATURED("HomePageFeatured"),

    /**
     * 
     * 						Listing is using ProPackBundle (a feature pack).
     * 						Applies only to vehicle listings on eBay Motors (US and Canada), and
     * 						to the Parts and Accessories category in the eBay Motors US site.
     * 						Contains the BoldTitle, Border, Featured and Highlight features.
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundle")
    PRO_PACK_BUNDLE("ProPackBundle"),

    /**
     * 
     * 						No longer applicable to any site.
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundle")
    BASIC_UPGRADE_PACK_BUNDLE("BasicUpgradePackBundle"),

    /**
     * 
     * 						Listing is using ValuePack bundle (a feature pack),
     * 						which combines the features Gallery, Subtitle, and Listing Designer for a discounted price. Support for this feature varies by site and category.
     * 						<br><br>
     * 						Whenever ValuePackBundle is
     * 						selected in a request, the Value Pack bundle is
     * 						automatically upgraded to the Gallery Plus feature at no extra cost (see
     * 						Item.PictureDetails.GalleryType.Plus for more information on Gallery Plus).
     * 						The Gallery Plus upgrade will display on all
     * 						sites and categories that support ValuePackBundle.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundle")
    VALUE_PACK_BUNDLE("ValuePackBundle"),

    /**
     * 
     * 						Support for this feature varies by site and category.
     * 						A ProPackPlusBundle listing is using ProPackPlus bundle (a feature pack),
     * 						which combines the features of BoldTitle, Border, Highlight, Featured (which
     * 						is equivalent to a GalleryType value of Featured), and
     * 						Gallery, for a discounted price.
     * 						Note that if, for example, in AddItem, if you use ProPackPlusBundle and
     * 						a GalleryType value of Gallery, then the resulting item will have a GalleryType
     * 						value of Featured.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundle")
    PRO_PACK_PLUS_BUNDLE("ProPackPlusBundle"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingEnhancementsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingEnhancementsCodeType fromValue(String v) {
        for (ListingEnhancementsCodeType c: ListingEnhancementsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
