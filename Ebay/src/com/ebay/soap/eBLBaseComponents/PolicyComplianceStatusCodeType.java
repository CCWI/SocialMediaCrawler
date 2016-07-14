
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyComplianceStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyComplianceStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="Fair"/>
 *     &lt;enumeration value="Poor"/>
 *     &lt;enumeration value="Failing"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PolicyComplianceStatusCodeType")
@XmlEnum
public enum PolicyComplianceStatusCodeType {


    /**
     * 
     * 						You're doing a good job of selling and are in line with eBay policies.
     * 						<br><br>
     * 						Be sure to continue to follow eBay rules in your selling activities. While your
     * 						risk of restrictions is low, a future policy violation could result in a lower
     * 						policy-compliance rating.
     * 					
     * 
     */
    @XmlEnumValue("Good")
    GOOD("Good"),

    /**
     * 
     * 						You could do a better job of following eBay policies and you are at risk of
     * 						having your listings canceled.
     * 						<br><br>
     * 						Check to see what policies you violated and what steps you can take to avoid
     * 						those mistakes in the future. Additonal violations could cause eBay to cancel
     * 						your listings.
     * 					
     * 
     */
    @XmlEnumValue("Fair")
    FAIR("Fair"),

    /**
     * 
     * 						You are doing a poor job of following the eBay selling policies and rules.
     * 						Your selling status and privileges are at risk.
     * 						<br><br>
     * 						Check to see what policies you have violated and take steps improve your
     * 						selling practices. Additonal violations could cause eBay to cancel your
     * 						listings and/or add restrictions on your account. You could lose your
     * 						PowerSeller status and privileges.
     * 					
     * 
     */
    @XmlEnumValue("Poor")
    POOR("Poor"),

    /**
     * 
     * 						You need to increase your compliance with the eBay selling policies and
     * 						rules immediately. Your account is at risk and may be suspended.
     * 						<br><br>
     * 						Check the policies you violated and improve your selling practices immediately.
     * 						Additonal violations could cause eBay to cancel your listings, add restrictions
     * 						on your account, suspend your account, or take other measures. You could
     * 						lose your PowerSeller status and privileges.
     * 					
     * 
     */
    @XmlEnumValue("Failing")
    FAILING("Failing"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PolicyComplianceStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyComplianceStatusCodeType fromValue(String v) {
        for (PolicyComplianceStatusCodeType c: PolicyComplianceStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
