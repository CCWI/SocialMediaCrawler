
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Returned after calling GetDisputeRequest. Returns the record of
 *       	a dispute, including the dispute state and other information.
 *       	<br><br>Both Sellers and Buyers can use the SellerClosedDispute in
 *       	Platform Notifications to receive a notification when a dispute has been closed.
 *       	The notification includes the same data that is returned in the GetDispute response.
 * 			
 * 
 * <p>Java class for GetDisputeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Dispute" type="{urn:ebay:apis:eBLBaseComponents}DisputeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeResponseType", propOrder = {
    "dispute"
})
public class GetDisputeResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Dispute")
    protected DisputeType dispute;

    /**
     * Gets the value of the dispute property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeType }
     *     
     */
    public DisputeType getDispute() {
        return dispute;
    }

    /**
     * Sets the value of the dispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeType }
     *     
     */
    public void setDispute(DisputeType value) {
        this.dispute = value;
    }

}
