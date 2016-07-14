
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
 * 				Contains one or more stored comments for use as feedback to buyers.
 * 			
 * 
 * <p>Java class for FeedbackCommentArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackCommentArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredCommentText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackCommentArrayType", propOrder = {
    "storedCommentText"
})
public class FeedbackCommentArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StoredCommentText")
    protected List<String> storedCommentText;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getStoredCommentText() {
        if (this.storedCommentText == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.storedCommentText.toArray(new String[this.storedCommentText.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getStoredCommentText(int idx) {
        if (this.storedCommentText == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.storedCommentText.get(idx);
    }

    public int getStoredCommentTextLength() {
        if (this.storedCommentText == null) {
            return  0;
        }
        return this.storedCommentText.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setStoredCommentText(String[] values) {
        this._getStoredCommentText().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.storedCommentText.add(values[i]);
        }
    }

    protected List<String> _getStoredCommentText() {
        if (storedCommentText == null) {
            storedCommentText = new ArrayList<String>();
        }
        return storedCommentText;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setStoredCommentText(int idx, String value) {
        return this.storedCommentText.set(idx, value);
    }

}
