
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialAddressTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SocialAddressTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="Twitter"/>
 *     &lt;enumeration value="Linkedin"/>
 *     &lt;enumeration value="GooglePlus"/>
 *     &lt;enumeration value="Myspace"/>
 *     &lt;enumeration value="Orkut"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SocialAddressTypeCodeType")
@XmlEnum
public enum SocialAddressTypeCodeType {


    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's Facebook account.
     * 					
     * 
     */
    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),

    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's Twitter account.
     * 					
     * 
     */
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),

    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's LinkedIn account.
     * 					
     * 
     */
    @XmlEnumValue("Linkedin")
    LINKEDIN("Linkedin"),

    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's Google+ account.
     * 					
     * 
     */
    @XmlEnumValue("GooglePlus")
    GOOGLE_PLUS("GooglePlus"),

    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's MySpace account.
     * 					
     * 
     */
    @XmlEnumValue("Myspace")
    MYSPACE("Myspace"),

    /**
     * 
     * 						This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * 						is associated with the nonprofit company's Orkut account.
     * 					
     * 
     */
    @XmlEnumValue("Orkut")
    ORKUT("Orkut"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SocialAddressTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SocialAddressTypeCodeType fromValue(String v) {
        for (SocialAddressTypeCodeType c: SocialAddressTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
