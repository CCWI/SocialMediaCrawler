
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Creates a Selling Manager product. Sellers use Selling Manager products to store SYI forms for use
 * 				as listing templates.
 * 			
 * 
 * <p>Java class for AddSellingManagerProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSellingManagerProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductSpecifics" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductSpecificsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSellingManagerProductRequestType", propOrder = {
    "sellingManagerProductDetails",
    "folderID",
    "sellingManagerProductSpecifics"
})
public class AddSellingManagerProductRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerProductDetails")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "FolderID")
    protected Long folderID;
    @XmlElement(name = "SellingManagerProductSpecifics")
    protected SellingManagerProductSpecificsType sellingManagerProductSpecifics;

    /**
     * Gets the value of the sellingManagerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public SellingManagerProductDetailsType getSellingManagerProductDetails() {
        return sellingManagerProductDetails;
    }

    /**
     * Sets the value of the sellingManagerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public void setSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.sellingManagerProductDetails = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the sellingManagerProductSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public SellingManagerProductSpecificsType getSellingManagerProductSpecifics() {
        return sellingManagerProductSpecifics;
    }

    /**
     * Sets the value of the sellingManagerProductSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public void setSellingManagerProductSpecifics(SellingManagerProductSpecificsType value) {
        this.sellingManagerProductSpecifics = value;
    }

}
