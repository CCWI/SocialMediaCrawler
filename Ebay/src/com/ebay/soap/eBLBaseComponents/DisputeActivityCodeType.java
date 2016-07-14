
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeActivityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeActivityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerAddInformation"/>
 *     &lt;enumeration value="SellerCompletedTransaction"/>
 *     &lt;enumeration value="CameToAgreementNeedFVFCredit"/>
 *     &lt;enumeration value="SellerEndCommunication"/>
 *     &lt;enumeration value="MutualAgreementOrNoBuyerResponse"/>
 *     &lt;enumeration value="SellerOffersRefund"/>
 *     &lt;enumeration value="SellerShippedItem"/>
 *     &lt;enumeration value="SellerComment"/>
 *     &lt;enumeration value="SellerPaymentNotReceived"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeActivityCodeType")
@XmlEnum
public enum DisputeActivityCodeType {


    /**
     * 
     * 						(in) The seller wants to add a response to the dispute. For Unpaid
     * 						Item disputes. The seller is limited to 25 responses.
     * 					
     * 
     */
    @XmlEnumValue("SellerAddInformation")
    SELLER_ADD_INFORMATION("SellerAddInformation"),

    /**
     * 
     * 						(in) The buyer has paid or the seller otherwise does not need to
     * 						pursue the dispute any longer. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("SellerCompletedTransaction")
    SELLER_COMPLETED_TRANSACTION("SellerCompletedTransaction"),

    /**
     * 
     * 						(in) The seller has made an agreement with the buyer and requires a
     * 						credit for a Final Value Fee already paid. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("CameToAgreementNeedFVFCredit")
    CAME_TO_AGREEMENT_NEED_FVF_CREDIT("CameToAgreementNeedFVFCredit"),

    /**
     * 
     * 						(in) The seller wants to end communication or stop waiting for the
     * 						buyer. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("SellerEndCommunication")
    SELLER_END_COMMUNICATION("SellerEndCommunication"),

    /**
     * 
     * 						(in) The seller wants to end communication or stop waiting for the
     * 						buyer. Mutual agreement has been reached or the buyer has not
     * 						responded within four days. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("MutualAgreementOrNoBuyerResponse")
    MUTUAL_AGREEMENT_OR_NO_BUYER_RESPONSE("MutualAgreementOrNoBuyerResponse"),

    /**
     * 
     * 						(in) The seller offers a full refund if the buyer did not receive
     * 						the item or a partial refund if the item is significantly not as
     * 						described. For Item Not Received or Significantly Not As Described
     * 						disputes. Can be used when DisputeState is:<br>
     * 						NotReceivedNoSellerResponse<br>
     * 						NotAsDescribedNoSellerResponse<br>
     * 						NotReceivedMutualCommunication<br>
     * 						NotAsDescribedMutualCommunication
     * 					
     * 
     */
    @XmlEnumValue("SellerOffersRefund")
    SELLER_OFFERS_REFUND("SellerOffersRefund"),

    /**
     * 
     * 						(in) The seller has shipped the item or a replacement and provides
     * 						shipping information. For Item Not Received and Significantly Not As
     * 						Described disputes. Can be used when DisputeState is:<br>
     * 						NotReceivedNoSellerResponse<br> NotReceivedMutualCommunication
     * 					
     * 
     */
    @XmlEnumValue("SellerShippedItem")
    SELLER_SHIPPED_ITEM("SellerShippedItem"),

    /**
     * 
     * 						(in) The seller communicates with the buyer, offering a response or
     * 						comment. The seller is limited to 25 responses.
     * 						For Item Not Received and Significantly Not As Described
     * 						disputes. Can be used when DisputeState is:<br>
     * 						NotReceivedNoSellerResponse<br>
     * 						NotAsDescribedNoSellerResponse<br>
     * 						NotReceivedMutualCommunication<br>
     * 						NotAsDescribedMutualCommunication
     * 					
     * 
     */
    @XmlEnumValue("SellerComment")
    SELLER_COMMENT("SellerComment"),

    /**
     * 
     * 						(in) The buyer has not received an expected full or partial refund from the
     * 						seller in an Item Not Received or Significantly Not As Described buyer
     * 						dispute. This value can be used when DisputeState is:<br>
     * 						NotReceivedNoSellerResponse <br>
     * 						NotReceivedMutualCommunication <br>
     * 					
     * 
     */
    @XmlEnumValue("SellerPaymentNotReceived")
    SELLER_PAYMENT_NOT_RECEIVED("SellerPaymentNotReceived"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeActivityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeActivityCodeType fromValue(String v) {
        for (DisputeActivityCodeType c: DisputeActivityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
