
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
 * 				Set of eBay Store color schemes.
 * 			
 * 
 * <p>Java class for StoreColorSchemeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreColorSchemeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorScheme" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreColorSchemeArrayType", propOrder = {
    "colorScheme"
})
public class StoreColorSchemeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ColorScheme")
    protected List<StoreColorSchemeType> colorScheme;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreColorSchemeType }
     *     
     */
    public StoreColorSchemeType[] getColorScheme() {
        if (this.colorScheme == null) {
            return new StoreColorSchemeType[ 0 ] ;
        }
        return ((StoreColorSchemeType[]) this.colorScheme.toArray(new StoreColorSchemeType[this.colorScheme.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreColorSchemeType }
     *     
     */
    public StoreColorSchemeType getColorScheme(int idx) {
        if (this.colorScheme == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.colorScheme.get(idx);
    }

    public int getColorSchemeLength() {
        if (this.colorScheme == null) {
            return  0;
        }
        return this.colorScheme.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreColorSchemeType }
     *     
     */
    public void setColorScheme(StoreColorSchemeType[] values) {
        this._getColorScheme().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.colorScheme.add(values[i]);
        }
    }

    protected List<StoreColorSchemeType> _getColorScheme() {
        if (colorScheme == null) {
            colorScheme = new ArrayList<StoreColorSchemeType>();
        }
        return colorScheme;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreColorSchemeType }
     *     
     */
    public StoreColorSchemeType setColorScheme(int idx, StoreColorSchemeType value) {
        return this.colorScheme.set(idx, value);
    }

}
