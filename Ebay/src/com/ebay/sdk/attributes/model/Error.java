/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.ebay.sdk.util.XmlUtil;

/**
 * Defines attributes error.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class Error {
  private static final String ERROR = "Error";
  private static final String ERROR_CODE = "errorcode";

  private int attributeID;
  private String ruleName;
  private String message;

  /**
   * Constructor.
   */
  public Error() {
  }

  /**
   * Sets the attribute ID that the error is associated with.
   * @param attributeID int
   */
  public void setAttributeID(int attributeID) {
    this.attributeID = attributeID;
  }

  /**
   * Gets the attribute ID that the error is associated with.
   * @return int
   */
  public int getAttributeID() {
    return attributeID;
  }

  /**
   * Sets the rule name that the error is associated with.
   * @param ruleName String
   */
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  /**
   * Gets the rule name that the error is associated with.
   * @return String
   */
  public String getRuleName() {
    return ruleName;
  }

  /**
   * Sets the error message.
   * @param message String
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Gets the error message.
   * @return String
   */
  public String getMessage() {
    return message;
  }

  /**
   *
   * @param doc Document
   * @return Node
   */
  public Node toXml(Document doc)
  {
    Element node = doc.createElement(ERROR);

    XmlUtil.appendAttributeNode(node, ERROR_CODE, this.ruleName);

    String idStr = new Integer(this.attributeID).toString();
    XmlUtil.appendAttributeNode(node, "id", idStr);

    Node text = doc.createCDATASection(this.message);
    node.appendChild(text);
    return node;
  }
}

