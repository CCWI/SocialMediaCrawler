
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
 * 	  		Store font set.
 * 	  	
 * 
 * <p>Java class for StoreFontType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreFontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="NameSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="NameColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="TitleSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="TitleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="DescSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="DescColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "StoreFontType", propOrder = {
    "nameFace",
    "nameSize",
    "nameColor",
    "titleFace",
    "titleSize",
    "titleColor",
    "descFace",
    "descSize",
    "descColor",
    "any"
})
public class StoreFontType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "NameFace")
    protected StoreFontFaceCodeType nameFace;
    @XmlElement(name = "NameSize")
    protected StoreFontSizeCodeType nameSize;
    @XmlElement(name = "NameColor")
    protected String nameColor;
    @XmlElement(name = "TitleFace")
    protected StoreFontFaceCodeType titleFace;
    @XmlElement(name = "TitleSize")
    protected StoreFontSizeCodeType titleSize;
    @XmlElement(name = "TitleColor")
    protected String titleColor;
    @XmlElement(name = "DescFace")
    protected StoreFontFaceCodeType descFace;
    @XmlElement(name = "DescSize")
    protected StoreFontSizeCodeType descSize;
    @XmlElement(name = "DescColor")
    protected String descColor;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the nameFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getNameFace() {
        return nameFace;
    }

    /**
     * Sets the value of the nameFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setNameFace(StoreFontFaceCodeType value) {
        this.nameFace = value;
    }

    /**
     * Gets the value of the nameSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getNameSize() {
        return nameSize;
    }

    /**
     * Sets the value of the nameSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setNameSize(StoreFontSizeCodeType value) {
        this.nameSize = value;
    }

    /**
     * Gets the value of the nameColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameColor() {
        return nameColor;
    }

    /**
     * Sets the value of the nameColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameColor(String value) {
        this.nameColor = value;
    }

    /**
     * Gets the value of the titleFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getTitleFace() {
        return titleFace;
    }

    /**
     * Sets the value of the titleFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setTitleFace(StoreFontFaceCodeType value) {
        this.titleFace = value;
    }

    /**
     * Gets the value of the titleSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setTitleSize(StoreFontSizeCodeType value) {
        this.titleSize = value;
    }

    /**
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
    }

    /**
     * Gets the value of the descFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getDescFace() {
        return descFace;
    }

    /**
     * Sets the value of the descFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setDescFace(StoreFontFaceCodeType value) {
        this.descFace = value;
    }

    /**
     * Gets the value of the descSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getDescSize() {
        return descSize;
    }

    /**
     * Sets the value of the descSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setDescSize(StoreFontSizeCodeType value) {
        this.descSize = value;
    }

    /**
     * Gets the value of the descColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescColor() {
        return descColor;
    }

    /**
     * Sets the value of the descColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescColor(String value) {
        this.descColor = value;
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
