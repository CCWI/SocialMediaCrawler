
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
 * 			  Returns a Selling Manager user's sold listings.
 * 				<br><br>
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 			
 * 
 * <p>Java class for GetSellingManagerSoldListingsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerSoldListingsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Search" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSearchType" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Filter" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldListingsPropertyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Archived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldListingsSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="SaleDateRange" type="{urn:ebay:apis:eBLBaseComponents}TimeRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerSoldListingsRequestType", propOrder = {
    "search",
    "storeCategoryID",
    "filter",
    "archived",
    "sort",
    "sortOrder",
    "pagination",
    "saleDateRange"
})
public class GetSellingManagerSoldListingsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Search")
    protected SellingManagerSearchType search;
    @XmlElement(name = "StoreCategoryID")
    protected Long storeCategoryID;
    @XmlElement(name = "Filter")
    protected List<SellingManagerSoldListingsPropertyTypeCodeType> filter;
    @XmlElement(name = "Archived")
    protected Boolean archived;
    @XmlElement(name = "Sort")
    protected SellingManagerSoldListingsSortTypeCodeType sort;
    @XmlElement(name = "SortOrder")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "SaleDateRange")
    protected TimeRangeType saleDateRange;

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
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsPropertyTypeCodeType[] getFilter() {
        if (this.filter == null) {
            return new SellingManagerSoldListingsPropertyTypeCodeType[ 0 ] ;
        }
        return ((SellingManagerSoldListingsPropertyTypeCodeType[]) this.filter.toArray(new SellingManagerSoldListingsPropertyTypeCodeType[this.filter.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsPropertyTypeCodeType getFilter(int idx) {
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
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public void setFilter(SellingManagerSoldListingsPropertyTypeCodeType[] values) {
        this._getFilter().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.filter.add(values[i]);
        }
    }

    protected List<SellingManagerSoldListingsPropertyTypeCodeType> _getFilter() {
        if (filter == null) {
            filter = new ArrayList<SellingManagerSoldListingsPropertyTypeCodeType>();
        }
        return filter;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsPropertyTypeCodeType setFilter(int idx, SellingManagerSoldListingsPropertyTypeCodeType value) {
        return this.filter.set(idx, value);
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSoldListingsSortTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsSortTypeCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldListingsSortTypeCodeType }
     *     
     */
    public void setSort(SellingManagerSoldListingsSortTypeCodeType value) {
        this.sort = value;
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
     * Gets the value of the saleDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRangeType }
     *     
     */
    public TimeRangeType getSaleDateRange() {
        return saleDateRange;
    }

    /**
     * Sets the value of the saleDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRangeType }
     *     
     */
    public void setSaleDateRange(TimeRangeType value) {
        this.saleDateRange = value;
    }

}
