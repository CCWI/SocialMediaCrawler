
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
 * 				Specifies the type of reminders for which you want information.
 * 			
 * 
 * <p>Java class for RemindersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemindersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentToSendCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackToReceiveCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackToSendCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutbidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentToReceiveCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondChanceOfferCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingNeededCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelistingNeededCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNewLeadsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocsForCCProcessingToSendCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RTEToProcessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemReceiptToConfirmCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefundOnHoldCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefundCancelledCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingDetailsToBeProvidedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemReceiptConfirmationToReceiveCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefundInitiatedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PendingRTERequestCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeclinedRTERequestCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "RemindersType", propOrder = {
    "paymentToSendCount",
    "feedbackToReceiveCount",
    "feedbackToSendCount",
    "outbidCount",
    "paymentToReceiveCount",
    "secondChanceOfferCount",
    "shippingNeededCount",
    "relistingNeededCount",
    "totalNewLeadsCount",
    "docsForCCProcessingToSendCount",
    "rteToProcessCount",
    "itemReceiptToConfirmCount",
    "refundOnHoldCount",
    "refundCancelledCount",
    "shippingDetailsToBeProvidedCount",
    "itemReceiptConfirmationToReceiveCount",
    "refundInitiatedCount",
    "pendingRTERequestCount",
    "declinedRTERequestCount",
    "any"
})
public class RemindersType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaymentToSendCount")
    protected Integer paymentToSendCount;
    @XmlElement(name = "FeedbackToReceiveCount")
    protected Integer feedbackToReceiveCount;
    @XmlElement(name = "FeedbackToSendCount")
    protected Integer feedbackToSendCount;
    @XmlElement(name = "OutbidCount")
    protected Integer outbidCount;
    @XmlElement(name = "PaymentToReceiveCount")
    protected Integer paymentToReceiveCount;
    @XmlElement(name = "SecondChanceOfferCount")
    protected Integer secondChanceOfferCount;
    @XmlElement(name = "ShippingNeededCount")
    protected Integer shippingNeededCount;
    @XmlElement(name = "RelistingNeededCount")
    protected Integer relistingNeededCount;
    @XmlElement(name = "TotalNewLeadsCount")
    protected Integer totalNewLeadsCount;
    @XmlElement(name = "DocsForCCProcessingToSendCount")
    protected Integer docsForCCProcessingToSendCount;
    @XmlElement(name = "RTEToProcessCount")
    protected Integer rteToProcessCount;
    @XmlElement(name = "ItemReceiptToConfirmCount")
    protected Integer itemReceiptToConfirmCount;
    @XmlElement(name = "RefundOnHoldCount")
    protected Integer refundOnHoldCount;
    @XmlElement(name = "RefundCancelledCount")
    protected Integer refundCancelledCount;
    @XmlElement(name = "ShippingDetailsToBeProvidedCount")
    protected Integer shippingDetailsToBeProvidedCount;
    @XmlElement(name = "ItemReceiptConfirmationToReceiveCount")
    protected Integer itemReceiptConfirmationToReceiveCount;
    @XmlElement(name = "RefundInitiatedCount")
    protected Integer refundInitiatedCount;
    @XmlElement(name = "PendingRTERequestCount")
    protected Integer pendingRTERequestCount;
    @XmlElement(name = "DeclinedRTERequestCount")
    protected Integer declinedRTERequestCount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the paymentToSendCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentToSendCount() {
        return paymentToSendCount;
    }

    /**
     * Sets the value of the paymentToSendCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentToSendCount(Integer value) {
        this.paymentToSendCount = value;
    }

    /**
     * Gets the value of the feedbackToReceiveCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackToReceiveCount() {
        return feedbackToReceiveCount;
    }

    /**
     * Sets the value of the feedbackToReceiveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackToReceiveCount(Integer value) {
        this.feedbackToReceiveCount = value;
    }

    /**
     * Gets the value of the feedbackToSendCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackToSendCount() {
        return feedbackToSendCount;
    }

    /**
     * Sets the value of the feedbackToSendCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackToSendCount(Integer value) {
        this.feedbackToSendCount = value;
    }

    /**
     * Gets the value of the outbidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutbidCount() {
        return outbidCount;
    }

    /**
     * Sets the value of the outbidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutbidCount(Integer value) {
        this.outbidCount = value;
    }

    /**
     * Gets the value of the paymentToReceiveCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentToReceiveCount() {
        return paymentToReceiveCount;
    }

    /**
     * Sets the value of the paymentToReceiveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentToReceiveCount(Integer value) {
        this.paymentToReceiveCount = value;
    }

    /**
     * Gets the value of the secondChanceOfferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondChanceOfferCount() {
        return secondChanceOfferCount;
    }

    /**
     * Sets the value of the secondChanceOfferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondChanceOfferCount(Integer value) {
        this.secondChanceOfferCount = value;
    }

    /**
     * Gets the value of the shippingNeededCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingNeededCount() {
        return shippingNeededCount;
    }

    /**
     * Sets the value of the shippingNeededCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingNeededCount(Integer value) {
        this.shippingNeededCount = value;
    }

    /**
     * Gets the value of the relistingNeededCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelistingNeededCount() {
        return relistingNeededCount;
    }

    /**
     * Sets the value of the relistingNeededCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelistingNeededCount(Integer value) {
        this.relistingNeededCount = value;
    }

    /**
     * Gets the value of the totalNewLeadsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNewLeadsCount() {
        return totalNewLeadsCount;
    }

    /**
     * Sets the value of the totalNewLeadsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNewLeadsCount(Integer value) {
        this.totalNewLeadsCount = value;
    }

    /**
     * Gets the value of the docsForCCProcessingToSendCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocsForCCProcessingToSendCount() {
        return docsForCCProcessingToSendCount;
    }

    /**
     * Sets the value of the docsForCCProcessingToSendCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocsForCCProcessingToSendCount(Integer value) {
        this.docsForCCProcessingToSendCount = value;
    }

    /**
     * Gets the value of the rteToProcessCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRTEToProcessCount() {
        return rteToProcessCount;
    }

    /**
     * Sets the value of the rteToProcessCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRTEToProcessCount(Integer value) {
        this.rteToProcessCount = value;
    }

    /**
     * Gets the value of the itemReceiptToConfirmCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemReceiptToConfirmCount() {
        return itemReceiptToConfirmCount;
    }

    /**
     * Sets the value of the itemReceiptToConfirmCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemReceiptToConfirmCount(Integer value) {
        this.itemReceiptToConfirmCount = value;
    }

    /**
     * Gets the value of the refundOnHoldCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundOnHoldCount() {
        return refundOnHoldCount;
    }

    /**
     * Sets the value of the refundOnHoldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundOnHoldCount(Integer value) {
        this.refundOnHoldCount = value;
    }

    /**
     * Gets the value of the refundCancelledCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundCancelledCount() {
        return refundCancelledCount;
    }

    /**
     * Sets the value of the refundCancelledCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundCancelledCount(Integer value) {
        this.refundCancelledCount = value;
    }

    /**
     * Gets the value of the shippingDetailsToBeProvidedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingDetailsToBeProvidedCount() {
        return shippingDetailsToBeProvidedCount;
    }

    /**
     * Sets the value of the shippingDetailsToBeProvidedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingDetailsToBeProvidedCount(Integer value) {
        this.shippingDetailsToBeProvidedCount = value;
    }

    /**
     * Gets the value of the itemReceiptConfirmationToReceiveCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemReceiptConfirmationToReceiveCount() {
        return itemReceiptConfirmationToReceiveCount;
    }

    /**
     * Sets the value of the itemReceiptConfirmationToReceiveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemReceiptConfirmationToReceiveCount(Integer value) {
        this.itemReceiptConfirmationToReceiveCount = value;
    }

    /**
     * Gets the value of the refundInitiatedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundInitiatedCount() {
        return refundInitiatedCount;
    }

    /**
     * Sets the value of the refundInitiatedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundInitiatedCount(Integer value) {
        this.refundInitiatedCount = value;
    }

    /**
     * Gets the value of the pendingRTERequestCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPendingRTERequestCount() {
        return pendingRTERequestCount;
    }

    /**
     * Sets the value of the pendingRTERequestCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPendingRTERequestCount(Integer value) {
        this.pendingRTERequestCount = value;
    }

    /**
     * Gets the value of the declinedRTERequestCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeclinedRTERequestCount() {
        return declinedRTERequestCount;
    }

    /**
     * Sets the value of the declinedRTERequestCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeclinedRTERequestCount(Integer value) {
        this.declinedRTERequestCount = value;
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
