
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
 * 				This type is deprecated as the Bid Assistant feature is no longer available.
 * 
 * 			
 * 
 * <p>Java class for BidGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroupItem" type="{urn:ebay:apis:eBLBaseComponents}BidGroupItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BidGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BidGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BidGroupStatus" type="{urn:ebay:apis:eBLBaseComponents}BidGroupStatusCodeType" minOccurs="0"/>
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
@XmlType(name = "BidGroupType", propOrder = {
    "bidGroupItem",
    "bidGroupID",
    "bidGroupName",
    "bidGroupStatus",
    "any"
})
public class BidGroupType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidGroupItem")
    protected List<BidGroupItemType> bidGroupItem;
    @XmlElement(name = "BidGroupID")
    protected Long bidGroupID;
    @XmlElement(name = "BidGroupName")
    protected String bidGroupName;
    @XmlElement(name = "BidGroupStatus")
    protected BidGroupStatusCodeType bidGroupStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BidGroupItemType }
     *     
     */
    public BidGroupItemType[] getBidGroupItem() {
        if (this.bidGroupItem == null) {
            return new BidGroupItemType[ 0 ] ;
        }
        return ((BidGroupItemType[]) this.bidGroupItem.toArray(new BidGroupItemType[this.bidGroupItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BidGroupItemType }
     *     
     */
    public BidGroupItemType getBidGroupItem(int idx) {
        if (this.bidGroupItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bidGroupItem.get(idx);
    }

    public int getBidGroupItemLength() {
        if (this.bidGroupItem == null) {
            return  0;
        }
        return this.bidGroupItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BidGroupItemType }
     *     
     */
    public void setBidGroupItem(BidGroupItemType[] values) {
        this._getBidGroupItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bidGroupItem.add(values[i]);
        }
    }

    protected List<BidGroupItemType> _getBidGroupItem() {
        if (bidGroupItem == null) {
            bidGroupItem = new ArrayList<BidGroupItemType>();
        }
        return bidGroupItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupItemType }
     *     
     */
    public BidGroupItemType setBidGroupItem(int idx, BidGroupItemType value) {
        return this.bidGroupItem.set(idx, value);
    }

    /**
     * Gets the value of the bidGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBidGroupID() {
        return bidGroupID;
    }

    /**
     * Sets the value of the bidGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBidGroupID(Long value) {
        this.bidGroupID = value;
    }

    /**
     * Gets the value of the bidGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidGroupName() {
        return bidGroupName;
    }

    /**
     * Sets the value of the bidGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidGroupName(String value) {
        this.bidGroupName = value;
    }

    /**
     * Gets the value of the bidGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BidGroupStatusCodeType }
     *     
     */
    public BidGroupStatusCodeType getBidGroupStatus() {
        return bidGroupStatus;
    }

    /**
     * Sets the value of the bidGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupStatusCodeType }
     *     
     */
    public void setBidGroupStatus(BidGroupStatusCodeType value) {
        this.bidGroupStatus = value;
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
