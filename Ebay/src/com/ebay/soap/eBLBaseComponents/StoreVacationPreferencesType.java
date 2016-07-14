
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Specifies a set of Store vacation preferences.
 * 			
 * 
 * <p>Java class for StoreVacationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreVacationPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnVacation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HideFixedPriceStoreItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayMessageStoreCustomText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageStoreCustomText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreVacationPreferencesType", propOrder = {
    "onVacation",
    "returnDate",
    "hideFixedPriceStoreItems",
    "messageItem",
    "messageStore",
    "displayMessageStoreCustomText",
    "messageStoreCustomText"
})
public class StoreVacationPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OnVacation")
    protected Boolean onVacation;
    @XmlElement(name = "ReturnDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar returnDate;
    @XmlElement(name = "HideFixedPriceStoreItems")
    protected Boolean hideFixedPriceStoreItems;
    @XmlElement(name = "MessageItem")
    protected Boolean messageItem;
    @XmlElement(name = "MessageStore")
    protected Boolean messageStore;
    @XmlElement(name = "DisplayMessageStoreCustomText")
    protected Boolean displayMessageStoreCustomText;
    @XmlElement(name = "MessageStoreCustomText")
    protected String messageStoreCustomText;

    /**
     * Gets the value of the onVacation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnVacation() {
        return onVacation;
    }

    /**
     * Sets the value of the onVacation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnVacation(Boolean value) {
        this.onVacation = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(Calendar value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the hideFixedPriceStoreItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideFixedPriceStoreItems() {
        return hideFixedPriceStoreItems;
    }

    /**
     * Sets the value of the hideFixedPriceStoreItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideFixedPriceStoreItems(Boolean value) {
        this.hideFixedPriceStoreItems = value;
    }

    /**
     * Gets the value of the messageItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageItem() {
        return messageItem;
    }

    /**
     * Sets the value of the messageItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageItem(Boolean value) {
        this.messageItem = value;
    }

    /**
     * Gets the value of the messageStore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageStore() {
        return messageStore;
    }

    /**
     * Sets the value of the messageStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageStore(Boolean value) {
        this.messageStore = value;
    }

    /**
     * Gets the value of the displayMessageStoreCustomText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayMessageStoreCustomText() {
        return displayMessageStoreCustomText;
    }

    /**
     * Sets the value of the displayMessageStoreCustomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayMessageStoreCustomText(Boolean value) {
        this.displayMessageStoreCustomText = value;
    }

    /**
     * Gets the value of the messageStoreCustomText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStoreCustomText() {
        return messageStoreCustomText;
    }

    /**
     * Sets the value of the messageStoreCustomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStoreCustomText(String value) {
        this.messageStoreCustomText = value;
    }

}
