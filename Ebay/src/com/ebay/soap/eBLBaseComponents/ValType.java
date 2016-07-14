
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
 * <p>Java class for ValType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueLiteral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedValueLiteral" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ValType", propOrder = {
    "valueLiteral",
    "suggestedValueLiteral",
    "valueID",
    "any"
})
public class ValType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ValueLiteral")
    protected String valueLiteral;
    @XmlElement(name = "SuggestedValueLiteral")
    protected List<String> suggestedValueLiteral;
    @XmlElement(name = "ValueID")
    protected Integer valueID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the valueLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueLiteral() {
        return valueLiteral;
    }

    /**
     * Sets the value of the valueLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueLiteral(String value) {
        this.valueLiteral = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getSuggestedValueLiteral() {
        if (this.suggestedValueLiteral == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.suggestedValueLiteral.toArray(new String[this.suggestedValueLiteral.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getSuggestedValueLiteral(int idx) {
        if (this.suggestedValueLiteral == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.suggestedValueLiteral.get(idx);
    }

    public int getSuggestedValueLiteralLength() {
        if (this.suggestedValueLiteral == null) {
            return  0;
        }
        return this.suggestedValueLiteral.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setSuggestedValueLiteral(String[] values) {
        this._getSuggestedValueLiteral().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.suggestedValueLiteral.add(values[i]);
        }
    }

    protected List<String> _getSuggestedValueLiteral() {
        if (suggestedValueLiteral == null) {
            suggestedValueLiteral = new ArrayList<String>();
        }
        return suggestedValueLiteral;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setSuggestedValueLiteral(int idx, String value) {
        return this.suggestedValueLiteral.set(idx, value);
    }

    /**
     * Gets the value of the valueID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueID() {
        return valueID;
    }

    /**
     * Sets the value of the valueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueID(Integer value) {
        this.valueID = value;
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
