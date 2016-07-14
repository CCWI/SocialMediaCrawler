
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
 * 				Contains all information describing a dispute.
 * 			
 * 
 * <p>Java class for DisputeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeRecordType" type="{urn:ebay:apis:eBLBaseComponents}DisputeRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeState" type="{urn:ebay:apis:eBLBaseComponents}DisputeStateCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeStatus" type="{urn:ebay:apis:eBLBaseComponents}DisputeStatusCodeType" minOccurs="0"/>
 *         &lt;element name="OtherPartyRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="OtherPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="SellerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="DisputeReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeReasonCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeExplanation" type="{urn:ebay:apis:eBLBaseComponents}DisputeExplanationCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeCreditEligibility" type="{urn:ebay:apis:eBLBaseComponents}DisputeCreditEligibilityCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisputeModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisputeResolution" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisputeMessage" type="{urn:ebay:apis:eBLBaseComponents}DisputeMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Escalation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PurchaseProtection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DisputeType", propOrder = {
    "disputeID",
    "disputeRecordType",
    "disputeState",
    "disputeStatus",
    "otherPartyRole",
    "otherPartyName",
    "userRole",
    "buyerUserID",
    "sellerUserID",
    "transactionID",
    "item",
    "disputeReason",
    "disputeExplanation",
    "disputeCreditEligibility",
    "disputeCreatedTime",
    "disputeModifiedTime",
    "disputeResolution",
    "disputeMessage",
    "escalation",
    "purchaseProtection",
    "orderLineItemID",
    "any"
})
public class DisputeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeID")
    protected String disputeID;
    @XmlElement(name = "DisputeRecordType")
    protected DisputeRecordTypeCodeType disputeRecordType;
    @XmlElement(name = "DisputeState")
    protected DisputeStateCodeType disputeState;
    @XmlElement(name = "DisputeStatus")
    protected DisputeStatusCodeType disputeStatus;
    @XmlElement(name = "OtherPartyRole")
    protected TradingRoleCodeType otherPartyRole;
    @XmlElement(name = "OtherPartyName")
    protected String otherPartyName;
    @XmlElement(name = "UserRole")
    protected TradingRoleCodeType userRole;
    @XmlElement(name = "BuyerUserID")
    protected String buyerUserID;
    @XmlElement(name = "SellerUserID")
    protected String sellerUserID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "DisputeReason")
    protected DisputeReasonCodeType disputeReason;
    @XmlElement(name = "DisputeExplanation")
    protected DisputeExplanationCodeType disputeExplanation;
    @XmlElement(name = "DisputeCreditEligibility")
    protected DisputeCreditEligibilityCodeType disputeCreditEligibility;
    @XmlElement(name = "DisputeCreatedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar disputeCreatedTime;
    @XmlElement(name = "DisputeModifiedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar disputeModifiedTime;
    @XmlElement(name = "DisputeResolution")
    protected List<DisputeResolutionType> disputeResolution;
    @XmlElement(name = "DisputeMessage")
    protected List<DisputeMessageType> disputeMessage;
    @XmlElement(name = "Escalation")
    protected Boolean escalation;
    @XmlElement(name = "PurchaseProtection")
    protected Boolean purchaseProtection;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the disputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

    /**
     * Gets the value of the disputeRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeRecordTypeCodeType }
     *     
     */
    public DisputeRecordTypeCodeType getDisputeRecordType() {
        return disputeRecordType;
    }

    /**
     * Sets the value of the disputeRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeRecordTypeCodeType }
     *     
     */
    public void setDisputeRecordType(DisputeRecordTypeCodeType value) {
        this.disputeRecordType = value;
    }

    /**
     * Gets the value of the disputeState property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStateCodeType }
     *     
     */
    public DisputeStateCodeType getDisputeState() {
        return disputeState;
    }

    /**
     * Sets the value of the disputeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStateCodeType }
     *     
     */
    public void setDisputeState(DisputeStateCodeType value) {
        this.disputeState = value;
    }

    /**
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatusCodeType }
     *     
     */
    public DisputeStatusCodeType getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatusCodeType }
     *     
     */
    public void setDisputeStatus(DisputeStatusCodeType value) {
        this.disputeStatus = value;
    }

    /**
     * Gets the value of the otherPartyRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getOtherPartyRole() {
        return otherPartyRole;
    }

    /**
     * Sets the value of the otherPartyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setOtherPartyRole(TradingRoleCodeType value) {
        this.otherPartyRole = value;
    }

    /**
     * Gets the value of the otherPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartyName() {
        return otherPartyName;
    }

    /**
     * Sets the value of the otherPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartyName(String value) {
        this.otherPartyName = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setUserRole(TradingRoleCodeType value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the buyerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerUserID() {
        return buyerUserID;
    }

    /**
     * Sets the value of the buyerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerUserID(String value) {
        this.buyerUserID = value;
    }

    /**
     * Gets the value of the sellerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserID() {
        return sellerUserID;
    }

    /**
     * Sets the value of the sellerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserID(String value) {
        this.sellerUserID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
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
     * Gets the value of the disputeReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public DisputeReasonCodeType getDisputeReason() {
        return disputeReason;
    }

    /**
     * Sets the value of the disputeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public void setDisputeReason(DisputeReasonCodeType value) {
        this.disputeReason = value;
    }

    /**
     * Gets the value of the disputeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public DisputeExplanationCodeType getDisputeExplanation() {
        return disputeExplanation;
    }

    /**
     * Sets the value of the disputeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public void setDisputeExplanation(DisputeExplanationCodeType value) {
        this.disputeExplanation = value;
    }

    /**
     * Gets the value of the disputeCreditEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCreditEligibilityCodeType }
     *     
     */
    public DisputeCreditEligibilityCodeType getDisputeCreditEligibility() {
        return disputeCreditEligibility;
    }

    /**
     * Sets the value of the disputeCreditEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCreditEligibilityCodeType }
     *     
     */
    public void setDisputeCreditEligibility(DisputeCreditEligibilityCodeType value) {
        this.disputeCreditEligibility = value;
    }

    /**
     * Gets the value of the disputeCreatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDisputeCreatedTime() {
        return disputeCreatedTime;
    }

    /**
     * Sets the value of the disputeCreatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCreatedTime(Calendar value) {
        this.disputeCreatedTime = value;
    }

    /**
     * Gets the value of the disputeModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDisputeModifiedTime() {
        return disputeModifiedTime;
    }

    /**
     * Sets the value of the disputeModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeModifiedTime(Calendar value) {
        this.disputeModifiedTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DisputeResolutionType }
     *     
     */
    public DisputeResolutionType[] getDisputeResolution() {
        if (this.disputeResolution == null) {
            return new DisputeResolutionType[ 0 ] ;
        }
        return ((DisputeResolutionType[]) this.disputeResolution.toArray(new DisputeResolutionType[this.disputeResolution.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DisputeResolutionType }
     *     
     */
    public DisputeResolutionType getDisputeResolution(int idx) {
        if (this.disputeResolution == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.disputeResolution.get(idx);
    }

    public int getDisputeResolutionLength() {
        if (this.disputeResolution == null) {
            return  0;
        }
        return this.disputeResolution.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DisputeResolutionType }
     *     
     */
    public void setDisputeResolution(DisputeResolutionType[] values) {
        this._getDisputeResolution().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.disputeResolution.add(values[i]);
        }
    }

    protected List<DisputeResolutionType> _getDisputeResolution() {
        if (disputeResolution == null) {
            disputeResolution = new ArrayList<DisputeResolutionType>();
        }
        return disputeResolution;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionType }
     *     
     */
    public DisputeResolutionType setDisputeResolution(int idx, DisputeResolutionType value) {
        return this.disputeResolution.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DisputeMessageType }
     *     
     */
    public DisputeMessageType[] getDisputeMessage() {
        if (this.disputeMessage == null) {
            return new DisputeMessageType[ 0 ] ;
        }
        return ((DisputeMessageType[]) this.disputeMessage.toArray(new DisputeMessageType[this.disputeMessage.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DisputeMessageType }
     *     
     */
    public DisputeMessageType getDisputeMessage(int idx) {
        if (this.disputeMessage == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.disputeMessage.get(idx);
    }

    public int getDisputeMessageLength() {
        if (this.disputeMessage == null) {
            return  0;
        }
        return this.disputeMessage.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DisputeMessageType }
     *     
     */
    public void setDisputeMessage(DisputeMessageType[] values) {
        this._getDisputeMessage().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.disputeMessage.add(values[i]);
        }
    }

    protected List<DisputeMessageType> _getDisputeMessage() {
        if (disputeMessage == null) {
            disputeMessage = new ArrayList<DisputeMessageType>();
        }
        return disputeMessage;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeMessageType }
     *     
     */
    public DisputeMessageType setDisputeMessage(int idx, DisputeMessageType value) {
        return this.disputeMessage.set(idx, value);
    }

    /**
     * Gets the value of the escalation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscalation() {
        return escalation;
    }

    /**
     * Sets the value of the escalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscalation(Boolean value) {
        this.escalation = value;
    }

    /**
     * Gets the value of the purchaseProtection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseProtection() {
        return purchaseProtection;
    }

    /**
     * Sets the value of the purchaseProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseProtection(Boolean value) {
        this.purchaseProtection = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
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
