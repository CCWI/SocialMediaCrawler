
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
 * 				A list of Selling Manager templates.
 * 			
 * 
 * <p>Java class for SellingManagerTemplateDetailsArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerTemplateDetailsArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerTemplateDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerTemplateDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerTemplateDetailsArrayType", propOrder = {
    "sellingManagerTemplateDetails"
})
public class SellingManagerTemplateDetailsArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerTemplateDetails")
    protected List<SellingManagerTemplateDetailsType> sellingManagerTemplateDetails;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerTemplateDetailsType }
     *     
     */
    public SellingManagerTemplateDetailsType[] getSellingManagerTemplateDetails() {
        if (this.sellingManagerTemplateDetails == null) {
            return new SellingManagerTemplateDetailsType[ 0 ] ;
        }
        return ((SellingManagerTemplateDetailsType[]) this.sellingManagerTemplateDetails.toArray(new SellingManagerTemplateDetailsType[this.sellingManagerTemplateDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerTemplateDetailsType }
     *     
     */
    public SellingManagerTemplateDetailsType getSellingManagerTemplateDetails(int idx) {
        if (this.sellingManagerTemplateDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sellingManagerTemplateDetails.get(idx);
    }

    public int getSellingManagerTemplateDetailsLength() {
        if (this.sellingManagerTemplateDetails == null) {
            return  0;
        }
        return this.sellingManagerTemplateDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellingManagerTemplateDetailsType }
     *     
     */
    public void setSellingManagerTemplateDetails(SellingManagerTemplateDetailsType[] values) {
        this._getSellingManagerTemplateDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sellingManagerTemplateDetails.add(values[i]);
        }
    }

    protected List<SellingManagerTemplateDetailsType> _getSellingManagerTemplateDetails() {
        if (sellingManagerTemplateDetails == null) {
            sellingManagerTemplateDetails = new ArrayList<SellingManagerTemplateDetailsType>();
        }
        return sellingManagerTemplateDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerTemplateDetailsType }
     *     
     */
    public SellingManagerTemplateDetailsType setSellingManagerTemplateDetails(int idx, SellingManagerTemplateDetailsType value) {
        return this.sellingManagerTemplateDetails.set(idx, value);
    }

}
