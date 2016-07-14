
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Removes the association of Selling Manager automation rules
 * 				to an item. Returns the remaining rules in the response.
 * 				<br><br>
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for DeleteSellingManagerItemAutomationRuleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSellingManagerItemAutomationRuleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
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
@XmlType(name = "DeleteSellingManagerItemAutomationRuleRequestType", propOrder = {
    "itemID",
    "deleteAutomatedRelistingRule",
    "deleteAutomatedSecondChanceOfferRule"
})
public class DeleteSellingManagerItemAutomationRuleRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "DeleteAutomatedRelistingRule")
    protected Boolean deleteAutomatedRelistingRule;
    @XmlElement(name = "DeleteAutomatedSecondChanceOfferRule")
    protected Boolean deleteAutomatedSecondChanceOfferRule;

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
