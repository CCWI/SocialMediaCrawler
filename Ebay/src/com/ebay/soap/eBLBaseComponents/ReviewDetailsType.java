
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
 * 				Contains product reviews written by eBay members.
 * 			 
 * 
 * <p>Java class for ReviewDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Review" type="{urn:ebay:apis:eBLBaseComponents}ReviewType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReviewDetailsType", propOrder = {
    "averageRating",
    "review",
    "any"
})
public class ReviewDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AverageRating")
    protected Float averageRating;
    @XmlElement(name = "Review")
    protected List<ReviewType> review;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the averageRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRating(Float value) {
        this.averageRating = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReviewType }
     *     
     */
    public ReviewType[] getReview() {
        if (this.review == null) {
            return new ReviewType[ 0 ] ;
        }
        return ((ReviewType[]) this.review.toArray(new ReviewType[this.review.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReviewType }
     *     
     */
    public ReviewType getReview(int idx) {
        if (this.review == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.review.get(idx);
    }

    public int getReviewLength() {
        if (this.review == null) {
            return  0;
        }
        return this.review.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReviewType }
     *     
     */
    public void setReview(ReviewType[] values) {
        this._getReview().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.review.add(values[i]);
        }
    }

    protected List<ReviewType> _getReview() {
        if (review == null) {
            review = new ArrayList<ReviewType>();
        }
        return review;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewType }
     *     
     */
    public ReviewType setReview(int idx, ReviewType value) {
        return this.review.set(idx, value);
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
