
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns all promotion rules associated with the specified item or store category. 
 * 				<strong>Note:</strong> eBay Store Cross Promotions are no longer supported in the 
 * 				Trading API.
 * 			
 * 
 * <p>Java class for GetPromotionRulesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromotionRulesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PromotionRuleArray" type="{urn:ebay:apis:eBLBaseComponents}PromotionRuleArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromotionRulesResponseType", propOrder = {
    "promotionRuleArray"
})
public class GetPromotionRulesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionRuleArray")
    protected PromotionRuleArrayType promotionRuleArray;

    /**
     * Gets the value of the promotionRuleArray property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionRuleArrayType }
     *     
     */
    public PromotionRuleArrayType getPromotionRuleArray() {
        return promotionRuleArray;
    }

    /**
     * Sets the value of the promotionRuleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionRuleArrayType }
     *     
     */
    public void setPromotionRuleArray(PromotionRuleArrayType value) {
        this.promotionRuleArray = value;
    }

}
