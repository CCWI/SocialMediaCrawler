
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
 * 				GetItemRecommendations returns recommended changes or opportunities for improvement
 * 				related to listing data that was passed in the request.
 * 				This call supports batch requests. That is, it can retrieve recommendations for multiple
 * 				items at once.
 * 			
 * 
 * <p>Java class for GetItemRecommendationsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemRecommendationsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="GetRecommendationsResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}GetRecommendationsResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemRecommendationsResponseType", propOrder = {
    "getRecommendationsResponseContainer"
})
public class GetItemRecommendationsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "GetRecommendationsResponseContainer")
    protected List<GetRecommendationsResponseContainerType> getRecommendationsResponseContainer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link GetRecommendationsResponseContainerType }
     *     
     */
    public GetRecommendationsResponseContainerType[] getGetRecommendationsResponseContainer() {
        if (this.getRecommendationsResponseContainer == null) {
            return new GetRecommendationsResponseContainerType[ 0 ] ;
        }
        return ((GetRecommendationsResponseContainerType[]) this.getRecommendationsResponseContainer.toArray(new GetRecommendationsResponseContainerType[this.getRecommendationsResponseContainer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link GetRecommendationsResponseContainerType }
     *     
     */
    public GetRecommendationsResponseContainerType getGetRecommendationsResponseContainer(int idx) {
        if (this.getRecommendationsResponseContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.getRecommendationsResponseContainer.get(idx);
    }

    public int getGetRecommendationsResponseContainerLength() {
        if (this.getRecommendationsResponseContainer == null) {
            return  0;
        }
        return this.getRecommendationsResponseContainer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link GetRecommendationsResponseContainerType }
     *     
     */
    public void setGetRecommendationsResponseContainer(GetRecommendationsResponseContainerType[] values) {
        this._getGetRecommendationsResponseContainer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.getRecommendationsResponseContainer.add(values[i]);
        }
    }

    protected List<GetRecommendationsResponseContainerType> _getGetRecommendationsResponseContainer() {
        if (getRecommendationsResponseContainer == null) {
            getRecommendationsResponseContainer = new ArrayList<GetRecommendationsResponseContainerType>();
        }
        return getRecommendationsResponseContainer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecommendationsResponseContainerType }
     *     
     */
    public GetRecommendationsResponseContainerType setGetRecommendationsResponseContainer(int idx, GetRecommendationsResponseContainerType value) {
        return this.getRecommendationsResponseContainer.set(idx, value);
    }

}
