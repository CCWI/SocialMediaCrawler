
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
 * 				This type is deprecated because attributes are deprecated.
 * 				
 * 			
 * 
 * <p>Java class for LookupAttributeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupAttributeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookupAttribute" type="{urn:ebay:apis:eBLBaseComponents}LookupAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupAttributeArrayType", propOrder = {
    "lookupAttribute"
})
public class LookupAttributeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "LookupAttribute")
    protected List<LookupAttributeType> lookupAttribute;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link LookupAttributeType }
     *     
     */
    public LookupAttributeType[] getLookupAttribute() {
        if (this.lookupAttribute == null) {
            return new LookupAttributeType[ 0 ] ;
        }
        return ((LookupAttributeType[]) this.lookupAttribute.toArray(new LookupAttributeType[this.lookupAttribute.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link LookupAttributeType }
     *     
     */
    public LookupAttributeType getLookupAttribute(int idx) {
        if (this.lookupAttribute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.lookupAttribute.get(idx);
    }

    public int getLookupAttributeLength() {
        if (this.lookupAttribute == null) {
            return  0;
        }
        return this.lookupAttribute.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link LookupAttributeType }
     *     
     */
    public void setLookupAttribute(LookupAttributeType[] values) {
        this._getLookupAttribute().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.lookupAttribute.add(values[i]);
        }
    }

    protected List<LookupAttributeType> _getLookupAttribute() {
        if (lookupAttribute == null) {
            lookupAttribute = new ArrayList<LookupAttributeType>();
        }
        return lookupAttribute;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link LookupAttributeType }
     *     
     */
    public LookupAttributeType setLookupAttribute(int idx, LookupAttributeType value) {
        return this.lookupAttribute.set(idx, value);
    }

}
