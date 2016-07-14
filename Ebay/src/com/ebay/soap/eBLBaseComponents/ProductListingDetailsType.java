
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains product information that can be included in a listing.
 * 				Applicable for listings that use eBay's Pre-filled Item Information feature.
 * 				See <a href="http://developer.ebay.com/DevZone//guides/ebayfeatures/Development/ItemSpecifics-CatalogDetails.html">Pre-filling Item Specifics with Product Details</a> 
 * 				for details on working with Pre-filled Item Information.
 * 			
 * 
 * <p>Java class for ProductListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeStockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludePrefilledItemInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseStockPhotoURLAsGallery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ProductDetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReturnSearchResultOnDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListIfNoProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandMPN" type="{urn:ebay:apis:eBLBaseComponents}BrandMPNType" minOccurs="0"/>
 *         &lt;element name="TicketListingDetails" type="{urn:ebay:apis:eBLBaseComponents}TicketListingDetailsType" minOccurs="0"/>
 *         &lt;element name="UseFirstProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ProductListingDetailsType", propOrder = {
    "productID",
    "includeStockPhotoURL",
    "includePrefilledItemInformation",
    "useStockPhotoURLAsGallery",
    "stockPhotoURL",
    "copyright",
    "productReferenceID",
    "detailsURL",
    "productDetailsURL",
    "returnSearchResultOnDuplicates",
    "listIfNoProduct",
    "gtin",
    "isbn",
    "upc",
    "ean",
    "brandMPN",
    "ticketListingDetails",
    "useFirstProduct",
    "any"
})
public class ProductListingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "IncludeStockPhotoURL")
    protected Boolean includeStockPhotoURL;
    @XmlElement(name = "IncludePrefilledItemInformation")
    protected Boolean includePrefilledItemInformation;
    @XmlElement(name = "UseStockPhotoURLAsGallery")
    protected Boolean useStockPhotoURLAsGallery;
    @XmlElement(name = "StockPhotoURL")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "Copyright")
    protected List<String> copyright;
    @XmlElement(name = "ProductReferenceID")
    protected String productReferenceID;
    @XmlElement(name = "DetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "ProductDetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String productDetailsURL;
    @XmlElement(name = "ReturnSearchResultOnDuplicates")
    protected Boolean returnSearchResultOnDuplicates;
    @XmlElement(name = "ListIfNoProduct")
    protected Boolean listIfNoProduct;
    @XmlElement(name = "GTIN")
    protected String gtin;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "BrandMPN")
    protected BrandMPNType brandMPN;
    @XmlElement(name = "TicketListingDetails")
    protected TicketListingDetailsType ticketListingDetails;
    @XmlElement(name = "UseFirstProduct")
    protected Boolean useFirstProduct;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the includeStockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStockPhotoURL() {
        return includeStockPhotoURL;
    }

    /**
     * Sets the value of the includeStockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStockPhotoURL(Boolean value) {
        this.includeStockPhotoURL = value;
    }

    /**
     * Gets the value of the includePrefilledItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePrefilledItemInformation() {
        return includePrefilledItemInformation;
    }

    /**
     * Sets the value of the includePrefilledItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePrefilledItemInformation(Boolean value) {
        this.includePrefilledItemInformation = value;
    }

    /**
     * Gets the value of the useStockPhotoURLAsGallery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseStockPhotoURLAsGallery() {
        return useStockPhotoURLAsGallery;
    }

    /**
     * Sets the value of the useStockPhotoURLAsGallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseStockPhotoURLAsGallery(Boolean value) {
        this.useStockPhotoURLAsGallery = value;
    }

    /**
     * Gets the value of the stockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * Sets the value of the stockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCopyright() {
        if (this.copyright == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.copyright.toArray(new String[this.copyright.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCopyright(int idx) {
        if (this.copyright == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.copyright.get(idx);
    }

    public int getCopyrightLength() {
        if (this.copyright == null) {
            return  0;
        }
        return this.copyright.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCopyright(String[] values) {
        this._getCopyright().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.copyright.add(values[i]);
        }
    }

    protected List<String> _getCopyright() {
        if (copyright == null) {
            copyright = new ArrayList<String>();
        }
        return copyright;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCopyright(int idx, String value) {
        return this.copyright.set(idx, value);
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReferenceID(String value) {
        this.productReferenceID = value;
    }

    /**
     * Gets the value of the detailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Sets the value of the detailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Gets the value of the productDetailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailsURL() {
        return productDetailsURL;
    }

    /**
     * Sets the value of the productDetailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailsURL(String value) {
        this.productDetailsURL = value;
    }

    /**
     * Gets the value of the returnSearchResultOnDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchResultOnDuplicates() {
        return returnSearchResultOnDuplicates;
    }

    /**
     * Sets the value of the returnSearchResultOnDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchResultOnDuplicates(Boolean value) {
        this.returnSearchResultOnDuplicates = value;
    }

    /**
     * Gets the value of the listIfNoProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListIfNoProduct() {
        return listIfNoProduct;
    }

    /**
     * Sets the value of the listIfNoProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListIfNoProduct(Boolean value) {
        this.listIfNoProduct = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTIN() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTIN(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the brandMPN property.
     * 
     * @return
     *     possible object is
     *     {@link BrandMPNType }
     *     
     */
    public BrandMPNType getBrandMPN() {
        return brandMPN;
    }

    /**
     * Sets the value of the brandMPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandMPNType }
     *     
     */
    public void setBrandMPN(BrandMPNType value) {
        this.brandMPN = value;
    }

    /**
     * Gets the value of the ticketListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public TicketListingDetailsType getTicketListingDetails() {
        return ticketListingDetails;
    }

    /**
     * Sets the value of the ticketListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public void setTicketListingDetails(TicketListingDetailsType value) {
        this.ticketListingDetails = value;
    }

    /**
     * Gets the value of the useFirstProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFirstProduct() {
        return useFirstProduct;
    }

    /**
     * Sets the value of the useFirstProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFirstProduct(Boolean value) {
        this.useFirstProduct = value;
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
