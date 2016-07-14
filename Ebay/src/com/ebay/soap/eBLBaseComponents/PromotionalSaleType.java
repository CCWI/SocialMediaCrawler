
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
 * 				Details for a single promotional sale.
 * 			
 * 
 * <p>Java class for PromotionalSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleItemIDArray" type="{urn:ebay:apis:eBLBaseComponents}ItemIDArrayType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{urn:ebay:apis:eBLBaseComponents}DiscountCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleType" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleTypeCodeType" minOccurs="0"/>
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
@XmlType(name = "PromotionalSaleType", propOrder = {
    "promotionalSaleID",
    "promotionalSaleName",
    "promotionalSaleItemIDArray",
    "status",
    "discountType",
    "discountValue",
    "promotionalSaleStartTime",
    "promotionalSaleEndTime",
    "promotionalSaleType",
    "any"
})
public class PromotionalSaleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionalSaleID")
    protected Long promotionalSaleID;
    @XmlElement(name = "PromotionalSaleName")
    protected String promotionalSaleName;
    @XmlElement(name = "PromotionalSaleItemIDArray")
    protected ItemIDArrayType promotionalSaleItemIDArray;
    @XmlElement(name = "Status")
    protected PromotionalSaleStatusCodeType status;
    @XmlElement(name = "DiscountType")
    protected DiscountCodeType discountType;
    @XmlElement(name = "DiscountValue")
    protected Double discountValue;
    @XmlElement(name = "PromotionalSaleStartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar promotionalSaleStartTime;
    @XmlElement(name = "PromotionalSaleEndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar promotionalSaleEndTime;
    @XmlElement(name = "PromotionalSaleType")
    protected PromotionalSaleTypeCodeType promotionalSaleType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the promotionalSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionalSaleID() {
        return promotionalSaleID;
    }

    /**
     * Sets the value of the promotionalSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionalSaleID(Long value) {
        this.promotionalSaleID = value;
    }

    /**
     * Gets the value of the promotionalSaleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalSaleName() {
        return promotionalSaleName;
    }

    /**
     * Sets the value of the promotionalSaleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalSaleName(String value) {
        this.promotionalSaleName = value;
    }

    /**
     * Gets the value of the promotionalSaleItemIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDArrayType }
     *     
     */
    public ItemIDArrayType getPromotionalSaleItemIDArray() {
        return promotionalSaleItemIDArray;
    }

    /**
     * Sets the value of the promotionalSaleItemIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDArrayType }
     *     
     */
    public void setPromotionalSaleItemIDArray(ItemIDArrayType value) {
        this.promotionalSaleItemIDArray = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setStatus(PromotionalSaleStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCodeType }
     *     
     */
    public DiscountCodeType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCodeType }
     *     
     */
    public void setDiscountType(DiscountCodeType value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountValue(Double value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the promotionalSaleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPromotionalSaleStartTime() {
        return promotionalSaleStartTime;
    }

    /**
     * Sets the value of the promotionalSaleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalSaleStartTime(Calendar value) {
        this.promotionalSaleStartTime = value;
    }

    /**
     * Gets the value of the promotionalSaleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPromotionalSaleEndTime() {
        return promotionalSaleEndTime;
    }

    /**
     * Sets the value of the promotionalSaleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalSaleEndTime(Calendar value) {
        this.promotionalSaleEndTime = value;
    }

    /**
     * Gets the value of the promotionalSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleTypeCodeType }
     *     
     */
    public PromotionalSaleTypeCodeType getPromotionalSaleType() {
        return promotionalSaleType;
    }

    /**
     * Sets the value of the promotionalSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleTypeCodeType }
     *     
     */
    public void setPromotionalSaleType(PromotionalSaleTypeCodeType value) {
        this.promotionalSaleType = value;
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
