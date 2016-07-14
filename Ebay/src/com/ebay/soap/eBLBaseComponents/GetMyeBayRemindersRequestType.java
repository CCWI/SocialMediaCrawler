
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Requests totals for the Buying and Selling reminders from the user's
 * 				My eBay account.
 * 			
 * 
 * <p>Java class for GetMyeBayRemindersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBayRemindersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="BuyingReminders" type="{urn:ebay:apis:eBLBaseComponents}ReminderCustomizationType" minOccurs="0"/>
 *         &lt;element name="SellingReminders" type="{urn:ebay:apis:eBLBaseComponents}ReminderCustomizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayRemindersRequestType", propOrder = {
    "buyingReminders",
    "sellingReminders"
})
public class GetMyeBayRemindersRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyingReminders")
    protected ReminderCustomizationType buyingReminders;
    @XmlElement(name = "SellingReminders")
    protected ReminderCustomizationType sellingReminders;

    /**
     * Gets the value of the buyingReminders property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public ReminderCustomizationType getBuyingReminders() {
        return buyingReminders;
    }

    /**
     * Sets the value of the buyingReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public void setBuyingReminders(ReminderCustomizationType value) {
        this.buyingReminders = value;
    }

    /**
     * Gets the value of the sellingReminders property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public ReminderCustomizationType getSellingReminders() {
        return sellingReminders;
    }

    /**
     * Sets the value of the sellingReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public void setSellingReminders(ReminderCustomizationType value) {
        this.sellingReminders = value;
    }

}
