
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Revises, or adds to, the set of Selling Manager automation
 * 				rules associated with an item.
 * 				<br>
 * 				<br>
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 				<br>
 * 				<br>
 * 				Using this call, you can add an autolist rule.
 * 				You also can add a second chance offer
 * 				rule (restricted to auction items and auction templates).
 * 				Note that autorelist rules can only be set on templates.
 * 				An autorelist rule for an item is inherited from a template.
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
 * 				(Instead, use DeleteSellingManagerItemAutomationRule.)
 * 			
 * 
 * <p>Java class for SetSellingManagerItemAutomationRuleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSellingManagerItemAutomationRuleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
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
@XmlType(name = "SetSellingManagerItemAutomationRuleRequestType", propOrder = {
    "itemID",
    "automatedRelistingRule",
    "automatedSecondChanceOfferRule"
})
public class SetSellingManagerItemAutomationRuleRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "AutomatedRelistingRule")
    protected SellingManagerAutoRelistType automatedRelistingRule;
    @XmlElement(name = "AutomatedSecondChanceOfferRule")
    protected SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;

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
