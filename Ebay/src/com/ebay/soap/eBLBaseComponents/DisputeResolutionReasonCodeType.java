
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="ProofOfPayment"/>
 *     &lt;enumeration value="ComputerTechnicalProblem"/>
 *     &lt;enumeration value="NoContact"/>
 *     &lt;enumeration value="FamilyEmergency"/>
 *     &lt;enumeration value="ProofGivenInFeedback"/>
 *     &lt;enumeration value="FirstInfraction"/>
 *     &lt;enumeration value="CameToAgreement"/>
 *     &lt;enumeration value="ItemReturned"/>
 *     &lt;enumeration value="BuyerPaidAuctionFees"/>
 *     &lt;enumeration value="SellerReceivedPayment"/>
 *     &lt;enumeration value="OtherResolution"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeResolutionReasonCodeType")
@XmlEnum
public enum DisputeResolutionReasonCodeType {


    /**
     * 
     * 						The dispute was not resolved.
     * 					
     * 
     */
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),

    /**
     * 
     * 						The buyer provided proof of payment in feedback.
     * 					
     * 
     */
    @XmlEnumValue("ProofOfPayment")
    PROOF_OF_PAYMENT("ProofOfPayment"),

    /**
     * 
     * 						The buyer or seller had a technical problem with a computer.
     * 					
     * 
     */
    @XmlEnumValue("ComputerTechnicalProblem")
    COMPUTER_TECHNICAL_PROBLEM("ComputerTechnicalProblem"),

    /**
     * 
     * 						The buyer and seller have not made contact.
     * 					
     * 
     */
    @XmlEnumValue("NoContact")
    NO_CONTACT("NoContact"),

    /**
     * 
     * 						The buyer or seller had a family emergency.
     * 					
     * 
     */
    @XmlEnumValue("FamilyEmergency")
    FAMILY_EMERGENCY("FamilyEmergency"),

    /**
     * 
     * 						The buyer provided proof of payment in feedback.
     * 					
     * 
     */
    @XmlEnumValue("ProofGivenInFeedback")
    PROOF_GIVEN_IN_FEEDBACK("ProofGivenInFeedback"),

    /**
     * 
     * 						The dispute was the buyer's first infraction.
     * 					
     * 
     */
    @XmlEnumValue("FirstInfraction")
    FIRST_INFRACTION("FirstInfraction"),

    /**
     * 
     * 						The buyer and seller came to agreement.
     * 					
     * 
     */
    @XmlEnumValue("CameToAgreement")
    CAME_TO_AGREEMENT("CameToAgreement"),

    /**
     * 
     * 						The buyer returned the item.
     * 					
     * 
     */
    @XmlEnumValue("ItemReturned")
    ITEM_RETURNED("ItemReturned"),

    /**
     * 
     *  						The buyer reimbursed the seller's auction fees.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPaidAuctionFees")
    BUYER_PAID_AUCTION_FEES("BuyerPaidAuctionFees"),

    /**
     * 
     * 						The seller received payment.
     * 					
     * 
     */
    @XmlEnumValue("SellerReceivedPayment")
    SELLER_RECEIVED_PAYMENT("SellerReceivedPayment"),

    /**
     * 
     * 						Some other resolution occurred.
     * 					
     * 
     */
    @XmlEnumValue("OtherResolution")
    OTHER_RESOLUTION("OtherResolution"),

    /**
     * 
     * 						After eBay approved payment of the claim, the claim was paid.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaid")
    CLAIM_PAID("ClaimPaid"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeResolutionReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeResolutionReasonCodeType fromValue(String v) {
        for (DisputeResolutionReasonCodeType c: DisputeResolutionReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
