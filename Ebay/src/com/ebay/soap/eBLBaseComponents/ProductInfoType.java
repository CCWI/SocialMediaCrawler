
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageStartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageSoldPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductState" type="{urn:ebay:apis:eBLBaseComponents}ProductStateCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="productInfoID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoType", propOrder = {
    "averageStartPrice",
    "averageSoldPrice",
    "title",
    "productState"
})
public class ProductInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AverageStartPrice")
    protected AmountType averageStartPrice;
    @XmlElement(name = "AverageSoldPrice")
    protected AmountType averageSoldPrice;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ProductState")
    protected ProductStateCodeType productState;
    @XmlAttribute
    protected String productInfoID;

    /**
     * Gets the value of the averageStartPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageStartPrice() {
        return averageStartPrice;
    }

    /**
     * Sets the value of the averageStartPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageStartPrice(AmountType value) {
        this.averageStartPrice = value;
    }

    /**
     * Gets the value of the averageSoldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageSoldPrice() {
        return averageSoldPrice;
    }

    /**
     * Sets the value of the averageSoldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageSoldPrice(AmountType value) {
        this.averageSoldPrice = value;
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
     * Gets the value of the productState property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStateCodeType }
     *     
     */
    public ProductStateCodeType getProductState() {
        return productState;
    }

    /**
     * Sets the value of the productState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStateCodeType }
     *     
     */
    public void setProductState(ProductStateCodeType value) {
        this.productState = value;
    }

    /**
     * Gets the value of the productInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInfoID() {
        return productInfoID;
    }

    /**
     * Sets the value of the productInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInfoID(String value) {
        this.productInfoID = value;
    }

}
