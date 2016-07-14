
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
 * 				Response to a GetContextualKeywords request.
 * 			
 * 
 * <p>Java class for GetContextualKeywordsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContextualKeywordsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ContextSearchAsset" type="{urn:ebay:apis:eBLBaseComponents}ContextSearchAssetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContextualKeywordsResponseType", propOrder = {
    "contextSearchAsset"
})
public class GetContextualKeywordsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ContextSearchAsset")
    protected List<ContextSearchAssetType> contextSearchAsset;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ContextSearchAssetType }
     *     
     */
    public ContextSearchAssetType[] getContextSearchAsset() {
        if (this.contextSearchAsset == null) {
            return new ContextSearchAssetType[ 0 ] ;
        }
        return ((ContextSearchAssetType[]) this.contextSearchAsset.toArray(new ContextSearchAssetType[this.contextSearchAsset.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ContextSearchAssetType }
     *     
     */
    public ContextSearchAssetType getContextSearchAsset(int idx) {
        if (this.contextSearchAsset == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.contextSearchAsset.get(idx);
    }

    public int getContextSearchAssetLength() {
        if (this.contextSearchAsset == null) {
            return  0;
        }
        return this.contextSearchAsset.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ContextSearchAssetType }
     *     
     */
    public void setContextSearchAsset(ContextSearchAssetType[] values) {
        this._getContextSearchAsset().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.contextSearchAsset.add(values[i]);
        }
    }

    protected List<ContextSearchAssetType> _getContextSearchAsset() {
        if (contextSearchAsset == null) {
            contextSearchAsset = new ArrayList<ContextSearchAssetType>();
        }
        return contextSearchAsset;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ContextSearchAssetType }
     *     
     */
    public ContextSearchAssetType setContextSearchAsset(int idx, ContextSearchAssetType value) {
        return this.contextSearchAsset.set(idx, value);
    }

}
