
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
 * 				Set of Store logos.
 * 			
 * 
 * <p>Java class for StoreLogoArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreLogoArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Logo" type="{urn:ebay:apis:eBLBaseComponents}StoreLogoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreLogoArrayType", propOrder = {
    "logo"
})
public class StoreLogoArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Logo")
    protected List<StoreLogoType> logo;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreLogoType }
     *     
     */
    public StoreLogoType[] getLogo() {
        if (this.logo == null) {
            return new StoreLogoType[ 0 ] ;
        }
        return ((StoreLogoType[]) this.logo.toArray(new StoreLogoType[this.logo.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreLogoType }
     *     
     */
    public StoreLogoType getLogo(int idx) {
        if (this.logo == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.logo.get(idx);
    }

    public int getLogoLength() {
        if (this.logo == null) {
            return  0;
        }
        return this.logo.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreLogoType }
     *     
     */
    public void setLogo(StoreLogoType[] values) {
        this._getLogo().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.logo.add(values[i]);
        }
    }

    protected List<StoreLogoType> _getLogo() {
        if (logo == null) {
            logo = new ArrayList<StoreLogoType>();
        }
        return logo;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreLogoType }
     *     
     */
    public StoreLogoType setLogo(int idx, StoreLogoType value) {
        return this.logo.set(idx, value);
    }

}
