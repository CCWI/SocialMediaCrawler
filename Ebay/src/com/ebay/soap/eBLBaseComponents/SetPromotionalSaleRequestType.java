
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Creates or modifies a promotional sale. Promotional sales enable sellers
 * 				to apply discounts and/or free shipping across many listings.
 * 			
 * 
 * <p>Java class for SetPromotionalSaleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPromotionalSaleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}ModifyActionCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPromotionalSaleRequestType", propOrder = {
    "action",
    "promotionalSaleDetails"
})
public class SetPromotionalSaleRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Action")
    protected ModifyActionCodeType action;
    @XmlElement(name = "PromotionalSaleDetails")
    protected PromotionalSaleType promotionalSaleDetails;

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
     * Gets the value of the promotionalSaleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleType }
     *     
     */
    public PromotionalSaleType getPromotionalSaleDetails() {
        return promotionalSaleDetails;
    }

    /**
     * Sets the value of the promotionalSaleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleType }
     *     
     */
    public void setPromotionalSaleDetails(PromotionalSaleType value) {
        this.promotionalSaleDetails = value;
    }

}
