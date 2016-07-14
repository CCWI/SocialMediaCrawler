
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Searches for nonprofit charity organizations that meet the
 * 				criteria specified in the request.
 * 				It is recommended that you use at least one input filter, because this call
 * 				no longer returns all charities when made without filters.
 * 			
 * 
 * <p>Java class for GetCharitiesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCharitiesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CharityDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchType" type="{urn:ebay:apis:eBLBaseComponents}StringMatchCodeType" minOccurs="0"/>
 *         &lt;element name="Featured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharitiesRequestType", propOrder = {
    "charityID",
    "charityName",
    "query",
    "charityRegion",
    "charityDomain",
    "includeDescription",
    "matchType",
    "featured",
    "campaignID"
})
public class GetCharitiesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharityID")
    protected String charityID;
    @XmlElement(name = "CharityName")
    protected String charityName;
    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "CharityRegion")
    protected Integer charityRegion;
    @XmlElement(name = "CharityDomain")
    protected Integer charityDomain;
    @XmlElement(name = "IncludeDescription")
    protected Boolean includeDescription;
    @XmlElement(name = "MatchType")
    protected StringMatchCodeType matchType;
    @XmlElement(name = "Featured")
    protected Boolean featured;
    @XmlElement(name = "CampaignID")
    protected Long campaignID;

    /**
     * Gets the value of the charityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityID() {
        return charityID;
    }

    /**
     * Sets the value of the charityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityID(String value) {
        this.charityID = value;
    }

    /**
     * Gets the value of the charityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityName() {
        return charityName;
    }

    /**
     * Sets the value of the charityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityName(String value) {
        this.charityName = value;
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
     * Gets the value of the charityRegion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityRegion() {
        return charityRegion;
    }

    /**
     * Sets the value of the charityRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityRegion(Integer value) {
        this.charityRegion = value;
    }

    /**
     * Gets the value of the charityDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityDomain() {
        return charityDomain;
    }

    /**
     * Sets the value of the charityDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityDomain(Integer value) {
        this.charityDomain = value;
    }

    /**
     * Gets the value of the includeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDescription() {
        return includeDescription;
    }

    /**
     * Sets the value of the includeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDescription(Boolean value) {
        this.includeDescription = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link StringMatchCodeType }
     *     
     */
    public StringMatchCodeType getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMatchCodeType }
     *     
     */
    public void setMatchType(StringMatchCodeType value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the featured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeatured() {
        return featured;
    }

    /**
     * Sets the value of the featured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeatured(Boolean value) {
        this.featured = value;
    }

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignID(Long value) {
        this.campaignID = value;
    }

}
