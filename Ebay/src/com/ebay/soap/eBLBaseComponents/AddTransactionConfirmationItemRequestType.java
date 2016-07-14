
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Ends the eBay Motors listing specified by ItemID and creates a new Transaction
 * 				Confirmation Request (TCR) for the item, thus enabling the TCR recipient to
 * 				purchase the item. You can also use this call to see if a new TCR can be created
 * 				for the specified item.
 * 			
 * 
 * <p>Java class for AddTransactionConfirmationItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTransactionConfirmationItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="RecipientUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType"/>
 *         &lt;element name="VerifyEligibilityOnly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecipientPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecipientRelationType" type="{urn:ebay:apis:eBLBaseComponents}RecipientRelationCodeType"/>
 *         &lt;element name="NegotiatedPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType"/>
 *         &lt;element name="ListingDuration" type="{urn:ebay:apis:eBLBaseComponents}SecondChanceOfferDurationCodeType"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTransactionConfirmationItemRequestType", propOrder = {
    "recipientUserID",
    "verifyEligibilityOnly",
    "recipientPostalCode",
    "recipientRelationType",
    "negotiatedPrice",
    "listingDuration",
    "itemID",
    "comments"
})
public class AddTransactionConfirmationItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RecipientUserID", required = true)
    protected String recipientUserID;
    @XmlElement(name = "VerifyEligibilityOnly", required = true)
    protected String verifyEligibilityOnly;
    @XmlElement(name = "RecipientPostalCode", required = true)
    protected String recipientPostalCode;
    @XmlElement(name = "RecipientRelationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String recipientRelationType;
    @XmlElement(name = "NegotiatedPrice", required = true)
    protected AmountType negotiatedPrice;
    @XmlElement(name = "ListingDuration", required = true)
    protected SecondChanceOfferDurationCodeType listingDuration;
    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "Comments", required = true)
    protected String comments;

    /**
     * Gets the value of the recipientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientUserID() {
        return recipientUserID;
    }

    /**
     * Sets the value of the recipientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientUserID(String value) {
        this.recipientUserID = value;
    }

    /**
     * Gets the value of the verifyEligibilityOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyEligibilityOnly() {
        return verifyEligibilityOnly;
    }

    /**
     * Sets the value of the verifyEligibilityOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyEligibilityOnly(String value) {
        this.verifyEligibilityOnly = value;
    }

    /**
     * Gets the value of the recipientPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPostalCode() {
        return recipientPostalCode;
    }

    /**
     * Sets the value of the recipientPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPostalCode(String value) {
        this.recipientPostalCode = value;
    }

    /**
     * Gets the value of the recipientRelationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRelationType() {
        return recipientRelationType;
    }

    /**
     * Sets the value of the recipientRelationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRelationType(String value) {
        this.recipientRelationType = value;
    }

    /**
     * Gets the value of the negotiatedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNegotiatedPrice() {
        return negotiatedPrice;
    }

    /**
     * Sets the value of the negotiatedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNegotiatedPrice(AmountType value) {
        this.negotiatedPrice = value;
    }

    /**
     * Gets the value of the listingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public SecondChanceOfferDurationCodeType getListingDuration() {
        return listingDuration;
    }

    /**
     * Sets the value of the listingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public void setListingDuration(SecondChanceOfferDurationCodeType value) {
        this.listingDuration = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
