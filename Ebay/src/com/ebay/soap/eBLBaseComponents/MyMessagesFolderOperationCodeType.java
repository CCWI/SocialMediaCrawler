
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyMessagesFolderOperationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MyMessagesFolderOperationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Rename"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MyMessagesFolderOperationCodeType")
@XmlEnum
public enum MyMessagesFolderOperationCodeType {


    /**
     * 
     * 						If a folder has been removed, restores the specified folder
     * 						in My Messages. Because you cannot remove the Inbox and Sent folders,
     * 						they can also not be restored. Requires FolderName as input.
     * 						<br><br>
     * 						Use Display to create a new custom folder. If you specify a FolderName
     * 						that has not be removed, a new My Messages folder is created.
     * 					
     * 
     */
    @XmlEnumValue("Display")
    DISPLAY("Display"),

    /**
     * 
     * 						Renames a specified folder. Inbox and Sent folders cannot be
     * 						renamed. To rename a folder, use FolderID to indicate the
     * 						folder to rename, and FolderName to indicate the new name.
     * 					
     * 
     */
    @XmlEnumValue("Rename")
    RENAME("Rename"),

    /**
     * 
     * 						Removes a specified folder. Inbox and Sent folders cannot be
     * 						removed. Removing a folder that is not empty returns an
     * 						error. Requires FolderID as input.
     * 					
     * 
     */
    @XmlEnumValue("Remove")
    REMOVE("Remove"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MyMessagesFolderOperationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MyMessagesFolderOperationCodeType fromValue(String v) {
        for (MyMessagesFolderOperationCodeType c: MyMessagesFolderOperationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
