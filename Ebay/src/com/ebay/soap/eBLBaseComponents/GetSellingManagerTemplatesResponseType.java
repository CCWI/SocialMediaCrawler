
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the templates requested on input. 
 * 				Each SellingManagerTemplateType object in the response contains the data for one
 * 				Selling Manager template.
 * 			
 * 
 * <p>Java class for GetSellingManagerTemplatesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerTemplatesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerTemplateDetailsArray" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerTemplateDetailsArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerTemplatesResponseType", propOrder = {
    "sellingManagerTemplateDetailsArray"
})
public class GetSellingManagerTemplatesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerTemplateDetailsArray")
    protected SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray;

    /**
     * Gets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public SellingManagerTemplateDetailsArrayType getSellingManagerTemplateDetailsArray() {
        return sellingManagerTemplateDetailsArray;
    }

    /**
     * Sets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public void setSellingManagerTemplateDetailsArray(SellingManagerTemplateDetailsArrayType value) {
        this.sellingManagerTemplateDetailsArray = value;
    }

}
