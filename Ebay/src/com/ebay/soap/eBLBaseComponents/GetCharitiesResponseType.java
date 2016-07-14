
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
 * 			Contains information about charity nonprofit organizations that meet the
 * 			criteria specified in the request.
 * 			
 * 
 * <p>Java class for GetCharitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCharitiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharitiesResponseType", propOrder = {
    "charity"
})
public class GetCharitiesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Charity")
    protected List<CharityInfoType> charity;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharityInfoType }
     *     
     */
    public CharityInfoType[] getCharity() {
        if (this.charity == null) {
            return new CharityInfoType[ 0 ] ;
        }
        return ((CharityInfoType[]) this.charity.toArray(new CharityInfoType[this.charity.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharityInfoType }
     *     
     */
    public CharityInfoType getCharity(int idx) {
        if (this.charity == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.charity.get(idx);
    }

    public int getCharityLength() {
        if (this.charity == null) {
            return  0;
        }
        return this.charity.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharityInfoType }
     *     
     */
    public void setCharity(CharityInfoType[] values) {
        this._getCharity().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.charity.add(values[i]);
        }
    }

    protected List<CharityInfoType> _getCharity() {
        if (charity == null) {
            charity = new ArrayList<CharityInfoType>();
        }
        return charity;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharityInfoType }
     *     
     */
    public CharityInfoType setCharity(int idx, CharityInfoType value) {
        return this.charity.set(idx, value);
    }

}
