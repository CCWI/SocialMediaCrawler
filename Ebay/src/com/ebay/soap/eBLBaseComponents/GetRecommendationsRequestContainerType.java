
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
 * 				Specifies the data for a single item and configures the recommendation engines to use
 * 				when processing the item with GetItemRecommendations.
 * 			
 * 
 * <p>Java class for GetRecommendationsRequestContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecommendationsRequestContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingFlow" type="{urn:ebay:apis:eBLBaseComponents}ListingFlowCodeType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="RecommendationEngine" type="{urn:ebay:apis:eBLBaseComponents}RecommendationEngineCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeConfidence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "GetRecommendationsRequestContainerType", propOrder = {
    "listingFlow",
    "item",
    "recommendationEngine",
    "query",
    "correlationID",
    "deletedField",
    "excludeRelationships",
    "includeConfidence",
    "any"
})
public class GetRecommendationsRequestContainerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingFlow")
    protected ListingFlowCodeType listingFlow;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "RecommendationEngine")
    protected List<RecommendationEngineCodeType> recommendationEngine;
    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "DeletedField")
    protected List<String> deletedField;
    @XmlElement(name = "ExcludeRelationships")
    protected Boolean excludeRelationships;
    @XmlElement(name = "IncludeConfidence")
    protected Boolean includeConfidence;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the listingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link ListingFlowCodeType }
     *     
     */
    public ListingFlowCodeType getListingFlow() {
        return listingFlow;
    }

    /**
     * Sets the value of the listingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingFlowCodeType }
     *     
     */
    public void setListingFlow(ListingFlowCodeType value) {
        this.listingFlow = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RecommendationEngineCodeType }
     *     
     */
    public RecommendationEngineCodeType[] getRecommendationEngine() {
        if (this.recommendationEngine == null) {
            return new RecommendationEngineCodeType[ 0 ] ;
        }
        return ((RecommendationEngineCodeType[]) this.recommendationEngine.toArray(new RecommendationEngineCodeType[this.recommendationEngine.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RecommendationEngineCodeType }
     *     
     */
    public RecommendationEngineCodeType getRecommendationEngine(int idx) {
        if (this.recommendationEngine == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recommendationEngine.get(idx);
    }

    public int getRecommendationEngineLength() {
        if (this.recommendationEngine == null) {
            return  0;
        }
        return this.recommendationEngine.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RecommendationEngineCodeType }
     *     
     */
    public void setRecommendationEngine(RecommendationEngineCodeType[] values) {
        this._getRecommendationEngine().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recommendationEngine.add(values[i]);
        }
    }

    protected List<RecommendationEngineCodeType> _getRecommendationEngine() {
        if (recommendationEngine == null) {
            recommendationEngine = new ArrayList<RecommendationEngineCodeType>();
        }
        return recommendationEngine;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationEngineCodeType }
     *     
     */
    public RecommendationEngineCodeType setRecommendationEngine(int idx, RecommendationEngineCodeType value) {
        return this.recommendationEngine.set(idx, value);
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
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
