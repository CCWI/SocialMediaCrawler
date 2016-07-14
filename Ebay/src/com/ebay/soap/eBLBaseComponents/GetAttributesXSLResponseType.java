
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated as the call is no longer available.
 * 				
 * 			
 * 
 * <p>Java class for GetAttributesXSLResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAttributesXSLResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="XSLFile" type="{urn:ebay:apis:eBLBaseComponents}XSLFileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributesXSLResponseType", propOrder = {
    "xslFile"
})
public class GetAttributesXSLResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "XSLFile")
    protected List<XSLFileType> xslFile;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link XSLFileType }
     *     
     */
    public XSLFileType[] getXSLFile() {
        if (this.xslFile == null) {
            return new XSLFileType[ 0 ] ;
        }
        return ((XSLFileType[]) this.xslFile.toArray(new XSLFileType[this.xslFile.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link XSLFileType }
     *     
     */
    public XSLFileType getXSLFile(int idx) {
        if (this.xslFile == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.xslFile.get(idx);
    }

    public int getXSLFileLength() {
        if (this.xslFile == null) {
            return  0;
        }
        return this.xslFile.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link XSLFileType }
     *     
     */
    public void setXSLFile(XSLFileType[] values) {
        this._getXSLFile().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.xslFile.add(values[i]);
        }
    }

    protected List<XSLFileType> _getXSLFile() {
        if (xslFile == null) {
            xslFile = new ArrayList<XSLFileType>();
        }
        return xslFile;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link XSLFileType }
     *     
     */
    public XSLFileType setXSLFile(int idx, XSLFileType value) {
        return this.xslFile.set(idx, value);
    }

}
