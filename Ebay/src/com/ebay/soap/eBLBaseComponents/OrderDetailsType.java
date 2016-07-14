
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains information about the sold item, such as: order id, buyer information,
 * 				shipping information, order creation time, payment cleared time, tax amount,
 * 				insurance cost, and total cost.
 * 			
 * 
 * <p>Java class for OrderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipRecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipStateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCountryName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentClearedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckoutSiteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderSalePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OrderTotalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SellingManagerSaleRecordID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderItemDetails" type="{urn:ebay:apis:eBLBaseComponents}OrderItemDetailsType" minOccurs="0"/>
 *         &lt;element name="BuyerStaticAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingServiceToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckoutStatus" type="{urn:ebay:apis:eBLBaseComponents}CheckoutStatusType" minOccurs="0"/>
 *         &lt;element name="PaymentHoldStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ExternalTransaction" type="{urn:ebay:apis:eBLBaseComponents}ExternalTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupDetailsType" minOccurs="0"/>
 *         &lt;element name="PickupMethodSelected" type="{urn:ebay:apis:eBLBaseComponents}PickupMethodSelectedType" minOccurs="0"/>
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
@XmlType(name = "OrderDetailsType", propOrder = {
    "orderID",
    "buyerUserID",
    "buyerFirstName",
    "buyerLastName",
    "buyerEmail",
    "buyerPhone",
    "shipRecipientName",
    "shipStreet1",
    "shipStreet2",
    "shipCityName",
    "shipStateOrProvince",
    "shipPostalCode",
    "shipCountryName",
    "shippingService",
    "paymentClearedTime",
    "checkoutSiteID",
    "orderCreationTime",
    "orderSalePrice",
    "taxAmount",
    "insuranceCost",
    "shippingCost",
    "orderTotalCost",
    "sellingManagerSaleRecordID",
    "orderItemDetails",
    "buyerStaticAlias",
    "shippingServiceToken",
    "checkoutStatus",
    "paymentHoldStatus",
    "externalTransaction",
    "shipReferenceId",
    "pickupDetails",
    "pickupMethodSelected",
    "any"
})
public class OrderDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "BuyerUserID")
    protected String buyerUserID;
    @XmlElement(name = "BuyerFirstName")
    protected String buyerFirstName;
    @XmlElement(name = "BuyerLastName")
    protected String buyerLastName;
    @XmlElement(name = "BuyerEmail")
    protected String buyerEmail;
    @XmlElement(name = "BuyerPhone")
    protected String buyerPhone;
    @XmlElement(name = "ShipRecipientName")
    protected String shipRecipientName;
    @XmlElement(name = "ShipStreet1")
    protected String shipStreet1;
    @XmlElement(name = "ShipStreet2")
    protected String shipStreet2;
    @XmlElement(name = "ShipCityName")
    protected String shipCityName;
    @XmlElement(name = "ShipStateOrProvince")
    protected String shipStateOrProvince;
    @XmlElement(name = "ShipPostalCode")
    protected String shipPostalCode;
    @XmlElement(name = "ShipCountryName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shipCountryName;
    @XmlElement(name = "ShippingService")
    protected String shippingService;
    @XmlElement(name = "PaymentClearedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paymentClearedTime;
    @XmlElement(name = "CheckoutSiteID")
    protected Integer checkoutSiteID;
    @XmlElement(name = "OrderCreationTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar orderCreationTime;
    @XmlElement(name = "OrderSalePrice")
    protected AmountType orderSalePrice;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "InsuranceCost")
    protected AmountType insuranceCost;
    @XmlElement(name = "ShippingCost")
    protected AmountType shippingCost;
    @XmlElement(name = "OrderTotalCost")
    protected AmountType orderTotalCost;
    @XmlElement(name = "SellingManagerSaleRecordID")
    protected Integer sellingManagerSaleRecordID;
    @XmlElement(name = "OrderItemDetails")
    protected OrderItemDetailsType orderItemDetails;
    @XmlElement(name = "BuyerStaticAlias")
    protected String buyerStaticAlias;
    @XmlElement(name = "ShippingServiceToken")
    protected String shippingServiceToken;
    @XmlElement(name = "CheckoutStatus")
    protected CheckoutStatusType checkoutStatus;
    @XmlElement(name = "PaymentHoldStatus")
    protected PaymentHoldStatusCodeType paymentHoldStatus;
    @XmlElement(name = "ExternalTransaction")
    protected List<ExternalTransactionType> externalTransaction;
    @XmlElement(name = "ShipReferenceId")
    protected String shipReferenceId;
    @XmlElement(name = "PickupDetails")
    protected PickupDetailsType pickupDetails;
    @XmlElement(name = "PickupMethodSelected")
    protected PickupMethodSelectedType pickupMethodSelected;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
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
     * Gets the value of the buyerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerFirstName() {
        return buyerFirstName;
    }

    /**
     * Sets the value of the buyerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerFirstName(String value) {
        this.buyerFirstName = value;
    }

    /**
     * Gets the value of the buyerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerLastName() {
        return buyerLastName;
    }

    /**
     * Sets the value of the buyerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerLastName(String value) {
        this.buyerLastName = value;
    }

    /**
     * Gets the value of the buyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Sets the value of the buyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Gets the value of the buyerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * Sets the value of the buyerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPhone(String value) {
        this.buyerPhone = value;
    }

    /**
     * Gets the value of the shipRecipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipRecipientName() {
        return shipRecipientName;
    }

    /**
     * Sets the value of the shipRecipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipRecipientName(String value) {
        this.shipRecipientName = value;
    }

    /**
     * Gets the value of the shipStreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipStreet1() {
        return shipStreet1;
    }

    /**
     * Sets the value of the shipStreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipStreet1(String value) {
        this.shipStreet1 = value;
    }

    /**
     * Gets the value of the shipStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipStreet2() {
        return shipStreet2;
    }

    /**
     * Sets the value of the shipStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipStreet2(String value) {
        this.shipStreet2 = value;
    }

    /**
     * Gets the value of the shipCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCityName() {
        return shipCityName;
    }

    /**
     * Sets the value of the shipCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCityName(String value) {
        this.shipCityName = value;
    }

    /**
     * Gets the value of the shipStateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipStateOrProvince() {
        return shipStateOrProvince;
    }

    /**
     * Sets the value of the shipStateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipStateOrProvince(String value) {
        this.shipStateOrProvince = value;
    }

    /**
     * Gets the value of the shipPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPostalCode() {
        return shipPostalCode;
    }

    /**
     * Sets the value of the shipPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPostalCode(String value) {
        this.shipPostalCode = value;
    }

    /**
     * Gets the value of the shipCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCountryName() {
        return shipCountryName;
    }

    /**
     * Sets the value of the shipCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCountryName(String value) {
        this.shipCountryName = value;
    }

    /**
     * Gets the value of the shippingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingService() {
        return shippingService;
    }

    /**
     * Sets the value of the shippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingService(String value) {
        this.shippingService = value;
    }

    /**
     * Gets the value of the paymentClearedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaymentClearedTime() {
        return paymentClearedTime;
    }

    /**
     * Sets the value of the paymentClearedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentClearedTime(Calendar value) {
        this.paymentClearedTime = value;
    }

    /**
     * Gets the value of the checkoutSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckoutSiteID() {
        return checkoutSiteID;
    }

    /**
     * Sets the value of the checkoutSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckoutSiteID(Integer value) {
        this.checkoutSiteID = value;
    }

    /**
     * Gets the value of the orderCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrderCreationTime() {
        return orderCreationTime;
    }

    /**
     * Sets the value of the orderCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCreationTime(Calendar value) {
        this.orderCreationTime = value;
    }

    /**
     * Gets the value of the orderSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOrderSalePrice() {
        return orderSalePrice;
    }

    /**
     * Sets the value of the orderSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOrderSalePrice(AmountType value) {
        this.orderSalePrice = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCost(AmountType value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingCost(AmountType value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the orderTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOrderTotalCost() {
        return orderTotalCost;
    }

    /**
     * Sets the value of the orderTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOrderTotalCost(AmountType value) {
        this.orderTotalCost = value;
    }

    /**
     * Gets the value of the sellingManagerSaleRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellingManagerSaleRecordID() {
        return sellingManagerSaleRecordID;
    }

    /**
     * Sets the value of the sellingManagerSaleRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellingManagerSaleRecordID(Integer value) {
        this.sellingManagerSaleRecordID = value;
    }

    /**
     * Gets the value of the orderItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDetailsType }
     *     
     */
    public OrderItemDetailsType getOrderItemDetails() {
        return orderItemDetails;
    }

    /**
     * Sets the value of the orderItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDetailsType }
     *     
     */
    public void setOrderItemDetails(OrderItemDetailsType value) {
        this.orderItemDetails = value;
    }

    /**
     * Gets the value of the buyerStaticAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerStaticAlias() {
        return buyerStaticAlias;
    }

    /**
     * Sets the value of the buyerStaticAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerStaticAlias(String value) {
        this.buyerStaticAlias = value;
    }

    /**
     * Gets the value of the shippingServiceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceToken() {
        return shippingServiceToken;
    }

    /**
     * Sets the value of the shippingServiceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceToken(String value) {
        this.shippingServiceToken = value;
    }

    /**
     * Gets the value of the checkoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutStatusType }
     *     
     */
    public CheckoutStatusType getCheckoutStatus() {
        return checkoutStatus;
    }

    /**
     * Sets the value of the checkoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutStatusType }
     *     
     */
    public void setCheckoutStatus(CheckoutStatusType value) {
        this.checkoutStatus = value;
    }

    /**
     * Gets the value of the paymentHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public PaymentHoldStatusCodeType getPaymentHoldStatus() {
        return paymentHoldStatus;
    }

    /**
     * Sets the value of the paymentHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public void setPaymentHoldStatus(PaymentHoldStatusCodeType value) {
        this.paymentHoldStatus = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType[] getExternalTransaction() {
        if (this.externalTransaction == null) {
            return new ExternalTransactionType[ 0 ] ;
        }
        return ((ExternalTransactionType[]) this.externalTransaction.toArray(new ExternalTransactionType[this.externalTransaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType getExternalTransaction(int idx) {
        if (this.externalTransaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.externalTransaction.get(idx);
    }

    public int getExternalTransactionLength() {
        if (this.externalTransaction == null) {
            return  0;
        }
        return this.externalTransaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ExternalTransactionType }
     *     
     */
    public void setExternalTransaction(ExternalTransactionType[] values) {
        this._getExternalTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.externalTransaction.add(values[i]);
        }
    }

    protected List<ExternalTransactionType> _getExternalTransaction() {
        if (externalTransaction == null) {
            externalTransaction = new ArrayList<ExternalTransactionType>();
        }
        return externalTransaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType setExternalTransaction(int idx, ExternalTransactionType value) {
        return this.externalTransaction.set(idx, value);
    }

    /**
     * Gets the value of the shipReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipReferenceId() {
        return shipReferenceId;
    }

    /**
     * Sets the value of the shipReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipReferenceId(String value) {
        this.shipReferenceId = value;
    }

    /**
     * Gets the value of the pickupDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDetailsType }
     *     
     */
    public PickupDetailsType getPickupDetails() {
        return pickupDetails;
    }

    /**
     * Sets the value of the pickupDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDetailsType }
     *     
     */
    public void setPickupDetails(PickupDetailsType value) {
        this.pickupDetails = value;
    }

    /**
     * Gets the value of the pickupMethodSelected property.
     * 
     * @return
     *     possible object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public PickupMethodSelectedType getPickupMethodSelected() {
        return pickupMethodSelected;
    }

    /**
     * Sets the value of the pickupMethodSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public void setPickupMethodSelected(PickupMethodSelectedType value) {
        this.pickupMethodSelected = value;
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
