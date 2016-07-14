
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Revises, or adds to, the Selling Manager automation
 * 				rules associated with a template.
 * 				<br>
 * 				<br>
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 				<br>
 * 				<br>
 * 				Using this call, you can add either an autorelist rule or
 * 				an autolist rule, but not both.
 * 				You also can add a second chance
 * 				offer rule (restricted to auction items and auction templates).
 * 				<br>
 * 				<br>
 * 				This call also enables you to specify particular information about automation
 * 				rules.
 * 				<br>
 * 				<br>
 * 				If a node is not passed in the call, the setting for the corresponding
 * 				automation rule remains unchanged.
 * 				<br>
 * 				<br>
 * 				Although this call can revise (overwrite) an existing rule,
 * 				this call cannot delete an automation rule.
 * 				(Instead, use DeleteSellingManagerTemplateAutomationRule.)
 * 			
 * 
 * <p>Java class for SetSellingManagerTemplateAutomationRuleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSellingManagerTemplateAutomationRuleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AutomatedListingRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListType" minOccurs="0"/>
 *         &lt;element name="AutomatedRelistingRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistType" minOccurs="0"/>
 *         &lt;element name="AutomatedSecondChanceOfferRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoSecondChanceOfferType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSellingManagerTemplateAutomationRuleRequestType", propOrder = {
    "saleTemplateID",
    "automatedListingRule",
    "automatedRelistingRule",
    "automatedSecondChanceOfferRule"
})
public class SetSellingManagerTemplateAutomationRuleRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SaleTemplateID")
    protected Long saleTemplateID;
    @XmlElement(name = "AutomatedListingRule")
    protected SellingManagerAutoListType automatedListingRule;
    @XmlElement(name = "AutomatedRelistingRule")
    protected SellingManagerAutoRelistType automatedRelistingRule;
    @XmlElement(name = "AutomatedSecondChanceOfferRule")
    protected SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;

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
     * Gets the value of the automatedListingRule property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoListType }
     *     
     */
    public SellingManagerAutoListType getAutomatedListingRule() {
        return automatedListingRule;
    }

    /**
     * Sets the value of the automatedListingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoListType }
     *     
     */
    public void setAutomatedListingRule(SellingManagerAutoListType value) {
        this.automatedListingRule = value;
    }

    /**
     * Gets the value of the automatedRelistingRule property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoRelistType }
     *     
     */
    public SellingManagerAutoRelistType getAutomatedRelistingRule() {
        return automatedRelistingRule;
    }

    /**
     * Sets the value of the automatedRelistingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoRelistType }
     *     
     */
    public void setAutomatedRelistingRule(SellingManagerAutoRelistType value) {
        this.automatedRelistingRule = value;
    }

    /**
     * Gets the value of the automatedSecondChanceOfferRule property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoSecondChanceOfferType }
     *     
     */
    public SellingManagerAutoSecondChanceOfferType getAutomatedSecondChanceOfferRule() {
        return automatedSecondChanceOfferRule;
    }

    /**
     * Sets the value of the automatedSecondChanceOfferRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoSecondChanceOfferType }
     *     
     */
    public void setAutomatedSecondChanceOfferRule(SellingManagerAutoSecondChanceOfferType value) {
        this.automatedSecondChanceOfferRule = value;
    }

}
