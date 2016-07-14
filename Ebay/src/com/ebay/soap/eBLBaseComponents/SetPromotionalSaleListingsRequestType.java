
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables the seller to change the item listings that are affected by a promotional sale. 
 * 			
 * 
 * <p>Java class for SetPromotionalSaleListingsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPromotionalSaleListingsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}ModifyActionCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleItemIDArray" type="{urn:ebay:apis:eBLBaseComponents}ItemIDArrayType" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AllFixedPriceItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllStoreInventoryItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllAuctionItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPromotionalSaleListingsRequestType", propOrder = {
    "promotionalSaleID",
    "action",
    "promotionalSaleItemIDArray",
    "storeCategoryID",
    "categoryID",
    "allFixedPriceItems",
    "allStoreInventoryItems",
    "allAuctionItems"
})
public class SetPromotionalSaleListingsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionalSaleID")
    protected Long promotionalSaleID;
    @XmlElement(name = "Action")
    protected ModifyActionCodeType action;
    @XmlElement(name = "PromotionalSaleItemIDArray")
    protected ItemIDArrayType promotionalSaleItemIDArray;
    @XmlElement(name = "StoreCategoryID")
    protected Long storeCategoryID;
    @XmlElement(name = "CategoryID")
    protected Long categoryID;
    @XmlElement(name = "AllFixedPriceItems")
    protected Boolean allFixedPriceItems;
    @XmlElement(name = "AllStoreInventoryItems")
    protected Boolean allStoreInventoryItems;
    @XmlElement(name = "AllAuctionItems")
    protected Boolean allAuctionItems;

    /**
     * Gets the value of the promotionalSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionalSaleID() {
        return promotionalSaleID;
    }

    /**
     * Sets the value of the promotionalSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionalSaleID(Long value) {
        this.promotionalSaleID = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyActionCodeType }
     *     
     */
    public ModifyActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyActionCodeType }
     *     
     */
    public void setAction(ModifyActionCodeType value) {
        this.action = value;
    }

    /**
     * Gets the value of the promotionalSaleItemIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDArrayType }
     *     
     */
    public ItemIDArrayType getPromotionalSaleItemIDArray() {
        return promotionalSaleItemIDArray;
    }

    /**
     * Sets the value of the promotionalSaleItemIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDArrayType }
     *     
     */
    public void setPromotionalSaleItemIDArray(ItemIDArrayType value) {
        this.promotionalSaleItemIDArray = value;
    }

    /**
     * Gets the value of the storeCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreCategoryID(Long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryID(Long value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the allFixedPriceItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFixedPriceItems() {
        return allFixedPriceItems;
    }

    /**
     * Sets the value of the allFixedPriceItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFixedPriceItems(Boolean value) {
        this.allFixedPriceItems = value;
    }

    /**
     * Gets the value of the allStoreInventoryItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllStoreInventoryItems() {
        return allStoreInventoryItems;
    }

    /**
     * Sets the value of the allStoreInventoryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllStoreInventoryItems(Boolean value) {
        this.allStoreInventoryItems = value;
    }

    /**
     * Gets the value of the allAuctionItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllAuctionItems() {
        return allAuctionItems;
    }

    /**
     * Sets the value of the allAuctionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllAuctionItems(Boolean value) {
        this.allAuctionItems = value;
    }

}
