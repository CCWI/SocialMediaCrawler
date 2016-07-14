
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
 * 				This type is deprecated as the call is no longer available.
 * 				
 * 			
 * 
 * <p>Java class for GetProductFinderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductFinderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductFinderID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductFinderRequestType", propOrder = {
    "attributeSystemVersion",
    "productFinderID"
})
public class GetProductFinderRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;
    @XmlElement(name = "ProductFinderID", type = Integer.class)
    protected List<Integer> productFinderID;

    /**
     * Gets the value of the attributeSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeSystemVersion() {
        return attributeSystemVersion;
    }

    /**
     * Sets the value of the attributeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeSystemVersion(String value) {
        this.attributeSystemVersion = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getProductFinderID() {
        if (this.productFinderID == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.productFinderID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.productFinderID.get(__i).intValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Integer }
     *     
     */
    public int getProductFinderID(int idx) {
        if (this.productFinderID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productFinderID.get(idx).intValue();
    }

    public int getProductFinderIDLength() {
        if (this.productFinderID == null) {
            return  0;
        }
        return this.productFinderID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setProductFinderID(int[] values) {
        this._getProductFinderID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productFinderID.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getProductFinderID() {
        if (productFinderID == null) {
            productFinderID = new ArrayList<Integer>();
        }
        return productFinderID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setProductFinderID(int idx, int value) {
        return this.productFinderID.set(idx, new Integer(value)).intValue();
    }

}
