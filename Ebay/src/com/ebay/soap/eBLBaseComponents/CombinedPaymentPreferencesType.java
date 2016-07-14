
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
 * 			Type used to define all combined payment preferences, including preferences and
 * 			rules for Calculated and Flat Rate shipping, a flag to allow or disallow <a href="http://developer.ebay.com/DevZone/guides/ebayfeatures/Development/Listing-AnItem.html#CombinedInvoice">Combined Invoice</a> 
 * 			orders, and the time period in which to allow buyers to combine multiple
 * 			purchases from the seller into a Combined Invoice order.
 * 			
 * 
 * <p>Java class for CombinedPaymentPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedPaymentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedShippingPreferences" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingPreferencesType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentOption" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentPeriod" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="FlatShippingPreferences" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingPreferencesType" minOccurs="0"/>
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
@XmlType(name = "CombinedPaymentPreferencesType", propOrder = {
    "calculatedShippingPreferences",
    "combinedPaymentOption",
    "combinedPaymentPeriod",
    "flatShippingPreferences",
    "any"
})
public class CombinedPaymentPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CalculatedShippingPreferences")
    protected CalculatedShippingPreferencesType calculatedShippingPreferences;
    @XmlElement(name = "CombinedPaymentOption")
    protected CombinedPaymentOptionCodeType combinedPaymentOption;
    @XmlElement(name = "CombinedPaymentPeriod")
    protected CombinedPaymentPeriodCodeType combinedPaymentPeriod;
    @XmlElement(name = "FlatShippingPreferences")
    protected FlatShippingPreferencesType flatShippingPreferences;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the calculatedShippingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingPreferencesType }
     *     
     */
    public CalculatedShippingPreferencesType getCalculatedShippingPreferences() {
        return calculatedShippingPreferences;
    }

    /**
     * Sets the value of the calculatedShippingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingPreferencesType }
     *     
     */
    public void setCalculatedShippingPreferences(CalculatedShippingPreferencesType value) {
        this.calculatedShippingPreferences = value;
    }

    /**
     * Gets the value of the combinedPaymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public CombinedPaymentOptionCodeType getCombinedPaymentOption() {
        return combinedPaymentOption;
    }

    /**
     * Sets the value of the combinedPaymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public void setCombinedPaymentOption(CombinedPaymentOptionCodeType value) {
        this.combinedPaymentOption = value;
    }

    /**
     * Gets the value of the combinedPaymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public CombinedPaymentPeriodCodeType getCombinedPaymentPeriod() {
        return combinedPaymentPeriod;
    }

    /**
     * Sets the value of the combinedPaymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public void setCombinedPaymentPeriod(CombinedPaymentPeriodCodeType value) {
        this.combinedPaymentPeriod = value;
    }

    /**
     * Gets the value of the flatShippingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingPreferencesType }
     *     
     */
    public FlatShippingPreferencesType getFlatShippingPreferences() {
        return flatShippingPreferences;
    }

    /**
     * Sets the value of the flatShippingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingPreferencesType }
     *     
     */
    public void setFlatShippingPreferences(FlatShippingPreferencesType value) {
        this.flatShippingPreferences = value;
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
