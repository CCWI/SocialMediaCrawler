
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the data describing a seller's eBay store, including name, description,
 * 				URL, and other information. The caller making the request must be the owner
 * 				of an eBay store. If the authenticated caller does not have an eBay store, the
 * 				response is an error. A successful response contains either the complete store
 * 				configuration or information about the category hierarchy for the store only.
 * 			
 * 
 * <p>Java class for GetStoreResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Store" type="{urn:ebay:apis:eBLBaseComponents}StoreType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreResponseType", propOrder = {
    "store"
})
public class GetStoreResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Store")
    protected StoreType store;

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link StoreType }
     *     
     */
    public StoreType getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreType }
     *     
     */
    public void setStore(StoreType value) {
        this.store = value;
    }

}
