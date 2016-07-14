
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains the definition of a rule that governs the number of times your
 * 				application can access the eBay API (invoke a call) on an hourly, daily, or
 * 				periodic basis.
 * 			
 * 
 * <p>Java class for ApiAccessRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiAccessRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountsTowardAggregate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DailyHardLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DailySoftLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DailyUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HourlyHardLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HourlySoftLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HourlyUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PeriodicHardLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PeriodicSoftLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PeriodicUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PeriodicStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RuleCurrentStatus" type="{urn:ebay:apis:eBLBaseComponents}AccessRuleCurrentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RuleStatus" type="{urn:ebay:apis:eBLBaseComponents}AccessRuleStatusCodeType" minOccurs="0"/>
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
@XmlType(name = "ApiAccessRuleType", propOrder = {
    "callName",
    "countsTowardAggregate",
    "dailyHardLimit",
    "dailySoftLimit",
    "dailyUsage",
    "hourlyHardLimit",
    "hourlySoftLimit",
    "hourlyUsage",
    "period",
    "periodicHardLimit",
    "periodicSoftLimit",
    "periodicUsage",
    "periodicStartDate",
    "modTime",
    "ruleCurrentStatus",
    "ruleStatus",
    "any"
})
public class ApiAccessRuleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CallName")
    protected String callName;
    @XmlElement(name = "CountsTowardAggregate")
    protected Boolean countsTowardAggregate;
    @XmlElement(name = "DailyHardLimit")
    protected Long dailyHardLimit;
    @XmlElement(name = "DailySoftLimit")
    protected Long dailySoftLimit;
    @XmlElement(name = "DailyUsage")
    protected Long dailyUsage;
    @XmlElement(name = "HourlyHardLimit")
    protected Long hourlyHardLimit;
    @XmlElement(name = "HourlySoftLimit")
    protected Long hourlySoftLimit;
    @XmlElement(name = "HourlyUsage")
    protected Long hourlyUsage;
    @XmlElement(name = "Period")
    protected Integer period;
    @XmlElement(name = "PeriodicHardLimit")
    protected Long periodicHardLimit;
    @XmlElement(name = "PeriodicSoftLimit")
    protected Long periodicSoftLimit;
    @XmlElement(name = "PeriodicUsage")
    protected Long periodicUsage;
    @XmlElement(name = "PeriodicStartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar periodicStartDate;
    @XmlElement(name = "ModTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTime;
    @XmlElement(name = "RuleCurrentStatus")
    protected AccessRuleCurrentStatusCodeType ruleCurrentStatus;
    @XmlElement(name = "RuleStatus")
    protected AccessRuleStatusCodeType ruleStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the callName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallName() {
        return callName;
    }

    /**
     * Sets the value of the callName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallName(String value) {
        this.callName = value;
    }

    /**
     * Gets the value of the countsTowardAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountsTowardAggregate() {
        return countsTowardAggregate;
    }

    /**
     * Sets the value of the countsTowardAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountsTowardAggregate(Boolean value) {
        this.countsTowardAggregate = value;
    }

    /**
     * Gets the value of the dailyHardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailyHardLimit() {
        return dailyHardLimit;
    }

    /**
     * Sets the value of the dailyHardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailyHardLimit(Long value) {
        this.dailyHardLimit = value;
    }

    /**
     * Gets the value of the dailySoftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailySoftLimit() {
        return dailySoftLimit;
    }

    /**
     * Sets the value of the dailySoftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailySoftLimit(Long value) {
        this.dailySoftLimit = value;
    }

    /**
     * Gets the value of the dailyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailyUsage() {
        return dailyUsage;
    }

    /**
     * Sets the value of the dailyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailyUsage(Long value) {
        this.dailyUsage = value;
    }

    /**
     * Gets the value of the hourlyHardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHourlyHardLimit() {
        return hourlyHardLimit;
    }

    /**
     * Sets the value of the hourlyHardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHourlyHardLimit(Long value) {
        this.hourlyHardLimit = value;
    }

    /**
     * Gets the value of the hourlySoftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHourlySoftLimit() {
        return hourlySoftLimit;
    }

    /**
     * Sets the value of the hourlySoftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHourlySoftLimit(Long value) {
        this.hourlySoftLimit = value;
    }

    /**
     * Gets the value of the hourlyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHourlyUsage() {
        return hourlyUsage;
    }

    /**
     * Sets the value of the hourlyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHourlyUsage(Long value) {
        this.hourlyUsage = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodicHardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicHardLimit() {
        return periodicHardLimit;
    }

    /**
     * Sets the value of the periodicHardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicHardLimit(Long value) {
        this.periodicHardLimit = value;
    }

    /**
     * Gets the value of the periodicSoftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicSoftLimit() {
        return periodicSoftLimit;
    }

    /**
     * Sets the value of the periodicSoftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicSoftLimit(Long value) {
        this.periodicSoftLimit = value;
    }

    /**
     * Gets the value of the periodicUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicUsage() {
        return periodicUsage;
    }

    /**
     * Sets the value of the periodicUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicUsage(Long value) {
        this.periodicUsage = value;
    }

    /**
     * Gets the value of the periodicStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPeriodicStartDate() {
        return periodicStartDate;
    }

    /**
     * Sets the value of the periodicStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicStartDate(Calendar value) {
        this.periodicStartDate = value;
    }

    /**
     * Gets the value of the modTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModTime() {
        return modTime;
    }

    /**
     * Sets the value of the modTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTime(Calendar value) {
        this.modTime = value;
    }

    /**
     * Gets the value of the ruleCurrentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRuleCurrentStatusCodeType }
     *     
     */
    public AccessRuleCurrentStatusCodeType getRuleCurrentStatus() {
        return ruleCurrentStatus;
    }

    /**
     * Sets the value of the ruleCurrentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRuleCurrentStatusCodeType }
     *     
     */
    public void setRuleCurrentStatus(AccessRuleCurrentStatusCodeType value) {
        this.ruleCurrentStatus = value;
    }

    /**
     * Gets the value of the ruleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRuleStatusCodeType }
     *     
     */
    public AccessRuleStatusCodeType getRuleStatus() {
        return ruleStatus;
    }

    /**
     * Sets the value of the ruleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRuleStatusCodeType }
     *     
     */
    public void setRuleStatus(AccessRuleStatusCodeType value) {
        this.ruleStatus = value;
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
