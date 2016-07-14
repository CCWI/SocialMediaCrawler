
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
 * 				Represents a list of disputes. Can hold zero or more Dispute
 * 				types, each of which describes a dispute.
 * 			
 * 
 * <p>Java class for DisputeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispute" type="{urn:ebay:apis:eBLBaseComponents}DisputeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeArrayType", propOrder = {
    "dispute"
})
public class DisputeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Dispute")
    protected List<DisputeType> dispute;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DisputeType }
     *     
     */
    public DisputeType[] getDispute() {
        if (this.dispute == null) {
            return new DisputeType[ 0 ] ;
        }
        return ((DisputeType[]) this.dispute.toArray(new DisputeType[this.dispute.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DisputeType }
     *     
     */
    public DisputeType getDispute(int idx) {
        if (this.dispute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dispute.get(idx);
    }

    public int getDisputeLength() {
        if (this.dispute == null) {
            return  0;
        }
        return this.dispute.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DisputeType }
     *     
     */
    public void setDispute(DisputeType[] values) {
        this._getDispute().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.dispute.add(values[i]);
        }
    }

    protected List<DisputeType> _getDispute() {
        if (dispute == null) {
            dispute = new ArrayList<DisputeType>();
        }
        return dispute;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeType }
     *     
     */
    public DisputeType setDispute(int idx, DisputeType value) {
        return this.dispute.set(idx, value);
    }

}
