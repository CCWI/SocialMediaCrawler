
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
 * 			Defines details about recommended names and values for custom Item Specifics.
 * 		
 * 
 * <p>Java class for RecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameRecommendation" type="{urn:ebay:apis:eBLBaseComponents}NameRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "RecommendationsType", propOrder = {
    "categoryID",
    "nameRecommendation",
    "updated",
    "any"
})
public class RecommendationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "NameRecommendation")
    protected List<NameRecommendationType> nameRecommendation;
    @XmlElement(name = "Updated")
    protected Boolean updated;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType[] getNameRecommendation() {
        if (this.nameRecommendation == null) {
            return new NameRecommendationType[ 0 ] ;
        }
        return ((NameRecommendationType[]) this.nameRecommendation.toArray(new NameRecommendationType[this.nameRecommendation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType getNameRecommendation(int idx) {
        if (this.nameRecommendation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.nameRecommendation.get(idx);
    }

    public int getNameRecommendationLength() {
        if (this.nameRecommendation == null) {
            return  0;
        }
        return this.nameRecommendation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameRecommendationType }
     *     
     */
    public void setNameRecommendation(NameRecommendationType[] values) {
        this._getNameRecommendation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.nameRecommendation.add(values[i]);
        }
    }

    protected List<NameRecommendationType> _getNameRecommendation() {
        if (nameRecommendation == null) {
            nameRecommendation = new ArrayList<NameRecommendationType>();
        }
        return nameRecommendation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType setNameRecommendation(int idx, NameRecommendationType value) {
        return this.nameRecommendation.set(idx, value);
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdated(Boolean value) {
        this.updated = value;
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
