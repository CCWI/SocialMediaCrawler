
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Indicates the refund amount that a seller issued to a buyer for a single Half.com order line item.
 * Refunds may only be issued for a specific order line item. Sellers do not have the ability to issue a 
 * general refund (not tied to an order line item) to a buyer.
 * 			
 * 
 * <p>Java class for IssueRefundResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueRefundResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="RefundFromSeller" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalRefundToBuyer" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueRefundResponseType", propOrder = {
    "refundFromSeller",
    "totalRefundToBuyer"
})
public class IssueRefundResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundFromSeller")
    protected AmountType refundFromSeller;
    @XmlElement(name = "TotalRefundToBuyer")
    protected AmountType totalRefundToBuyer;

    /**
     * Gets the value of the refundFromSeller property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundFromSeller() {
        return refundFromSeller;
    }

    /**
     * Sets the value of the refundFromSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundFromSeller(AmountType value) {
        this.refundFromSeller = value;
    }

    /**
     * Gets the value of the totalRefundToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRefundToBuyer() {
        return totalRefundToBuyer;
    }

    /**
     * Sets the value of the totalRefundToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRefundToBuyer(AmountType value) {
        this.totalRefundToBuyer = value;
    }

}
