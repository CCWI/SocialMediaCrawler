
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
 * 				Returns the log of emails not sent.
 * 			
 * 
 * <p>Java class for GetSellingManagerEmailLogResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerEmailLogResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EmailLog" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailLogType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerEmailLogResponseType", propOrder = {
    "emailLog"
})
public class GetSellingManagerEmailLogResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EmailLog")
    protected List<SellingManagerEmailLogType> emailLog;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerEmailLogType }
     *     
     */
    public SellingManagerEmailLogType[] getEmailLog() {
        if (this.emailLog == null) {
            return new SellingManagerEmailLogType[ 0 ] ;
        }
        return ((SellingManagerEmailLogType[]) this.emailLog.toArray(new SellingManagerEmailLogType[this.emailLog.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerEmailLogType }
     *     
     */
    public SellingManagerEmailLogType getEmailLog(int idx) {
        if (this.emailLog == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.emailLog.get(idx);
    }

    public int getEmailLogLength() {
        if (this.emailLog == null) {
            return  0;
        }
        return this.emailLog.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellingManagerEmailLogType }
     *     
     */
    public void setEmailLog(SellingManagerEmailLogType[] values) {
        this._getEmailLog().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.emailLog.add(values[i]);
        }
    }

    protected List<SellingManagerEmailLogType> _getEmailLog() {
        if (emailLog == null) {
            emailLog = new ArrayList<SellingManagerEmailLogType>();
        }
        return emailLog;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerEmailLogType }
     *     
     */
    public SellingManagerEmailLogType setEmailLog(int idx, SellingManagerEmailLogType value) {
        return this.emailLog.set(idx, value);
    }

}
