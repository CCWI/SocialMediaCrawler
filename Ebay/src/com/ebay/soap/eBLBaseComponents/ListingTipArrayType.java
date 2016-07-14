
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
 *       (out) Contains a list of tips on improving a listing's details, if any. 
 * 			
 * 
 * <p>Java class for ListingTipArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTip" type="{urn:ebay:apis:eBLBaseComponents}ListingTipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipArrayType", propOrder = {
    "listingTip"
})
public class ListingTipArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingTip")
    protected List<ListingTipType> listingTip;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingTipType }
     *     
     */
    public ListingTipType[] getListingTip() {
        if (this.listingTip == null) {
            return new ListingTipType[ 0 ] ;
        }
        return ((ListingTipType[]) this.listingTip.toArray(new ListingTipType[this.listingTip.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingTipType }
     *     
     */
    public ListingTipType getListingTip(int idx) {
        if (this.listingTip == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingTip.get(idx);
    }

    public int getListingTipLength() {
        if (this.listingTip == null) {
            return  0;
        }
        return this.listingTip.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingTipType }
     *     
     */
    public void setListingTip(ListingTipType[] values) {
        this._getListingTip().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingTip.add(values[i]);
        }
    }

    protected List<ListingTipType> _getListingTip() {
        if (listingTip == null) {
            listingTip = new ArrayList<ListingTipType>();
        }
        return listingTip;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTipType }
     *     
     */
    public ListingTipType setListingTip(int idx, ListingTipType value) {
        return this.listingTip.set(idx, value);
    }

}
