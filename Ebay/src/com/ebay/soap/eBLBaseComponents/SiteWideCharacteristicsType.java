
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
 * 				A list of one or more characteristics sets mapped to the category, 
 * 				if any. Use this information when working with Item Specifics (Attributes) 
 * 				and Pre-filled Item Information (Catalogs) functionality.
 * 			
 * 
 * <p>Java class for SiteWideCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteWideCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsSet" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSetType" minOccurs="0"/>
 *         &lt;element name="ExcludeCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SiteWideCharacteristicsType", propOrder = {
    "characteristicsSet",
    "excludeCategoryID",
    "any"
})
public class SiteWideCharacteristicsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharacteristicsSet")
    protected CharacteristicsSetType characteristicsSet;
    @XmlElement(name = "ExcludeCategoryID")
    protected List<String> excludeCategoryID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the characteristicsSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public CharacteristicsSetType getCharacteristicsSet() {
        return characteristicsSet;
    }

    /**
     * Sets the value of the characteristicsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public void setCharacteristicsSet(CharacteristicsSetType value) {
        this.characteristicsSet = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExcludeCategoryID() {
        if (this.excludeCategoryID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.excludeCategoryID.toArray(new String[this.excludeCategoryID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExcludeCategoryID(int idx) {
        if (this.excludeCategoryID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.excludeCategoryID.get(idx);
    }

    public int getExcludeCategoryIDLength() {
        if (this.excludeCategoryID == null) {
            return  0;
        }
        return this.excludeCategoryID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExcludeCategoryID(String[] values) {
        this._getExcludeCategoryID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.excludeCategoryID.add(values[i]);
        }
    }

    protected List<String> _getExcludeCategoryID() {
        if (excludeCategoryID == null) {
            excludeCategoryID = new ArrayList<String>();
        }
        return excludeCategoryID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExcludeCategoryID(int idx, String value) {
        return this.excludeCategoryID.set(idx, value);
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
