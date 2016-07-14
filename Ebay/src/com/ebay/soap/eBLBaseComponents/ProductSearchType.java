
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
 * <p>Java class for ProductSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSearchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductFinderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortAttributeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChildrenPerFamily" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchAttributes" type="{urn:ebay:apis:eBLBaseComponents}SearchAttributesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="AvailableItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharacteristicSetIDs" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicSetIDsType" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductID" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductIDType" minOccurs="0"/>
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
@XmlType(name = "ProductSearchType", propOrder = {
    "productSearchID",
    "attributeSetID",
    "productFinderID",
    "productID",
    "sortAttributeID",
    "maxChildrenPerFamily",
    "searchAttributes",
    "pagination",
    "availableItemsOnly",
    "queryKeywords",
    "characteristicSetIDs",
    "productReferenceID",
    "externalProductID",
    "any"
})
public class ProductSearchType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductSearchID")
    protected String productSearchID;
    @XmlElement(name = "AttributeSetID")
    protected int attributeSetID;
    @XmlElement(name = "ProductFinderID")
    protected Integer productFinderID;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "SortAttributeID")
    protected Integer sortAttributeID;
    @XmlElement(name = "MaxChildrenPerFamily")
    protected Integer maxChildrenPerFamily;
    @XmlElement(name = "SearchAttributes")
    protected List<SearchAttributesType> searchAttributes;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "AvailableItemsOnly")
    protected Boolean availableItemsOnly;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "CharacteristicSetIDs")
    protected CharacteristicSetIDsType characteristicSetIDs;
    @XmlElement(name = "ProductReferenceID")
    protected String productReferenceID;
    @XmlElement(name = "ExternalProductID")
    protected ExternalProductIDType externalProductID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the productSearchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSearchID() {
        return productSearchID;
    }

    /**
     * Sets the value of the productSearchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSearchID(String value) {
        this.productSearchID = value;
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
     * Gets the value of the productFinderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductFinderID() {
        return productFinderID;
    }

    /**
     * Sets the value of the productFinderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductFinderID(Integer value) {
        this.productFinderID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the sortAttributeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortAttributeID() {
        return sortAttributeID;
    }

    /**
     * Sets the value of the sortAttributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortAttributeID(Integer value) {
        this.sortAttributeID = value;
    }

    /**
     * Gets the value of the maxChildrenPerFamily property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChildrenPerFamily() {
        return maxChildrenPerFamily;
    }

    /**
     * Sets the value of the maxChildrenPerFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChildrenPerFamily(Integer value) {
        this.maxChildrenPerFamily = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SearchAttributesType }
     *     
     */
    public SearchAttributesType[] getSearchAttributes() {
        if (this.searchAttributes == null) {
            return new SearchAttributesType[ 0 ] ;
        }
        return ((SearchAttributesType[]) this.searchAttributes.toArray(new SearchAttributesType[this.searchAttributes.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SearchAttributesType }
     *     
     */
    public SearchAttributesType getSearchAttributes(int idx) {
        if (this.searchAttributes == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.searchAttributes.get(idx);
    }

    public int getSearchAttributesLength() {
        if (this.searchAttributes == null) {
            return  0;
        }
        return this.searchAttributes.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SearchAttributesType }
     *     
     */
    public void setSearchAttributes(SearchAttributesType[] values) {
        this._getSearchAttributes().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.searchAttributes.add(values[i]);
        }
    }

    protected List<SearchAttributesType> _getSearchAttributes() {
        if (searchAttributes == null) {
            searchAttributes = new ArrayList<SearchAttributesType>();
        }
        return searchAttributes;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAttributesType }
     *     
     */
    public SearchAttributesType setSearchAttributes(int idx, SearchAttributesType value) {
        return this.searchAttributes.set(idx, value);
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the availableItemsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableItemsOnly() {
        return availableItemsOnly;
    }

    /**
     * Sets the value of the availableItemsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableItemsOnly(Boolean value) {
        this.availableItemsOnly = value;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * Sets the value of the queryKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * Gets the value of the characteristicSetIDs property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicSetIDsType }
     *     
     */
    public CharacteristicSetIDsType getCharacteristicSetIDs() {
        return characteristicSetIDs;
    }

    /**
     * Sets the value of the characteristicSetIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicSetIDsType }
     *     
     */
    public void setCharacteristicSetIDs(CharacteristicSetIDsType value) {
        this.characteristicSetIDs = value;
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReferenceID(String value) {
        this.productReferenceID = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductIDType }
     *     
     */
    public ExternalProductIDType getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductIDType }
     *     
     */
    public void setExternalProductID(ExternalProductIDType value) {
        this.externalProductID = value;
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
