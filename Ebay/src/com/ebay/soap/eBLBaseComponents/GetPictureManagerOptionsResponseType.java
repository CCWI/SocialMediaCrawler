
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      Returns a list of Picture Manager options and allowed values.
 * 	    
 * 
 * <p>Java class for GetPictureManagerOptionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPictureManagerOptionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerSubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PictureType" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerPictureDisplayType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPictureManagerOptionsResponseType", propOrder = {
    "subscription",
    "pictureType"
})
public class GetPictureManagerOptionsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Subscription")
    protected List<PictureManagerSubscriptionType> subscription;
    @XmlElement(name = "PictureType")
    protected List<PictureManagerPictureDisplayType> pictureType;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureManagerSubscriptionType }
     *     
     */
    public PictureManagerSubscriptionType[] getSubscription() {
        if (this.subscription == null) {
            return new PictureManagerSubscriptionType[ 0 ] ;
        }
        return ((PictureManagerSubscriptionType[]) this.subscription.toArray(new PictureManagerSubscriptionType[this.subscription.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureManagerSubscriptionType }
     *     
     */
    public PictureManagerSubscriptionType getSubscription(int idx) {
        if (this.subscription == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.subscription.get(idx);
    }

    public int getSubscriptionLength() {
        if (this.subscription == null) {
            return  0;
        }
        return this.subscription.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureManagerSubscriptionType }
     *     
     */
    public void setSubscription(PictureManagerSubscriptionType[] values) {
        this._getSubscription().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.subscription.add(values[i]);
        }
    }

    protected List<PictureManagerSubscriptionType> _getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<PictureManagerSubscriptionType>();
        }
        return subscription;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerSubscriptionType }
     *     
     */
    public PictureManagerSubscriptionType setSubscription(int idx, PictureManagerSubscriptionType value) {
        return this.subscription.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType[] getPictureType() {
        if (this.pictureType == null) {
            return new PictureManagerPictureDisplayType[ 0 ] ;
        }
        return ((PictureManagerPictureDisplayType[]) this.pictureType.toArray(new PictureManagerPictureDisplayType[this.pictureType.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType getPictureType(int idx) {
        if (this.pictureType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureType.get(idx);
    }

    public int getPictureTypeLength() {
        if (this.pictureType == null) {
            return  0;
        }
        return this.pictureType.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public void setPictureType(PictureManagerPictureDisplayType[] values) {
        this._getPictureType().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictureType.add(values[i]);
        }
    }

    protected List<PictureManagerPictureDisplayType> _getPictureType() {
        if (pictureType == null) {
            pictureType = new ArrayList<PictureManagerPictureDisplayType>();
        }
        return pictureType;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType setPictureType(int idx, PictureManagerPictureDisplayType value) {
        return this.pictureType.set(idx, value);
    }

}
