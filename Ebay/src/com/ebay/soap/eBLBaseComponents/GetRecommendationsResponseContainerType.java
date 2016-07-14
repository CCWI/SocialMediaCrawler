
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
 * 				Returns recommended changes or opportunities for improvement
 * 				related to listing data that was passed in a GetItemRecommendations request.
 * 			
 * 
 * <p>Java class for GetRecommendationsResponseContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecommendationsResponseContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingAnalyzerRecommendations" type="{urn:ebay:apis:eBLBaseComponents}ListingAnalyzerRecommendationsType" minOccurs="0"/>
 *         &lt;element name="SIFFTASRecommendations" type="{urn:ebay:apis:eBLBaseComponents}SIFFTASRecommendationsType" minOccurs="0"/>
 *         &lt;element name="PricingRecommendations" type="{urn:ebay:apis:eBLBaseComponents}PricingRecommendationsType" minOccurs="0"/>
 *         &lt;element name="AttributeRecommendations" type="{urn:ebay:apis:eBLBaseComponents}AttributeRecommendationsType" minOccurs="0"/>
 *         &lt;element name="ProductRecommendations" type="{urn:ebay:apis:eBLBaseComponents}ProductRecommendationsType" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recommendations" type="{urn:ebay:apis:eBLBaseComponents}RecommendationsType" minOccurs="0"/>
 *         &lt;element name="ProductListingDetails" type="{urn:ebay:apis:eBLBaseComponents}ProductListingDetailsType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetRecommendationsResponseContainerType", propOrder = {
    "listingAnalyzerRecommendations",
    "sifftasRecommendations",
    "pricingRecommendations",
    "attributeRecommendations",
    "productRecommendations",
    "correlationID",
    "recommendations",
    "productListingDetails",
    "title",
    "any"
})
public class GetRecommendationsResponseContainerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingAnalyzerRecommendations")
    protected ListingAnalyzerRecommendationsType listingAnalyzerRecommendations;
    @XmlElement(name = "SIFFTASRecommendations")
    protected SIFFTASRecommendationsType sifftasRecommendations;
    @XmlElement(name = "PricingRecommendations")
    protected PricingRecommendationsType pricingRecommendations;
    @XmlElement(name = "AttributeRecommendations")
    protected AttributeRecommendationsType attributeRecommendations;
    @XmlElement(name = "ProductRecommendations")
    protected ProductRecommendationsType productRecommendations;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "Recommendations")
    protected RecommendationsType recommendations;
    @XmlElement(name = "ProductListingDetails")
    protected ProductListingDetailsType productListingDetails;
    @XmlElement(name = "Title")
    protected String title;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the listingAnalyzerRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingAnalyzerRecommendationsType }
     *     
     */
    public ListingAnalyzerRecommendationsType getListingAnalyzerRecommendations() {
        return listingAnalyzerRecommendations;
    }

    /**
     * Sets the value of the listingAnalyzerRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingAnalyzerRecommendationsType }
     *     
     */
    public void setListingAnalyzerRecommendations(ListingAnalyzerRecommendationsType value) {
        this.listingAnalyzerRecommendations = value;
    }

    /**
     * Gets the value of the sifftasRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link SIFFTASRecommendationsType }
     *     
     */
    public SIFFTASRecommendationsType getSIFFTASRecommendations() {
        return sifftasRecommendations;
    }

    /**
     * Sets the value of the sifftasRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFFTASRecommendationsType }
     *     
     */
    public void setSIFFTASRecommendations(SIFFTASRecommendationsType value) {
        this.sifftasRecommendations = value;
    }

    /**
     * Gets the value of the pricingRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link PricingRecommendationsType }
     *     
     */
    public PricingRecommendationsType getPricingRecommendations() {
        return pricingRecommendations;
    }

    /**
     * Sets the value of the pricingRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingRecommendationsType }
     *     
     */
    public void setPricingRecommendations(PricingRecommendationsType value) {
        this.pricingRecommendations = value;
    }

    /**
     * Gets the value of the attributeRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRecommendationsType }
     *     
     */
    public AttributeRecommendationsType getAttributeRecommendations() {
        return attributeRecommendations;
    }

    /**
     * Sets the value of the attributeRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRecommendationsType }
     *     
     */
    public void setAttributeRecommendations(AttributeRecommendationsType value) {
        this.attributeRecommendations = value;
    }

    /**
     * Gets the value of the productRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRecommendationsType }
     *     
     */
    public ProductRecommendationsType getProductRecommendations() {
        return productRecommendations;
    }

    /**
     * Sets the value of the productRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRecommendationsType }
     *     
     */
    public void setProductRecommendations(ProductRecommendationsType value) {
        this.productRecommendations = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationsType }
     *     
     */
    public RecommendationsType getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationsType }
     *     
     */
    public void setRecommendations(RecommendationsType value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the productListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductListingDetailsType }
     *     
     */
    public ProductListingDetailsType getProductListingDetails() {
        return productListingDetails;
    }

    /**
     * Sets the value of the productListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListingDetailsType }
     *     
     */
    public void setProductListingDetails(ProductListingDetailsType value) {
        this.productListingDetails = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
