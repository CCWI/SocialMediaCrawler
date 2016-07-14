
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
 * 				Details about insurance for <a href="http://developer.ebay.com/DevZone/guides/ebayfeatures/Development/Listing-AnItem.html#CombinedInvoice">Combined Invoice</a> 
 *       orders.
 * 			
 * 
 * <p>Java class for ShippingInsuranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInsuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="FlatRateInsuranceRangeCost" type="{urn:ebay:apis:eBLBaseComponents}FlatRateInsuranceRangeCostType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShippingInsuranceType", propOrder = {
    "insuranceOption",
    "flatRateInsuranceRangeCost",
    "any"
})
public class ShippingInsuranceType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "FlatRateInsuranceRangeCost")
    protected List<FlatRateInsuranceRangeCostType> flatRateInsuranceRangeCost;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link FlatRateInsuranceRangeCostType }
     *     
     */
    public FlatRateInsuranceRangeCostType[] getFlatRateInsuranceRangeCost() {
        if (this.flatRateInsuranceRangeCost == null) {
            return new FlatRateInsuranceRangeCostType[ 0 ] ;
        }
        return ((FlatRateInsuranceRangeCostType[]) this.flatRateInsuranceRangeCost.toArray(new FlatRateInsuranceRangeCostType[this.flatRateInsuranceRangeCost.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link FlatRateInsuranceRangeCostType }
     *     
     */
    public FlatRateInsuranceRangeCostType getFlatRateInsuranceRangeCost(int idx) {
        if (this.flatRateInsuranceRangeCost == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.flatRateInsuranceRangeCost.get(idx);
    }

    public int getFlatRateInsuranceRangeCostLength() {
        if (this.flatRateInsuranceRangeCost == null) {
            return  0;
        }
        return this.flatRateInsuranceRangeCost.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link FlatRateInsuranceRangeCostType }
     *     
     */
    public void setFlatRateInsuranceRangeCost(FlatRateInsuranceRangeCostType[] values) {
        this._getFlatRateInsuranceRangeCost().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.flatRateInsuranceRangeCost.add(values[i]);
        }
    }

    protected List<FlatRateInsuranceRangeCostType> _getFlatRateInsuranceRangeCost() {
        if (flatRateInsuranceRangeCost == null) {
            flatRateInsuranceRangeCost = new ArrayList<FlatRateInsuranceRangeCostType>();
        }
        return flatRateInsuranceRangeCost;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link FlatRateInsuranceRangeCostType }
     *     
     */
    public FlatRateInsuranceRangeCostType setFlatRateInsuranceRangeCost(int idx, FlatRateInsuranceRangeCostType value) {
        return this.flatRateInsuranceRangeCost.set(idx, value);
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
