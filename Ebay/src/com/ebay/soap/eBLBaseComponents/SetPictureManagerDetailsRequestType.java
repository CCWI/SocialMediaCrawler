
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      Creates, updates, or deletes Picture Manager account settings, folders, or pictures.
 * 	    
 * 
 * <p>Java class for SetPictureManagerDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPictureManagerDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PictureManagerDetails" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerDetailsType" minOccurs="0"/>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerActionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPictureManagerDetailsRequestType", propOrder = {
    "pictureManagerDetails",
    "action"
})
public class SetPictureManagerDetailsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureManagerDetails")
    protected PictureManagerDetailsType pictureManagerDetails;
    @XmlElement(name = "Action")
    protected PictureManagerActionCodeType action;

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

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerActionCodeType }
     *     
     */
    public PictureManagerActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerActionCodeType }
     *     
     */
    public void setAction(PictureManagerActionCodeType value) {
        this.action = value;
    }

}
