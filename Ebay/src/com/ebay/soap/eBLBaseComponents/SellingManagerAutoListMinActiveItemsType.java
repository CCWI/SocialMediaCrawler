
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
 * 			Defines the options available for an automated listing rule that
 * 			keeps a minimum number of items on the site.
 * 			
 * 
 * <p>Java class for SellingManagerAutoListMinActiveItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListMinActiveItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinActiveItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListTimeFrom" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ListTimeTo" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SpacingIntervalInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAutoListMinActiveItemsType", propOrder = {
    "minActiveItemCount",
    "listTimeFrom",
    "listTimeTo",
    "spacingIntervalInMinutes",
    "listingHoldInventoryLevel",
    "any"
})
public class SellingManagerAutoListMinActiveItemsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MinActiveItemCount")
    protected Integer minActiveItemCount;
    @XmlElement(name = "ListTimeFrom")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listTimeFrom;
    @XmlElement(name = "ListTimeTo")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listTimeTo;
    @XmlElement(name = "SpacingIntervalInMinutes")
    protected Integer spacingIntervalInMinutes;
    @XmlElement(name = "ListingHoldInventoryLevel")
    protected Integer listingHoldInventoryLevel;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the minActiveItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinActiveItemCount() {
        return minActiveItemCount;
    }

    /**
     * Sets the value of the minActiveItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinActiveItemCount(Integer value) {
        this.minActiveItemCount = value;
    }

    /**
     * Gets the value of the listTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListTimeFrom() {
        return listTimeFrom;
    }

    /**
     * Sets the value of the listTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListTimeFrom(XMLGregorianCalendar value) {
        this.listTimeFrom = value;
    }

    /**
     * Gets the value of the listTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListTimeTo() {
        return listTimeTo;
    }

    /**
     * Sets the value of the listTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListTimeTo(XMLGregorianCalendar value) {
        this.listTimeTo = value;
    }

    /**
     * Gets the value of the spacingIntervalInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpacingIntervalInMinutes() {
        return spacingIntervalInMinutes;
    }

    /**
     * Sets the value of the spacingIntervalInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpacingIntervalInMinutes(Integer value) {
        this.spacingIntervalInMinutes = value;
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
