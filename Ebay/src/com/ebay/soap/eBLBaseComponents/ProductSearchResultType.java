
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
 * <p>Java class for ProductSearchResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumProducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSet" type="{urn:ebay:apis:eBLBaseComponents}ResponseAttributeSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ProductSearchResultType", propOrder = {
    "id",
    "numProducts",
    "attributeSet",
    "displayStockPhotos",
    "any"
})
public class ProductSearchResultType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "NumProducts")
    protected String numProducts;
    @XmlElement(name = "AttributeSet")
    protected List<ResponseAttributeSetType> attributeSet;
    @XmlElement(name = "DisplayStockPhotos")
    protected Boolean displayStockPhotos;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the numProducts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProducts() {
        return numProducts;
    }

    /**
     * Sets the value of the numProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProducts(String value) {
        this.numProducts = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ResponseAttributeSetType }
     *     
     */
    public ResponseAttributeSetType[] getAttributeSet() {
        if (this.attributeSet == null) {
            return new ResponseAttributeSetType[ 0 ] ;
        }
        return ((ResponseAttributeSetType[]) this.attributeSet.toArray(new ResponseAttributeSetType[this.attributeSet.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ResponseAttributeSetType }
     *     
     */
    public ResponseAttributeSetType getAttributeSet(int idx) {
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
     *     {@link ResponseAttributeSetType }
     *     
     */
    public void setAttributeSet(ResponseAttributeSetType[] values) {
        this._getAttributeSet().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.attributeSet.add(values[i]);
        }
    }

    protected List<ResponseAttributeSetType> _getAttributeSet() {
        if (attributeSet == null) {
            attributeSet = new ArrayList<ResponseAttributeSetType>();
        }
        return attributeSet;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAttributeSetType }
     *     
     */
    public ResponseAttributeSetType setAttributeSet(int idx, ResponseAttributeSetType value) {
        return this.attributeSet.set(idx, value);
    }

    /**
     * Gets the value of the displayStockPhotos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayStockPhotos() {
        return displayStockPhotos;
    }

    /**
     * Sets the value of the displayStockPhotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayStockPhotos(Boolean value) {
        this.displayStockPhotos = value;
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
