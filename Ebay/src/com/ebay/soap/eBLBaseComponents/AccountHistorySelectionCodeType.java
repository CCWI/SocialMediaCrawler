
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountHistorySelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountHistorySelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LastInvoice"/>
 *     &lt;enumeration value="SpecifiedInvoice"/>
 *     &lt;enumeration value="BetweenSpecifiedDates"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccountHistorySelectionCodeType")
@XmlEnum
public enum AccountHistorySelectionCodeType {


    /**
     * 
     * 								 (in) Contains the entries since the last invoice eBay sent to the seller.
     * 								 If you use LastInvoice, then InvoiceDate, BeginDate and EndDate are ignored.
     * 					
     * 
     */
    @XmlEnumValue("LastInvoice")
    LAST_INVOICE("LastInvoice"),

    /**
     * 
     * 								(in) Contains the entries for a specific invoice, identified
     * 								by the invoice month and year. If you use SpecifiedInvoice, then you
     * 								must also use InvoiceDate. If you use SpecifiedInvoice, then BeginDate and EndDate are ignored.
     * 					
     * 
     */
    @XmlEnumValue("SpecifiedInvoice")
    SPECIFIED_INVOICE("SpecifiedInvoice"),

    /**
     * 
     * 								(in) Contains entries that were posted to the seller's account between two dates.
     * 								The period covered may cross the boundaries of formal invoices.
     * 								If you use BetweenSpecifiedDates, then you also must specify BeginDate and EndDate.
     * 								If you use BetweenSpecifiedDates, then InvoiceDate is ignored.
     * 					
     * 
     */
    @XmlEnumValue("BetweenSpecifiedDates")
    BETWEEN_SPECIFIED_DATES("BetweenSpecifiedDates"),

    /**
     * 
     * 						 (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccountHistorySelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHistorySelectionCodeType fromValue(String v) {
        for (AccountHistorySelectionCodeType c: AccountHistorySelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
