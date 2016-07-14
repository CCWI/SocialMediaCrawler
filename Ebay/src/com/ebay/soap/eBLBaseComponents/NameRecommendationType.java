
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			Defines details about recommended names and values for custom Item Specifics.
 * 		
 * 
 * <p>Java class for NameRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationRules" type="{urn:ebay:apis:eBLBaseComponents}RecommendationValidationRulesType" minOccurs="0"/>
 *         &lt;element name="ValueRecommendation" type="{urn:ebay:apis:eBLBaseComponents}ValueRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HelpURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificSourceCodeType" minOccurs="0"/>
 *         &lt;element name="HelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "NameRecommendationType", propOrder = {
    "name",
    "validationRules",
    "valueRecommendation",
    "helpURL",
    "source",
    "helpText",
    "any"
})
public class NameRecommendationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ValidationRules")
    protected RecommendationValidationRulesType validationRules;
    @XmlElement(name = "ValueRecommendation")
    protected List<ValueRecommendationType> valueRecommendation;
    @XmlElement(name = "HelpURL")
    @XmlSchemaType(name = "anyURI")
    protected String helpURL;
    @XmlElement(name = "Source")
    protected ItemSpecificSourceCodeType source;
    @XmlElement(name = "HelpText")
    protected String helpText;
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
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationValidationRulesType }
     *     
     */
    public RecommendationValidationRulesType getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationValidationRulesType }
     *     
     */
    public void setValidationRules(RecommendationValidationRulesType value) {
        this.validationRules = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ValueRecommendationType }
     *     
     */
    public ValueRecommendationType[] getValueRecommendation() {
        if (this.valueRecommendation == null) {
            return new ValueRecommendationType[ 0 ] ;
        }
        return ((ValueRecommendationType[]) this.valueRecommendation.toArray(new ValueRecommendationType[this.valueRecommendation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ValueRecommendationType }
     *     
     */
    public ValueRecommendationType getValueRecommendation(int idx) {
        if (this.valueRecommendation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.valueRecommendation.get(idx);
    }

    public int getValueRecommendationLength() {
        if (this.valueRecommendation == null) {
            return  0;
        }
        return this.valueRecommendation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ValueRecommendationType }
     *     
     */
    public void setValueRecommendation(ValueRecommendationType[] values) {
        this._getValueRecommendation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.valueRecommendation.add(values[i]);
        }
    }

    protected List<ValueRecommendationType> _getValueRecommendation() {
        if (valueRecommendation == null) {
            valueRecommendation = new ArrayList<ValueRecommendationType>();
        }
        return valueRecommendation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ValueRecommendationType }
     *     
     */
    public ValueRecommendationType setValueRecommendation(int idx, ValueRecommendationType value) {
        return this.valueRecommendation.set(idx, value);
    }

    /**
     * Gets the value of the helpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURL() {
        return helpURL;
    }

    /**
     * Sets the value of the helpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURL(String value) {
        this.helpURL = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSpecificSourceCodeType }
     *     
     */
    public ItemSpecificSourceCodeType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificSourceCodeType }
     *     
     */
    public void setSource(ItemSpecificSourceCodeType value) {
        this.source = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
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
