
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeStateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeStateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="BuyerFirstResponsePayOption"/>
 *     &lt;enumeration value="BuyerFirstResponseNoPayOption"/>
 *     &lt;enumeration value="BuyerFirstResponsePayOptionLateResponse"/>
 *     &lt;enumeration value="BuyerFirstResponseNoPayOptionLateResponse"/>
 *     &lt;enumeration value="MutualCommunicationPayOption"/>
 *     &lt;enumeration value="MutualCommunicationNoPayOption"/>
 *     &lt;enumeration value="PendingResolve"/>
 *     &lt;enumeration value="MutualWithdrawalAgreement"/>
 *     &lt;enumeration value="MutualWithdrawalAgreementLate"/>
 *     &lt;enumeration value="NotReceivedNoSellerResponse"/>
 *     &lt;enumeration value="NotAsDescribedNoSellerResponse"/>
 *     &lt;enumeration value="NotReceivedMutualCommunication"/>
 *     &lt;enumeration value="NotAsDescribedMutualCommunication"/>
 *     &lt;enumeration value="MutualAgreementOrBuyerReturningItem"/>
 *     &lt;enumeration value="ClaimOpened"/>
 *     &lt;enumeration value="NoDocumentation"/>
 *     &lt;enumeration value="ClaimClosed"/>
 *     &lt;enumeration value="ClaimDenied"/>
 *     &lt;enumeration value="ClaimPending"/>
 *     &lt;enumeration value="ClaimPaymentPending"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="ClaimResolved"/>
 *     &lt;enumeration value="ClaimSubmitted"/>
 *     &lt;enumeration value="UnpaidItemOpen"/>
 *     &lt;enumeration value="UPIAssistanceDisabledByeBay"/>
 *     &lt;enumeration value="UPIAssistanceDisabledBySeller"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeStateCodeType")
@XmlEnum
public enum DisputeStateCodeType {


    /**
     * 
     * 						The dispute is locked and cannot be updated. For any type of
     * 						dispute. No values of DisputeActivity are valid.
     * 					
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * 
     * 						The dispute is closed. In some cases, it can be reversed with
     * 						SellerReverseDispute. For any type of dispute. No values of
     * 						DisputeActivity are valid.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						eBay sent the buyer an Unpaid Item Reminder with a Pay Now
     * 						option. Waiting for the buyer's first response. It is within the 7-day
     * 						grace period. For Unpaid Item Disputes. DisputeActivity can be
     * 						SellerAddInformation or SellerCompletedTransaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponsePayOption")
    BUYER_FIRST_RESPONSE_PAY_OPTION("BuyerFirstResponsePayOption"),

    /**
     * 
     * 						eBay sent the buyer an Unpaid Item Reminder with no Pay Now
     * 						option. Waiting for the buyer's first response. It is within the 7-day
     * 						grace period. For Unpaid Item Disputes. DisputeActivity can be
     * 						SellerAddInformation or SellerCompletedTransaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponseNoPayOption")
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION("BuyerFirstResponseNoPayOption"),

    /**
     * 
     * 						eBay sent the buyer an Unpaid Item Reminder with a Pay Now
     * 						option. Waiting for the buyer's first response. The 7-day grace
     * 						period has expired. For Unpaid Item Disputes. DisputeActivity can be
     * 						SellerAddInformation, SellerCompletedTransaction, or
     * 						SellerEndCommunication.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponsePayOptionLateResponse")
    BUYER_FIRST_RESPONSE_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponsePayOptionLateResponse"),

    /**
     * 
     * 						eBay sent the buyer an Unpaid Item Reminder with no Pay Now
     * 						option. Waiting for the buyer's first response. The 7-day grace
     * 						period has expired. For Unpaid Item Disputes. DisputeActivity can be
     * 						SellerAddInformation, SellerCompletedTransaction, or
     * 						SellerEndCommunication.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponseNoPayOptionLateResponse")
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponseNoPayOptionLateResponse"),

    /**
     * 
     * 						The buyer and seller have communicated, and eBay offered the buyer
     * 						a Pay Now option. For Unpaid Item Disputes. DisputeActivity
     * 						can be SellerAddInformation, SellerCompletedTransaction,
     * 						SellerEndCommunication, or CameToAgreementNeedFVFCredit.
     * 					
     * 
     */
    @XmlEnumValue("MutualCommunicationPayOption")
    MUTUAL_COMMUNICATION_PAY_OPTION("MutualCommunicationPayOption"),

    /**
     * 
     * 				    The buyer and seller have communicated. eBay did not offer
     * 				    the buyer a Pay Now option. For Unpaid Item Disputes. DisputeActivity can
     * 						be SellerAddInformation, SellerCompletedTransaction,
     * 						SellerEndCommunication, or CameToAgreementNeedFVFCredit.
     * 					
     * 
     */
    @XmlEnumValue("MutualCommunicationNoPayOption")
    MUTUAL_COMMUNICATION_NO_PAY_OPTION("MutualCommunicationNoPayOption"),

    /**
     * 
     * 						The dispute is pending resolution. A dispute cannot be closed
     * 						when it is in this state. For Unpaid Item Disputes.
     * 						No values of DisputeActivity are valid.
     * 					
     * 
     */
    @XmlEnumValue("PendingResolve")
    PENDING_RESOLVE("PendingResolve"),

    /**
     * 
     * 						The buyer and seller have agreed within the grace period not
     * 						to complete the transaction. For Unpaid Item Disputes.
     * 						DisputeActivity can be SellerAddInformation.
     * 					
     * 
     */
    @XmlEnumValue("MutualWithdrawalAgreement")
    MUTUAL_WITHDRAWAL_AGREEMENT("MutualWithdrawalAgreement"),

