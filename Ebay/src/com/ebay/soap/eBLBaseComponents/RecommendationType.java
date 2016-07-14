
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
 * 				This type is reserved for future or internal use.
 * 			
 * 
 * <p>Java class for RecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RecommendationType", propOrder = {
    "fieldGroup",
    "fieldName",
    "recommendationCode",
    "recommendedValue",
    "message",
    "any"
})
public class RecommendationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FieldGroup")
    protected String fieldGroup;
    @XmlElement(name = "FieldName")
    protected String fieldName;
    @XmlElement(name = "RecommendationCode")
    protected String recommendationCode;
    @XmlElement(name = "RecommendedValue")
    protected List<String> recommendedValue;
    @XmlElement(name = "Message")
    protected String message;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fieldGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldGroup() {
        return fieldGroup;
    }

    /**
     * Sets the value of the fieldGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldGroup(String value) {
        this.fieldGroup = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the recommendationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationCode() {
        return recommendationCode;
    }

    /**
     * Sets the value of the recommendationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationCode(String value) {
        this.recommendationCode = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getRecommendedValue() {
        if (this.recommendedValue == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.recommendedValue.toArray(new String[this.recommendedValue.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getRecommendedValue(int idx) {
        if (this.recommendedValue == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recommendedValue.get(idx);
    }

    public int getRecommendedValueLength() {
        if (this.recommendedValue == null) {
            return  0;
        }
        return this.recommendedValue.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setRecommendedValue(String[] values) {
        this._getRecommendedValue().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recommendedValue.add(values[i]);
        }
    }

    protected List<String> _getRecommendedValue() {
        if (recommendedValue == null) {
            recommendedValue = new ArrayList<String>();
        }
        return recommendedValue;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setRecommendedValue(int idx, String value) {
        return this.recommendedValue.set(idx, value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
