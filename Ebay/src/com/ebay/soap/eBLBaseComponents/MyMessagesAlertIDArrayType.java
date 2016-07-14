
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
 * 				This type is deprecated because <b>MyMessagesAlert*</b> are deprecated.
 * 				
 * 			
 * 
 * <p>Java class for MyMessagesAlertIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesAlertIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesAlertIDArrayType", propOrder = {
    "alertID"
})
public class MyMessagesAlertIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AlertID")
    protected List<String> alertID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getAlertID() {
        if (this.alertID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.alertID.toArray(new String[this.alertID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getAlertID(int idx) {
        if (this.alertID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.alertID.get(idx);
    }

    public int getAlertIDLength() {
        if (this.alertID == null) {
            return  0;
        }
        return this.alertID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setAlertID(String[] values) {
        this._getAlertID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.alertID.add(values[i]);
        }
    }

    protected List<String> _getAlertID() {
        if (alertID == null) {
            alertID = new ArrayList<String>();
        }
        return alertID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setAlertID(int idx, String value) {
        return this.alertID.set(idx, value);
    }

}
