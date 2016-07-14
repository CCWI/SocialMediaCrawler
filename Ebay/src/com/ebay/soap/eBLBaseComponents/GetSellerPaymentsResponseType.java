
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
 * 				Returns a summary of pending or paid payments that Half.com created for the seller
 * 				identified by the authentication token in the request. Only returns payments that
 * 				occurred within a particular pay period. Each payment is for one transaction for
 * 				one item in one order. An order can contain transactions for multiple items from
 * 				multiple sellers, but this call only retrieves payments that are relevant to one
 * 				seller. Payments are only issued for items and transactions that the seller has
 * 				confirmed (see the Half.com online help for details). The financial value of a
 * 				payment is typically based on an amount that a buyer paid to Half.com for a
 * 				transaction, plus the shipping cost the buyer paid to Half.com for the item, minus
 * 				Half.com's commission. For most sellers, each month contains two pay periods: One
 * 				from the 1st to the 15th of the month, and one from the 16th to the last day of
 * 				the month. Payments are submitted to the seller's financial institution a certain
 * 				number of days after the current pay period ends (see the Half.com online help for
 * 				details).
 * 			
 * 
 * <p>Java class for GetSellerPaymentsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerPaymentsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMorePayments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerPayment" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnedPaymentCountActual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerPaymentsResponseType", propOrder = {
    "paginationResult",
    "hasMorePayments",
    "sellerPayment",
    "paymentsPerPage",
    "pageNumber",
    "returnedPaymentCountActual"
})
public class GetSellerPaymentsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMorePayments")
    protected Boolean hasMorePayments;
    @XmlElement(name = "SellerPayment")
    protected List<SellerPaymentType> sellerPayment;
    @XmlElement(name = "PaymentsPerPage")
    protected Integer paymentsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ReturnedPaymentCountActual")
    protected Integer returnedPaymentCountActual;

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

    /**
     * Gets the value of the hasMorePayments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMorePayments() {
        return hasMorePayments;
    }

    /**
     * Sets the value of the hasMorePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMorePayments(Boolean value) {
        this.hasMorePayments = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellerPaymentType }
     *     
     */
    public SellerPaymentType[] getSellerPayment() {
        if (this.sellerPayment == null) {
            return new SellerPaymentType[ 0 ] ;
        }
        return ((SellerPaymentType[]) this.sellerPayment.toArray(new SellerPaymentType[this.sellerPayment.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellerPaymentType }
     *     
     */
    public SellerPaymentType getSellerPayment(int idx) {
        if (this.sellerPayment == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sellerPayment.get(idx);
    }

    public int getSellerPaymentLength() {
        if (this.sellerPayment == null) {
            return  0;
        }
        return this.sellerPayment.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellerPaymentType }
     *     
     */
    public void setSellerPayment(SellerPaymentType[] values) {
        this._getSellerPayment().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sellerPayment.add(values[i]);
        }
    }

    protected List<SellerPaymentType> _getSellerPayment() {
        if (sellerPayment == null) {
            sellerPayment = new ArrayList<SellerPaymentType>();
        }
        return sellerPayment;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentType }
     *     
     */
    public SellerPaymentType setSellerPayment(int idx, SellerPaymentType value) {
        return this.sellerPayment.set(idx, value);
    }

    /**
     * Gets the value of the paymentsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentsPerPage() {
        return paymentsPerPage;
    }

    /**
     * Sets the value of the paymentsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentsPerPage(Integer value) {
        this.paymentsPerPage = value;
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
     * Gets the value of the returnedPaymentCountActual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedPaymentCountActual() {
        return returnedPaymentCountActual;
    }

    /**
     * Sets the value of the returnedPaymentCountActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedPaymentCountActual(Integer value) {
        this.returnedPaymentCountActual = value;
    }

}
