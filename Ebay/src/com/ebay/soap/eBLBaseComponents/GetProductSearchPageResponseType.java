
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
 * <p>Java class for GetProductSearchPageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchPageResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSearchPage" type="{urn:ebay:apis:eBLBaseComponents}ProductSearchPageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchPageResponseType", propOrder = {
    "attributeSystemVersion",
    "productSearchPage"
})
public class GetProductSearchPageResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;
    @XmlElement(name = "ProductSearchPage")
    protected List<ProductSearchPageType> productSearchPage;

    /**
     * Gets the value of the attributeSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeSystemVersion() {
        return attributeSystemVersion;
    }

    /**
     * Sets the value of the attributeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeSystemVersion(String value) {
        this.attributeSystemVersion = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductSearchPageType }
     *     
     */
    public ProductSearchPageType[] getProductSearchPage() {
        if (this.productSearchPage == null) {
            return new ProductSearchPageType[ 0 ] ;
        }
        return ((ProductSearchPageType[]) this.productSearchPage.toArray(new ProductSearchPageType[this.productSearchPage.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductSearchPageType }
     *     
     */
    public ProductSearchPageType getProductSearchPage(int idx) {
        if (this.productSearchPage == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productSearchPage.get(idx);
    }

    public int getProductSearchPageLength() {
        if (this.productSearchPage == null) {
            return  0;
        }
        return this.productSearchPage.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductSearchPageType }
     *     
     */
    public void setProductSearchPage(ProductSearchPageType[] values) {
        this._getProductSearchPage().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productSearchPage.add(values[i]);
        }
    }

    protected List<ProductSearchPageType> _getProductSearchPage() {
        if (productSearchPage == null) {
            productSearchPage = new ArrayList<ProductSearchPageType>();
        }
        return productSearchPage;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSearchPageType }
     *     
     */
    public ProductSearchPageType setProductSearchPage(int idx, ProductSearchPageType value) {
        return this.productSearchPage.set(idx, value);
    }

}
