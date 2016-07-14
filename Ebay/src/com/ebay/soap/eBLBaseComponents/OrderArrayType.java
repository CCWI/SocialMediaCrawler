
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
 * 			An array of Orders.
 * 		
 * 
 * <p>Java class for OrderArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{urn:ebay:apis:eBLBaseComponents}OrderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderArrayType", propOrder = {
    "order"
})
public class OrderArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Order")
    protected List<OrderType> order;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link OrderType }
     *     
     */
    public OrderType[] getOrder() {
        if (this.order == null) {
            return new OrderType[ 0 ] ;
        }
        return ((OrderType[]) this.order.toArray(new OrderType[this.order.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder(int idx) {
        if (this.order == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.order.get(idx);
    }

    public int getOrderLength() {
        if (this.order == null) {
            return  0;
        }
        return this.order.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType[] values) {
        this._getOrder().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.order.add(values[i]);
        }
    }

    protected List<OrderType> _getOrder() {
        if (order == null) {
            order = new ArrayList<OrderType>();
        }
        return order;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public OrderType setOrder(int idx, OrderType value) {
        return this.order.set(idx, value);
    }

}
