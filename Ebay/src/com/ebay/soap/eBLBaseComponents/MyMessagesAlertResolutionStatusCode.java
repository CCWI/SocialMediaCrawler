
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyMessagesAlertResolutionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MyMessagesAlertResolutionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="ResolvedByAutoResolution"/>
 *     &lt;enumeration value="ResolvedByUser"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MyMessagesAlertResolutionStatusCode")
@XmlEnum
public enum MyMessagesAlertResolutionStatusCode {


    /**
     * 
     * 						
     * 						The alert has not been resolved. If the alert requires user action, an unresolved status
     * 						means that the user did not take action on the alert. If the alert does not require user
     * 						action, an unresolved status means that the alert has not been read. Note that an
     * 						unresolved alert can not be deleted.
     * 					
     * 
     */
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),

    /**
     * 
     * 						
     * 						The alert was resolved by auto resolution, for example,
     * 						by expiring after a certain date.
     * 					
     * 
     */
    @XmlEnumValue("ResolvedByAutoResolution")
    RESOLVED_BY_AUTO_RESOLUTION("ResolvedByAutoResolution"),

    /**
     * 
     * 						
     * 						The alert was resolved by user. If the alert requires user action, resolved status
     * 						means that the user took the necessary action on the alert. If the alert does not require user
     * 						action, resolved status means that the alert was read by the user.
     * 					
     * 
     */
    @XmlEnumValue("ResolvedByUser")
    RESOLVED_BY_USER("ResolvedByUser"),

    /**
     * 
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MyMessagesAlertResolutionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MyMessagesAlertResolutionStatusCode fromValue(String v) {
        for (MyMessagesAlertResolutionStatusCode c: MyMessagesAlertResolutionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
