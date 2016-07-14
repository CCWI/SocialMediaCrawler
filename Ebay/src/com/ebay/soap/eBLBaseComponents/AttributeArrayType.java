
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
 * 				This type defines the <b>AttributeArray</b> container, which is used by the
 * 				seller to specify one or more attribute values for a Half.com item.
 * 			
 * 
 * <p>Java class for AttributeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribute" type="{urn:ebay:apis:eBLBaseComponents}AttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeArrayType", propOrder = {
    "attribute"
})
public class AttributeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Attribute")
    protected List<AttributeType> attribute;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AttributeType }
     *     
     */
    public AttributeType[] getAttribute() {
        if (this.attribute == null) {
            return new AttributeType[ 0 ] ;
        }
        return ((AttributeType[]) this.attribute.toArray(new AttributeType[this.attribute.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AttributeType }
     *     
     */
    public AttributeType getAttribute(int idx) {
        if (this.attribute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.attribute.get(idx);
    }

    public int getAttributeLength() {
        if (this.attribute == null) {
            return  0;
        }
        return this.attribute.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AttributeType }
     *     
     */
    public void setAttribute(AttributeType[] values) {
        this._getAttribute().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.attribute.add(values[i]);
        }
    }

    protected List<AttributeType> _getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeType>();
        }
        return attribute;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType setAttribute(int idx, AttributeType value) {
        return this.attribute.set(idx, value);
    }

}
