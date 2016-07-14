
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
 * 				This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 				
 * 			
 * 
 * <p>Java class for ResponseAttributeSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseAttributeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProductFamilies" type="{urn:ebay:apis:eBLBaseComponents}ProductFamilyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductFinderConstraints" type="{urn:ebay:apis:eBLBaseComponents}ProductFinderConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TooManyMatchesFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ResponseAttributeSetType", propOrder = {
    "approximatePages",
    "attributeSetID",
    "hasMore",
    "productFamilies",
    "productFinderConstraints",
    "tooManyMatchesFound",
    "totalProducts",
    "any"
})
public class ResponseAttributeSetType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ApproximatePages")
    protected int approximatePages;
    @XmlElement(name = "AttributeSetID")
    protected int attributeSetID;
    @XmlElement(name = "HasMore")
    protected boolean hasMore;
    @XmlElement(name = "ProductFamilies")
    protected List<ProductFamilyType> productFamilies;
    @XmlElement(name = "ProductFinderConstraints")
    protected List<ProductFinderConstraintType> productFinderConstraints;
    @XmlElement(name = "TooManyMatchesFound")
    protected boolean tooManyMatchesFound;
    @XmlElement(name = "TotalProducts")
    protected int totalProducts;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the approximatePages property.
     * 
     */
    public int getApproximatePages() {
        return approximatePages;
    }

    /**
     * Sets the value of the approximatePages property.
     * 
     */
    public void setApproximatePages(int value) {
        this.approximatePages = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     */
    public int getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     */
    public void setAttributeSetID(int value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductFamilyType }
     *     
     */
    public ProductFamilyType[] getProductFamilies() {
        if (this.productFamilies == null) {
            return new ProductFamilyType[ 0 ] ;
        }
        return ((ProductFamilyType[]) this.productFamilies.toArray(new ProductFamilyType[this.productFamilies.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductFamilyType }
     *     
     */
    public ProductFamilyType getProductFamilies(int idx) {
        if (this.productFamilies == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productFamilies.get(idx);
    }

    public int getProductFamiliesLength() {
        if (this.productFamilies == null) {
            return  0;
        }
        return this.productFamilies.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductFamilyType }
     *     
     */
    public void setProductFamilies(ProductFamilyType[] values) {
        this._getProductFamilies().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productFamilies.add(values[i]);
        }
    }

    protected List<ProductFamilyType> _getProductFamilies() {
        if (productFamilies == null) {
            productFamilies = new ArrayList<ProductFamilyType>();
        }
        return productFamilies;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyType }
     *     
     */
    public ProductFamilyType setProductFamilies(int idx, ProductFamilyType value) {
        return this.productFamilies.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductFinderConstraintType }
     *     
     */
    public ProductFinderConstraintType[] getProductFinderConstraints() {
        if (this.productFinderConstraints == null) {
            return new ProductFinderConstraintType[ 0 ] ;
        }
        return ((ProductFinderConstraintType[]) this.productFinderConstraints.toArray(new ProductFinderConstraintType[this.productFinderConstraints.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductFinderConstraintType }
     *     
     */
    public ProductFinderConstraintType getProductFinderConstraints(int idx) {
        if (this.productFinderConstraints == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productFinderConstraints.get(idx);
    }

    public int getProductFinderConstraintsLength() {
        if (this.productFinderConstraints == null) {
            return  0;
        }
        return this.productFinderConstraints.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductFinderConstraintType }
     *     
     */
    public void setProductFinderConstraints(ProductFinderConstraintType[] values) {
        this._getProductFinderConstraints().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productFinderConstraints.add(values[i]);
        }
    }

    protected List<ProductFinderConstraintType> _getProductFinderConstraints() {
        if (productFinderConstraints == null) {
            productFinderConstraints = new ArrayList<ProductFinderConstraintType>();
        }
        return productFinderConstraints;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFinderConstraintType }
     *     
     */
    public ProductFinderConstraintType setProductFinderConstraints(int idx, ProductFinderConstraintType value) {
        return this.productFinderConstraints.set(idx, value);
    }

    /**
     * Gets the value of the tooManyMatchesFound property.
     * 
     */
    public boolean isTooManyMatchesFound() {
        return tooManyMatchesFound;
    }

    /**
     * Sets the value of the tooManyMatchesFound property.
     * 
     */
    public void setTooManyMatchesFound(boolean value) {
        this.tooManyMatchesFound = value;
    }

    /**
     * Gets the value of the totalProducts property.
     * 
     */
    public int getTotalProducts() {
        return totalProducts;
    }

    /**
     * Sets the value of the totalProducts property.
     * 
     */
    public void setTotalProducts(int value) {
        this.totalProducts = value;
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
