
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
 * 				Retrieves eBay IDs and codes (e.g., site IDs and shipping service
 * 				codes), enumerated data (e.g., payment methods), and other common eBay
 * 				meta-data. This call enables you to keep certain data up to date in your
 * 				applications without referring to the schema, the documentation, or the
 * 				eBay online help. Other data is returned for your reference, but you may
 * 				need to refer to the schema or the documentation for information about
 * 				valid values and usage.
 * 				<br><br>
 * 				In some cases, the data returned in the response will vary according to
 * 				the site that you use for the request.
 * 				<br><br>
 * 				If you use GeteBayDetails in preparation for listing in the US Motors Parts
 * 				and Accessories categories, use site ID 0 (which is the site ID of the US
 * 				site) when you call GeteBayDetails.
 * 				<br><br>
 * 				Sellers who engage in cross-border trade on sites that require a recoupment agreement, must agree to the
 * 				recoupment terms before adding items to the site. This agreement allows eBay to reimburse
 * 				a buyer during a dispute and then recoup the cost from the seller. Information about whether a site
 *         is a recoupment site is returned in the GeteBayDetailsResponse.RecoupmentPolicyDetails container.
 * 			
 * 
 * <p>Java class for GeteBayDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DetailName" type="{urn:ebay:apis:eBLBaseComponents}DetailNameCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayDetailsRequestType", propOrder = {
    "detailName"
})
public class GeteBayDetailsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DetailName")
    protected List<DetailNameCodeType> detailName;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DetailNameCodeType }
     *     
     */
    public DetailNameCodeType[] getDetailName() {
        if (this.detailName == null) {
            return new DetailNameCodeType[ 0 ] ;
        }
        return ((DetailNameCodeType[]) this.detailName.toArray(new DetailNameCodeType[this.detailName.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DetailNameCodeType }
     *     
     */
    public DetailNameCodeType getDetailName(int idx) {
        if (this.detailName == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.detailName.get(idx);
    }

    public int getDetailNameLength() {
        if (this.detailName == null) {
            return  0;
        }
        return this.detailName.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DetailNameCodeType }
     *     
     */
    public void setDetailName(DetailNameCodeType[] values) {
        this._getDetailName().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.detailName.add(values[i]);
        }
    }

    protected List<DetailNameCodeType> _getDetailName() {
        if (detailName == null) {
            detailName = new ArrayList<DetailNameCodeType>();
        }
        return detailName;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DetailNameCodeType }
     *     
     */
    public DetailNameCodeType setDetailName(int idx, DetailNameCodeType value) {
        return this.detailName.set(idx, value);
    }

}
