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
 * Defines special valud IDs.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public abstract class ValueIds {
  private ValueIds() {
  }

  /**
   * Incomplete Single-Text-Date.
   */
  public static final int PARTIAL_TEXT_DATE_ONE = -1;

  /**
   * Complete Single-Text-Date.
   */
  public static final int COMPLETE_TEXT_DATE_ONE = -2;

  /**
   * Localized string.
   */
  public static final int TEXT = -3;

  /**
   * Incomplete Text-Date.
   */
  public static final int PARTIAL_TEXT_DATE = -4;

  /**
   * Complete Text-Date.
   */
  public static final int COMPLETE_TEXT_DATE = -5;

  /**
   * Other.
   */
  public static final int OTHER = -6;

  /**
   * None or initial value.
   */
  public static final int NONE = -10;

  /**
   * Not specified.
   */
  public static final int NOT_SPECIFIED = -100;
}
