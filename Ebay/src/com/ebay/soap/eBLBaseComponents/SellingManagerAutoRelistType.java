
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 				Provides information about an automated relisting rule.   
 * 				Automated relisting rules cannot be combined with automated listing rules.
 * 				A template can have one set of information per automated relisting rule specified.
 * 			
 * 
 * <p>Java class for SellingManagerAutoRelistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoRelistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RelistCondition" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistOptionCodeType" minOccurs="0"/>
 *         &lt;element name="RelistAfterDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelistAfterHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelistAtSpecificTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="BestOfferDetails" type="{urn:ebay:apis:eBLBaseComponents}BestOfferDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingHoldInventoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAutoRelistType", propOrder = {
    "type",
    "relistCondition",
    "relistAfterDays",
    "relistAfterHours",
    "relistAtSpecificTimeOfDay",
    "bestOfferDetails",
    "listingHoldInventoryLevel",
    "any"
})
public class SellingManagerAutoRelistType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Type")
    protected SellingManagerAutoRelistTypeCodeType type;
    @XmlElement(name = "RelistCondition")
    protected SellingManagerAutoRelistOptionCodeType relistCondition;
    @XmlElement(name = "RelistAfterDays")
    protected Integer relistAfterDays;
    @XmlElement(name = "RelistAfterHours")
    protected Integer relistAfterHours;
    @XmlElement(name = "RelistAtSpecificTimeOfDay")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar relistAtSpecificTimeOfDay;
    @XmlElement(name = "BestOfferDetails")
    protected BestOfferDetailsType bestOfferDetails;
    @XmlElement(name = "ListingHoldInventoryLevel")
    protected Integer listingHoldInventoryLevel;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoRelistTypeCodeType }
     *     
     */
    public SellingManagerAutoRelistTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoRelistTypeCodeType }
     *     
     */
    public void setType(SellingManagerAutoRelistTypeCodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the relistCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoRelistOptionCodeType }
     *     
     */
    public SellingManagerAutoRelistOptionCodeType getRelistCondition() {
        return relistCondition;
    }

    /**
     * Sets the value of the relistCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoRelistOptionCodeType }
     *     
     */
    public void setRelistCondition(SellingManagerAutoRelistOptionCodeType value) {
        this.relistCondition = value;
    }

    /**
     * Gets the value of the relistAfterDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelistAfterDays() {
        return relistAfterDays;
    }

    /**
     * Sets the value of the relistAfterDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelistAfterDays(Integer value) {
        this.relistAfterDays = value;
    }

    /**
     * Gets the value of the relistAfterHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelistAfterHours() {
        return relistAfterHours;
    }

    /**
     * Sets the value of the relistAfterHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelistAfterHours(Integer value) {
        this.relistAfterHours = value;
    }

    /**
     * Gets the value of the relistAtSpecificTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelistAtSpecificTimeOfDay() {
        return relistAtSpecificTimeOfDay;
    }

    /**
     * Sets the value of the relistAtSpecificTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelistAtSpecificTimeOfDay(XMLGregorianCalendar value) {
        this.relistAtSpecificTimeOfDay = value;
    }

    /**
     * Gets the value of the bestOfferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public BestOfferDetailsType getBestOfferDetails() {
        return bestOfferDetails;
    }

    /**
     * Sets the value of the bestOfferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public void setBestOfferDetails(BestOfferDetailsType value) {
        this.bestOfferDetails = value;
    }

    /**
     * Gets the value of the listingHoldInventoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingHoldInventoryLevel() {
        return listingHoldInventoryLevel;
    }

    /**
     * Sets the value of the listingHoldInventoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingHoldInventoryLevel(Integer value) {
        this.listingHoldInventoryLevel = value;
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
