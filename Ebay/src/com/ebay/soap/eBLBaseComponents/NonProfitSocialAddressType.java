
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>NonProfitSocialAddress</b> container, which identifies the
 * 				nonprofit organization's social networking site account ID. A <b>NonProfitSocialAddress</b>
 * 				container will exist for each social networking site that the charity organization is
 * 				associated with.
 * 			
 * 
 * <p>Java class for NonProfitSocialAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonProfitSocialAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialAddressType" type="{urn:ebay:apis:eBLBaseComponents}SocialAddressTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SocialAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonProfitSocialAddressType", propOrder = {
    "socialAddressType",
    "socialAddressId"
})
public class NonProfitSocialAddressType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SocialAddressType")
    protected SocialAddressTypeCodeType socialAddressType;
    @XmlElement(name = "SocialAddressId")
    protected String socialAddressId;

    /**
     * Gets the value of the socialAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link SocialAddressTypeCodeType }
     *     
     */
    public SocialAddressTypeCodeType getSocialAddressType() {
        return socialAddressType;
    }

    /**
     * Sets the value of the socialAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialAddressTypeCodeType }
     *     
     */
    public void setSocialAddressType(SocialAddressTypeCodeType value) {
        this.socialAddressType = value;
    }

    /**
     * Gets the value of the socialAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialAddressId() {
        return socialAddressId;
    }

    /**
     * Sets the value of the socialAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialAddressId(String value) {
        this.socialAddressId = value;
    }

}
