
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
 * 				Returns the most popular custom Item Specific names and values for each
 * 				category you request.
 * 			
 * 
 * <p>Java class for GetCategorySpecificsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategorySpecificsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValuesPerName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategorySpecific" type="{urn:ebay:apis:eBLBaseComponents}CategoryItemSpecificsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeConfidence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CategorySpecificsFileInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategorySpecificsRequestType", propOrder = {
    "categoryID",
    "lastUpdateTime",
    "maxNames",
    "maxValuesPerName",
    "name",
    "categorySpecific",
    "excludeRelationships",
    "includeConfidence",
    "categorySpecificsFileInfo"
})
public class GetCategorySpecificsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected List<String> categoryID;
    @XmlElement(name = "LastUpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpdateTime;
    @XmlElement(name = "MaxNames")
    protected Integer maxNames;
    @XmlElement(name = "MaxValuesPerName")
    protected Integer maxValuesPerName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CategorySpecific")
    protected List<CategoryItemSpecificsType> categorySpecific;
    @XmlElement(name = "ExcludeRelationships")
    protected Boolean excludeRelationships;
    @XmlElement(name = "IncludeConfidence")
    protected Boolean includeConfidence;
    @XmlElement(name = "CategorySpecificsFileInfo")
    protected Boolean categorySpecificsFileInfo;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCategoryID() {
        if (this.categoryID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.categoryID.toArray(new String[this.categoryID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCategoryID(int idx) {
        if (this.categoryID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categoryID.get(idx);
    }

    public int getCategoryIDLength() {
        if (this.categoryID == null) {
            return  0;
        }
        return this.categoryID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCategoryID(String[] values) {
        this._getCategoryID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categoryID.add(values[i]);
        }
    }

    protected List<String> _getCategoryID() {
        if (categoryID == null) {
            categoryID = new ArrayList<String>();
        }
        return categoryID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCategoryID(int idx, String value) {
        return this.categoryID.set(idx, value);
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(Calendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the maxNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNames() {
        return maxNames;
    }

    /**
     * Sets the value of the maxNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNames(Integer value) {
        this.maxNames = value;
    }

    /**
     * Gets the value of the maxValuesPerName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValuesPerName() {
        return maxValuesPerName;
    }

    /**
     * Sets the value of the maxValuesPerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValuesPerName(Integer value) {
        this.maxValuesPerName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CategoryItemSpecificsType }
     *     
     */
    public CategoryItemSpecificsType[] getCategorySpecific() {
        if (this.categorySpecific == null) {
            return new CategoryItemSpecificsType[ 0 ] ;
        }
        return ((CategoryItemSpecificsType[]) this.categorySpecific.toArray(new CategoryItemSpecificsType[this.categorySpecific.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CategoryItemSpecificsType }
     *     
     */
    public CategoryItemSpecificsType getCategorySpecific(int idx) {
        if (this.categorySpecific == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categorySpecific.get(idx);
    }

    public int getCategorySpecificLength() {
        if (this.categorySpecific == null) {
            return  0;
        }
        return this.categorySpecific.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CategoryItemSpecificsType }
     *     
     */
    public void setCategorySpecific(CategoryItemSpecificsType[] values) {
        this._getCategorySpecific().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categorySpecific.add(values[i]);
        }
    }

    protected List<CategoryItemSpecificsType> _getCategorySpecific() {
        if (categorySpecific == null) {
            categorySpecific = new ArrayList<CategoryItemSpecificsType>();
        }
        return categorySpecific;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryItemSpecificsType }
     *     
     */
    public CategoryItemSpecificsType setCategorySpecific(int idx, CategoryItemSpecificsType value) {
        return this.categorySpecific.set(idx, value);
    }

    /**
     * Gets the value of the excludeRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeRelationships() {
        return excludeRelationships;
    }

    /**
     * Sets the value of the excludeRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeRelationships(Boolean value) {
        this.excludeRelationships = value;
    }

    /**
     * Gets the value of the includeConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeConfidence() {
        return includeConfidence;
    }

    /**
     * Sets the value of the includeConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeConfidence(Boolean value) {
        this.includeConfidence = value;
    }

    /**
     * Gets the value of the categorySpecificsFileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategorySpecificsFileInfo() {
        return categorySpecificsFileInfo;
    }

    /**
     * Sets the value of the categorySpecificsFileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategorySpecificsFileInfo(Boolean value) {
        this.categorySpecificsFileInfo = value;
    }

}
