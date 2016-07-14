
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables Selling Manager subscribers to store standard feedback comments that can
 * 				be left for their buyers. Selling Manager Pro subscribers can also specify what
 * 				events, if any, will trigger an automated feedback to buyers.
 * 			
 * 
 * <p>Java class for SetSellingManagerFeedbackOptionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSellingManagerFeedbackOptionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AutomatedLeaveFeedbackEvent" type="{urn:ebay:apis:eBLBaseComponents}AutomatedLeaveFeedbackEventCodeType" minOccurs="0"/>
 *         &lt;element name="StoredComments" type="{urn:ebay:apis:eBLBaseComponents}FeedbackCommentArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSellingManagerFeedbackOptionsRequestType", propOrder = {
    "automatedLeaveFeedbackEvent",
    "storedComments"
})
public class SetSellingManagerFeedbackOptionsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AutomatedLeaveFeedbackEvent")
    protected AutomatedLeaveFeedbackEventCodeType automatedLeaveFeedbackEvent;
    @XmlElement(name = "StoredComments")
    protected FeedbackCommentArrayType storedComments;

    /**
     * Gets the value of the automatedLeaveFeedbackEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedLeaveFeedbackEventCodeType }
     *     
     */
    public AutomatedLeaveFeedbackEventCodeType getAutomatedLeaveFeedbackEvent() {
        return automatedLeaveFeedbackEvent;
    }

    /**
     * Sets the value of the automatedLeaveFeedbackEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedLeaveFeedbackEventCodeType }
     *     
     */
    public void setAutomatedLeaveFeedbackEvent(AutomatedLeaveFeedbackEventCodeType value) {
        this.automatedLeaveFeedbackEvent = value;
    }

    /**
     * Gets the value of the storedComments property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackCommentArrayType }
     *     
     */
    public FeedbackCommentArrayType getStoredComments() {
        return storedComments;
    }

    /**
     * Sets the value of the storedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackCommentArrayType }
     *     
     */
    public void setStoredComments(FeedbackCommentArrayType value) {
        this.storedComments = value;
    }

}
