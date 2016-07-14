
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MoneyBack"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="MerchandiseCredit"/>
 *     &lt;enumeration value="MoneyBackOrExchange"/>
 *     &lt;enumeration value="MoneyBackOrReplacement"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundOptionsCodeType")
@XmlEnum
public enum RefundOptionsCodeType {


    /**
     * 
     * 						This value indicates that the seller will refund the buyer the cost of the item, excluding shipping and handling costs and any restocking fee (US only). 
     * 						<br><br>
     * 						The seller should use the <b>ReturnPolicy.Description</b> field in the Add API call to explain how the refund will be handled (such as whether the refund will occur via PayPal).
     * 					
     * 
     */
    @XmlEnumValue("MoneyBack")
    MONEY_BACK("MoneyBack"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This value is deprecated on the US site, and all listings attempting to use this
     * 						value will be blocked.
     * 						</span>
     * 						This value indicates that the seller will exchange the returned item for another item. 
     * 						The seller should use the <b>ReturnPolicy.Description</b> field in the Add API call to explain how this will occur (such as whether the seller will send an identical item in place of the returned item).
     * 					
     * 
     */
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This value is deprecated on the US site, and all listings attempting to use this
     * 						value will be blocked.
     * 						</span>
     * 						The seller will give the buyer a credit toward the purchase of another item. The seller should use the <b>ReturnPolicy.Description</b> field in the Add API call to explain how the buyer can redeem this credit.
     * 					
     * 
     */
    @XmlEnumValue("MerchandiseCredit")
    MERCHANDISE_CREDIT("MerchandiseCredit"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						US sellers opted into eBay-managed returns, that are willing to refund buyers or offer an identical replacement item, should use the 'MoneyBackOrReplacement' value instead of 'MoneyBackOrExchange'. 
     * 						</span>
     * 						This value indicates that the seller will refund the buyer the cost of the item, excluding shipping and handling costs and any restocking fee (US only), or the seller will exchange the returned item for another identical/similar item.
     * 						<br><br> 
     * 						The seller should use the <b>ReturnPolicy.Description</b> field in the Add API call to explain how the refund will be handled, such as whether the refund will occur via PayPal, or how the exchange will occur, such as whether the seller will send an identical item in place of the returned item.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBackOrExchange")
    MONEY_BACK_OR_EXCHANGE("MoneyBackOrExchange"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This value is only available on the US site. US sellers opted into eBay-managed returns should use this value (and not 'MoneyBackOrExchange') if they are willing to refund buyers or offer an identical replacement item.
     * 						</span>
     * 						This value indicates that the seller will refund the buyer the cost of the item (excluding shipping and handling costs and any restocking fee) through eBay-managed returns, or the seller will replace the returned item with another identical item.
     * 						<br><br> 
     * 						The seller should use the <b>ReturnPolicy.Description</b> field in the Add API call to explain to buyer that are refunds and replacements will be handled through the eBay-managed returns process.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBackOrReplacement")
    MONEY_BACK_OR_REPLACEMENT("MoneyBackOrReplacement"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundOptionsCodeType fromValue(String v) {
        for (RefundOptionsCodeType c: RefundOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
