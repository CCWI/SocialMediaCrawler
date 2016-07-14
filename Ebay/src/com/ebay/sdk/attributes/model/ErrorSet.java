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
 * Defines list of error for a specific CS.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class ErrorSet {
  private static final String ERROR_SET = "ErrorSet";

  private int CSId;
  private Error[] errors = null;

  /**
   * Constructor.
   */
  public ErrorSet() {
  }

  /**
   *
   * @param csId int
   */
  public ErrorSet(int csId) {
    this.CSId = csId;
  }

  /**
   * Sets the CS ID.
   * @param CSId int
   */
  public void setCSId(int CSId) {
    this.CSId = CSId;
  }

  /**
   * Gets the CS ID.
   * @return int
   */
  public int getCSId() {
    return CSId;
  }

  /**
   * Sets list of errors.
   * @param errors Error[]
   */
  public void setErrors(Error[] errors) {
    this.errors = errors;
  }

  /**
   * Gets list of errors.
   * @return Error[]
   */
  public Error[] getErrors() {
    return errors;
  }

  /**
   * Append an error to the ErrorSet.
   * @param error Error
   */
  public void addError(Error error)
  {
    Error[] oldErrs = this.errors;
    Error[] newErrs = new Error[((oldErrs == null) ? 0 : oldErrs.length) + 1];
    int i = 0;
    if( oldErrs != null )
    {
      for (i = 0; i < oldErrs.length; i++) {
        newErrs[i] = oldErrs[i];
      }
    }
    newErrs[i] = error;

    this.errors = newErrs;
  }

  /**
   *
   * @param doc Document
   * @return Node
   */
  public Node toXml(Document doc)
  {
    Element root = doc.createElement(ERROR_SET);
    String csidStr = new Integer(this.CSId).toString();
    XmlUtil.appendAttributeNode(root, "id", csidStr);

    for(int i = 0; i < this.errors.length; i++ )
    {
      Node node = this.errors[i].toXml(doc);
      root.appendChild(node);
    }

    return root;
  }
}
