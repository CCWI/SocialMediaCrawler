
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
 * 				This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 				
 * 			
 * 
 * <p>Java class for SearchAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateSpecifier" type="{urn:ebay:apis:eBLBaseComponents}DateSpecifierCodeType" minOccurs="0"/>
 *         &lt;element name="RangeSpecifier" type="{urn:ebay:apis:eBLBaseComponents}RangeCodeType" minOccurs="0"/>
 *         &lt;element name="ValueList" type="{urn:ebay:apis:eBLBaseComponents}ValType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SearchAttributesType", propOrder = {
    "attributeID",
    "dateSpecifier",
    "rangeSpecifier",
    "valueList",
    "any"
})
public class SearchAttributesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeID")
    protected int attributeID;
    @XmlElement(name = "DateSpecifier")
    protected DateSpecifierCodeType dateSpecifier;
    @XmlElement(name = "RangeSpecifier")
    protected RangeCodeType rangeSpecifier;
    @XmlElement(name = "ValueList")
    protected List<ValType> valueList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the attributeID property.
     * 
     */
    public int getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     */
    public void setAttributeID(int value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the dateSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link DateSpecifierCodeType }
     *     
     */
    public DateSpecifierCodeType getDateSpecifier() {
        return dateSpecifier;
    }

    /**
     * Sets the value of the dateSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSpecifierCodeType }
     *     
     */
    public void setDateSpecifier(DateSpecifierCodeType value) {
        this.dateSpecifier = value;
    }

    /**
     * Gets the value of the rangeSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link RangeCodeType }
     *     
     */
    public RangeCodeType getRangeSpecifier() {
        return rangeSpecifier;
    }

    /**
     * Sets the value of the rangeSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeCodeType }
     *     
     */
    public void setRangeSpecifier(RangeCodeType value) {
        this.rangeSpecifier = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ValType }
     *     
     */
    public ValType[] getValueList() {
        if (this.valueList == null) {
            return new ValType[ 0 ] ;
        }
        return ((ValType[]) this.valueList.toArray(new ValType[this.valueList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ValType }
     *     
     */
    public ValType getValueList(int idx) {
        if (this.valueList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.valueList.get(idx);
    }

    public int getValueListLength() {
        if (this.valueList == null) {
            return  0;
        }
        return this.valueList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ValType }
     *     
     */
    public void setValueList(ValType[] values) {
        this._getValueList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.valueList.add(values[i]);
        }
    }

    protected List<ValType> _getValueList() {
        if (valueList == null) {
            valueList = new ArrayList<ValType>();
        }
        return valueList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ValType }
     *     
     */
    public ValType setValueList(int idx, ValType value) {
        return this.valueList.set(idx, value);
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
