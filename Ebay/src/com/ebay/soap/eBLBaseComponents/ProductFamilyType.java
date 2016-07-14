
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 				
 * 			
 * 
 * <p>Java class for ProductFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentProduct" type="{urn:ebay:apis:eBLBaseComponents}ProductType" minOccurs="0"/>
 *         &lt;element name="FamilyMembers" type="{urn:ebay:apis:eBLBaseComponents}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasMoreChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFamilyType", propOrder = {
    "parentProduct",
    "familyMembers",
    "any"
})
public class ProductFamilyType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ParentProduct")
    protected ProductType parentProduct;
    @XmlElement(name = "FamilyMembers")
    protected List<ProductType> familyMembers;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute
    protected Boolean hasMoreChildren;

    /**
     * Gets the value of the parentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getParentProduct() {
        return parentProduct;
    }

    /**
     * Sets the value of the parentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setParentProduct(ProductType value) {
        this.parentProduct = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductType }
     *     
     */
    public ProductType[] getFamilyMembers() {
        if (this.familyMembers == null) {
            return new ProductType[ 0 ] ;
        }
        return ((ProductType[]) this.familyMembers.toArray(new ProductType[this.familyMembers.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductType }
     *     
     */
    public ProductType getFamilyMembers(int idx) {
        if (this.familyMembers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.familyMembers.get(idx);
    }

    public int getFamilyMembersLength() {
        if (this.familyMembers == null) {
            return  0;
        }
        return this.familyMembers.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductType }
     *     
     */
    public void setFamilyMembers(ProductType[] values) {
        this._getFamilyMembers().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.familyMembers.add(values[i]);
        }
    }

    protected List<ProductType> _getFamilyMembers() {
        if (familyMembers == null) {
            familyMembers = new ArrayList<ProductType>();
        }
        return familyMembers;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public ProductType setFamilyMembers(int idx, ProductType value) {
        return this.familyMembers.set(idx, value);
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

    /**
     * Gets the value of the hasMoreChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreChildren() {
        return hasMoreChildren;
    }

    /**
     * Sets the value of the hasMoreChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreChildren(Boolean value) {
        this.hasMoreChildren = value;
    }

}
