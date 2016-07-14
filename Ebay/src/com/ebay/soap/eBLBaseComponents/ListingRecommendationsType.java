
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Type defining the <b>ListingRecommendations</b> container that is
 * 				conditionally returned in all Add/Revise/Relist/Verify API calls. A
 * 				<b>ListingRecommendations</b> container consists of one or
 * 				more <b>Recommendation</b> containers, and each
 * 				<b>Recommendation</b> container provides a message to the seller on how a
 * 				listing can be improved or brought up to standard in regards to top-rated seller/listing requirements, mandated or recommended Item Specifics, picture quality requirements, pricing and/or listing format recommendations, recommended keywords and/or Item Specifics in a Title, and/or a recommendation to use Fast 'N Free shipping.
 * 				<br><br>
 * 				The <b>ListingRecommendations</b> container is only returned if the
 * 				<b>IncludeRecommendations</b> flag is included and set to 'true' in the
 * 				API call request.
 * 			
 * 
 * <p>Java class for ListingRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recommendation" type="{urn:ebay:apis:eBLBaseComponents}ListingRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingRecommendationsType", propOrder = {
    "recommendation",
    "any"
})
public class ListingRecommendationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Recommendation")
    protected List<ListingRecommendationType> recommendation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingRecommendationType }
     *     
     */
    public ListingRecommendationType[] getRecommendation() {
        if (this.recommendation == null) {
            return new ListingRecommendationType[ 0 ] ;
        }
        return ((ListingRecommendationType[]) this.recommendation.toArray(new ListingRecommendationType[this.recommendation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingRecommendationType }
     *     
     */
    public ListingRecommendationType getRecommendation(int idx) {
        if (this.recommendation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recommendation.get(idx);
    }

    public int getRecommendationLength() {
        if (this.recommendation == null) {
            return  0;
        }
        return this.recommendation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingRecommendationType }
     *     
     */
    public void setRecommendation(ListingRecommendationType[] values) {
        this._getRecommendation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recommendation.add(values[i]);
        }
    }

    protected List<ListingRecommendationType> _getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<ListingRecommendationType>();
        }
        return recommendation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingRecommendationType }
     *     
     */
    public ListingRecommendationType setRecommendation(int idx, ListingRecommendationType value) {
        return this.recommendation.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
