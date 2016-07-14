
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				<b>Half.com only.</b>&nbsp;Retrieves a summary of pending or paid payments that Half.com created for the
 * 				seller identified by the authentication token in the request. Only retrieves
 * 				payments that occurred within a particular pay period. Each payment is for one
 * 				order line item in one order. An order can contain order line items for
 * 				multiple items from multiple sellers, but this call only retrieves payments that
 * 				are relevant to one seller. The financial value of a payment is typically based on
 * 				an amount that a buyer paid to Half.com for an order line item, with adjustments for
 * 				shipping costs and Half.com's commission. For most sellers, each month contains
 * 				two pay periods: One from the 1st to the 15th of the month, and one from the 16th
 * 				to the last day of the month. Sellers can refer to their account information on
 * 				the Half.com site to determine their pay periods. (You cannot retrieve a seller's
 * 				pay periods by using eBay API.) When a buyer makes a purchase and an
 * 				order is created, Half.com creates a payment for the seller and marks it as
 * 				Pending in the seller's Half.com account. Within a certain number of days after
 * 				the pay period ends, Half.com settles payments for that period and marks each
 * 				completed payment as Paid. See the Half.com Web site online help for more
 * 				information about how payments are managed.
 * 			
 * 
 * <p>Java class for GetSellerPaymentsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerPaymentsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}RCSPaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerPaymentsRequestType", propOrder = {
    "paymentStatus",
    "paymentTimeFrom",
    "paymentTimeTo",
    "pagination"
})
public class GetSellerPaymentsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaymentStatus")
    protected RCSPaymentStatusCodeType paymentStatus;
    @XmlElement(name = "PaymentTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paymentTimeFrom;
    @XmlElement(name = "PaymentTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paymentTimeTo;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RCSPaymentStatusCodeType }
     *     
     */
    public RCSPaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSPaymentStatusCodeType }
     *     
     */
    public void setPaymentStatus(RCSPaymentStatusCodeType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaymentTimeFrom() {
        return paymentTimeFrom;
    }

    /**
     * Sets the value of the paymentTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTimeFrom(Calendar value) {
        this.paymentTimeFrom = value;
    }

    /**
     * Gets the value of the paymentTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaymentTimeTo() {
        return paymentTimeTo;
    }

    /**
     * Sets the value of the paymentTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTimeTo(Calendar value) {
        this.paymentTimeTo = value;
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

}
