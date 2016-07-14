
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
 * 				Type defining the call-specific response fields for the <b>GetSellingManagerAlerts</b> 
 * 				call.
 * 			
 * 
 * <p>Java class for GetSellingManagerAlertsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerAlertsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerAlertsResponseType", propOrder = {
    "alert"
})
public class GetSellingManagerAlertsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Alert")
    protected List<SellingManagerAlertType> alert;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerAlertType }
     *     
     */
    public SellingManagerAlertType[] getAlert() {
        if (this.alert == null) {
            return new SellingManagerAlertType[ 0 ] ;
        }
        return ((SellingManagerAlertType[]) this.alert.toArray(new SellingManagerAlertType[this.alert.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerAlertType }
     *     
     */
    public SellingManagerAlertType getAlert(int idx) {
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
     *     {@link SellingManagerAlertType }
     *     
     */
    public void setAlert(SellingManagerAlertType[] values) {
        this._getAlert().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.alert.add(values[i]);
        }
    }

    protected List<SellingManagerAlertType> _getAlert() {
        if (alert == null) {
            alert = new ArrayList<SellingManagerAlertType>();
        }
        return alert;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAlertType }
     *     
     */
    public SellingManagerAlertType setAlert(int idx, SellingManagerAlertType value) {
        return this.alert.set(idx, value);
    }

}
