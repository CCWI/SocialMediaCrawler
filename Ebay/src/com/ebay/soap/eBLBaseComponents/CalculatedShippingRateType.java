
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
 * 				Details pertinent to one or more items for which
 * 				calculated shipping (or flat rate shipping using shipping rate tables with
 * 				weight surcharges) has been offered by the seller, such as package
 * 				dimension and weight and packaging/handling costs. Also returned
 * 				with the data for an item's transaction.
 * 				<br><br>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					The <strong>CalculatedShippingRate</strong> container should only be used to specify values for the <strong>InternationalPackagingHandlingCosts</strong>, <strong>OriginatingPostalCode</strong>, and/or <strong>PackagingHandlingCosts</strong> fields. The rest of the fields in the <strong>CalculatedShippingRate</strong> container are used to specify package dimensions and package weight, and these values should now be specified in the <strong>ShippingPackageDetails</strong> container instead.
 * 				</span>
 * 			
 * 
 * <p>Java class for CalculatedShippingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginatingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasurementUnit" type="{urn:ebay:apis:eBLBaseComponents}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="PackageDepth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageLength" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageWidth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackagingHandlingCosts" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingIrregular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="WeightMajor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="WeightMinor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="InternationalPackagingHandlingCosts" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "CalculatedShippingRateType", propOrder = {
    "originatingPostalCode",
    "measurementUnit",
    "packageDepth",
    "packageLength",
    "packageWidth",
    "packagingHandlingCosts",
    "shippingIrregular",
    "shippingPackage",
    "weightMajor",
    "weightMinor",
    "internationalPackagingHandlingCosts",
    "any"
})
public class CalculatedShippingRateType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OriginatingPostalCode")
    protected String originatingPostalCode;
    @XmlElement(name = "MeasurementUnit")
    protected MeasurementSystemCodeType measurementUnit;
    @XmlElement(name = "PackageDepth")
    protected MeasureType packageDepth;
    @XmlElement(name = "PackageLength")
    protected MeasureType packageLength;
    @XmlElement(name = "PackageWidth")
    protected MeasureType packageWidth;
    @XmlElement(name = "PackagingHandlingCosts")
    protected AmountType packagingHandlingCosts;
    @XmlElement(name = "ShippingIrregular")
    protected Boolean shippingIrregular;
    @XmlElement(name = "ShippingPackage")
    protected ShippingPackageCodeType shippingPackage;
    @XmlElement(name = "WeightMajor")
    protected MeasureType weightMajor;
    @XmlElement(name = "WeightMinor")
    protected MeasureType weightMinor;
    @XmlElement(name = "InternationalPackagingHandlingCosts")
    protected AmountType internationalPackagingHandlingCosts;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the originatingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingPostalCode() {
        return originatingPostalCode;
    }

    /**
     * Sets the value of the originatingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingPostalCode(String value) {
        this.originatingPostalCode = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystemCodeType }
     *     
     */
    public MeasurementSystemCodeType getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystemCodeType }
     *     
     */
    public void setMeasurementUnit(MeasurementSystemCodeType value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the packageDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageDepth() {
        return packageDepth;
    }

    /**
     * Sets the value of the packageDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageDepth(MeasureType value) {
        this.packageDepth = value;
    }

    /**
     * Gets the value of the packageLength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageLength() {
        return packageLength;
    }

    /**
     * Sets the value of the packageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageLength(MeasureType value) {
        this.packageLength = value;
    }

    /**
     * Gets the value of the packageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageWidth() {
        return packageWidth;
    }

    /**
     * Sets the value of the packageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageWidth(MeasureType value) {
        this.packageWidth = value;
    }

    /**
     * Gets the value of the packagingHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPackagingHandlingCosts() {
        return packagingHandlingCosts;
    }

    /**
     * Sets the value of the packagingHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPackagingHandlingCosts(AmountType value) {
        this.packagingHandlingCosts = value;
    }

    /**
     * Gets the value of the shippingIrregular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIrregular() {
        return shippingIrregular;
    }

    /**
     * Sets the value of the shippingIrregular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIrregular(Boolean value) {
        this.shippingIrregular = value;
    }

    /**
     * Gets the value of the shippingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }

    /**
     * Sets the value of the shippingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType value) {
        this.shippingPackage = value;
    }

    /**
     * Gets the value of the weightMajor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMajor() {
        return weightMajor;
    }

    /**
     * Sets the value of the weightMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMajor(MeasureType value) {
        this.weightMajor = value;
    }

    /**
     * Gets the value of the weightMinor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMinor() {
        return weightMinor;
    }

    /**
     * Sets the value of the weightMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMinor(MeasureType value) {
        this.weightMinor = value;
    }

    /**
     * Gets the value of the internationalPackagingHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInternationalPackagingHandlingCosts() {
        return internationalPackagingHandlingCosts;
    }

    /**
     * Sets the value of the internationalPackagingHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInternationalPackagingHandlingCosts(AmountType value) {
        this.internationalPackagingHandlingCosts = value;
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
