
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Provides information about an automated listing rule.   
 * 				Automated listing rules cannot be combined with automated relisting rules.
 * 				A template can have one set of information per automated listing rule specified.
 * 			
 * 
 * <p>Java class for SellingManagerAutoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceSaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeepMinActive" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListMinActiveItemsType" minOccurs="0"/>
 *         &lt;element name="ListAccordingToSchedule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListAccordingToScheduleType" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAutoListType", propOrder = {
    "sourceSaleTemplateID",
    "keepMinActive",
    "listAccordingToSchedule",
    "any"
})
public class SellingManagerAutoListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SourceSaleTemplateID")
    protected Long sourceSaleTemplateID;
    @XmlElement(name = "KeepMinActive")
    protected SellingManagerAutoListMinActiveItemsType keepMinActive;
    @XmlElement(name = "ListAccordingToSchedule")
    protected SellingManagerAutoListAccordingToScheduleType listAccordingToSchedule;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sourceSaleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceSaleTemplateID() {
        return sourceSaleTemplateID;
    }

    /**
     * Sets the value of the sourceSaleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceSaleTemplateID(Long value) {
        this.sourceSaleTemplateID = value;
    }

    /**
     * Gets the value of the keepMinActive property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoListMinActiveItemsType }
     *     
     */
    public SellingManagerAutoListMinActiveItemsType getKeepMinActive() {
        return keepMinActive;
    }

    /**
     * Sets the value of the keepMinActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoListMinActiveItemsType }
     *     
     */
    public void setKeepMinActive(SellingManagerAutoListMinActiveItemsType value) {
        this.keepMinActive = value;
    }

    /**
     * Gets the value of the listAccordingToSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoListAccordingToScheduleType }
     *     
     */
    public SellingManagerAutoListAccordingToScheduleType getListAccordingToSchedule() {
        return listAccordingToSchedule;
    }

    /**
     * Sets the value of the listAccordingToSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoListAccordingToScheduleType }
     *     
     */
    public void setListAccordingToSchedule(SellingManagerAutoListAccordingToScheduleType value) {
        this.listAccordingToSchedule = value;
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
