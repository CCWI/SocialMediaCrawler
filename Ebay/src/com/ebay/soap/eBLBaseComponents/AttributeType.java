
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			A salient aspect or feature of a Half.com item that is specified by the seller so that a buyers can find the item more easily.
 * 		
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{urn:ebay:apis:eBLBaseComponents}ValType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="attributeLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "value",
    "any"
})
public class AttributeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Value")
    protected List<ValType> value;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute
    protected Integer attributeID;
    @XmlAttribute
    protected String attributeLabel;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ValType }
     *     
     */
    public ValType[] getValue() {
        if (this.value == null) {
            return new ValType[ 0 ] ;
        }
        return ((ValType[]) this.value.toArray(new ValType[this.value.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ValType }
     *     
     */
    public ValType getValue(int idx) {
        if (this.value == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.value.get(idx);
    }

    public int getValueLength() {
        if (this.value == null) {
            return  0;
        }
        return this.value.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ValType }
     *     
     */
    public void setValue(ValType[] values) {
        this._getValue().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.value.add(values[i]);
        }
    }

    protected List<ValType> _getValue() {
        if (value == null) {
            value = new ArrayList<ValType>();
        }
        return value;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ValType }
     *     
     */
    public ValType setValue(int idx, ValType value) {
        return this.value.set(idx, value);
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

    /**
     * Gets the value of the attributeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeID(Integer value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the attributeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeLabel() {
        return attributeLabel;
    }

    /**
     * Sets the value of the attributeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeLabel(String value) {
        this.attributeLabel = value;
    }

}
