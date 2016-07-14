
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Enables a seller to change the price and quantity of a currently-
 * 				active, fixed-price listing. Using ReviseInventoryStatus to modify
 * 				data qualifies as revising the listing.
 * 				<br><br>
 * 				Inputs are the item IDs or SKUs of the listings being revised,
 * 				and the price and quantity that are
 * 				being changed for each revision. Only applicable to fixed-price listings.<br>
 * 				<br><br>
 * 				Changing the price or quantity of a currently-
 * 				active, fixed-price listing does not reset the Best Match performance score.
 * 				For Best Match information related to multi-variation listings, see the Best
 * 				Match information at the following topic:
 * 				<a href="http://pages.ebay.com/sell/variation/">Multi-quantity Fixed Price
 * 				listings with variations</a>.<br>
 * 				<br><br>
 * 				As with all listing calls, the site you specify in the request URL
 * 				(for SOAP) or the X-EBAY-API-SITEID HTTP header (for XML)
 * 				should match the original listing's <b>Item.Site</b> value.
 * 				In particular, this is a best practice when you submit new and
 * 				revised listings.<br>
 * 				<br><b>
 * 				For Large Merchant Services users:</b> When you use ReviseInventoryStatus within a Merchant Data file,
 * 				it must be enclosed within two BulkDataExchangeRequest tags.
 * 				A namespace is returned in the BulkDataExchangeResponseType
 * 				(top level) of the response. The BulkDataExchange tags are not shown in the call input/output descriptions.
 * 			
 * 
 * <p>Java class for ReviseInventoryStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseInventoryStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="InventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}InventoryStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseInventoryStatusRequestType", propOrder = {
    "inventoryStatus",
    "reviseInventoryStatusRequestTypeAny"
})
public class ReviseInventoryStatusRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InventoryStatus")
    protected List<InventoryStatusType> inventoryStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> reviseInventoryStatusRequestTypeAny;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType[] getInventoryStatus() {
        if (this.inventoryStatus == null) {
            return new InventoryStatusType[ 0 ] ;
        }
        return ((InventoryStatusType[]) this.inventoryStatus.toArray(new InventoryStatusType[this.inventoryStatus.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType getInventoryStatus(int idx) {
        if (this.inventoryStatus == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.inventoryStatus.get(idx);
    }

    public int getInventoryStatusLength() {
        if (this.inventoryStatus == null) {
            return  0;
        }
        return this.inventoryStatus.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link InventoryStatusType }
     *     
     */
    public void setInventoryStatus(InventoryStatusType[] values) {
        this._getInventoryStatus().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.inventoryStatus.add(values[i]);
        }
    }

    protected List<InventoryStatusType> _getInventoryStatus() {
        if (inventoryStatus == null) {
            inventoryStatus = new ArrayList<InventoryStatusType>();
        }
        return inventoryStatus;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType setInventoryStatus(int idx, InventoryStatusType value) {
        return this.inventoryStatus.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getReviseInventoryStatusRequestTypeAny() {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.reviseInventoryStatusRequestTypeAny.toArray(new Object[this.reviseInventoryStatusRequestTypeAny.size()] ));
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
    public Object getReviseInventoryStatusRequestTypeAny(int idx) {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reviseInventoryStatusRequestTypeAny.get(idx);
    }

    public int getReviseInventoryStatusRequestTypeAnyLength() {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            return  0;
        }
        return this.reviseInventoryStatusRequestTypeAny.size();
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
    public void setReviseInventoryStatusRequestTypeAny(Object[] values) {
        this._getReviseInventoryStatusRequestTypeAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.reviseInventoryStatusRequestTypeAny.add(values[i]);
        }
    }

    protected List<Object> _getReviseInventoryStatusRequestTypeAny() {
        if (reviseInventoryStatusRequestTypeAny == null) {
            reviseInventoryStatusRequestTypeAny = new ArrayList<Object>();
        }
        return reviseInventoryStatusRequestTypeAny;
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
    public Object setReviseInventoryStatusRequestTypeAny(int idx, Object value) {
        return this.reviseInventoryStatusRequestTypeAny.set(idx, value);
    }

}
