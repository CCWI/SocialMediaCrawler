
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
 * 				Calls made form seller or buyer find out what the most relevant tags and values are for a given category
 * 			
 * 
 * <p>Java class for GetCategorySpecificsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategorySpecificsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Recommendations" type="{urn:ebay:apis:eBLBaseComponents}RecommendationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaskReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategorySpecificsResponseType", propOrder = {
    "recommendations",
    "taskReferenceID",
    "fileReferenceID"
})
public class GetCategorySpecificsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Recommendations")
    protected List<RecommendationsType> recommendations;
    @XmlElement(name = "TaskReferenceID")
    protected String taskReferenceID;
    @XmlElement(name = "FileReferenceID")
    protected String fileReferenceID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RecommendationsType }
     *     
     */
    public RecommendationsType[] getRecommendations() {
        if (this.recommendations == null) {
            return new RecommendationsType[ 0 ] ;
        }
        return ((RecommendationsType[]) this.recommendations.toArray(new RecommendationsType[this.recommendations.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RecommendationsType }
     *     
     */
    public RecommendationsType getRecommendations(int idx) {
        if (this.recommendations == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recommendations.get(idx);
    }

    public int getRecommendationsLength() {
        if (this.recommendations == null) {
            return  0;
        }
        return this.recommendations.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RecommendationsType }
     *     
     */
    public void setRecommendations(RecommendationsType[] values) {
        this._getRecommendations().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recommendations.add(values[i]);
        }
    }

    protected List<RecommendationsType> _getRecommendations() {
        if (recommendations == null) {
            recommendations = new ArrayList<RecommendationsType>();
        }
        return recommendations;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationsType }
     *     
     */
    public RecommendationsType setRecommendations(int idx, RecommendationsType value) {
        return this.recommendations.set(idx, value);
    }

    /**
     * Gets the value of the taskReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskReferenceID() {
        return taskReferenceID;
    }

    /**
     * Sets the value of the taskReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskReferenceID(String value) {
        this.taskReferenceID = value;
    }

    /**
     * Gets the value of the fileReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceID() {
        return fileReferenceID;
    }

    /**
     * Sets the value of the fileReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceID(String value) {
        this.fileReferenceID = value;
    }

}