    /**
     * 
     * 						The buyer and seller have agreed not to complete the
     * 						transaction, after the grace period. For Unpaid Item Disputes.
     * 						DisputeActivity can be SellerAddInformation,
     * 						SellerCompletedTransaction, or SellerEndCommunication.
     * 					
     * 
     */
    @XmlEnumValue("MutualWithdrawalAgreementLate")
    MUTUAL_WITHDRAWAL_AGREEMENT_LATE("MutualWithdrawalAgreementLate"),

    /**
     * 
     * 						The buyer filed an Item Not Received dispute, and the seller
     * 						has not responded. For Item Not Received disputes. DisputeActivity
     * 						can be SellerOffersRefund, SellerShippedItem, or SellerComment.
     * 					
     * 
     */
    @XmlEnumValue("NotReceivedNoSellerResponse")
    NOT_RECEIVED_NO_SELLER_RESPONSE("NotReceivedNoSellerResponse"),

    /**
     * 
     * 						The buyer filed an Item Not Received dispute for an item
     * 						significantly not as described, and the seller has not responded.
     * 						DisputeActivity can be SellerOffersRefund or SellerComment.
     * 					
     * 
     */
    @XmlEnumValue("NotAsDescribedNoSellerResponse")
    NOT_AS_DESCRIBED_NO_SELLER_RESPONSE("NotAsDescribedNoSellerResponse"),

    /**
     * 
     * 						The buyer filed an Item Not Received dispute and is
     * 						communicating with the seller. DisputeActivity can be
     * 						SellerOffersRefund, SellerShippedItem, or SellerComment.
     * 					
     * 
     */
    @XmlEnumValue("NotReceivedMutualCommunication")
    NOT_RECEIVED_MUTUAL_COMMUNICATION("NotReceivedMutualCommunication"),

    /**
     * 
     * 						The buyer filed an Item Not Received dispute for an item
     * 						significantly not as described and is communicating with the seller.
     * 						DisputeActivity can be SellerOffersRefund.
     * 					
     * 
     */
    @XmlEnumValue("NotAsDescribedMutualCommunication")
    NOT_AS_DESCRIBED_MUTUAL_COMMUNICATION("NotAsDescribedMutualCommunication"),

    /**
     * 
     * 						The seller says mutual agreement has been reached and is
     * 						waiting for the buyer to confirm, or the buyer is returning the item
     * 						to the seller. DisputeActivity can be SellerAddInformation.
     * 						For Unpaid Item Disputes.
     * 					
     * 
     */
    @XmlEnumValue("MutualAgreementOrBuyerReturningItem")
    MUTUAL_AGREEMENT_OR_BUYER_RETURNING_ITEM("MutualAgreementOrBuyerReturningItem"),

    /**
     * 
     * 						The claim was assigned to an adjuster.
     * 					
     * 
     */
    @XmlEnumValue("ClaimOpened")
    CLAIM_OPENED("ClaimOpened"),

    /**
     * 
     * 						The buyer was contacted by eBay and asked to submit paperwork to
     * 						support the claim.
     * 					
     * 
     */
    @XmlEnumValue("NoDocumentation")
    NO_DOCUMENTATION("NoDocumentation"),

    /**
     * 
     * 						The buyer did not respond to verification or was missing paperwork.
     * 					
     * 
     */
    @XmlEnumValue("ClaimClosed")
    CLAIM_CLOSED("ClaimClosed"),

    /**
     * 
     * 						The buyer is not eligible for reimbursement.
     * 					
     * 
     */
    @XmlEnumValue("ClaimDenied")
    CLAIM_DENIED("ClaimDenied"),

    /**
     * 
     * 						Paperwork was received from the buyer and the claim is being investigated.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPending")
    CLAIM_PENDING("ClaimPending"),

    /**
     * 
     * 						The buyer's claim was approved for reimbursement and was
     * 						sent to accounts payable for payment.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaymentPending")
    CLAIM_PAYMENT_PENDING("ClaimPaymentPending"),

    /**
     * 
     * 						The buyer was reimbursed.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaid")
    CLAIM_PAID("ClaimPaid"),

    /**
     * 
     * 						The issue has been resolved: the seller sent the item or a refund.
     * 					
     * 
     */
    @XmlEnumValue("ClaimResolved")
    CLAIM_RESOLVED("ClaimResolved"),

    /**
     * 
     * 						A claim was submitted (via Web).
     * 					
     * 
     */
    @XmlEnumValue("ClaimSubmitted")
    CLAIM_SUBMITTED("ClaimSubmitted"),

    /**
     * 
     * 						The unpaid item dispute is open.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemOpen")
    UNPAID_ITEM_OPEN("UnpaidItemOpen"),

    /**
     * 
     * 						An unpaid item dispute filed by the Unpaid Item Assistance mechanism was
     * 						disabled by eBay (for example, eBay detected that payment was initiated
     * 						and the seller needs to manually handle this dispute).
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistanceDisabledByeBay")
    UPI_ASSISTANCE_DISABLED_BYE_BAY("UPIAssistanceDisabledByeBay"),

    /**
     * 
     * 						An unpaid item dispute filed by the Unpaid Item Assistance mechanism was
     * 						disabled by the seller (e.g. the buyer and seller have communicated
     * 						about payment and the seller wishes to extend the time for payment
     * 						and not let the automatic process close the dispute 4 days after the
     * 						dispute was automatically opened).
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistanceDisabledBySeller")
    UPI_ASSISTANCE_DISABLED_BY_SELLER("UPIAssistanceDisabledBySeller"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeStateCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeStateCodeType fromValue(String v) {
        for (DisputeStateCodeType c: DisputeStateCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
