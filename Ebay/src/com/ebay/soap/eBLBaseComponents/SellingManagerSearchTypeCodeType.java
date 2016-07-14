
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerSearchTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerSearchTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerUserID"/>
 *     &lt;enumeration value="BuyerEmail"/>
 *     &lt;enumeration value="BuyerFullName"/>
 *     &lt;enumeration value="ItemID"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="ProductID"/>
 *     &lt;enumeration value="ProductName"/>
 *     &lt;enumeration value="CustomLabel"/>
 *     &lt;enumeration value="SaleRecordID"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerSearchTypeCodeType")
@XmlEnum
public enum SellingManagerSearchTypeCodeType {


    /**
     * 
     * 						Search for listings based on Buyer ID.
     * 					
     * 
     */
    @XmlEnumValue("BuyerUserID")
    BUYER_USER_ID("BuyerUserID"),

    /**
     * 
     * 						Search for listings based on Buyers email.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmail")
    BUYER_EMAIL("BuyerEmail"),

    /**
     * 
     * 						Search for listings based on Buyers full name.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFullName")
    BUYER_FULL_NAME("BuyerFullName"),

    /**
     * 
     * 						Search for listings based on ItemID.
     * 					
     * 
     */
    @XmlEnumValue("ItemID")
    ITEM_ID("ItemID"),

    /**
     * 
     * 						Search for listings based on Item Title.
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						Search for listings based on Product ID.
     * 					
     * 
     */
    @XmlEnumValue("ProductID")
    PRODUCT_ID("ProductID"),

    /**
     * 
     * 						Search for listings based on ProductName.
     * 					
     * 
     */
    @XmlEnumValue("ProductName")
    PRODUCT_NAME("ProductName"),

    /**
     * 
     * 						Search for listings based on SKU.
     * 					
     * 
     */
    @XmlEnumValue("CustomLabel")
    CUSTOM_LABEL("CustomLabel"),

    /**
     * 
     * 						Search for listings based on the sale record ID.
     * 						When an item is sold, Selling Manager generates a sale record.
     * 						A sale record contains buyer information, shipping, and other information.
     * 						A sale record is displayed in the Sold view in Selling Manager.
     * 						In the following calls,
     * 						the value for the sale record ID is in the SellingManagerSalesRecordNumber field:
     * 						GetItemTransactions, GetSellerTransactions, GetOrders, GetOrderTransactions.
     * 						In the Selling Manager calls, the value for the sale record ID is in the
     * 						SaleRecordID field. The sale record ID can be for a single or multiple line item order.
     * 						<br/><br/>
     * 						For orders that occurred within the last 30 days, passing only the SaleRecordID into the GetSellingManagerSoldListings 
     * 						request will return the sale record. However, for sales that occurred more than 30 days ago, the SaleDateRange container 
     * 						must also be used, passing in a date range that includes the date on which the specific sale occurred.
     * 					
     * 
     */
    @XmlEnumValue("SaleRecordID")
    SALE_RECORD_ID("SaleRecordID"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerSearchTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerSearchTypeCodeType fromValue(String v) {
        for (SellingManagerSearchTypeCodeType c: SellingManagerSearchTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
