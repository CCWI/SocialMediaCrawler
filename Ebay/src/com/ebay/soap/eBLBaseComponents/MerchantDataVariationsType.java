
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
 *                 Variations are multiple similar (but not identical) items in a
 *                 single fixed-price (or Store Inventory Format) listing.
 *                 For example, a single listing could contain multiple items of the
 *                 same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium").
 * 		Each variation can have its own quantity and price. For example, a listing could
 * 		include 10 "Blue, Large" variations and 20 "Black, Medium" variations.
 *             
 * 
 * <p>Java class for MerchantDataVariationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantDataVariationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}MerchantDataVariationType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MerchantDataVariationsType", propOrder = {
    "variation",
    "any"
})
public class MerchantDataVariationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Variation")
    protected List<MerchantDataVariationType> variation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MerchantDataVariationType }
     *     
     */
    public MerchantDataVariationType[] getVariation() {
        if (this.variation == null) {
            return new MerchantDataVariationType[ 0 ] ;
        }
        return ((MerchantDataVariationType[]) this.variation.toArray(new MerchantDataVariationType[this.variation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MerchantDataVariationType }
     *     
     */
    public MerchantDataVariationType getVariation(int idx) {
        if (this.variation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.variation.get(idx);
    }

    public int getVariationLength() {
        if (this.variation == null) {
            return  0;
        }
        return this.variation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MerchantDataVariationType }
     *     
     */
    public void setVariation(MerchantDataVariationType[] values) {
        this._getVariation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.variation.add(values[i]);
        }
    }

    protected List<MerchantDataVariationType> _getVariation() {
        if (variation == null) {
            variation = new ArrayList<MerchantDataVariationType>();
        }
        return variation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDataVariationType }
     *     
     */
    public MerchantDataVariationType setVariation(int idx, MerchantDataVariationType value) {
        return this.variation.set(idx, value);
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
