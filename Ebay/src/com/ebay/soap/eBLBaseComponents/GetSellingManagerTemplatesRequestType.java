
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
 * 	 			Retrieves Selling Manager templates.
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for GetSellingManagerTemplatesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerTemplatesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerTemplatesRequestType", propOrder = {
    "saleTemplateID"
})
public class GetSellingManagerTemplatesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SaleTemplateID", type = Long.class)
    protected List<Long> saleTemplateID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Long }
     *     
     */
    public long[] getSaleTemplateID() {
        if (this.saleTemplateID == null) {
            return new long[ 0 ] ;
        }
        long[] r = new long[this.saleTemplateID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.saleTemplateID.get(__i).longValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Long }
     *     
     */
    public long getSaleTemplateID(int idx) {
        if (this.saleTemplateID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.saleTemplateID.get(idx).longValue();
    }

    public int getSaleTemplateIDLength() {
        if (this.saleTemplateID == null) {
            return  0;
        }
        return this.saleTemplateID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Long }
     *     
     */
    public void setSaleTemplateID(long[] values) {
        this._getSaleTemplateID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.saleTemplateID.add(new Long(values[i]));
        }
    }

    protected List<Long> _getSaleTemplateID() {
        if (saleTemplateID == null) {
            saleTemplateID = new ArrayList<Long>();
        }
        return saleTemplateID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public long setSaleTemplateID(int idx, long value) {
        return this.saleTemplateID.set(idx, new Long(value)).longValue();
    }

}
