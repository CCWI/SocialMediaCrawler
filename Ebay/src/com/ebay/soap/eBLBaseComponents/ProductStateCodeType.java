
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="UpdateMajor"/>
 *     &lt;enumeration value="UpdateNoDetails"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductStateCodeType")
@XmlEnum
public enum ProductStateCodeType {


    /**
     * 
     * 						This product's details have been updated.
     * 						If your application currently uses the product for listing or searching, 
     * 						we recommend that you check to make sure the product data still meets your needs.
     * 					
     * 
     */
    @XmlEnumValue("Update")
    UPDATE("Update"),

    /**
     * 
     * 						This product has changed. This product has been mapped to a newer
     * 						product in the catalog that eBay (or Half.com) is currently using,
     * 						and its details have been updated based on the new catalog data.
     * 						The product reference ID remains the same
     * 						(but the longer product ID string may have changed).
     * 						If your application currently uses the product for listing or searching, 
     * 						we recommend that you check to make sure the product data still meets your needs.
     * 					
     * 
     */
    @XmlEnumValue("UpdateMajor")
    UPDATE_MAJOR("UpdateMajor"),

    /**
     * 
     * 						This product was previously available in an earlier catalog, 
     * 						but it has not been mapped to a product in the catalog that eBay
     * 						is currently using. It can still be used to pre-fill listings, but 
     * 						it may contain fewer details than other products.
     * 						If your application currently uses the product for listing or searching, 
     * 						we recommend that you check to make sure the product data still meets your needs.
     * 						Not applicable to Half.com.
     * 					
     * 
     */
    @XmlEnumValue("UpdateNoDetails")
    UPDATE_NO_DETAILS("UpdateNoDetails"),

    /**
     * 
     * 						Some information in this product is scheduled to be merged into another product 
     * 						in the catalog that eBay (or Half.com) is currently using. This product may 
     * 						be removed from the system at any time.
     * 						If your application currently uses the product for listing or searching, 
     * 						we recommend that you update your application to use a product that is not 
     * 						scheduled to be merged or deleted.
     * 					
     * 
     */
    @XmlEnumValue("Merge")
    MERGE("Merge"),

    /**
     * 
     * 						This product is marked for deletion, and it will not be mapped to another product.
     * 						You cannot add or relist items that use products marked for deletion.
     * 						If your application currently uses the product for listing or searching, 
     * 						we recommend that you update your application to use a product that is not 
     * 						scheduled to be merged or deleted.
     * 					
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductStateCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductStateCodeType fromValue(String v) {
        for (ProductStateCodeType c: ProductStateCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
