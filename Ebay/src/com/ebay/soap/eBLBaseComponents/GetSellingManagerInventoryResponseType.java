
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Contains a list of the products created by the seller. The list of products is returned as a set
 * 				of tags, in which are returned zero, one, or multiple SellingManagerProductType objects. Each
 * 				SellingManagerProductType object contains the information about for one Selling Manager product
 * 				and any Selling Manager templates the product contains.
 * 			
 * 
 * <p>Java class for GetSellingManagerInventoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerInventoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="InventoryCountLastCalculatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellingManagerProduct" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerInventoryResponseType", propOrder = {
    "inventoryCountLastCalculatedDate",
    "sellingManagerProduct",
    "paginationResult"
})
public class GetSellingManagerInventoryResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InventoryCountLastCalculatedDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar inventoryCountLastCalculatedDate;
    @XmlElement(name = "SellingManagerProduct")
    protected List<SellingManagerProductType> sellingManagerProduct;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the inventoryCountLastCalculatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInventoryCountLastCalculatedDate() {
        return inventoryCountLastCalculatedDate;
    }

    /**
     * Sets the value of the inventoryCountLastCalculatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryCountLastCalculatedDate(Calendar value) {
        this.inventoryCountLastCalculatedDate = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellingManagerProductType }
     *     
     */
    public SellingManagerProductType[] getSellingManagerProduct() {
        if (this.sellingManagerProduct == null) {
            return new SellingManagerProductType[ 0 ] ;
        }
        return ((SellingManagerProductType[]) this.sellingManagerProduct.toArray(new SellingManagerProductType[this.sellingManagerProduct.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellingManagerProductType }
     *     
     */
    public SellingManagerProductType getSellingManagerProduct(int idx) {
        if (this.sellingManagerProduct == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sellingManagerProduct.get(idx);
    }

    public int getSellingManagerProductLength() {
        if (this.sellingManagerProduct == null) {
            return  0;
        }
        return this.sellingManagerProduct.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellingManagerProductType }
     *     
     */
    public void setSellingManagerProduct(SellingManagerProductType[] values) {
        this._getSellingManagerProduct().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sellingManagerProduct.add(values[i]);
        }
    }

    protected List<SellingManagerProductType> _getSellingManagerProduct() {
        if (sellingManagerProduct == null) {
            sellingManagerProduct = new ArrayList<SellingManagerProductType>();
        }
        return sellingManagerProduct;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductType }
     *     
     */
    public SellingManagerProductType setSellingManagerProduct(int idx, SellingManagerProductType value) {
        return this.sellingManagerProduct.set(idx, value);
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
