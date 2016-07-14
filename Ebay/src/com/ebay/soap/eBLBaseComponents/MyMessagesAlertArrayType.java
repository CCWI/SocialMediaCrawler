
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
 * <p>Java class for MyMessagesAlertArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesAlertArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesAlertArrayType", propOrder = {
    "alert"
})
public class MyMessagesAlertArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Alert")
    protected List<MyMessagesAlertType> alert;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MyMessagesAlertType }
     *     
     */
    public MyMessagesAlertType[] getAlert() {
        if (this.alert == null) {
            return new MyMessagesAlertType[ 0 ] ;
        }
        return ((MyMessagesAlertType[]) this.alert.toArray(new MyMessagesAlertType[this.alert.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MyMessagesAlertType }
     *     
     */
    public MyMessagesAlertType getAlert(int idx) {
        if (this.alert == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.alert.get(idx);
    }

    public int getAlertLength() {
        if (this.alert == null) {
            return  0;
        }
        return this.alert.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MyMessagesAlertType }
     *     
     */
    public void setAlert(MyMessagesAlertType[] values) {
        this._getAlert().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.alert.add(values[i]);
        }
    }

    protected List<MyMessagesAlertType> _getAlert() {
        if (alert == null) {
            alert = new ArrayList<MyMessagesAlertType>();
        }
        return alert;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesAlertType }
     *     
     */
    public MyMessagesAlertType setAlert(int idx, MyMessagesAlertType value) {
        return this.alert.set(idx, value);
    }

}
