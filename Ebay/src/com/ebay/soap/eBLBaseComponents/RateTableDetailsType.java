
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
 * 			   This type contains fields to specify the shipping rate tables that are to be applied to a listing. Shipping rate tables enable sellers to tailor the flat shipping rates offered for an item to fit the shipping destination. They can specify a base rate for a large region, then define alternative rates or surcharges for shipping to other (extended) regions within the larger region.
 *    			<br><br>
 * 				Prerequisites for applying shipping rate tables:
 * 				<ul>
 * 				<li>The shipping type for the listing must be Flat. </li>
 * 				<li>The seller must have previously configured a shipping rate table in My eBay site preferences. </li>
 * 				</ul>
 *             This container is returned from the GetItem family of calls only for the seller who listed the item.
 *    			<br><br>
 * 				You can find more information about using shipping rate tables in the Shipping chapter of the Trading API User's Guide.
 * 			
 * 
 * <p>Java class for RateTableDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTableDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RateTableDetailsType", propOrder = {
    "domesticRateTable",
    "internationalRateTable",
    "any"
})
public class RateTableDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticRateTable")
    protected String domesticRateTable;
    @XmlElement(name = "InternationalRateTable")
    protected String internationalRateTable;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the domesticRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticRateTable() {
        return domesticRateTable;
    }

    /**
     * Sets the value of the domesticRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticRateTable(String value) {
        this.domesticRateTable = value;
    }

    /**
     * Gets the value of the internationalRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRateTable() {
        return internationalRateTable;
    }

    /**
     * Sets the value of the internationalRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRateTable(String value) {
        this.internationalRateTable = value;
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
