
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
 * 				An array of promotional sales.
 * 			
 * 
 * <p>Java class for PromotionalSaleArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSaleArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSale" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSaleArrayType", propOrder = {
    "promotionalSale"
})
public class PromotionalSaleArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionalSale")
    protected List<PromotionalSaleType> promotionalSale;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PromotionalSaleType }
     *     
     */
    public PromotionalSaleType[] getPromotionalSale() {
        if (this.promotionalSale == null) {
            return new PromotionalSaleType[ 0 ] ;
        }
        return ((PromotionalSaleType[]) this.promotionalSale.toArray(new PromotionalSaleType[this.promotionalSale.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PromotionalSaleType }
     *     
     */
    public PromotionalSaleType getPromotionalSale(int idx) {
        if (this.promotionalSale == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.promotionalSale.get(idx);
    }

    public int getPromotionalSaleLength() {
        if (this.promotionalSale == null) {
            return  0;
        }
        return this.promotionalSale.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PromotionalSaleType }
     *     
     */
    public void setPromotionalSale(PromotionalSaleType[] values) {
        this._getPromotionalSale().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.promotionalSale.add(values[i]);
        }
    }

    protected List<PromotionalSaleType> _getPromotionalSale() {
        if (promotionalSale == null) {
            promotionalSale = new ArrayList<PromotionalSaleType>();
        }
        return promotionalSale;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleType }
     *     
     */
    public PromotionalSaleType setPromotionalSale(int idx, PromotionalSaleType value) {
        return this.promotionalSale.set(idx, value);
    }

}
