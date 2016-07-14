
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Indicates the success or failure of the attempt to leave feedback for the buyer,
 * 			change the paid status in My eBay, and/or change the shipped status in My eBay.
 * 			<br><br>
 * 			Applies to half.com.
 * 			<br><br>
 * 			When <b>CompleteSale</b> is applied to a specified order (by specifying <b>OrderID</b>), it
 * 			also applies to the child transactions associated with the order. An <b>OrderID</b> cannot be used with half.com items.
 * 			
 * 
 * <p>Java class for CompleteSaleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteSaleResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteSaleResponseType")
public class CompleteSaleResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}
