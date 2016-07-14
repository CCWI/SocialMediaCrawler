
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
 * 				A list of products returned from the Suggested Attributes engine.
 * 			
 * 
 * <p>Java class for ProductRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Product" type="{urn:ebay:apis:eBLBaseComponents}ProductInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductRecommendationsType", propOrder = {
    "product"
})
public class ProductRecommendationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Product")
    protected List<ProductInfoType> product;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType[] getProduct() {
        if (this.product == null) {
            return new ProductInfoType[ 0 ] ;
        }
        return ((ProductInfoType[]) this.product.toArray(new ProductInfoType[this.product.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType getProduct(int idx) {
        if (this.product == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.product.get(idx);
    }

    public int getProductLength() {
        if (this.product == null) {
            return  0;
        }
        return this.product.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductInfoType }
     *     
     */
    public void setProduct(ProductInfoType[] values) {
        this._getProduct().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.product.add(values[i]);
        }
    }

    protected List<ProductInfoType> _getProduct() {
        if (product == null) {
            product = new ArrayList<ProductInfoType>();
        }
        return product;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType setProduct(int idx, ProductInfoType value) {
        return this.product.set(idx, value);
    }

}
