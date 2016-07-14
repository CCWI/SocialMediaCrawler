
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated as "old" eBay attributes are no longer supported.
 * 			
 * 
 * <p>Java class for AttributeSetArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeSetArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSet" type="{urn:ebay:apis:eBLBaseComponents}AttributeSetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeSetArrayType", propOrder = {
    "attributeSet"
})
public class AttributeSetArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeSet")
    protected List<AttributeSetType> attributeSet;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AttributeSetType }
     *     
     */
    public AttributeSetType[] getAttributeSet() {
        if (this.attributeSet == null) {
            return new AttributeSetType[ 0 ] ;
        }
        return ((AttributeSetType[]) this.attributeSet.toArray(new AttributeSetType[this.attributeSet.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AttributeSetType }
     *     
     */
    public AttributeSetType getAttributeSet(int idx) {
        if (this.attributeSet == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.attributeSet.get(idx);
    }

    public int getAttributeSetLength() {
        if (this.attributeSet == null) {
            return  0;
        }
        return this.attributeSet.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AttributeSetType }
     *     
     */
    public void setAttributeSet(AttributeSetType[] values) {
        this._getAttributeSet().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.attributeSet.add(values[i]);
        }
    }

    protected List<AttributeSetType> _getAttributeSet() {
        if (attributeSet == null) {
            attributeSet = new ArrayList<AttributeSetType>();
        }
        return attributeSet;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSetType }
     *     
     */
    public AttributeSetType setAttributeSet(int idx, AttributeSetType value) {
        return this.attributeSet.set(idx, value);
    }

}
