
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 *  
 * 				For the US, Canada and Australia sites, users are 
 * 				required to offer at least one safe payment method (i.e. PayPal/PaisaPay, or one 
 * 				of the credit cards specified in Item.PaymentMethods).
 * 				<br>
 * 				If a seller has a 'SafePaymentExempt' status, they are exempt from the category 
 * 				requirement to offer at least one safe payment method when listing an item on a 
 * 				site that has the safe payment requirement.
 * 				<br>
 * 				The safe payment requirement also applies to two-category listings that have one 
 * 				ship-to or available-to location in the US, Canada, or Australia. The French 
 * 				Canadian (CAFR) site is a special case, because listings on the CAFR site with 
 * 				ship-to or available-to locations in Canada do not require a Safe Payment method, 
 * 				yet listings on the CAFR site with ship-to or available-to locations in the US or 
 * 				Australia do require a safe payment method.
 * 				<br>
 * 				The Business and Industrial, Motors, Real Estate, and Mature Audiences categories, 
 * 				and all listings that don't support Item.PaymentMethods are exempt from this 
 * 				requirement. Therefore, listings in those categories do not require a safe payment 
 * 				method.
 * 				<br>
 * 				Currently, this field contains no other special meta-data.(An empty element is 
 * 				returned.)
 * 				<br> 
 * 				Use SiteDefaults.SafePaymentRequired and Category.SafePaymentRequired to determine 
 * 				which categories require a safe payment method.
 * 			
 * 
 * <p>Java class for SafePaymentRequiredDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafePaymentRequiredDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafePaymentRequiredDefinitionType", propOrder = {
    "any"
})
public class SafePaymentRequiredDefinitionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
