
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
 * 				Set of eBay Store subscription levels.
 * 			
 * 
 * <p>Java class for StoreSubscriptionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreSubscriptionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{urn:ebay:apis:eBLBaseComponents}StoreSubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSubscriptionArrayType", propOrder = {
    "subscription"
})
public class StoreSubscriptionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Subscription")
    protected List<StoreSubscriptionType> subscription;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreSubscriptionType }
     *     
     */
    public StoreSubscriptionType[] getSubscription() {
        if (this.subscription == null) {
            return new StoreSubscriptionType[ 0 ] ;
        }
        return ((StoreSubscriptionType[]) this.subscription.toArray(new StoreSubscriptionType[this.subscription.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreSubscriptionType }
     *     
     */
    public StoreSubscriptionType getSubscription(int idx) {
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
     *     {@link StoreSubscriptionType }
     *     
     */
    public void setSubscription(StoreSubscriptionType[] values) {
        this._getSubscription().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.subscription.add(values[i]);
        }
    }

    protected List<StoreSubscriptionType> _getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<StoreSubscriptionType>();
        }
        return subscription;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSubscriptionType }
     *     
     */
    public StoreSubscriptionType setSubscription(int idx, StoreSubscriptionType value) {
        return this.subscription.set(idx, value);
    }

}
