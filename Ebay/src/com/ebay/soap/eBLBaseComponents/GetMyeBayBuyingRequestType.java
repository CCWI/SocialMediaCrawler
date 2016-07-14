
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns items from the Buying section of the user's My eBay
 * 				account, including items that the user is watching, bidding on, has
 * 				won, has not won, and has made best offers on.
 * 			
 * 
 * <p>Java class for GetMyeBayBuyingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBayBuyingRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="WatchList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="BidList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="BestOfferList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="WonList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="LostList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="FavoriteSearches" type="{urn:ebay:apis:eBLBaseComponents}MyeBaySelectionType" minOccurs="0"/>
 *         &lt;element name="FavoriteSellers" type="{urn:ebay:apis:eBLBaseComponents}MyeBaySelectionType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOffer" type="{urn:ebay:apis:eBLBaseComponents}MyeBaySelectionType" minOccurs="0"/>
 *         &lt;element name="BidAssistantList" type="{urn:ebay:apis:eBLBaseComponents}BidAssistantListType" minOccurs="0"/>
 *         &lt;element name="DeletedFromWonList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="DeletedFromLostList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="BuyingSummary" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="UserDefinedLists" type="{urn:ebay:apis:eBLBaseComponents}MyeBaySelectionType" minOccurs="0"/>
 *         &lt;element name="HideVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayBuyingRequestType", propOrder = {
    "watchList",
    "bidList",
    "bestOfferList",
    "wonList",
    "lostList",
    "favoriteSearches",
    "favoriteSellers",
    "secondChanceOffer",
    "bidAssistantList",
    "deletedFromWonList",
    "deletedFromLostList",
    "buyingSummary",
    "userDefinedLists",
    "hideVariations"
})
public class GetMyeBayBuyingRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "WatchList")
    protected ItemListCustomizationType watchList;
    @XmlElement(name = "BidList")
    protected ItemListCustomizationType bidList;
    @XmlElement(name = "BestOfferList")
    protected ItemListCustomizationType bestOfferList;
    @XmlElement(name = "WonList")
    protected ItemListCustomizationType wonList;
    @XmlElement(name = "LostList")
    protected ItemListCustomizationType lostList;
    @XmlElement(name = "FavoriteSearches")
    protected MyeBaySelectionType favoriteSearches;
    @XmlElement(name = "FavoriteSellers")
    protected MyeBaySelectionType favoriteSellers;
    @XmlElement(name = "SecondChanceOffer")
    protected MyeBaySelectionType secondChanceOffer;
    @XmlElement(name = "BidAssistantList")
    protected BidAssistantListType bidAssistantList;
    @XmlElement(name = "DeletedFromWonList")
    protected ItemListCustomizationType deletedFromWonList;
    @XmlElement(name = "DeletedFromLostList")
    protected ItemListCustomizationType deletedFromLostList;
    @XmlElement(name = "BuyingSummary")
    protected ItemListCustomizationType buyingSummary;
    @XmlElement(name = "UserDefinedLists")
    protected MyeBaySelectionType userDefinedLists;
    @XmlElement(name = "HideVariations")
    protected Boolean hideVariations;

    /**
     * Gets the value of the watchList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getWatchList() {
        return watchList;
    }

    /**
     * Sets the value of the watchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setWatchList(ItemListCustomizationType value) {
        this.watchList = value;
    }

    /**
     * Gets the value of the bidList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getBidList() {
        return bidList;
    }

    /**
     * Sets the value of the bidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setBidList(ItemListCustomizationType value) {
        this.bidList = value;
    }

    /**
     * Gets the value of the bestOfferList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getBestOfferList() {
        return bestOfferList;
    }

    /**
     * Sets the value of the bestOfferList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setBestOfferList(ItemListCustomizationType value) {
        this.bestOfferList = value;
    }

    /**
     * Gets the value of the wonList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getWonList() {
        return wonList;
    }

    /**
     * Sets the value of the wonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setWonList(ItemListCustomizationType value) {
        this.wonList = value;
    }

    /**
     * Gets the value of the lostList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getLostList() {
        return lostList;
    }

    /**
     * Sets the value of the lostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setLostList(ItemListCustomizationType value) {
        this.lostList = value;
    }

    /**
     * Gets the value of the favoriteSearches property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public MyeBaySelectionType getFavoriteSearches() {
        return favoriteSearches;
    }

    /**
     * Sets the value of the favoriteSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public void setFavoriteSearches(MyeBaySelectionType value) {
        this.favoriteSearches = value;
    }

    /**
     * Gets the value of the favoriteSellers property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public MyeBaySelectionType getFavoriteSellers() {
        return favoriteSellers;
    }

    /**
     * Sets the value of the favoriteSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public void setFavoriteSellers(MyeBaySelectionType value) {
        this.favoriteSellers = value;
    }

    /**
     * Gets the value of the secondChanceOffer property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public MyeBaySelectionType getSecondChanceOffer() {
        return secondChanceOffer;
    }

    /**
     * Sets the value of the secondChanceOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public void setSecondChanceOffer(MyeBaySelectionType value) {
        this.secondChanceOffer = value;
    }

    /**
     * Gets the value of the bidAssistantList property.
     * 
     * @return
     *     possible object is
     *     {@link BidAssistantListType }
     *     
     */
    public BidAssistantListType getBidAssistantList() {
        return bidAssistantList;
    }

    /**
     * Sets the value of the bidAssistantList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidAssistantListType }
     *     
     */
    public void setBidAssistantList(BidAssistantListType value) {
        this.bidAssistantList = value;
    }

    /**
     * Gets the value of the deletedFromWonList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getDeletedFromWonList() {
        return deletedFromWonList;
    }

    /**
     * Sets the value of the deletedFromWonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setDeletedFromWonList(ItemListCustomizationType value) {
        this.deletedFromWonList = value;
    }

    /**
     * Gets the value of the deletedFromLostList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getDeletedFromLostList() {
        return deletedFromLostList;
    }

    /**
     * Sets the value of the deletedFromLostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setDeletedFromLostList(ItemListCustomizationType value) {
        this.deletedFromLostList = value;
    }

    /**
     * Gets the value of the buyingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getBuyingSummary() {
        return buyingSummary;
    }

    /**
     * Sets the value of the buyingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setBuyingSummary(ItemListCustomizationType value) {
        this.buyingSummary = value;
    }

    /**
     * Gets the value of the userDefinedLists property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public MyeBaySelectionType getUserDefinedLists() {
        return userDefinedLists;
    }

    /**
     * Sets the value of the userDefinedLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBaySelectionType }
     *     
     */
    public void setUserDefinedLists(MyeBaySelectionType value) {
        this.userDefinedLists = value;
    }

    /**
     * Gets the value of the hideVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideVariations() {
        return hideVariations;
    }

    /**
     * Sets the value of the hideVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideVariations(Boolean value) {
        this.hideVariations = value;
    }

}
