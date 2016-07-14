
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains all information about a dispute resolution. A dispute
 * 				can have a resolution even if the seller does not receive payment.
 * 				The resolution can have various results, including a Final Value Fee credit to
 * 				the seller or a strike to the buyer.
 * 			
 * 
 * <p>Java class for DisputeResolutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeResolutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisputeResolutionRecordType" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeResolutionReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionReasonCodeType" minOccurs="0"/>
 *         &lt;element name="ResolutionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "DisputeResolutionType", propOrder = {
    "disputeResolutionRecordType",
    "disputeResolutionReason",
    "resolutionTime",
    "any"
})
public class DisputeResolutionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeResolutionRecordType")
    protected DisputeResolutionRecordTypeCodeType disputeResolutionRecordType;
    @XmlElement(name = "DisputeResolutionReason")
    protected DisputeResolutionReasonCodeType disputeResolutionReason;
    @XmlElement(name = "ResolutionTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar resolutionTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the disputeResolutionRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionRecordTypeCodeType }
     *     
     */
    public DisputeResolutionRecordTypeCodeType getDisputeResolutionRecordType() {
        return disputeResolutionRecordType;
    }

    /**
     * Sets the value of the disputeResolutionRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionRecordTypeCodeType }
     *     
     */
    public void setDisputeResolutionRecordType(DisputeResolutionRecordTypeCodeType value) {
        this.disputeResolutionRecordType = value;
    }

    /**
     * Gets the value of the disputeResolutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public DisputeResolutionReasonCodeType getDisputeResolutionReason() {
        return disputeResolutionReason;
    }

    /**
     * Sets the value of the disputeResolutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public void setDisputeResolutionReason(DisputeResolutionReasonCodeType value) {
        this.disputeResolutionReason = value;
    }

    /**
     * Gets the value of the resolutionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Sets the value of the resolutionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionTime(Calendar value) {
        this.resolutionTime = value;
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
