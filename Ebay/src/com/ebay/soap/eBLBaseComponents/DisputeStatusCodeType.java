
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="WaitingForSellerResponse"/>
 *     &lt;enumeration value="WaitingForBuyerResponse"/>
 *     &lt;enumeration value="ClosedFVFCreditStrike"/>
 *     &lt;enumeration value="ClosedNoFVFCreditStrike"/>
 *     &lt;enumeration value="ClosedFVFCreditNoStrike"/>
 *     &lt;enumeration value="ClosedNoFVFCreditNoStrike"/>
 *     &lt;enumeration value="StrikeAppealedAfterClosing"/>
 *     &lt;enumeration value="FVFCreditReversedAfterClosing"/>
 *     &lt;enumeration value="StrikeAppealedAndFVFCreditReversed"/>
 *     &lt;enumeration value="ClaimOpened"/>
 *     &lt;enumeration value="NoDocumentation"/>
 *     &lt;enumeration value="ClaimClosed"/>
 *     &lt;enumeration value="ClaimDenied"/>
 *     &lt;enumeration value="ClaimInProcess"/>
 *     &lt;enumeration value="ClaimApproved"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="ClaimResolved"/>
 *     &lt;enumeration value="ClaimSubmitted"/>
 *     &lt;enumeration value="UnpaidItemOpened"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeStatusCodeType")
@XmlEnum
public enum DisputeStatusCodeType {


    /**
     * 
     * 						The dispute is closed. For Item Not Received disputes.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						The dispute is waiting for the seller's response. For both
     * 						Unpaid Item and Item Not Received disputes.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForSellerResponse")
    WAITING_FOR_SELLER_RESPONSE("WaitingForSellerResponse"),

    /**
     * 
     * 						The dispute is waiting for the buyer's response. For both
     * 						Unpaid Item and Item Not Received disputes.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForBuyerResponse")
    WAITING_FOR_BUYER_RESPONSE("WaitingForBuyerResponse"),

    /**
     * 
     * 						The dispute is closed, the seller received
     * 						a Final Value Fee credit, and the buyer received a strike.
     * 						For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("ClosedFVFCreditStrike")
    CLOSED_FVF_CREDIT_STRIKE("ClosedFVFCreditStrike"),

    /**
     * 
     * 						The dispute is closed, the seller did not receive
     * 						a Final Value Fee credit, and the buyer received a strike.
     * 						For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("ClosedNoFVFCreditStrike")
    CLOSED_NO_FVF_CREDIT_STRIKE("ClosedNoFVFCreditStrike"),

    /**
     * 
     * 						The dispute is closed, the seller received a
     * 						Final Value Fee credit, and the buyer did not receive a strike.
     * 						For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("ClosedFVFCreditNoStrike")
    CLOSED_FVF_CREDIT_NO_STRIKE("ClosedFVFCreditNoStrike"),

    /**
     * 
     * 						The dispute is closed, the seller did not receive
     * 						a Final Value Fee credit, and the buyer did not receive a strike.
     * 						For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("ClosedNoFVFCreditNoStrike")
    CLOSED_NO_FVF_CREDIT_NO_STRIKE("ClosedNoFVFCreditNoStrike"),

    /**
     * 
     * 						The buyer's strike was appealed after the dispute was closed.
     * 						For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("StrikeAppealedAfterClosing")
    STRIKE_APPEALED_AFTER_CLOSING("StrikeAppealedAfterClosing"),

    /**
     * 
     * 						The seller's Final Value Fee credit was reversed after the
     * 						dispute was closed. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversedAfterClosing")
    FVF_CREDIT_REVERSED_AFTER_CLOSING("FVFCreditReversedAfterClosing"),

    /**
     * 
     * 						Both the seller's Final Value Fee credit and the buyer's strike
     * 						were reversed after the dispute was closed. For Unpaid Item disputes.
     * 					
     * 
     */
    @XmlEnumValue("StrikeAppealedAndFVFCreditReversed")
    STRIKE_APPEALED_AND_FVF_CREDIT_REVERSED("StrikeAppealedAndFVFCreditReversed"),

    /**
     * 
     * 						Claim assigned to an adjuster. Also maps for filed claim in Half.com
     * 					
     * 
     */
    @XmlEnumValue("ClaimOpened")
    CLAIM_OPENED("ClaimOpened"),

    /**
     * 
     * 						Buyer contacted and asked to submit paperwork
     * 					
     * 
     */
    @XmlEnumValue("NoDocumentation")
    NO_DOCUMENTATION("NoDocumentation"),

    /**
     * 
     * 						Buyer did not respond to verification or missing some paperwork. Also maps for
     * 						filed claim in Half.com
     * 					
     * 
     */
    @XmlEnumValue("ClaimClosed")
    CLAIM_CLOSED("ClaimClosed"),

    /**
     * 
     * 						Not eligible for reimbursement
     * 					
     * 
     */
    @XmlEnumValue("ClaimDenied")
    CLAIM_DENIED("ClaimDenied"),

    /**
     * 
     * 						Paperwork received, claim being investigated. Also maps for filed claim in
     * 						Half.com
     * 					
     * 
     */
    @XmlEnumValue("ClaimInProcess")
    CLAIM_IN_PROCESS("ClaimInProcess"),

    /**
     * 
     * 						Claim approved for reimbursement; sent to accounts payable for payment
     * 					
     * 
     */
    @XmlEnumValue("ClaimApproved")
    CLAIM_APPROVED("ClaimApproved"),

    /**
     * 
     * 						Reimbursement completed
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaid")
    CLAIM_PAID("ClaimPaid"),

    /**
     * 
     * 						Issue resolved: seller sent Item or Refund
     * 					
     * 
     */
    @XmlEnumValue("ClaimResolved")
    CLAIM_RESOLVED("ClaimResolved"),

    /**
     * 
     * 						Claim Submitted via Web flow
     * 					
     * 
     */
    @XmlEnumValue("ClaimSubmitted")
    CLAIM_SUBMITTED("ClaimSubmitted"),

    /**
     * 
     * 						Unpaid Item dispute opened
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemOpened")
    UNPAID_ITEM_OPENED("UnpaidItemOpened"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeStatusCodeType fromValue(String v) {
        for (DisputeStatusCodeType c: DisputeStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
