
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This event is not functional. 
 * 			
 * 
 * <p>Java class for ItemsCanceledEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemsCanceledEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CanceledItemIDArray" type="{urn:ebay:apis:eBLBaseComponents}ItemIDArrayType" minOccurs="0"/>
 *         &lt;element name="EligibleForRelist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsCanceledEventType", propOrder = {
    "canceledItemIDArray",
    "eligibleForRelist",
    "sellerID"
})
public class ItemsCanceledEventType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CanceledItemIDArray")
    protected ItemIDArrayType canceledItemIDArray;
    @XmlElement(name = "EligibleForRelist")
    protected Boolean eligibleForRelist;
    @XmlElement(name = "SellerID")
    protected String sellerID;

    /**
     * Gets the value of the canceledItemIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDArrayType }
     *     
     */
    public ItemIDArrayType getCanceledItemIDArray() {
        return canceledItemIDArray;
    }

    /**
     * Sets the value of the canceledItemIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDArrayType }
     *     
     */
    public void setCanceledItemIDArray(ItemIDArrayType value) {
        this.canceledItemIDArray = value;
    }

    /**
     * Gets the value of the eligibleForRelist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForRelist() {
        return eligibleForRelist;
    }

    /**
     * Sets the value of the eligibleForRelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForRelist(Boolean value) {
        this.eligibleForRelist = value;
    }

    /**
     * Gets the value of the sellerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets the value of the sellerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

}
