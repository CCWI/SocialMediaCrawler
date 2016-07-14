
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Responds with information about content in a Picture Manager album
 * 				or the account settings.
 * 			
 * 
 * <p>Java class for GetPictureManagerDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPictureManagerDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PictureManagerDetails" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPictureManagerDetailsResponseType", propOrder = {
    "pictureManagerDetails"
})
public class GetPictureManagerDetailsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureManagerDetails")
    protected PictureManagerDetailsType pictureManagerDetails;

    /**
     * Gets the value of the pictureManagerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerDetailsType }
     *     
     */
    public PictureManagerDetailsType getPictureManagerDetails() {
        return pictureManagerDetails;
    }

    /**
     * Sets the value of the pictureManagerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerDetailsType }
     *     
     */
    public void setPictureManagerDetails(PictureManagerDetailsType value) {
        this.pictureManagerDetails = value;
    }

}
