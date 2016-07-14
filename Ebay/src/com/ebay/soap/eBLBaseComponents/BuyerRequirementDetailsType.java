
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Type defining the <b>BuyerRequirementDetails</b> container, which allows the 
 * 				seller to set buyer requirements at the listing level. For the corresponding listing, 
 * 				all buyer requirement values/settings will overwrite values/settings in Buyer Requirements 
 * 				preferences in My eBay.
 * 			
 * 
 * <p>Java class for BuyerRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerRequirementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipToRegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ZeroFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}MaximumItemRequirementsType" minOccurs="0"/>
 *         &lt;element name="LinkedPayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifiedUserRequirements" type="{urn:ebay:apis:eBLBaseComponents}VerifiedUserRequirementsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesInfo" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesInfoType" minOccurs="0"/>
 *         &lt;element name="MaximumBuyerPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}MaximumBuyerPolicyViolationsType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerRequirementDetailsType", propOrder = {
    "shipToRegistrationCountry",
    "zeroFeedbackScore",
    "minimumFeedbackScore",
    "maximumItemRequirements",
    "linkedPayPalAccount",
    "verifiedUserRequirements",
    "maximumUnpaidItemStrikesInfo",
    "maximumBuyerPolicyViolations",
    "any"
})
public class BuyerRequirementDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShipToRegistrationCountry")
    protected Boolean shipToRegistrationCountry;
    @XmlElement(name = "ZeroFeedbackScore")
    protected Boolean zeroFeedbackScore;
    @XmlElement(name = "MinimumFeedbackScore")
    protected Integer minimumFeedbackScore;
    @XmlElement(name = "MaximumItemRequirements")
    protected MaximumItemRequirementsType maximumItemRequirements;
    @XmlElement(name = "LinkedPayPalAccount")
    protected Boolean linkedPayPalAccount;
    @XmlElement(name = "VerifiedUserRequirements")
    protected VerifiedUserRequirementsType verifiedUserRequirements;
    @XmlElement(name = "MaximumUnpaidItemStrikesInfo")
    protected MaximumUnpaidItemStrikesInfoType maximumUnpaidItemStrikesInfo;
    @XmlElement(name = "MaximumBuyerPolicyViolations")
    protected MaximumBuyerPolicyViolationsType maximumBuyerPolicyViolations;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shipToRegistrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipToRegistrationCountry() {
        return shipToRegistrationCountry;
    }

    /**
     * Sets the value of the shipToRegistrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipToRegistrationCountry(Boolean value) {
        this.shipToRegistrationCountry = value;
    }

    /**
     * Gets the value of the zeroFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroFeedbackScore() {
        return zeroFeedbackScore;
    }

    /**
     * Sets the value of the zeroFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroFeedbackScore(Boolean value) {
        this.zeroFeedbackScore = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumFeedbackScore(Integer value) {
        this.minimumFeedbackScore = value;
    }

    /**
     * Gets the value of the maximumItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumItemRequirementsType }
     *     
     */
    public MaximumItemRequirementsType getMaximumItemRequirements() {
        return maximumItemRequirements;
    }

    /**
     * Sets the value of the maximumItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumItemRequirementsType }
     *     
     */
    public void setMaximumItemRequirements(MaximumItemRequirementsType value) {
        this.maximumItemRequirements = value;
    }

    /**
     * Gets the value of the linkedPayPalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkedPayPalAccount() {
        return linkedPayPalAccount;
    }

    /**
     * Sets the value of the linkedPayPalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkedPayPalAccount(Boolean value) {
        this.linkedPayPalAccount = value;
    }

    /**
     * Gets the value of the verifiedUserRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedUserRequirementsType }
     *     
     */
    public VerifiedUserRequirementsType getVerifiedUserRequirements() {
        return verifiedUserRequirements;
    }

    /**
     * Sets the value of the verifiedUserRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedUserRequirementsType }
     *     
     */
    public void setVerifiedUserRequirements(VerifiedUserRequirementsType value) {
        this.verifiedUserRequirements = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesInfoType }
     *     
     */
    public MaximumUnpaidItemStrikesInfoType getMaximumUnpaidItemStrikesInfo() {
        return maximumUnpaidItemStrikesInfo;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesInfoType }
     *     
     */
    public void setMaximumUnpaidItemStrikesInfo(MaximumUnpaidItemStrikesInfoType value) {
        this.maximumUnpaidItemStrikesInfo = value;
    }

    /**
     * Gets the value of the maximumBuyerPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBuyerPolicyViolationsType }
     *     
     */
    public MaximumBuyerPolicyViolationsType getMaximumBuyerPolicyViolations() {
        return maximumBuyerPolicyViolations;
    }

    /**
     * Sets the value of the maximumBuyerPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBuyerPolicyViolationsType }
     *     
     */
    public void setMaximumBuyerPolicyViolations(MaximumBuyerPolicyViolationsType value) {
        this.maximumBuyerPolicyViolations = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
