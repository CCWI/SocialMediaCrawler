
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnAll"/>
 *     &lt;enumeration value="ItemReturnDescription"/>
 *     &lt;enumeration value="ItemReturnAttributes"/>
 *     &lt;enumeration value="ItemReturnCategories"/>
 *     &lt;enumeration value="ReturnSummary"/>
 *     &lt;enumeration value="ReturnHeaders"/>
 *     &lt;enumeration value="ReturnMessages"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DetailLevelCodeType")
@XmlEnum
public enum DetailLevelCodeType {


    /**
     * 
     * 						(in) Returns all available data.
     * 						With GetSellerList and other calls that retrieve large data sets,
     * 						please avoid using ReturnAll when possible. For example, if you use
     * 						GetSellerList, use a GranularityLevel or use the
     * 						GetSellerEvents call instead. If you use ReturnAll with GetSellerList,
     * 						use a small EntriesPerPage value and a short
     * 						EndTimeFrom/EndTimeTo range for better performance.
     * 					
     * 
     */
    @XmlEnumValue("ReturnAll")
    RETURN_ALL("ReturnAll"),

    /**
     * 
     * 						(in) Returns Description, plus the
     * 						ListingDesigner node and some additional information if applicable
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnDescription")
    ITEM_RETURN_DESCRIPTION("ItemReturnDescription"),

    /**
     * 
     * 						(in) For GetItem, returns Item Specifics and
     * 						Pre-filled Item Information, if any.
     * 						For GetSearchResults, only returns Item Specifics (if any) that
     * 						are applicable to search results, and only under certain conditions.
     * 						See the description of Item.AttributeSetArray for details about
     * 						the effects for applicable calls. Also see the description of
     * 						Item.ProductListingDetails for GetItem.
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnAttributes")
    ITEM_RETURN_ATTRIBUTES("ItemReturnAttributes"),

    /**
     * 
     * 						(in) For the GetSearchResults call, returns the primary category and, if applicable, the secondary category
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnCategories")
    ITEM_RETURN_CATEGORIES("ItemReturnCategories"),

    /**
     * 
     * 						(in) Returns the summary data.
     * 						For GetMyMessages, this detail level returns the same data
     * 						whether or not you include MessageIDs or AlertIDs in the
     * 						request. Returns up to 10 FolderID and FolderName values.
     * 						Currently, this detail level is the only way to retrieve
     * 						FolderID and FolderName values. See "GetMyMessages" in the
     * 						eBay Web Services Guide for a code sample that demonstrates
     * 						this.
     * 					
     * 
     */
    @XmlEnumValue("ReturnSummary")
    RETURN_SUMMARY("ReturnSummary"),

    /**
     * 
     * 						(in) Returns message headers.
     * 						For GetMyMessages, if you include MessageIDs or AlertIDs in
     * 						the request, this detail level returns header information,
     * 						without body text, for the specified message ID or alert ID
     * 						values. If you include a FolderID, header information is
     * 						returned only for the messages and alerts in the specified
     * 						folder.
     * 						If you do not include MessageIDs or AlertIDs, this detail
     * 						level returns header information for Alerts and Messages as follows:
     * 						- If all the Alerts have been read, they are sorted in date order,
     * 						with the most recent first.
     * 						- If one of the Alerts has not been read, the Read Alerts come first,
     * 						sorted most recent first, followed by the Unread Alert(s).
     * 						- All messages in ascending order by date received with the
     * 						  oldest messages first.
     * 						Note that even when restricted by this detail level to
     * 						return only header information, GetMyMessages may return a
     * 						high volume of data.
     * 					
     * 
     */
    @XmlEnumValue("ReturnHeaders")
    RETURN_HEADERS("ReturnHeaders"),

    /**
     * 
     * 						(in) Returns full message information.
     * 						For GetMyMessages, if you include MessageIDs or AlertIDs in
     * 						the request, this detail level returns message information
     * 						for the specified message ID or alert ID values. If you
     * 						include a FolderID, message information is returned only for
     * 						the messages and alerts in the specified folder.
     * 					
     * 
     */
    @XmlEnumValue("ReturnMessages")
    RETURN_MESSAGES("ReturnMessages");
    private final String value;

    DetailLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevelCodeType fromValue(String v) {
        for (DetailLevelCodeType c: DetailLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
