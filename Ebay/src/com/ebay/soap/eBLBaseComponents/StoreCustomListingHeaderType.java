
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
 * 			Configuration of a Store custom listing header.
 * 		
 * 
 * <p>Java class for StoreCustomListingHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomListingHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayType" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomListingHeaderDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="Logo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkToInclude" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomListingHeaderLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddToFavoriteStores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignUpForStoreNewsletter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "StoreCustomListingHeaderType", propOrder = {
    "displayType",
    "logo",
    "searchBox",
    "linkToInclude",
    "addToFavoriteStores",
    "signUpForStoreNewsletter",
    "any"
})
public class StoreCustomListingHeaderType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisplayType")
    protected StoreCustomListingHeaderDisplayCodeType displayType;
    @XmlElement(name = "Logo")
    protected Boolean logo;
    @XmlElement(name = "SearchBox")
    protected Boolean searchBox;
    @XmlElement(name = "LinkToInclude")
    protected List<StoreCustomListingHeaderLinkType> linkToInclude;
    @XmlElement(name = "AddToFavoriteStores")
    protected Boolean addToFavoriteStores;
    @XmlElement(name = "SignUpForStoreNewsletter")
    protected Boolean signUpForStoreNewsletter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomListingHeaderDisplayCodeType }
     *     
     */
    public StoreCustomListingHeaderDisplayCodeType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomListingHeaderDisplayCodeType }
     *     
     */
    public void setDisplayType(StoreCustomListingHeaderDisplayCodeType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogo(Boolean value) {
        this.logo = value;
    }

    /**
     * Gets the value of the searchBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchBox() {
        return searchBox;
    }

    /**
     * Sets the value of the searchBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchBox(Boolean value) {
        this.searchBox = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreCustomListingHeaderLinkType }
     *     
     */
    public StoreCustomListingHeaderLinkType[] getLinkToInclude() {
        if (this.linkToInclude == null) {
            return new StoreCustomListingHeaderLinkType[ 0 ] ;
        }
        return ((StoreCustomListingHeaderLinkType[]) this.linkToInclude.toArray(new StoreCustomListingHeaderLinkType[this.linkToInclude.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreCustomListingHeaderLinkType }
     *     
     */
    public StoreCustomListingHeaderLinkType getLinkToInclude(int idx) {
        if (this.linkToInclude == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.linkToInclude.get(idx);
    }

    public int getLinkToIncludeLength() {
        if (this.linkToInclude == null) {
            return  0;
        }
        return this.linkToInclude.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreCustomListingHeaderLinkType }
     *     
     */
    public void setLinkToInclude(StoreCustomListingHeaderLinkType[] values) {
        this._getLinkToInclude().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.linkToInclude.add(values[i]);
        }
    }

    protected List<StoreCustomListingHeaderLinkType> _getLinkToInclude() {
        if (linkToInclude == null) {
            linkToInclude = new ArrayList<StoreCustomListingHeaderLinkType>();
        }
        return linkToInclude;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomListingHeaderLinkType }
     *     
     */
    public StoreCustomListingHeaderLinkType setLinkToInclude(int idx, StoreCustomListingHeaderLinkType value) {
        return this.linkToInclude.set(idx, value);
    }

    /**
     * Gets the value of the addToFavoriteStores property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddToFavoriteStores() {
        return addToFavoriteStores;
    }

    /**
     * Sets the value of the addToFavoriteStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddToFavoriteStores(Boolean value) {
        this.addToFavoriteStores = value;
    }

    /**
     * Gets the value of the signUpForStoreNewsletter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignUpForStoreNewsletter() {
        return signUpForStoreNewsletter;
    }

    /**
     * Sets the value of the signUpForStoreNewsletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignUpForStoreNewsletter(Boolean value) {
        this.signUpForStoreNewsletter = value;
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
