
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
 * 				This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 * 				
 * 			
 * 
 * <p>Java class for CharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{urn:ebay:apis:eBLBaseComponents}LabelType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="ValueList" type="{urn:ebay:apis:eBLBaseComponents}ValType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CharacteristicType", propOrder = {
    "attributeID",
    "dateFormat",
    "displaySequence",
    "displayUOM",
    "label",
    "sortOrder",
    "valueList",
    "any"
})
public class CharacteristicType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeID")
    protected int attributeID;
    @XmlElement(name = "DateFormat")
    protected String dateFormat;
    @XmlElement(name = "DisplaySequence")
    protected String displaySequence;
    @XmlElement(name = "DisplayUOM")
    protected String displayUOM;
    @XmlElement(name = "Label")
    protected LabelType label;
    @XmlElement(name = "SortOrder")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "ValueList")
    protected List<ValType> valueList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the attributeID property.
     * 
     */
    public int getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     */
    public void setAttributeID(int value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySequence(String value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the displayUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUOM() {
        return displayUOM;
    }

    /**
     * Sets the value of the displayUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUOM(String value) {
        this.displayUOM = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType }
     *     
     */
    public LabelType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType }
     *     
     */
    public void setLabel(LabelType value) {
        this.label = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ValType }
     *     
     */
    public ValType[] getValueList() {
        if (this.valueList == null) {
            return new ValType[ 0 ] ;
        }
        return ((ValType[]) this.valueList.toArray(new ValType[this.valueList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ValType }
     *     
     */
    public ValType getValueList(int idx) {
        if (this.valueList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.valueList.get(idx);
    }

    public int getValueListLength() {
        if (this.valueList == null) {
            return  0;
        }
        return this.valueList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ValType }
     *     
     */
    public void setValueList(ValType[] values) {
        this._getValueList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.valueList.add(values[i]);
        }
    }

    protected List<ValType> _getValueList() {
        if (valueList == null) {
            valueList = new ArrayList<ValType>();
        }
        return valueList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ValType }
     *     
     */
    public ValType setValueList(int idx, ValType value) {
        return this.valueList.set(idx, value);
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
