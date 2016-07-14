
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="PaisaPayAccepted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="PrePayDelivery"/>
 *     &lt;enumeration value="CODPrePayDelivery"/>
 *     &lt;enumeration value="PostalTransfer"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="LoanCheck"/>
 *     &lt;enumeration value="CashInPerson"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="PaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *     &lt;enumeration value="IntegratedMerchantCreditCard"/>
 *     &lt;enumeration value="Moneybookers"/>
 *     &lt;enumeration value="Paymate"/>
 *     &lt;enumeration value="ProPay"/>
 *     &lt;enumeration value="PayOnPickup"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="StandardPayment"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *     &lt;enumeration value="QIWI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     * 						No payment method specified.
     * 						For example, no payment methods would be specified for Ad format listings.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Money order/cashiers check.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						American Express.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						Payment instructions are contained in the item's description.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						Credit card.
     * 						Not applicable to Real Estate or US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						Personal check.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						Cash on delivery.
     * 						This payment method is obsolete (ignored) for the US, US eBay Motors, UK, and Canada sites.
     * 						See "Field Differences for eBay Sites" in the eBay Web Services Guide for a list of sites
     * 						that accept COD as a payment method. Not applicable to Real Estate listings.
     * 						When revising an item (on sites that still support COD), you can add or change its value.
     * 					
     * 
     */
    COD("COD"),

    /**
     * 
     * 						Visa/Mastercard. These qualify as safe payment methods.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						PaisaPay (for India site only). This qualifies as a safe payment method and is required for all categories on the IN site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						Other forms of payment. Some custom methods are accepted by seller
     * 						as the payment method in the transaction.
     * 						Not applicable to US/CA eBay Motors listings
     * 						(see PaymentSeeDescription instead).
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						PayPal is accepted as a payment method. This qualifies as a safe payment method. If true in listing
     * 						requests, Item.PayPalEmailAddress must also be specified.<br>
     * 						<br>
     * 						If you don't pass PayPal in the listing request but the seller's eBay
     * 						preferences are set to accept PayPal on all listings,
     * 						eBay will add PayPal as a payment method for you in most cases,
     * 						and we may return a warning. <br>
     * 						<br>
     * 						PayPal must be accepted when the seller requires immediate payment
     * 						(Item.AutoPay) or offers other PayPal-based features, such as a
     * 						finance offer (Item.FinanceOfferID).
     * 						PayPal must be accepted for charity listings.
     * 						PayPal must be accepted for event ticket listings when the venue is in
     * 						New York state or Illinois, so that eBay can offer buyer protection
     * 						(per state law). (For some applications, it may be
     * 						simplest to use errors returned from VerifyAddItem to flag the PayPal
     * 						requirement for New York and Illinois ticket listings.)
     * 						PayPal must be accepted for US eBay Motors listings that require a deposit (and it will not be set automatically based on the
     * 						seller's preferences). Conversely, if PayPal is specified for US eBay Motors listings, deposit attributes must be specified.<br>
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						Discover card.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						Payment on delivery.
     * 						Not applicable to Real Estate or US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						Direct transfer of money.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						If the seller has bank account information on file, and
     * 						MoneyXferAcceptedInCheckout = true, then the bank account information will
     * 						be displayed in Checkout. Applicable only to certain global eBay sites. See
     * 						the "International Differences Overview" in the eBay Web Services Guide.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						All other online payments.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Loan check option (applicable only to the US eBay Motors site,
     * 						except in the Parts and Accessories category, and the eBay Canada site for motors).
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),

    /**
     * 
     * 						Cash-in-person option. Applicable only to US and Canada eBay Motors vehicles,
     * 						(not the Parts and Accessories category).
     * 					
     * 
     */
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						Elektronisches Lastschriftverfahren (direct debit).
     * 						Only applicable to the Express Germany site, which has been shut down.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 						PaisaPayEscrow payment option. Applicable on selected categories on the India site only.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrow")
    PAISA_PAY_ESCROW("PaisaPayEscrow"),

    /**
     * 
     * 						PaisaPayEscrowEMI (Equal Monthly Installments) Payment option.
     * 						Must be specified with PaisaPayEscrow. Applicable only to India site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						This payment method can be added only if
     * 						a seller has a payment gateway account.
     * 						You can use GetUser.User.SellerInfo.IntegratedMerchantCreditCardInfo
     * 						to determine if a seller has a payment gateway account.
     * 						If a seller successfully uses AddItem with IntegratedMerchantCreditCard,
     * 						then for the resulting item,
     * 						the IntegratedMerchantCreditCard value is a replacement
     * 						for a credit-card payment method such as VisaMC.
     * 						In such a case, the listing displays (to potential buyers) the credit cards that the
     * 						seller specified in the seller's preferences for their payment gateway account (in My eBay).
     * 						Additionally, a buyer's credit-card payment is integrated into eBay checkout.
     * 					
     * 
     */
    @XmlEnumValue("IntegratedMerchantCreditCard")
    INTEGRATED_MERCHANT_CREDIT_CARD("IntegratedMerchantCreditCard"),

    /**
     * 
     * 						The Moneybookers payment method.
     * 						For more information, see http://www.moneybookers.com/partners/us/ebay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						The Paymate payment method. This payment method is only accepted on the eBay Australia site. For more information on setting up Paymate as an accepted payment method on the eBay Australia site,
     * 						see the <a href="http://www.paymate.com/cms/index.php/sellers/sell-on-ebay/selling-on-ebay" target="_blank">Sell with Paymate on eBay.com.au</a> help page. 
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						The ProPay payment method. US site only. For more information,
     * 						see http://www.Propay.com/eBay.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						PayOnPickup payment method. PayOnPickup is the same as CashOnPickup.
     * 						For listings on the eBay US site, the user interface refers to this feature as Pay on pickup.
     * 						In the user interface of your application, please refer to the feature as Pay on pickup so that
     * 						the name in your user interface corresponds to the name on the eBay US site.
     * 					
     * 
     */
    @XmlEnumValue("PayOnPickup")
    PAY_ON_PICKUP("PayOnPickup"),

    /**
     * 
     * 						This payment method can be added only if
     * 						a seller has a IMCC payment gateway account and Diners Club card is selected in credit card preference.
     * 						Currently Dines card is enabled for CyberSource Gateway sellers.
     * 					
     * 
     */
    @XmlEnumValue("Diners")
    DINERS("Diners"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This value indicates that a debit card can be used/was used to pay for the order. This payment method value must be passed in one of the <b>Item.PaymentMethods</b> fields if the seller is making the item available for eBay Now delivery. For eBay Now orders, the eBay Now valet accepts debit cards as a form of payment. This value is only applicable for eBay Now orders.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This value indicates that a credit card can be used/was used to pay for the order. This payment method value must be passed in one of the <b>Item.PaymentMethods</b> fields if the seller is making the item available for eBay Now delivery. For eBay Now orders, the eBay Now valet accepts credit cards as a form of payment. This value is only applicable for eBay Now orders.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This buyer payment method is only applicable for the Germany site and is associated with the rollout of Progressive Checkout and the Pay Upon Invoice feature. 'PayUponInvoice' is not a payment method that is offered to the buyer, but instead, eBay/PayPal makes the determination (based on several factors) during checkout whether the buyer is eligible for 'Pay Upon Invoice'. If the buyer is offered the 'Pay Upon Invoice' option, that buyer is not required to pay for the order until an order invoice is sent by the seller. The seller must offer PayPal as a payment option or the 'Pay Upon Invoice' option will not be made available to the buyer under any circumstance.
     * 						<br><br>
     * 						Only select categories on the Germany site will support the 'Pay Upon Invoice' option, and orders going above the two-thousand dollar EURO mark will not be eligible for 'Pay Upon Invoice'.
     * 						<br><br>
     * 						Since the seller can not specify 'Pay Upon Invoice' as a payment method, this enumeration value cannot be passed into a <b>Item.PaymentMethods</b> field in an Add/Revise/Relist call.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice"),

    /**
     * 
     * 					This value indicates that QIWI can be used/was used by Russian buyers to pay for the order. This payment method value must be passed in one of the <b>Item.PaymentMethods</b> fields in an Add/Revise/Relist API call if the seller wants to make QIWI an available payment method for Russian buyers. QIWI works in conjunction with PayPal, so if 'QIWI' is set as an available payment method, 'PayPal' must be specified as well. This value can only be specified on the eBay US site, and it is only applicable for Russian buyers.
     * 				
     * 
     */
    QIWI("QIWI");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
