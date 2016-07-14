
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
 * 				Revises a Selling Manager product.
 * 				<br><br>
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for ReviseSellingManagerProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseSellingManagerProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="SellingManagerFolderDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReviseSellingManagerProductRequestType", propOrder = {
    "sellingManagerProductDetails",
    "sellingManagerFolderDetails",
    "deletedField",
    "sellingManagerProductSpecifics"
})
public class ReviseSellingManagerProductRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerProductDetails")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "SellingManagerFolderDetails")
    protected SellingManagerFolderDetailsType sellingManagerFolderDetails;
    @XmlElement(name = "DeletedField")
    protected List<String> deletedField;
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
     * Gets the value of the sellingManagerFolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public SellingManagerFolderDetailsType getSellingManagerFolderDetails() {
        return sellingManagerFolderDetails;
    }

    /**
     * Sets the value of the sellingManagerFolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public void setSellingManagerFolderDetails(SellingManagerFolderDetailsType value) {
        this.sellingManagerFolderDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getDeletedField() {
        if (this.deletedField == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.deletedField.toArray(new String[this.deletedField.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getDeletedField(int idx) {
        if (this.deletedField == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.deletedField.get(idx);
    }

    public int getDeletedFieldLength() {
        if (this.deletedField == null) {
            return  0;
        }
        return this.deletedField.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setDeletedField(String[] values) {
        this._getDeletedField().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.deletedField.add(values[i]);
        }
    }

    protected List<String> _getDeletedField() {
        if (deletedField == null) {
            deletedField = new ArrayList<String>();
        }
        return deletedField;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setDeletedField(int idx, String value) {
        return this.deletedField.set(idx, value);
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
