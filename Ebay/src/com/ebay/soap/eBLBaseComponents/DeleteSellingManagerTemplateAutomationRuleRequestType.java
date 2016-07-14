
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Removes the association of Selling Manager automation rules
 * 				to a template. Returns the remaining rules in the response.
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for DeleteSellingManagerTemplateAutomationRuleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSellingManagerTemplateAutomationRuleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteAutomatedListingRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteAutomatedRelistingRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteAutomatedSecondChanceOfferRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSellingManagerTemplateAutomationRuleRequestType", propOrder = {
    "saleTemplateID",
    "deleteAutomatedListingRule",
    "deleteAutomatedRelistingRule",
    "deleteAutomatedSecondChanceOfferRule"
})
public class DeleteSellingManagerTemplateAutomationRuleRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SaleTemplateID")
    protected Long saleTemplateID;
    @XmlElement(name = "DeleteAutomatedListingRule")
    protected Boolean deleteAutomatedListingRule;
    @XmlElement(name = "DeleteAutomatedRelistingRule")
    protected Boolean deleteAutomatedRelistingRule;
    @XmlElement(name = "DeleteAutomatedSecondChanceOfferRule")
    protected Boolean deleteAutomatedSecondChanceOfferRule;

    /**
     * Gets the value of the saleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleTemplateID() {
        return saleTemplateID;
    }

    /**
     * Sets the value of the saleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleTemplateID(Long value) {
        this.saleTemplateID = value;
    }

    /**
     * Gets the value of the deleteAutomatedListingRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAutomatedListingRule() {
        return deleteAutomatedListingRule;
    }

    /**
     * Sets the value of the deleteAutomatedListingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAutomatedListingRule(Boolean value) {
        this.deleteAutomatedListingRule = value;
    }

    /**
     * Gets the value of the deleteAutomatedRelistingRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAutomatedRelistingRule() {
        return deleteAutomatedRelistingRule;
    }

    /**
     * Sets the value of the deleteAutomatedRelistingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAutomatedRelistingRule(Boolean value) {
        this.deleteAutomatedRelistingRule = value;
    }

    /**
     * Gets the value of the deleteAutomatedSecondChanceOfferRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAutomatedSecondChanceOfferRule() {
        return deleteAutomatedSecondChanceOfferRule;
    }

    /**
     * Sets the value of the deleteAutomatedSecondChanceOfferRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAutomatedSecondChanceOfferRule(Boolean value) {
        this.deleteAutomatedSecondChanceOfferRule = value;
    }

}
