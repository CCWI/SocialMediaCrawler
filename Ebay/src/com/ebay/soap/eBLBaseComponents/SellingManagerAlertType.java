
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
 * 				Type defining the Alert container, which contains summary information on one type of 
 * 				Selling Manager alert. 
 * 			
 * 
 * <p>Java class for SellingManagerAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertType" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAlertTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SoldAlert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldListingsPropertyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="InventoryAlert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerInventoryPropertyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AutomationAlert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutomationPropertyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PaisaPayAlert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerPaisaPayPropertyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="GeneralAlert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerGeneralPropertyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DurationInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAlertType", propOrder = {
    "alertType",
    "soldAlert",
    "inventoryAlert",
    "automationAlert",
    "paisaPayAlert",
    "generalAlert",
    "durationInDays",
    "count",
    "any"
})
public class SellingManagerAlertType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AlertType")
    protected SellingManagerAlertTypeCodeType alertType;
    @XmlElement(name = "SoldAlert")
    protected SellingManagerSoldListingsPropertyTypeCodeType soldAlert;
    @XmlElement(name = "InventoryAlert")
    protected SellingManagerInventoryPropertyTypeCodeType inventoryAlert;
    @XmlElement(name = "AutomationAlert")
    protected SellingManagerAutomationPropertyTypeCodeType automationAlert;
    @XmlElement(name = "PaisaPayAlert")
    protected SellingManagerPaisaPayPropertyTypeCodeType paisaPayAlert;
    @XmlElement(name = "GeneralAlert")
    protected SellingManagerGeneralPropertyTypeCodeType generalAlert;
    @XmlElement(name = "DurationInDays")
    protected Integer durationInDays;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAlertTypeCodeType }
     *     
     */
    public SellingManagerAlertTypeCodeType getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAlertTypeCodeType }
     *     
     */
    public void setAlertType(SellingManagerAlertTypeCodeType value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the soldAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsPropertyTypeCodeType getSoldAlert() {
        return soldAlert;
    }

    /**
     * Sets the value of the soldAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldListingsPropertyTypeCodeType }
     *     
     */
    public void setSoldAlert(SellingManagerSoldListingsPropertyTypeCodeType value) {
        this.soldAlert = value;
    }

    /**
     * Gets the value of the inventoryAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public SellingManagerInventoryPropertyTypeCodeType getInventoryAlert() {
        return inventoryAlert;
    }

    /**
     * Sets the value of the inventoryAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerInventoryPropertyTypeCodeType }
     *     
     */
    public void setInventoryAlert(SellingManagerInventoryPropertyTypeCodeType value) {
        this.inventoryAlert = value;
    }

    /**
     * Gets the value of the automationAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutomationPropertyTypeCodeType }
     *     
     */
    public SellingManagerAutomationPropertyTypeCodeType getAutomationAlert() {
        return automationAlert;
    }

    /**
     * Sets the value of the automationAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutomationPropertyTypeCodeType }
     *     
     */
    public void setAutomationAlert(SellingManagerAutomationPropertyTypeCodeType value) {
        this.automationAlert = value;
    }

    /**
     * Gets the value of the paisaPayAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerPaisaPayPropertyTypeCodeType }
     *     
     */
    public SellingManagerPaisaPayPropertyTypeCodeType getPaisaPayAlert() {
        return paisaPayAlert;
    }

    /**
     * Sets the value of the paisaPayAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerPaisaPayPropertyTypeCodeType }
     *     
     */
    public void setPaisaPayAlert(SellingManagerPaisaPayPropertyTypeCodeType value) {
        this.paisaPayAlert = value;
    }

    /**
     * Gets the value of the generalAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerGeneralPropertyTypeCodeType }
     *     
     */
    public SellingManagerGeneralPropertyTypeCodeType getGeneralAlert() {
        return generalAlert;
    }

    /**
     * Sets the value of the generalAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerGeneralPropertyTypeCodeType }
     *     
     */
    public void setGeneralAlert(SellingManagerGeneralPropertyTypeCodeType value) {
        this.generalAlert = value;
    }

    /**
     * Gets the value of the durationInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationInDays() {
        return durationInDays;
    }

    /**
     * Sets the value of the durationInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationInDays(Integer value) {
        this.durationInDays = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
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
