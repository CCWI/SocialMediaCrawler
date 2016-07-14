
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
 * <p>Java class for AccountTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{urn:ebay:apis:eBLBaseComponents}NonUsageTransactionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccountTransactionType", propOrder = {
    "feeDescription",
    "transaction",
    "any"
})
public class AccountTransactionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeeDescription")
    protected String feeDescription;
    @XmlElement(name = "Transaction")
    protected List<NonUsageTransactionType> transaction;
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
     *     {@link NonUsageTransactionType }
     *     
     */
    public NonUsageTransactionType[] getTransaction() {
        if (this.transaction == null) {
            return new NonUsageTransactionType[ 0 ] ;
        }
        return ((NonUsageTransactionType[]) this.transaction.toArray(new NonUsageTransactionType[this.transaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NonUsageTransactionType }
     *     
     */
    public NonUsageTransactionType getTransaction(int idx) {
        if (this.transaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.transaction.get(idx);
    }

    public int getTransactionLength() {
        if (this.transaction == null) {
            return  0;
        }
        return this.transaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NonUsageTransactionType }
     *     
     */
    public void setTransaction(NonUsageTransactionType[] values) {
        this._getTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.transaction.add(values[i]);
        }
    }

    protected List<NonUsageTransactionType> _getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<NonUsageTransactionType>();
        }
        return transaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NonUsageTransactionType }
     *     
     */
    public NonUsageTransactionType setTransaction(int idx, NonUsageTransactionType value) {
        return this.transaction.set(idx, value);
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
