
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the set of automation rules associated with the specified template.
 * 			
 * 
 * <p>Java class for SetSellingManagerTemplateAutomationRuleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSellingManagerTemplateAutomationRuleResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AutomatedListingRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListType" minOccurs="0"/>
 *         &lt;element name="AutomatedRelistingRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistType" minOccurs="0"/>
 *         &lt;element name="AutomatedSecondChanceOfferRule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoSecondChanceOfferType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}FeesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSellingManagerTemplateAutomationRuleResponseType", propOrder = {
    "automatedListingRule",
    "automatedRelistingRule",
    "automatedSecondChanceOfferRule",
    "fees"
})
public class SetSellingManagerTemplateAutomationRuleResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AutomatedListingRule")
    protected SellingManagerAutoListType automatedListingRule;
    @XmlElement(name = "AutomatedRelistingRule")
    protected SellingManagerAutoRelistType automatedRelistingRule;
    @XmlElement(name = "AutomatedSecondChanceOfferRule")
    protected SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;
    @XmlElement(name = "Fees")
    protected FeesType fees;

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

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

}
