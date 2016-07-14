
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to a GetSellingManagerSaleRecord call.
 * 			
 * 
 * <p>Java class for GetSellingManagerSaleRecordResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerSaleRecordResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerSoldOrder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerSaleRecordResponseType", propOrder = {
    "sellingManagerSoldOrder"
})
public class GetSellingManagerSaleRecordResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerSoldOrder")
    protected SellingManagerSoldOrderType sellingManagerSoldOrder;

    /**
     * Gets the value of the sellingManagerSoldOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public SellingManagerSoldOrderType getSellingManagerSoldOrder() {
        return sellingManagerSoldOrder;
    }

    /**
     * Sets the value of the sellingManagerSoldOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldOrderType }
     *     
     */
    public void setSellingManagerSoldOrder(SellingManagerSoldOrderType value) {
        this.sellingManagerSoldOrder = value;
    }

}
