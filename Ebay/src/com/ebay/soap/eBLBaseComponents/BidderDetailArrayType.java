
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
 * 				A collection of Bidder Detail.
 * 			
 * 
 * <p>Java class for BidderDetailArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidderDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidderDetail" type="{urn:ebay:apis:eBLBaseComponents}BidderDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidderDetailArrayType", propOrder = {
    "bidderDetail"
})
public class BidderDetailArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidderDetail")
    protected List<BidderDetailType> bidderDetail;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BidderDetailType }
     *     
     */
    public BidderDetailType[] getBidderDetail() {
        if (this.bidderDetail == null) {
            return new BidderDetailType[ 0 ] ;
        }
        return ((BidderDetailType[]) this.bidderDetail.toArray(new BidderDetailType[this.bidderDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BidderDetailType }
     *     
     */
    public BidderDetailType getBidderDetail(int idx) {
        if (this.bidderDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bidderDetail.get(idx);
    }

    public int getBidderDetailLength() {
        if (this.bidderDetail == null) {
            return  0;
        }
        return this.bidderDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BidderDetailType }
     *     
     */
    public void setBidderDetail(BidderDetailType[] values) {
        this._getBidderDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bidderDetail.add(values[i]);
        }
    }

    protected List<BidderDetailType> _getBidderDetail() {
        if (bidderDetail == null) {
            bidderDetail = new ArrayList<BidderDetailType>();
        }
        return bidderDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BidderDetailType }
     *     
     */
    public BidderDetailType setBidderDetail(int idx, BidderDetailType value) {
        return this.bidderDetail.set(idx, value);
    }

}
