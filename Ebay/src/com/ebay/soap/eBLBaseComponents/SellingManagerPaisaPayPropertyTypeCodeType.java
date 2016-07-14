
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerPaisaPayPropertyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerPaisaPayPropertyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaisaPayAwaitingShipment"/>
 *     &lt;enumeration value="PaisaPayTimeExtensionRequestDeclined"/>
 *     &lt;enumeration value="PaisaPayPendingReceived"/>
 *     &lt;enumeration value="PaisaPayRefundInitiated"/>
 *     &lt;enumeration value="PaisaPayTimeExtensionRequested"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerPaisaPayPropertyTypeCodeType")
@XmlEnum
public enum SellingManagerPaisaPayPropertyTypeCodeType {


    /**
     * 
     * 						PaisaPay items awaiting shipment.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAwaitingShipment")
    PAISA_PAY_AWAITING_SHIPMENT("PaisaPayAwaitingShipment"),

    /**
     * 
     * 						PaisaPay items for which time extension requests are rejected by the buyers.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayTimeExtensionRequestDeclined")
    PAISA_PAY_TIME_EXTENSION_REQUEST_DECLINED("PaisaPayTimeExtensionRequestDeclined"),

    /**
     * 
     * 						PaisaPay items for which the item receipt has not yet been confirmed by the buyer or not
     * 						yet been auto-confirmed by the system.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayPendingReceived")
    PAISA_PAY_PENDING_RECEIVED("PaisaPayPendingReceived"),

    /**
     * 
     * 						PaisaPay items for which buyers have filed "Item not received".
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayRefundInitiated")
    PAISA_PAY_REFUND_INITIATED("PaisaPayRefundInitiated"),

    /**
     * 
     * 						PaisaPay items for which the seller has requested a time extension to enter the
     * 						shipping information.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayTimeExtensionRequested")
    PAISA_PAY_TIME_EXTENSION_REQUESTED("PaisaPayTimeExtensionRequested"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerPaisaPayPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerPaisaPayPropertyTypeCodeType fromValue(String v) {
        for (SellingManagerPaisaPayPropertyTypeCodeType c: SellingManagerPaisaPayPropertyTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
