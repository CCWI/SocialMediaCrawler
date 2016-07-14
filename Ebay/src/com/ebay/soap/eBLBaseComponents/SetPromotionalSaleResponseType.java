
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the ID and status of a promotional sale.
 * 				The Promotional Price Display feature enables sellers
 * 				to apply discounts and/or free shipping across many listings.  
 * 			
 * 
 * <p>Java class for SetPromotionalSaleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPromotionalSaleResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPromotionalSaleResponseType", propOrder = {
    "status",
    "promotionalSaleID"
})
public class SetPromotionalSaleResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Status")
    protected PromotionalSaleStatusCodeType status;
    @XmlElement(name = "PromotionalSaleID")
    protected Long promotionalSaleID;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setStatus(PromotionalSaleStatusCodeType value) {
        this.status = value;
    }

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

}
