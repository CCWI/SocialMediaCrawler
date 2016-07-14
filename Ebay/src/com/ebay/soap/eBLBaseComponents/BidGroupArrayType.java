
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
 * 				This type is deprecated as the Bid Assistant feature is no longer available.
 *  
 * 			
 * 
 * <p>Java class for BidGroupArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidGroupArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroup" type="{urn:ebay:apis:eBLBaseComponents}BidGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidGroupArrayType", propOrder = {
    "bidGroup"
})
public class BidGroupArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidGroup")
    protected List<BidGroupType> bidGroup;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BidGroupType }
     *     
     */
    public BidGroupType[] getBidGroup() {
        if (this.bidGroup == null) {
            return new BidGroupType[ 0 ] ;
        }
        return ((BidGroupType[]) this.bidGroup.toArray(new BidGroupType[this.bidGroup.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BidGroupType }
     *     
     */
    public BidGroupType getBidGroup(int idx) {
        if (this.bidGroup == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bidGroup.get(idx);
    }

    public int getBidGroupLength() {
        if (this.bidGroup == null) {
            return  0;
        }
        return this.bidGroup.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BidGroupType }
     *     
     */
    public void setBidGroup(BidGroupType[] values) {
        this._getBidGroup().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bidGroup.add(values[i]);
        }
    }

    protected List<BidGroupType> _getBidGroup() {
        if (bidGroup == null) {
            bidGroup = new ArrayList<BidGroupType>();
        }
        return bidGroup;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupType }
     *     
     */
    public BidGroupType setBidGroup(int idx, BidGroupType value) {
        return this.bidGroup.set(idx, value);
    }

}
