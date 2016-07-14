
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
 * 	  		Set of Store custom pages.
 * 	  	
 * 
 * <p>Java class for StoreCustomPageArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomPageArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomPage" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomPageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomPageArrayType", propOrder = {
    "customPage"
})
public class StoreCustomPageArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CustomPage")
    protected List<StoreCustomPageType> customPage;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreCustomPageType }
     *     
     */
    public StoreCustomPageType[] getCustomPage() {
        if (this.customPage == null) {
            return new StoreCustomPageType[ 0 ] ;
        }
        return ((StoreCustomPageType[]) this.customPage.toArray(new StoreCustomPageType[this.customPage.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreCustomPageType }
     *     
     */
    public StoreCustomPageType getCustomPage(int idx) {
        if (this.customPage == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.customPage.get(idx);
    }

    public int getCustomPageLength() {
        if (this.customPage == null) {
            return  0;
        }
        return this.customPage.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreCustomPageType }
     *     
     */
    public void setCustomPage(StoreCustomPageType[] values) {
        this._getCustomPage().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.customPage.add(values[i]);
        }
    }

    protected List<StoreCustomPageType> _getCustomPage() {
        if (customPage == null) {
            customPage = new ArrayList<StoreCustomPageType>();
        }
        return customPage;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomPageType }
     *     
     */
    public StoreCustomPageType setCustomPage(int idx, StoreCustomPageType value) {
        return this.customPage.set(idx, value);
    }

}
