
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
 * 				Set of Store themes.
 * 			
 * 
 * <p>Java class for StoreThemeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreThemeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Theme" type="{urn:ebay:apis:eBLBaseComponents}StoreThemeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenericColorSchemeArray" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeArrayType" minOccurs="0"/>
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
@XmlType(name = "StoreThemeArrayType", propOrder = {
    "theme",
    "genericColorSchemeArray",
    "any"
})
public class StoreThemeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Theme")
    protected List<StoreThemeType> theme;
    @XmlElement(name = "GenericColorSchemeArray")
    protected StoreColorSchemeArrayType genericColorSchemeArray;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreThemeType }
     *     
     */
    public StoreThemeType[] getTheme() {
        if (this.theme == null) {
            return new StoreThemeType[ 0 ] ;
        }
        return ((StoreThemeType[]) this.theme.toArray(new StoreThemeType[this.theme.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreThemeType }
     *     
     */
    public StoreThemeType getTheme(int idx) {
        if (this.theme == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.theme.get(idx);
    }

    public int getThemeLength() {
        if (this.theme == null) {
            return  0;
        }
        return this.theme.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreThemeType }
     *     
     */
    public void setTheme(StoreThemeType[] values) {
        this._getTheme().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.theme.add(values[i]);
        }
    }

    protected List<StoreThemeType> _getTheme() {
        if (theme == null) {
            theme = new ArrayList<StoreThemeType>();
        }
        return theme;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreThemeType }
     *     
     */
    public StoreThemeType setTheme(int idx, StoreThemeType value) {
        return this.theme.set(idx, value);
    }

    /**
     * Gets the value of the genericColorSchemeArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreColorSchemeArrayType }
     *     
     */
    public StoreColorSchemeArrayType getGenericColorSchemeArray() {
        return genericColorSchemeArray;
    }

    /**
     * Sets the value of the genericColorSchemeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreColorSchemeArrayType }
     *     
     */
    public void setGenericColorSchemeArray(StoreColorSchemeArrayType value) {
        this.genericColorSchemeArray = value;
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
