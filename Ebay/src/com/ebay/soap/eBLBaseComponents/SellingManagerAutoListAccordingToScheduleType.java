
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * Defines the options available for an Automated Listing Rule that 
 * 			keeps a fixed number of items on the site
 * 
 * <p>Java class for SellingManagerAutoListAccordingToScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListAccordingToScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayOfWeek" type="{urn:ebay:apis:eBLBaseComponents}DayOfWeekCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListingPeriodInWeeks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListAtSpecificTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxActiveItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAutoListAccordingToScheduleType", propOrder = {
    "dayOfWeek",
    "listingPeriodInWeeks",
    "listAtSpecificTimeOfDay",
    "startTime",
    "endTime",
    "maxActiveItemCount",
    "listingHoldInventoryLevel",
    "any"
})
public class SellingManagerAutoListAccordingToScheduleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DayOfWeek")
    protected List<DayOfWeekCodeType> dayOfWeek;
    @XmlElement(name = "ListingPeriodInWeeks")
    protected Integer listingPeriodInWeeks;
    @XmlElement(name = "ListAtSpecificTimeOfDay")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listAtSpecificTimeOfDay;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "MaxActiveItemCount")
    protected Integer maxActiveItemCount;
    @XmlElement(name = "ListingHoldInventoryLevel")
    protected Integer listingHoldInventoryLevel;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DayOfWeekCodeType }
     *     
     */
    public DayOfWeekCodeType[] getDayOfWeek() {
        if (this.dayOfWeek == null) {
            return new DayOfWeekCodeType[ 0 ] ;
        }
        return ((DayOfWeekCodeType[]) this.dayOfWeek.toArray(new DayOfWeekCodeType[this.dayOfWeek.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DayOfWeekCodeType }
     *     
     */
    public DayOfWeekCodeType getDayOfWeek(int idx) {
        if (this.dayOfWeek == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dayOfWeek.get(idx);
    }

    public int getDayOfWeekLength() {
        if (this.dayOfWeek == null) {
            return  0;
        }
        return this.dayOfWeek.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DayOfWeekCodeType }
     *     
     */
    public void setDayOfWeek(DayOfWeekCodeType[] values) {
        this._getDayOfWeek().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.dayOfWeek.add(values[i]);
        }
    }

    protected List<DayOfWeekCodeType> _getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<DayOfWeekCodeType>();
        }
        return dayOfWeek;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekCodeType }
     *     
     */
    public DayOfWeekCodeType setDayOfWeek(int idx, DayOfWeekCodeType value) {
        return this.dayOfWeek.set(idx, value);
    }

    /**
     * Gets the value of the listingPeriodInWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingPeriodInWeeks() {
        return listingPeriodInWeeks;
    }

    /**
     * Sets the value of the listingPeriodInWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingPeriodInWeeks(Integer value) {
        this.listingPeriodInWeeks = value;
    }

    /**
     * Gets the value of the listAtSpecificTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListAtSpecificTimeOfDay() {
        return listAtSpecificTimeOfDay;
    }

    /**
     * Sets the value of the listAtSpecificTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListAtSpecificTimeOfDay(XMLGregorianCalendar value) {
        this.listAtSpecificTimeOfDay = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the maxActiveItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxActiveItemCount() {
        return maxActiveItemCount;
    }

    /**
     * Sets the value of the maxActiveItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxActiveItemCount(Integer value) {
        this.maxActiveItemCount = value;
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
