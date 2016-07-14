
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the Want It Now post data returned by the call. The data for the
 * 				specified post listing is returned in a WantItNowPostType object.
 *  			
 * 
 * <p>Java class for GetWantItNowPostResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWantItNowPostResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="WantItNowPost" type="{urn:ebay:apis:eBLBaseComponents}WantItNowPostType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWantItNowPostResponseType", propOrder = {
    "wantItNowPost"
})
public class GetWantItNowPostResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "WantItNowPost")
    protected WantItNowPostType wantItNowPost;

    /**
     * Gets the value of the wantItNowPost property.
     * 
     * @return
     *     possible object is
     *     {@link WantItNowPostType }
     *     
     */
    public WantItNowPostType getWantItNowPost() {
        return wantItNowPost;
    }

    /**
     * Sets the value of the wantItNowPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link WantItNowPostType }
     *     
     */
    public void setWantItNowPost(WantItNowPostType value) {
        this.wantItNowPost = value;
    }

}
