
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
 * 				Defines rules for recommended Item Specifics. The rules apply when 
 * 				the Item Specific is subsequently used in AddItem and related calls.
 * 			
 * 
 * <p>Java class for RecommendationValidationRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationValidationRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueType" type="{urn:ebay:apis:eBLBaseComponents}ValueTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MinValues" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValues" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectionMode" type="{urn:ebay:apis:eBLBaseComponents}SelectionModeCodeType" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{urn:ebay:apis:eBLBaseComponents}NameValueRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationPicture" type="{urn:ebay:apis:eBLBaseComponents}VariationPictureRuleCodeType" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}VariationSpecificsRuleCodeType" minOccurs="0"/>
 *         &lt;element name="ValueFormat" type="{urn:ebay:apis:eBLBaseComponents}ValueFormatCodeType" minOccurs="0"/>
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
@XmlType(name = "RecommendationValidationRulesType", propOrder = {
    "valueType",
    "minValues",
    "maxValues",
    "selectionMode",
    "confidence",
    "relationship",
    "variationPicture",
    "variationSpecifics",
    "valueFormat",
    "any"
})
public class RecommendationValidationRulesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ValueType")
    protected ValueTypeCodeType valueType;
    @XmlElement(name = "MinValues")
    protected Integer minValues;
    @XmlElement(name = "MaxValues")
    protected Integer maxValues;
    @XmlElement(name = "SelectionMode")
    protected SelectionModeCodeType selectionMode;
    @XmlElement(name = "Confidence")
    protected Integer confidence;
    @XmlElement(name = "Relationship")
    protected List<NameValueRelationshipType> relationship;
    @XmlElement(name = "VariationPicture")
    protected VariationPictureRuleCodeType variationPicture;
    @XmlElement(name = "VariationSpecifics")
    protected VariationSpecificsRuleCodeType variationSpecifics;
    @XmlElement(name = "ValueFormat")
    protected ValueFormatCodeType valueFormat;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public ValueTypeCodeType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public void setValueType(ValueTypeCodeType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the minValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinValues() {
        return minValues;
    }

    /**
     * Sets the value of the minValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinValues(Integer value) {
        this.minValues = value;
    }

    /**
     * Gets the value of the maxValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValues() {
        return maxValues;
    }

    /**
     * Sets the value of the maxValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValues(Integer value) {
        this.maxValues = value;
    }

    /**
     * Gets the value of the selectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionModeCodeType }
     *     
     */
    public SelectionModeCodeType getSelectionMode() {
        return selectionMode;
    }

    /**
     * Sets the value of the selectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionModeCodeType }
     *     
     */
    public void setSelectionMode(SelectionModeCodeType value) {
        this.selectionMode = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidence(Integer value) {
        this.confidence = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameValueRelationshipType }
     *     
     */
    public NameValueRelationshipType[] getRelationship() {
        if (this.relationship == null) {
            return new NameValueRelationshipType[ 0 ] ;
        }
        return ((NameValueRelationshipType[]) this.relationship.toArray(new NameValueRelationshipType[this.relationship.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameValueRelationshipType }
     *     
     */
    public NameValueRelationshipType getRelationship(int idx) {
        if (this.relationship == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.relationship.get(idx);
    }

    public int getRelationshipLength() {
        if (this.relationship == null) {
            return  0;
        }
        return this.relationship.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameValueRelationshipType }
     *     
     */
    public void setRelationship(NameValueRelationshipType[] values) {
        this._getRelationship().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.relationship.add(values[i]);
        }
    }

    protected List<NameValueRelationshipType> _getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<NameValueRelationshipType>();
        }
        return relationship;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueRelationshipType }
     *     
     */
    public NameValueRelationshipType setRelationship(int idx, NameValueRelationshipType value) {
        return this.relationship.set(idx, value);
    }

    /**
     * Gets the value of the variationPicture property.
     * 
     * @return
     *     possible object is
     *     {@link VariationPictureRuleCodeType }
     *     
     */
    public VariationPictureRuleCodeType getVariationPicture() {
        return variationPicture;
    }

    /**
     * Sets the value of the variationPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationPictureRuleCodeType }
     *     
     */
    public void setVariationPicture(VariationPictureRuleCodeType value) {
        this.variationPicture = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link VariationSpecificsRuleCodeType }
     *     
     */
    public VariationSpecificsRuleCodeType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationSpecificsRuleCodeType }
     *     
     */
    public void setVariationSpecifics(VariationSpecificsRuleCodeType value) {
        this.variationSpecifics = value;
    }

    /**
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ValueFormatCodeType }
     *     
     */
    public ValueFormatCodeType getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueFormatCodeType }
     *     
     */
    public void setValueFormat(ValueFormatCodeType value) {
        this.valueFormat = value;
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
