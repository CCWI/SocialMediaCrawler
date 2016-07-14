
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the Store preferences retrieved for a user.
 * 			
 * 
 * <p>Java class for GetStorePreferencesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStorePreferencesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="StorePreferences" type="{urn:ebay:apis:eBLBaseComponents}StorePreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStorePreferencesResponseType", propOrder = {
    "storePreferences"
})
public class GetStorePreferencesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StorePreferences")
    protected StorePreferencesType storePreferences;

    /**
     * Gets the value of the storePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link StorePreferencesType }
     *     
     */
    public StorePreferencesType getStorePreferences() {
        return storePreferences;
    }

    /**
     * Sets the value of the storePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorePreferencesType }
     *     
     */
    public void setStorePreferences(StorePreferencesType value) {
        this.storePreferences = value;
    }

}
