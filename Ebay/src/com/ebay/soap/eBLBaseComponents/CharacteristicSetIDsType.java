
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
 * 				This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 * 				
 * 			
 * 
 * <p>Java class for CharacteristicSetIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicSetIDsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicSetIDsType", propOrder = {
    "id"
})
public class CharacteristicSetIDsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ID")
    protected List<String> id;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getID() {
        if (this.id == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.id.toArray(new String[this.id.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getID(int idx) {
        if (this.id == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.id.get(idx);
    }

    public int getIDLength() {
        if (this.id == null) {
            return  0;
        }
        return this.id.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setID(String[] values) {
        this._getID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.id.add(values[i]);
        }
    }

    protected List<String> _getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return id;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setID(int idx, String value) {
        return this.id.set(idx, value);
    }

}
