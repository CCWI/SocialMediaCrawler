/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.soap.eBLBaseComponents.ValType;

/**
 * Wrapes eBL ValType.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class Value extends ValType{
  private int type;

  /**
   * Constructor.
   */
  public Value() {
  }

  /**
   * Constructor.
   * @param type int Type of the value. See class ValueTypes.
   */
  public Value(int type)
  {
    this.type = type;
  }

  /**
   * Sets the type of the value. See class ValueTypes.
   * @param type String
   */
  public void setType(int type) {
    this.type = type;
  }

  /**
   * Gets the type of the value. See class ValueTypes.
   * @return String
   */
  public int getType() {
    return type;
  }
}
