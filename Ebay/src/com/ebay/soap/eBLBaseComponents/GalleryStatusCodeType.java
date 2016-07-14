
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GalleryStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GalleryStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InvalidUrl"/>
 *     &lt;enumeration value="InvalidProtocol"/>
 *     &lt;enumeration value="InvalidFile"/>
 *     &lt;enumeration value="ServerDown"/>
 *     &lt;enumeration value="ImageNonExistent"/>
 *     &lt;enumeration value="ImageReadTimeOut"/>
 *     &lt;enumeration value="InvalidFileFormat"/>
 *     &lt;enumeration value="ImageProcessingError"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GalleryStatusCodeType")
@XmlEnum
public enum GalleryStatusCodeType {


    /**
     * 
     *             Gallery Image successfully generated.
     *           
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     *             Gallery image has not yet been generated.
     *           
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     *             The URL for the image is not valid.
     *           
     * 
     */
    @XmlEnumValue("InvalidUrl")
    INVALID_URL("InvalidUrl"),

    /**
     * 
     *             URL does not start with http:// - That is the only protocol currently supported for pictures.
     *           
     * 
     */
    @XmlEnumValue("InvalidProtocol")
    INVALID_PROTOCOL("InvalidProtocol"),

    /**
     * 
     *             There is a problem with the file containing the image.
     *           
     * 
     */
    @XmlEnumValue("InvalidFile")
    INVALID_FILE("InvalidFile"),

    /**
     * 
     *             The server containing your image was unavailable when we tried to retrieve it.
     *           
     * 
     */
    @XmlEnumValue("ServerDown")
    SERVER_DOWN("ServerDown"),

    /**
     * 
     *             We could not find your Gallery image when we went to retrieve it.
     *           
     * 
     */
    @XmlEnumValue("ImageNonExistent")
    IMAGE_NON_EXISTENT("ImageNonExistent"),

    /**
     * 
     *             The image failed to come across the Internet when we tried to retrieve it.
     *           
     * 
     */
    @XmlEnumValue("ImageReadTimeOut")
    IMAGE_READ_TIME_OUT("ImageReadTimeOut"),

    /**
     * 
     *             The file containing your image is not in standard jpeg, bmp, or tif format.
     *           
     * 
     */
    @XmlEnumValue("InvalidFileFormat")
    INVALID_FILE_FORMAT("InvalidFileFormat"),

    /**
     * 
     *             We were not able to process the image.
     *           
     * 
     */
    @XmlEnumValue("ImageProcessingError")
    IMAGE_PROCESSING_ERROR("ImageProcessingError"),

    /**
     * 
     *             Reserved for internal or future use.
     *           
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GalleryStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GalleryStatusCodeType fromValue(String v) {
        for (GalleryStatusCodeType c: GalleryStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
