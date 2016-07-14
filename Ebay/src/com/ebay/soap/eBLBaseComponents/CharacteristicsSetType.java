
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
 * 				No longer applicable to any category.
 * 			
 * 
 * <p>Java class for CharacteristicsSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicsSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttributeSetVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Characteristics" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CharacteristicsSetType", propOrder = {
    "name",
    "attributeSetID",
    "attributeSetVersion",
    "characteristics",
    "any"
})
public class CharacteristicsSetType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AttributeSetID")
    protected Integer attributeSetID;
    @XmlElement(name = "AttributeSetVersion")
    protected String attributeSetVersion;
    @XmlElement(name = "Characteristics")
    protected List<CharacteristicType> characteristics;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeSetID(Integer value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the attributeSetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeSetVersion() {
        return attributeSetVersion;
    }

    /**
     * Sets the value of the attributeSetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeSetVersion(String value) {
        this.attributeSetVersion = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType[] getCharacteristics() {
        if (this.characteristics == null) {
            return new CharacteristicType[ 0 ] ;
        }
        return ((CharacteristicType[]) this.characteristics.toArray(new CharacteristicType[this.characteristics.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType getCharacteristics(int idx) {
        if (this.characteristics == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.characteristics.get(idx);
    }

    public int getCharacteristicsLength() {
        if (this.characteristics == null) {
            return  0;
        }
        return this.characteristics.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharacteristicType }
     *     
     */
    public void setCharacteristics(CharacteristicType[] values) {
        this._getCharacteristics().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.characteristics.add(values[i]);
        }
    }

    protected List<CharacteristicType> _getCharacteristics() {
        if (characteristics == null) {
            characteristics = new ArrayList<CharacteristicType>();
        }
        return characteristics;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType setCharacteristics(int idx, CharacteristicType value) {
        return this.characteristics.set(idx, value);
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
