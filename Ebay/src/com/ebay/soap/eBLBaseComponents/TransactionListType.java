
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
 * 				Cost of insuring the delivery of this order with the courier.
 * 			
 * 
 * <p>Java class for TransactionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingTransaction" type="{urn:ebay:apis:eBLBaseComponents}ListingTransactionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransactionListType", propOrder = {
    "feeDescription",
    "listingTransaction",
    "any"
})
public class TransactionListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeeDescription")
    protected String feeDescription;
    @XmlElement(name = "ListingTransaction")
    protected List<ListingTransactionType> listingTransaction;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the feeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDescription() {
        return feeDescription;
    }

    /**
     * Sets the value of the feeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDescription(String value) {
        this.feeDescription = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingTransactionType }
     *     
     */
    public ListingTransactionType[] getListingTransaction() {
        if (this.listingTransaction == null) {
            return new ListingTransactionType[ 0 ] ;
        }
        return ((ListingTransactionType[]) this.listingTransaction.toArray(new ListingTransactionType[this.listingTransaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingTransactionType }
     *     
     */
    public ListingTransactionType getListingTransaction(int idx) {
        if (this.listingTransaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingTransaction.get(idx);
    }

    public int getListingTransactionLength() {
        if (this.listingTransaction == null) {
            return  0;
        }
        return this.listingTransaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingTransactionType }
     *     
     */
    public void setListingTransaction(ListingTransactionType[] values) {
        this._getListingTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingTransaction.add(values[i]);
        }
    }

    protected List<ListingTransactionType> _getListingTransaction() {
        if (listingTransaction == null) {
            listingTransaction = new ArrayList<ListingTransactionType>();
        }
        return listingTransaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTransactionType }
     *     
     */
    public ListingTransactionType setListingTransaction(int idx, ListingTransactionType value) {
        return this.listingTransaction.set(idx, value);
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
