
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
 * 				This type is deprecated as the call is no longer available.
 * 				
 * 			
 * 
 * <p>Java class for GetProductFamilyMembersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductFamilyMembersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductSearch" type="{urn:ebay:apis:eBLBaseComponents}ProductSearchType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductFamilyMembersRequestType", propOrder = {
    "productSearch"
})
public class GetProductFamilyMembersRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductSearch")
    protected List<ProductSearchType> productSearch;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductSearchType }
     *     
     */
    public ProductSearchType[] getProductSearch() {
        if (this.productSearch == null) {
            return new ProductSearchType[ 0 ] ;
        }
        return ((ProductSearchType[]) this.productSearch.toArray(new ProductSearchType[this.productSearch.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductSearchType }
     *     
     */
    public ProductSearchType getProductSearch(int idx) {
        if (this.productSearch == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productSearch.get(idx);
    }

    public int getProductSearchLength() {
        if (this.productSearch == null) {
            return  0;
        }
        return this.productSearch.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductSearchType }
     *     
     */
    public void setProductSearch(ProductSearchType[] values) {
        this._getProductSearch().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productSearch.add(values[i]);
        }
    }

    protected List<ProductSearchType> _getProductSearch() {
        if (productSearch == null) {
            productSearch = new ArrayList<ProductSearchType>();
        }
        return productSearch;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSearchType }
     *     
     */
    public ProductSearchType setProductSearch(int idx, ProductSearchType value) {
        return this.productSearch.set(idx, value);
    }

}
