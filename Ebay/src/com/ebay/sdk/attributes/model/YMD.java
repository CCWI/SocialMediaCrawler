/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

public class YMD
{
  public YMD(String year, String month, String day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public YMD()
  {
  }

  public String year;
  public String month;
  public String day;

  static String constructString(char c, int repeat)
  {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < repeat; i++) {
      sb.append(c);
    }
    return sb.toString();
  }

  public static String padString(String str, char c, int desiredLen)
  {
      if( str == null )
        str = constructString(c, desiredLen);
      else
      {
        int len = str.length();
        if( len > desiredLen )
          str = str.substring(0, desiredLen);
        else if( len < desiredLen )
          str = constructString(c, desiredLen - len) + str;
      }

      return str;
  }

  public static void FixYMD(YMD ymd)
  {
    ymd.year = padString(ymd.year, '0', 4);
    ymd.month = padString(ymd.month, '0', 2);
    ymd.day = padString(ymd.day, '0', 2);
  }
}
