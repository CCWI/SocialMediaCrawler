
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to "reverse" an Unpaid Item dispute that has been closed, for
 * 				example, if buyer and seller reach an agreement. The seller's Final Value Fee
 * 				credit and the buyer's strike are both reversed, if applicable.
 * 				The dispute might have resulted
 * 				in a strike to the buyer and a Final Value Fee credit to the seller. A buyer and
 * 				seller sometimes come to agreement after a dispute has been closed. In particular,
 * 				the seller might discover that the buyer actually paid, or the buyer might agree
 * 				to pay the seller's fees in exchange for having the strike removed.
 * 				<br><br>
 * 				A dispute can only be reversed if it was closed with DisputeActivity set to
 * 				SellerEndCommunication, CameToAgreementNeedFVFCredit, or
 * 				MutualAgreementOrNoBuyerResponse.
 * 			
 * 
 * <p>Java class for SellerReverseDisputeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerReverseDisputeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeResolutionReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionReasonCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerReverseDisputeRequestType", propOrder = {
    "disputeID",
    "disputeResolutionReason"
})
public class SellerReverseDisputeRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeID")
    protected String disputeID;
    @XmlElement(name = "DisputeResolutionReason")
    protected DisputeResolutionReasonCodeType disputeResolutionReason;

    /**
     * Gets the value of the disputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

    /**
     * Gets the value of the disputeResolutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public DisputeResolutionReasonCodeType getDisputeResolutionReason() {
        return disputeResolutionReason;
    }

    /**
     * Sets the value of the disputeResolutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public void setDisputeResolutionReason(DisputeResolutionReasonCodeType value) {
        this.disputeResolutionReason = value;
    }

}
