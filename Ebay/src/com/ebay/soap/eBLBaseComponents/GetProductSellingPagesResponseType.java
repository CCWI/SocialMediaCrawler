
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated as the call is no longer available.
 * 				
 * 			
 * 
 * <p>Java class for GetProductSellingPagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSellingPagesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ProductSellingPagesData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSellingPagesResponseType", propOrder = {
    "productSellingPagesData"
})
public class GetProductSellingPagesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductSellingPagesData")
    protected String productSellingPagesData;

    /**
     * Gets the value of the productSellingPagesData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSellingPagesData() {
        return productSellingPagesData;
    }

    /**
     * Sets the value of the productSellingPagesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSellingPagesData(String value) {
        this.productSellingPagesData = value;
    }

}
