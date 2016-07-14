
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the current list of options for Store configurations.
 * 			
 * 
 * <p>Java class for GetStoreOptionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreOptionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BasicThemeArray" type="{urn:ebay:apis:eBLBaseComponents}StoreThemeArrayType" minOccurs="0"/>
 *         &lt;element name="AdvancedThemeArray" type="{urn:ebay:apis:eBLBaseComponents}StoreThemeArrayType" minOccurs="0"/>
 *         &lt;element name="LogoArray" type="{urn:ebay:apis:eBLBaseComponents}StoreLogoArrayType" minOccurs="0"/>
 *         &lt;element name="SubscriptionArray" type="{urn:ebay:apis:eBLBaseComponents}StoreSubscriptionArrayType" minOccurs="0"/>
 *         &lt;element name="MaxCategories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCategoryLevels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreOptionsResponseType", propOrder = {
    "basicThemeArray",
    "advancedThemeArray",
    "logoArray",
    "subscriptionArray",
    "maxCategories",
    "maxCategoryLevels"
})
public class GetStoreOptionsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BasicThemeArray")
    protected StoreThemeArrayType basicThemeArray;
    @XmlElement(name = "AdvancedThemeArray")
    protected StoreThemeArrayType advancedThemeArray;
    @XmlElement(name = "LogoArray")
    protected StoreLogoArrayType logoArray;
    @XmlElement(name = "SubscriptionArray")
    protected StoreSubscriptionArrayType subscriptionArray;
    @XmlElement(name = "MaxCategories")
    protected Integer maxCategories;
    @XmlElement(name = "MaxCategoryLevels")
    protected Integer maxCategoryLevels;

    /**
     * Gets the value of the basicThemeArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreThemeArrayType }
     *     
     */
    public StoreThemeArrayType getBasicThemeArray() {
        return basicThemeArray;
    }

    /**
     * Sets the value of the basicThemeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreThemeArrayType }
     *     
     */
    public void setBasicThemeArray(StoreThemeArrayType value) {
        this.basicThemeArray = value;
    }

    /**
     * Gets the value of the advancedThemeArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreThemeArrayType }
     *     
     */
    public StoreThemeArrayType getAdvancedThemeArray() {
        return advancedThemeArray;
    }

    /**
     * Sets the value of the advancedThemeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreThemeArrayType }
     *     
     */
    public void setAdvancedThemeArray(StoreThemeArrayType value) {
        this.advancedThemeArray = value;
    }

    /**
     * Gets the value of the logoArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreLogoArrayType }
     *     
     */
    public StoreLogoArrayType getLogoArray() {
        return logoArray;
    }

    /**
     * Sets the value of the logoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreLogoArrayType }
     *     
     */
    public void setLogoArray(StoreLogoArrayType value) {
        this.logoArray = value;
    }

    /**
     * Gets the value of the subscriptionArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreSubscriptionArrayType }
     *     
     */
    public StoreSubscriptionArrayType getSubscriptionArray() {
        return subscriptionArray;
    }

    /**
     * Sets the value of the subscriptionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSubscriptionArrayType }
     *     
     */
    public void setSubscriptionArray(StoreSubscriptionArrayType value) {
        this.subscriptionArray = value;
    }

    /**
     * Gets the value of the maxCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCategories() {
        return maxCategories;
    }

    /**
     * Sets the value of the maxCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCategories(Integer value) {
        this.maxCategories = value;
    }

    /**
     * Gets the value of the maxCategoryLevels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCategoryLevels() {
        return maxCategoryLevels;
    }

    /**
     * Sets the value of the maxCategoryLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCategoryLevels(Integer value) {
        this.maxCategoryLevels = value;
    }

}
