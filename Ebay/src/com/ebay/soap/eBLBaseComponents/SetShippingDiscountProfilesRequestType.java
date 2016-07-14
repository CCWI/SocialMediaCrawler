
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to define shipping cost discount profiles for things such as combined
 * 				payments for shipping and handling costs.
 * 			
 * 
 * <p>Java class for SetShippingDiscountProfilesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetShippingDiscountProfilesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyID" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="CombinedDuration" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="ModifyActionCode" type="{urn:ebay:apis:eBLBaseComponents}ModifyActionCodeType" minOccurs="0"/>
 *         &lt;element name="FlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedHandlingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedHandlingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscountDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalShippingDiscountDetailsType" minOccurs="0"/>
 *         &lt;element name="ShippingInsurance" type="{urn:ebay:apis:eBLBaseComponents}ShippingInsuranceType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingInsurance" type="{urn:ebay:apis:eBLBaseComponents}ShippingInsuranceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetShippingDiscountProfilesRequestType", propOrder = {
    "currencyID",
    "combinedDuration",
    "modifyActionCode",
    "flatShippingDiscount",
    "calculatedShippingDiscount",
    "calculatedHandlingDiscount",
    "promotionalShippingDiscountDetails",
    "shippingInsurance",
    "internationalShippingInsurance"
})
public class SetShippingDiscountProfilesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CurrencyID")
    protected CurrencyCodeType currencyID;
    @XmlElement(name = "CombinedDuration")
    protected CombinedPaymentPeriodCodeType combinedDuration;
    @XmlElement(name = "ModifyActionCode")
    protected ModifyActionCodeType modifyActionCode;
    @XmlElement(name = "FlatShippingDiscount")
    protected FlatShippingDiscountType flatShippingDiscount;
    @XmlElement(name = "CalculatedShippingDiscount")
    protected CalculatedShippingDiscountType calculatedShippingDiscount;
    @XmlElement(name = "CalculatedHandlingDiscount")
    protected CalculatedHandlingDiscountType calculatedHandlingDiscount;
    @XmlElement(name = "PromotionalShippingDiscountDetails")
    protected PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
    @XmlElement(name = "ShippingInsurance")
    protected ShippingInsuranceType shippingInsurance;
    @XmlElement(name = "InternationalShippingInsurance")
    protected ShippingInsuranceType internationalShippingInsurance;

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyID(CurrencyCodeType value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the combinedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public CombinedPaymentPeriodCodeType getCombinedDuration() {
        return combinedDuration;
    }

    /**
     * Sets the value of the combinedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public void setCombinedDuration(CombinedPaymentPeriodCodeType value) {
        this.combinedDuration = value;
    }

    /**
     * Gets the value of the modifyActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyActionCodeType }
     *     
     */
    public ModifyActionCodeType getModifyActionCode() {
        return modifyActionCode;
    }

    /**
     * Sets the value of the modifyActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyActionCodeType }
     *     
     */
    public void setModifyActionCode(ModifyActionCodeType value) {
        this.modifyActionCode = value;
    }

    /**
     * Gets the value of the flatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getFlatShippingDiscount() {
        return flatShippingDiscount;
    }

    /**
     * Sets the value of the flatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setFlatShippingDiscount(FlatShippingDiscountType value) {
        this.flatShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getCalculatedShippingDiscount() {
        return calculatedShippingDiscount;
    }

    /**
     * Sets the value of the calculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.calculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedHandlingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public CalculatedHandlingDiscountType getCalculatedHandlingDiscount() {
        return calculatedHandlingDiscount;
    }

    /**
     * Sets the value of the calculatedHandlingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public void setCalculatedHandlingDiscount(CalculatedHandlingDiscountType value) {
        this.calculatedHandlingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public PromotionalShippingDiscountDetailsType getPromotionalShippingDiscountDetails() {
        return promotionalShippingDiscountDetails;
    }

    /**
     * Sets the value of the promotionalShippingDiscountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public void setPromotionalShippingDiscountDetails(PromotionalShippingDiscountDetailsType value) {
        this.promotionalShippingDiscountDetails = value;
    }

    /**
     * Gets the value of the shippingInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public ShippingInsuranceType getShippingInsurance() {
        return shippingInsurance;
    }

    /**
     * Sets the value of the shippingInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public void setShippingInsurance(ShippingInsuranceType value) {
        this.shippingInsurance = value;
    }

    /**
     * Gets the value of the internationalShippingInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public ShippingInsuranceType getInternationalShippingInsurance() {
        return internationalShippingInsurance;
    }

    /**
     * Sets the value of the internationalShippingInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public void setInternationalShippingInsurance(ShippingInsuranceType value) {
        this.internationalShippingInsurance = value;
    }

}
