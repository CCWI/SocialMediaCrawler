
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
 * 				Type defining the <b>Recommendation</b> container(s) that are
 * 				conditionally returned in all Add/Revise/Relist/Verify API calls.
 * 				Each <b>Recommendation</b> container provides a message to the seller on
 * 				how a listing can be improved or brought up to standard in regards to top-rated seller/listing requirements, mandated or recommended Item Specifics, picture quality requirements, pricing and/or listing format recommendations, recommended keywords and/or Item Specifics in a Title, and/or a recommendation to use Fast 'N Free shipping.
 * 				<br><br>
 * 				One or more <b>Recommendation</b> containers can be returned for each
 * 				listing.
 * 			
 * 
 * <p>Java class for ListingRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{urn:ebay:apis:eBLBaseComponents}MetadataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListingRecommendationType", propOrder = {
    "type",
    "group",
    "fieldName",
    "code",
    "value",
    "message",
    "metadata",
    "any"
})
public class ListingRecommendationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "FieldName")
    protected String fieldName;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Value")
    protected List<String> value;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Metadata")
    protected List<MetadataType> metadata;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getValue() {
        if (this.value == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.value.toArray(new String[this.value.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getValue(int idx) {
        if (this.value == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.value.get(idx);
    }

    public int getValueLength() {
        if (this.value == null) {
            return  0;
        }
        return this.value.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setValue(String[] values) {
        this._getValue().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.value.add(values[i]);
        }
    }

    protected List<String> _getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return value;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setValue(int idx, String value) {
        return this.value.set(idx, value);
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
     *     {@link MetadataType }
     *     
     */
    public MetadataType[] getMetadata() {
        if (this.metadata == null) {
            return new MetadataType[ 0 ] ;
        }
        return ((MetadataType[]) this.metadata.toArray(new MetadataType[this.metadata.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata(int idx) {
        if (this.metadata == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metadata.get(idx);
    }

    public int getMetadataLength() {
        if (this.metadata == null) {
            return  0;
        }
        return this.metadata.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType[] values) {
        this._getMetadata().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.metadata.add(values[i]);
        }
    }

    protected List<MetadataType> _getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetadataType>();
        }
        return metadata;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType setMetadata(int idx, MetadataType value) {
        return this.metadata.set(idx, value);
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
