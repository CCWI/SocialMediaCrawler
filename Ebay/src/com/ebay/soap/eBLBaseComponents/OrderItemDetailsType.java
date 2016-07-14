
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
 * 				Contains the line item information for each order.
 * 			
 * 
 * <p>Java class for OrderItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderLineItem" type="{urn:ebay:apis:eBLBaseComponents}OrderLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDetailsType", propOrder = {
    "orderLineItem"
})
public class OrderItemDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderLineItem")
    protected List<OrderLineItemType> orderLineItem;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link OrderLineItemType }
     *     
     */
    public OrderLineItemType[] getOrderLineItem() {
        if (this.orderLineItem == null) {
            return new OrderLineItemType[ 0 ] ;
        }
        return ((OrderLineItemType[]) this.orderLineItem.toArray(new OrderLineItemType[this.orderLineItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link OrderLineItemType }
     *     
     */
    public OrderLineItemType getOrderLineItem(int idx) {
        if (this.orderLineItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.orderLineItem.get(idx);
    }

    public int getOrderLineItemLength() {
        if (this.orderLineItem == null) {
            return  0;
        }
        return this.orderLineItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link OrderLineItemType }
     *     
     */
    public void setOrderLineItem(OrderLineItemType[] values) {
        this._getOrderLineItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.orderLineItem.add(values[i]);
        }
    }

    protected List<OrderLineItemType> _getOrderLineItem() {
        if (orderLineItem == null) {
            orderLineItem = new ArrayList<OrderLineItemType>();
        }
        return orderLineItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineItemType }
     *     
     */
    public OrderLineItemType setOrderLineItem(int idx, OrderLineItemType value) {
        return this.orderLineItem.set(idx, value);
    }

}
