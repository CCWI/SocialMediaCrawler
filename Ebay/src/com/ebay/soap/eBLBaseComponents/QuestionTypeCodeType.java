
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="MultipleItemShipping"/>
 *     &lt;enumeration value="CustomizedSubject"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "QuestionTypeCodeType")
@XmlEnum
public enum QuestionTypeCodeType {


    /**
     * 
     * 			  		General questions about the item.
     * 			  	
     * 
     */
    @XmlEnumValue("General")
    GENERAL("General"),

    /**
     * 
     * 						 Questions related to the shipping of the item.
     * 					
     * 
     */
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),

    /**
     * 
     * 						Questions related to the payment for the item.
     * 					
     * 
     */
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),

    /**
     * 
     * 						Questions related to the shipping of this item
     * 						bundled with other items also purchased on eBay.
     * 					
     * 
     */
    @XmlEnumValue("MultipleItemShipping")
    MULTIPLE_ITEM_SHIPPING("MultipleItemShipping"),

    /**
     * 
     * 						Customized subjects set by the seller using
     * 						SetMessagePreferences or the eBay Web site.
     * 					
     * 
     */
    @XmlEnumValue("CustomizedSubject")
    CUSTOMIZED_SUBJECT("CustomizedSubject"),

    /**
     * 
     * 						No question type applies. This value
     * 						doesn't apply to AddMemberMessageAAQToPartner.
     * 						Note that the value of None can apply if
     * 						Messages.Message.MessageType isn't set to AskSellerQuestion.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuestionTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionTypeCodeType fromValue(String v) {
        for (QuestionTypeCodeType c: QuestionTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
