
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type contains details on the status of an order.
 * 			
 * 
 * <p>Java class for SellingManagerOrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerOrderStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckoutStatus" type="{urn:ebay:apis:eBLBaseComponents}CheckoutStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaidStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerPaidStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ShippedStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerShippedStatusCodeType" minOccurs="0"/>
 *         &lt;element name="eBayPaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethodUsed" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackReceived" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalEmailsSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentHoldStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SellerInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastEmailSentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellerInvoiceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SellingManagerOrderStatusType", propOrder = {
    "checkoutStatus",
    "paidStatus",
    "shippedStatus",
    "eBayPaymentStatus",
    "payPalTransactionID",
    "paymentMethodUsed",
    "feedbackReceived",
    "feedbackSent",
    "totalEmailsSent",
    "paymentHoldStatus",
    "sellerInvoiceNumber",
    "shippedTime",
    "paidTime",
    "lastEmailSentTime",
    "sellerInvoiceTime",
    "integratedMerchantCreditCardEnabled",
    "any"
})
public class SellingManagerOrderStatusType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CheckoutStatus")
    protected CheckoutStatusCodeType checkoutStatus;
    @XmlElement(name = "PaidStatus")
    protected SellingManagerPaidStatusCodeType paidStatus;
    @XmlElement(name = "ShippedStatus")
    protected SellingManagerShippedStatusCodeType shippedStatus;
    protected PaymentStatusCodeType eBayPaymentStatus;
    @XmlElement(name = "PayPalTransactionID")
    protected String payPalTransactionID;
    @XmlElement(name = "PaymentMethodUsed")
    protected BuyerPaymentMethodCodeType paymentMethodUsed;
    @XmlElement(name = "FeedbackReceived")
    protected CommentTypeCodeType feedbackReceived;
    @XmlElement(name = "FeedbackSent")
    protected Boolean feedbackSent;
    @XmlElement(name = "TotalEmailsSent")
    protected Integer totalEmailsSent;
    @XmlElement(name = "PaymentHoldStatus")
    protected PaymentHoldStatusCodeType paymentHoldStatus;
    @XmlElement(name = "SellerInvoiceNumber")
    protected String sellerInvoiceNumber;
    @XmlElement(name = "ShippedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippedTime;
    @XmlElement(name = "PaidTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paidTime;
    @XmlElement(name = "LastEmailSentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastEmailSentTime;
    @XmlElement(name = "SellerInvoiceTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sellerInvoiceTime;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the checkoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutStatusCodeType }
     *     
     */
    public CheckoutStatusCodeType getCheckoutStatus() {
        return checkoutStatus;
    }

    /**
     * Sets the value of the checkoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutStatusCodeType }
     *     
     */
    public void setCheckoutStatus(CheckoutStatusCodeType value) {
        this.checkoutStatus = value;
    }

    /**
     * Gets the value of the paidStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerPaidStatusCodeType }
     *     
     */
    public SellingManagerPaidStatusCodeType getPaidStatus() {
        return paidStatus;
    }

    /**
     * Sets the value of the paidStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerPaidStatusCodeType }
     *     
     */
    public void setPaidStatus(SellingManagerPaidStatusCodeType value) {
        this.paidStatus = value;
    }

    /**
     * Gets the value of the shippedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerShippedStatusCodeType }
     *     
     */
    public SellingManagerShippedStatusCodeType getShippedStatus() {
        return shippedStatus;
    }

    /**
     * Sets the value of the shippedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerShippedStatusCodeType }
     *     
     */
    public void setShippedStatus(SellingManagerShippedStatusCodeType value) {
        this.shippedStatus = value;
    }

    /**
     * Gets the value of the eBayPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public PaymentStatusCodeType getEBayPaymentStatus() {
        return eBayPaymentStatus;
    }

    /**
     * Sets the value of the eBayPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public void setEBayPaymentStatus(PaymentStatusCodeType value) {
        this.eBayPaymentStatus = value;
    }

    /**
     * Gets the value of the payPalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalTransactionID() {
        return payPalTransactionID;
    }

    /**
     * Sets the value of the payPalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalTransactionID(String value) {
        this.payPalTransactionID = value;
    }

    /**
     * Gets the value of the paymentMethodUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethodUsed() {
        return paymentMethodUsed;
    }

    /**
     * Sets the value of the paymentMethodUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodUsed(BuyerPaymentMethodCodeType value) {
        this.paymentMethodUsed = value;
    }

    /**
     * Gets the value of the feedbackReceived property.
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public CommentTypeCodeType getFeedbackReceived() {
        return feedbackReceived;
    }

    /**
     * Sets the value of the feedbackReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public void setFeedbackReceived(CommentTypeCodeType value) {
        this.feedbackReceived = value;
    }

    /**
     * Gets the value of the feedbackSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackSent() {
        return feedbackSent;
    }

    /**
     * Sets the value of the feedbackSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackSent(Boolean value) {
        this.feedbackSent = value;
    }

    /**
     * Gets the value of the totalEmailsSent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEmailsSent() {
        return totalEmailsSent;
    }

    /**
     * Sets the value of the totalEmailsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEmailsSent(Integer value) {
        this.totalEmailsSent = value;
    }

    /**
     * Gets the value of the paymentHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public PaymentHoldStatusCodeType getPaymentHoldStatus() {
        return paymentHoldStatus;
    }

    /**
     * Sets the value of the paymentHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public void setPaymentHoldStatus(PaymentHoldStatusCodeType value) {
        this.paymentHoldStatus = value;
    }

    /**
     * Gets the value of the sellerInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerInvoiceNumber() {
        return sellerInvoiceNumber;
    }

    /**
     * Sets the value of the sellerInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInvoiceNumber(String value) {
        this.sellerInvoiceNumber = value;
    }

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedTime(Calendar value) {
        this.shippedTime = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTime(Calendar value) {
        this.paidTime = value;
    }

    /**
     * Gets the value of the lastEmailSentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastEmailSentTime() {
        return lastEmailSentTime;
    }

    /**
     * Sets the value of the lastEmailSentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEmailSentTime(Calendar value) {
        this.lastEmailSentTime = value;
    }

    /**
     * Gets the value of the sellerInvoiceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSellerInvoiceTime() {
        return sellerInvoiceTime;
    }

    /**
     * Sets the value of the sellerInvoiceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInvoiceTime(Calendar value) {
        this.sellerInvoiceTime = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
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
