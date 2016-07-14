
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to specify the definition of a new item and submit the definition to eBay without creating a listing.&nbsp;<b>Also for Half.com</b>.
 * 				<br><br>
 * 				Sellers who engage in cross-border trade on sites that require a recoupment agreement, must agree to the
 * 				recoupment terms before adding or verifying items. This agreement allows eBay to reimburse
 * 				a buyer during a dispute and then recoup the cost from the seller. The US site is a recoupment site, and
 *         the agreement is located <a href="https://scgi.ebay.com/ws/eBayISAPI.dll?CBTRecoupAgreement">here</a>.
 *         The list of the sites where a user has agreed to the recoupment terms is returned by the GetUser response.
 * 			
 * 
 * <p>Java class for VerifyAddItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyAddItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="IncludeExpressRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalProductID" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyAddItemRequestType", propOrder = {
    "item",
    "includeExpressRequirements",
    "externalProductID"
})
public class VerifyAddItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "IncludeExpressRequirements")
    protected Boolean includeExpressRequirements;
    @XmlElement(name = "ExternalProductID")
    protected ExternalProductIDType externalProductID;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the includeExpressRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExpressRequirements() {
        return includeExpressRequirements;
    }

    /**
     * Sets the value of the includeExpressRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExpressRequirements(Boolean value) {
        this.includeExpressRequirements = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductIDType }
     *     
     */
    public ExternalProductIDType getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductIDType }
     *     
     */
    public void setExternalProductID(ExternalProductIDType value) {
        this.externalProductID = value;
    }

}
