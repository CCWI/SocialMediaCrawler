
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
 * 				A generic type used for histograms.
 * 			
 * 
 * <p>Java class for CharacteristicsSetProductHistogramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicsSetProductHistogramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistogramEntry" type="{urn:ebay:apis:eBLBaseComponents}HistogramEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CharacteristicsSetProductHistogramType", propOrder = {
    "histogramEntry",
    "any"
})
public class CharacteristicsSetProductHistogramType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "HistogramEntry")
    protected List<HistogramEntryType> histogramEntry;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link HistogramEntryType }
     *     
     */
    public HistogramEntryType[] getHistogramEntry() {
        if (this.histogramEntry == null) {
            return new HistogramEntryType[ 0 ] ;
        }
        return ((HistogramEntryType[]) this.histogramEntry.toArray(new HistogramEntryType[this.histogramEntry.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link HistogramEntryType }
     *     
     */
    public HistogramEntryType getHistogramEntry(int idx) {
        if (this.histogramEntry == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.histogramEntry.get(idx);
    }

    public int getHistogramEntryLength() {
        if (this.histogramEntry == null) {
            return  0;
        }
        return this.histogramEntry.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link HistogramEntryType }
     *     
     */
    public void setHistogramEntry(HistogramEntryType[] values) {
        this._getHistogramEntry().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.histogramEntry.add(values[i]);
        }
    }

    protected List<HistogramEntryType> _getHistogramEntry() {
        if (histogramEntry == null) {
            histogramEntry = new ArrayList<HistogramEntryType>();
        }
        return histogramEntry;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link HistogramEntryType }
     *     
     */
    public HistogramEntryType setHistogramEntry(int idx, HistogramEntryType value) {
        return this.histogramEntry.set(idx, value);
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
