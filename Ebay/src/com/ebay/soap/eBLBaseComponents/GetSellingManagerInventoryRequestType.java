
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
 * 	      Retrieves a paginated list containing details of a user's Selling Manager inventory.
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 	    
 * 
 * <p>Java class for GetSellingManagerInventoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerInventoryRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductSortCodeType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="Search" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSearchType" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Filter" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerInventoryPropertyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerInventoryRequestType", propOrder = {
    "sort",
    "folderID",
    "pagination",
    "sortOrder",
    "search",
    "storeCategoryID",
    "filter"
})
public class GetSellingManagerInventoryRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Sort")
    protected SellingManagerProductSortCodeType sort;
    @XmlElement(name = "FolderID")
    protected Long folderID;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "SortOrder")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "Search")
    protected SellingManagerSearchType search;
    @XmlElement(name = "StoreCategoryID")
    protected Long storeCategoryID;
    @XmlElement(name = "Filter")
    protected List<SellingManagerInventoryPropertyTypeCodeType> filter;

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductSortCodeType }
     *     
     */
    public SellingManagerProductSortCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductSortCodeType }
     *     
     */
    public void setSort(SellingManagerProductSortCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
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
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSearchType }
     *     
     */
    public SellingManagerSearchType getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSearchType }
     *     
     */
    public void setSearch(SellingManagerSearchType value) {
        this.search = value;
    }

    /**
     * Gets the value of the storeCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreCategoryID(Long value) {
        this.storeCategoryID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public SellingManagerInventoryPropertyTypeCodeType[] getFilter() {
        if (this.filter == null) {
            return new SellingManagerInventoryPropertyTypeCodeType[ 0 ] ;
        }
        return ((SellingManagerInventoryPropertyTypeCodeType[]) this.filter.toArray(new SellingManagerInventoryPropertyTypeCodeType[this.filter.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public SellingManagerInventoryPropertyTypeCodeType getFilter(int idx) {
        if (this.filter == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.filter.get(idx);
    }

    public int getFilterLength() {
        if (this.filter == null) {
            return  0;
        }
        return this.filter.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public void setFilter(SellingManagerInventoryPropertyTypeCodeType[] values) {
        this._getFilter().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.filter.add(values[i]);
        }
    }

    protected List<SellingManagerInventoryPropertyTypeCodeType> _getFilter() {
        if (filter == null) {
            filter = new ArrayList<SellingManagerInventoryPropertyTypeCodeType>();
        }
        return filter;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public SellingManagerInventoryPropertyTypeCodeType setFilter(int idx, SellingManagerInventoryPropertyTypeCodeType value) {
        return this.filter.set(idx, value);
    }

}
