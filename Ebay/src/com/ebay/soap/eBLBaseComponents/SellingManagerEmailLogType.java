
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains list of Email log.
 * 			
 * 
 * <p>Java class for SellingManagerEmailLogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerEmailLogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailType" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CustomEmailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailState" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailSentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerEmailLogType", propOrder = {
    "emailType",
    "customEmailName",
    "emailState",
    "eventTime",
    "any"
})
public class SellingManagerEmailLogType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EmailType")
    protected SellingManagerEmailTypeCodeType emailType;
    @XmlElement(name = "CustomEmailName")
    protected String customEmailName;
    @XmlElement(name = "EmailState")
    protected SellingManagerEmailSentStatusCodeType emailState;
    @XmlElement(name = "EventTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar eventTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerEmailTypeCodeType }
     *     
     */
    public SellingManagerEmailTypeCodeType getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerEmailTypeCodeType }
     *     
     */
    public void setEmailType(SellingManagerEmailTypeCodeType value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the customEmailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomEmailName() {
        return customEmailName;
    }

    /**
     * Sets the value of the customEmailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomEmailName(String value) {
        this.customEmailName = value;
    }

    /**
     * Gets the value of the emailState property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerEmailSentStatusCodeType }
     *     
     */
    public SellingManagerEmailSentStatusCodeType getEmailState() {
        return emailState;
    }

    /**
     * Sets the value of the emailState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerEmailSentStatusCodeType }
     *     
     */
    public void setEmailState(SellingManagerEmailSentStatusCodeType value) {
        this.emailState = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTime(Calendar value) {
        this.eventTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
