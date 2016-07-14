
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAlertIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAlertIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalAlertID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAlertIDArrayType", propOrder = {
    "externalAlertID"
})
public class ExternalAlertIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ExternalAlertID")
    protected List<String> externalAlertID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExternalAlertID() {
        if (this.externalAlertID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.externalAlertID.toArray(new String[this.externalAlertID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExternalAlertID(int idx) {
        if (this.externalAlertID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.externalAlertID.get(idx);
    }

    public int getExternalAlertIDLength() {
        if (this.externalAlertID == null) {
            return  0;
        }
        return this.externalAlertID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExternalAlertID(String[] values) {
        this._getExternalAlertID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.externalAlertID.add(values[i]);
        }
    }

    protected List<String> _getExternalAlertID() {
        if (externalAlertID == null) {
            externalAlertID = new ArrayList<String>();
        }
        return externalAlertID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExternalAlertID(int idx, String value) {
        return this.externalAlertID.set(idx, value);
    }

}
