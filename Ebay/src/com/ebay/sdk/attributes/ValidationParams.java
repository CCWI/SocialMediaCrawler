/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import com.ebay.sdk.attributes.model.Attribute;
import com.ebay.sdk.attributes.model.Value;
import com.ebay.sdk.attributes.model.ValueIds;

abstract class ValidationParams
{
  public static Object[] getValidationParams(Attribute attr, ValidationRule rule)
  {
    String valStr = attr.getValue(0).getValueLiteral();
    if (valStr == null)
      valStr = "";

    // Decrement count of value list if value list contains -10.
    int passCount = attr.getValue().length;
    for(int i = 0; i < attr.getValue().length; i++ )
    {
      Value val = (Value)attr.getValue(i);
      if( val.getValueID().intValue() == (int)ValueIds.NONE )
      {
        passCount --;
        break;
      }
    }

    return new Object [] {new Integer(attr.getType()), new Integer(passCount), valStr, rule};
  }
}
