/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

/**
 * Defines type of attribute.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
abstract public class AttributeTypes {

  /**
   *
   */
  public static final int ATTR_ID = 0;

  /**
   *
   */
  public static final int ATTR_IDS = 1;

  /**
   *
   */
  public static final int ATTR_TEXT = 11;

  /**
   *
   */
  public static final int ATTR_TEXT_DATE = 12;

  /**
   *
   */
  public static final int ATTR_TEXT_DATE_ONE = 13;

  /**
   *
   */
  public static final int ATTR_DATE = 100;

  /**
   *
   */
  public static final int ATTR_DATE_D = 101;

  /**
   *
   */
  public static final int ATTR_DATE_M = 102;

  /**
   *
   */
  public static final int ATTR_DATE_Y = 103;
}
