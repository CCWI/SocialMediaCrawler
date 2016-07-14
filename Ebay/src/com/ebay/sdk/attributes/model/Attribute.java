/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.soap.eBLBaseComponents.AttributeType;
import com.ebay.soap.eBLBaseComponents.ValType;

/**
 * Wraps eBL AttributeType.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class Attribute extends AttributeType {
  private int type;

  //WEIJUN_TODO
  int SType;

  /**
   * Constructor.
   */
  public Attribute() {
  }

  /**
   * Sets the type of the attribute. See AttributeType.
   * @param type int
   */
  public void setType(int type) {
    this.type = type;
  }

  /**
   * Gets the type of the attribute. See AttributeType.
   * @return int
   */
  public int getType() {
    return type;
  }

  /**
   * Adds to value list of the attribute.
   * @param val Value
   */
  public void addValue(Value val)
  {
    ValType[] vals = this.getValue();
    ValType[] newVals = new ValType[((vals == null) ? 0 : vals.length) + 1];

    int i = 0;
    if( vals != null )
    {
      for (i = 0; i < vals.length; i++) {
        newVals[i] = vals[i];
      }
    }
    newVals[i] = val;

    this.setValue(newVals);
  }
}
