
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      Returned after calling SetStoreCustomPageRequest. This serves as
 * 	      confirmation that the custom page was successfully submitted.
 * 	    
 * 
 * <p>Java class for SetStoreCustomPageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStoreCustomPageResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CustomPage" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomPageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStoreCustomPageResponseType", propOrder = {
    "customPage"
})
public class SetStoreCustomPageResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CustomPage")
    protected StoreCustomPageType customPage;

    /**
     * Gets the value of the customPage property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomPageType }
     *     
     */
    public StoreCustomPageType getCustomPage() {
        return customPage;
    }

    /**
     * Sets the value of the customPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomPageType }
     *     
     */
    public void setCustomPage(StoreCustomPageType value) {
        this.customPage = value;
    }

}
