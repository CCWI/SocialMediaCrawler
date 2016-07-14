
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerProductSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerProductSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ActiveQuantity"/>
 *     &lt;enumeration value="AvailableToList"/>
 *     &lt;enumeration value="AveragePrice"/>
 *     &lt;enumeration value="AverageUnitCost"/>
 *     &lt;enumeration value="CustomLabel"/>
 *     &lt;enumeration value="ProductName"/>
 *     &lt;enumeration value="LastSubmittedDate"/>
 *     &lt;enumeration value="ScheduledQuantity"/>
 *     &lt;enumeration value="SoldQuantity"/>
 *     &lt;enumeration value="SuccessPercent"/>
 *     &lt;enumeration value="UnsoldQuantity"/>
 *     &lt;enumeration value="FolderName"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerProductSortCodeType")
@XmlEnum
public enum SellingManagerProductSortCodeType {


    /**
     * 
     * 					 Sort products by by quantity currently listed.
     * 					
     * 
     */
    @XmlEnumValue("ActiveQuantity")
    ACTIVE_QUANTITY("ActiveQuantity"),

    /**
     * 
     * 					 Sort unlisted products by availability to list.
     * 					
     * 
     */
    @XmlEnumValue("AvailableToList")
    AVAILABLE_TO_LIST("AvailableToList"),

    /**
     * 
     * 					 Sort by average price of sold items.
     * 					
     * 
     */
    @XmlEnumValue("AveragePrice")
    AVERAGE_PRICE("AveragePrice"),

    /**
     * 
     * 					 Sort by average unit cost of items.
     * 					
     * 
     */
    @XmlEnumValue("AverageUnitCost")
    AVERAGE_UNIT_COST("AverageUnitCost"),

    /**
     * 
     * 					 Sort products by label.
     * 					
     * 
     */
    @XmlEnumValue("CustomLabel")
    CUSTOM_LABEL("CustomLabel"),

    /**
     * 
     * 					 Sort by product name.
     * 					
     * 
     */
    @XmlEnumValue("ProductName")
    PRODUCT_NAME("ProductName"),

    /**
     * 
     * 					 Sort by submitted date.
     * 					
     * 
     */
    @XmlEnumValue("LastSubmittedDate")
    LAST_SUBMITTED_DATE("LastSubmittedDate"),

    /**
     * 
     * 					 Sort by quantity scheduled to be listed.
     * 					
     * 
     */
    @XmlEnumValue("ScheduledQuantity")
    SCHEDULED_QUANTITY("ScheduledQuantity"),

    /**
     * 
     * 					 Sort by quantity sold.
     * 					
     * 
     */
    @XmlEnumValue("SoldQuantity")
    SOLD_QUANTITY("SoldQuantity"),

    /**
     * 
     * 					 Sort by the percentage of ended listings that had a sale.
     * 					
     * 
     */
    @XmlEnumValue("SuccessPercent")
    SUCCESS_PERCENT("SuccessPercent"),

    /**
     * 
     * 					 Sort by number of unsold items.
     * 					
     * 
     */
    @XmlEnumValue("UnsoldQuantity")
    UNSOLD_QUANTITY("UnsoldQuantity"),

    /**
     * 
     * 					 	Sort products by folder name.
     * 					
     * 
     */
    @XmlEnumValue("FolderName")
    FOLDER_NAME("FolderName"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerProductSortCodeType fromValue(String v) {
        for (SellingManagerProductSortCodeType c: SellingManagerProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
