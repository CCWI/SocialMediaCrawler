
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
 * 			This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 				
 * 			
 * 
 * <p>Java class for ProductSearchPageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchPageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCharacteristicsSet" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSetType" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSearchCodeType" minOccurs="0"/>
 *         &lt;element name="SortCharacteristics" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataElementSet" type="{urn:ebay:apis:eBLBaseComponents}DataElementSetType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ProductSearchPageType", propOrder = {
    "searchCharacteristicsSet",
    "searchType",
    "sortCharacteristics",
    "dataElementSet",
    "any"
})
public class ProductSearchPageType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SearchCharacteristicsSet")
    protected CharacteristicsSetType searchCharacteristicsSet;
    @XmlElement(name = "SearchType")
    protected CharacteristicsSearchCodeType searchType;
    @XmlElement(name = "SortCharacteristics")
    protected List<CharacteristicType> sortCharacteristics;
    @XmlElement(name = "DataElementSet")
    protected List<DataElementSetType> dataElementSet;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the searchCharacteristicsSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public CharacteristicsSetType getSearchCharacteristicsSet() {
        return searchCharacteristicsSet;
    }

    /**
     * Sets the value of the searchCharacteristicsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public void setSearchCharacteristicsSet(CharacteristicsSetType value) {
        this.searchCharacteristicsSet = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSearchCodeType }
     *     
     */
    public CharacteristicsSearchCodeType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSearchCodeType }
     *     
     */
    public void setSearchType(CharacteristicsSearchCodeType value) {
        this.searchType = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType[] getSortCharacteristics() {
        if (this.sortCharacteristics == null) {
            return new CharacteristicType[ 0 ] ;
        }
        return ((CharacteristicType[]) this.sortCharacteristics.toArray(new CharacteristicType[this.sortCharacteristics.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType getSortCharacteristics(int idx) {
        if (this.sortCharacteristics == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sortCharacteristics.get(idx);
    }

    public int getSortCharacteristicsLength() {
        if (this.sortCharacteristics == null) {
            return  0;
        }
        return this.sortCharacteristics.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharacteristicType }
     *     
     */
    public void setSortCharacteristics(CharacteristicType[] values) {
        this._getSortCharacteristics().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sortCharacteristics.add(values[i]);
        }
    }

    protected List<CharacteristicType> _getSortCharacteristics() {
        if (sortCharacteristics == null) {
            sortCharacteristics = new ArrayList<CharacteristicType>();
        }
        return sortCharacteristics;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicType }
     *     
     */
    public CharacteristicType setSortCharacteristics(int idx, CharacteristicType value) {
        return this.sortCharacteristics.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DataElementSetType }
     *     
     */
    public DataElementSetType[] getDataElementSet() {
        if (this.dataElementSet == null) {
            return new DataElementSetType[ 0 ] ;
        }
        return ((DataElementSetType[]) this.dataElementSet.toArray(new DataElementSetType[this.dataElementSet.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DataElementSetType }
     *     
     */
    public DataElementSetType getDataElementSet(int idx) {
        if (this.dataElementSet == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dataElementSet.get(idx);
    }

    public int getDataElementSetLength() {
        if (this.dataElementSet == null) {
            return  0;
        }
        return this.dataElementSet.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DataElementSetType }
     *     
     */
    public void setDataElementSet(DataElementSetType[] values) {
        this._getDataElementSet().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.dataElementSet.add(values[i]);
        }
    }

    protected List<DataElementSetType> _getDataElementSet() {
        if (dataElementSet == null) {
            dataElementSet = new ArrayList<DataElementSetType>();
        }
        return dataElementSet;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DataElementSetType }
     *     
     */
    public DataElementSetType setDataElementSet(int idx, DataElementSetType value) {
        return this.dataElementSet.set(idx, value);
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
