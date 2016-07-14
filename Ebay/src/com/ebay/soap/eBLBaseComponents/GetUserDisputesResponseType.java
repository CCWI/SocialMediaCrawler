
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
 * 				Returns a list of disputes that involve the calling user
 * 				as buyer or seller, in response to a GetUserDisputesRequest.
 * 			
 * 
 * <p>Java class for GetUserDisputesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDisputesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="StartingDisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="EndingDisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeArray" type="{urn:ebay:apis:eBLBaseComponents}DisputeArrayType" minOccurs="0"/>
 *         &lt;element name="ItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisputeFilterCount" type="{urn:ebay:apis:eBLBaseComponents}DisputeFilterCountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserDisputesResponseType", propOrder = {
    "startingDisputeID",
    "endingDisputeID",
    "disputeArray",
    "itemsPerPage",
    "pageNumber",
    "disputeFilterCount",
    "paginationResult"
})
public class GetUserDisputesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StartingDisputeID")
    protected String startingDisputeID;
    @XmlElement(name = "EndingDisputeID")
    protected String endingDisputeID;
    @XmlElement(name = "DisputeArray")
    protected DisputeArrayType disputeArray;
    @XmlElement(name = "ItemsPerPage")
    protected Integer itemsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "DisputeFilterCount")
    protected List<DisputeFilterCountType> disputeFilterCount;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the startingDisputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingDisputeID() {
        return startingDisputeID;
    }

    /**
     * Sets the value of the startingDisputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingDisputeID(String value) {
        this.startingDisputeID = value;
    }

    /**
     * Gets the value of the endingDisputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingDisputeID() {
        return endingDisputeID;
    }

    /**
     * Sets the value of the endingDisputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingDisputeID(String value) {
        this.endingDisputeID = value;
    }

    /**
     * Gets the value of the disputeArray property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeArrayType }
     *     
     */
    public DisputeArrayType getDisputeArray() {
        return disputeArray;
    }

    /**
     * Sets the value of the disputeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeArrayType }
     *     
     */
    public void setDisputeArray(DisputeArrayType value) {
        this.disputeArray = value;
    }

    /**
     * Gets the value of the itemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DisputeFilterCountType }
     *     
     */
    public DisputeFilterCountType[] getDisputeFilterCount() {
        if (this.disputeFilterCount == null) {
            return new DisputeFilterCountType[ 0 ] ;
        }
        return ((DisputeFilterCountType[]) this.disputeFilterCount.toArray(new DisputeFilterCountType[this.disputeFilterCount.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DisputeFilterCountType }
     *     
     */
    public DisputeFilterCountType getDisputeFilterCount(int idx) {
        if (this.disputeFilterCount == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.disputeFilterCount.get(idx);
    }

    public int getDisputeFilterCountLength() {
        if (this.disputeFilterCount == null) {
            return  0;
        }
        return this.disputeFilterCount.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DisputeFilterCountType }
     *     
     */
    public void setDisputeFilterCount(DisputeFilterCountType[] values) {
        this._getDisputeFilterCount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.disputeFilterCount.add(values[i]);
        }
    }

    protected List<DisputeFilterCountType> _getDisputeFilterCount() {
        if (disputeFilterCount == null) {
            disputeFilterCount = new ArrayList<DisputeFilterCountType>();
        }
        return disputeFilterCount;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFilterCountType }
     *     
     */
    public DisputeFilterCountType setDisputeFilterCount(int idx, DisputeFilterCountType value) {
        return this.disputeFilterCount.set(idx, value);
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
