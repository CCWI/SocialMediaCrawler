
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
 * 				Returns a Selling Manager user's sold listings. Response can be filtered by date, search
 * 				values, and stores.
 * 			
 * 
 * <p>Java class for GetSellingManagerSoldListingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerSoldListingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SaleRecord" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldOrderType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetSellingManagerSoldListingsResponseType", propOrder = {
    "saleRecord",
    "paginationResult"
})
public class GetSellingManagerSoldListingsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SaleRecord")
    protected List<SellingManagerSoldOrderType> saleRecord;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public SellingManagerSoldOrderType[] getSaleRecord() {
        if (this.saleRecord == null) {
            return new SellingManagerSoldOrderType[ 0 ] ;
        }
        return ((SellingManagerSoldOrderType[]) this.saleRecord.toArray(new SellingManagerSoldOrderType[this.saleRecord.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public SellingManagerSoldOrderType getSaleRecord(int idx) {
        if (this.saleRecord == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.saleRecord.get(idx);
    }

    public int getSaleRecordLength() {
        if (this.saleRecord == null) {
            return  0;
        }
        return this.saleRecord.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public void setSaleRecord(SellingManagerSoldOrderType[] values) {
        this._getSaleRecord().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.saleRecord.add(values[i]);
        }
    }

    protected List<SellingManagerSoldOrderType> _getSaleRecord() {
        if (saleRecord == null) {
            saleRecord = new ArrayList<SellingManagerSoldOrderType>();
        }
        return saleRecord;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public SellingManagerSoldOrderType setSaleRecord(int idx, SellingManagerSoldOrderType value) {
        return this.saleRecord.set(idx, value);
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
