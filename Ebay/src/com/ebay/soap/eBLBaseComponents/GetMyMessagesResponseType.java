
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Contains information about the messages sent to
 * 			a user. Depending on the detail level, this
 * 			information can include message counts,
 * 			resolution and flagged status, message
 * 			headers, and message text.
 * 			
 * 
 * <p>Java class for GetMyMessagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyMessagesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Summary" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesSummaryType" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertArrayType" minOccurs="0"/>
 *         &lt;element name="Messages" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyMessagesResponseType", propOrder = {
    "summary",
    "alerts",
    "messages"
})
public class GetMyMessagesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Summary")
    protected MyMessagesSummaryType summary;
    @XmlElement(name = "Alerts")
    protected MyMessagesAlertArrayType alerts;
    @XmlElement(name = "Messages")
    protected MyMessagesMessageArrayType messages;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesSummaryType }
     *     
     */
    public MyMessagesSummaryType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesSummaryType }
     *     
     */
    public void setSummary(MyMessagesSummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesAlertArrayType }
     *     
     */
    public MyMessagesAlertArrayType getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesAlertArrayType }
     *     
     */
    public void setAlerts(MyMessagesAlertArrayType value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesMessageArrayType }
     *     
     */
    public MyMessagesMessageArrayType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageArrayType }
     *     
     */
    public void setMessages(MyMessagesMessageArrayType value) {
        this.messages = value;
    }

}
