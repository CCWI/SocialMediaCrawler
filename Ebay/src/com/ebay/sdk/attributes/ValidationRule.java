/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import org.w3c.dom.Node;

import com.ebay.sdk.util.XmlUtil;

class ValidationRule
{
  public int length;
  public String min;
  public String max;
  public String name = "";
  public int precision;
  public String required = "";
  public String other = "";

  public ValidationRule(Node node)
  {
    this.name = XmlUtil.getChildStringByName(node, NAME, "");

    this.name = XmlUtil.getChildStringByName(node, NAME, "");

    this.length = XmlUtil.getChildIntegerByName(node, LENGTH, 0);
    String s = XmlUtil.getChildStringByName(node, MIN, "");
    this.min = (s != null && s.length() > 0) ? s : "-1";
    s = XmlUtil.getChildStringByName(node, MAX, "");
    this.max = (s != null && s.length() > 0) ? s : "-1";

    this.precision = XmlUtil.getChildIntegerByName(node, PRECISION, 0);

    this.required = XmlUtil.getChildStringByName(node, REQUIRED, "");
    this.other = XmlUtil.getChildStringByName(node, REG_EXP, "");
  }

  public static final String NAME = "Name";
  public static final String MIN = "Min";
  public static final String MAX = "Max";
  public static final String LENGTH = "Length";
  public static final String PRECISION = "Precision";
  public static final String REQUIRED = "Required";
  public static final String REG_EXP = "RegularExpression";
}
