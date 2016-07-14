/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

/**
 * The suported date formats by this class are:
 *   YYYY
 *   YYYY-MM
 *   YYYYMMDD
 *   YYYY-MM-DD
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
class SimpleDate {
  private int day;
  private int month;
  private int year;
  private int type;

  public SimpleDate(String date)
  {
    init(date);
  }

  public int compare(SimpleDate dt)
  {
    int diff = this.year - dt.year;
    if (diff != 0)
      return diff;

    diff = this.month - dt.month;

    if (diff != 0)
      return diff;

    return this.day - dt.day;
  }

  protected void init(String date)
  {
    this.type = getDateFormat(date);

    if (this.type == DT_UNKNOWN)
      return;

    switch (this.type)
    {
      case DT_YEAR_MONTH:  //YYYY-MM
        int index = date.indexOf(DASH);
        this.year = Integer.parseInt(date.substring(0, index));
        this.month = Integer.parseInt(date.substring(index + 1));
        break;
      case DT_YEARMONTHDAY: //YYYYMMDD
        String s = date.substring(0, LEN_YEAR);
        this.year = Integer.parseInt(s);
        s = date.substring(LEN_YEAR, LEN_YEAR + LEN_MONTH);
        this.month = Integer.parseInt(s);
        s = date.substring(LEN_YEAR + LEN_MONTH, LEN_YEAR + LEN_MONTH + LEN_DAY); //IDX_DASH2
        this.day = Integer.parseInt(s);
        break;
      case DT_YEAR_MONTH_DAY: //YYYY-MM-DD
        s = date.substring(0, LEN_YEAR);
        this.year = Integer.parseInt(s);
        s = date.substring(LEN_YEAR + 1, LEN_YEAR + 1 + LEN_MONTH);
        this.month = Integer.parseInt(s);
        s = date.substring(IDX_DASH2 + 1);
        this.day = Integer.parseInt(s);
        break;
      default: //YYYY
        this.year = Integer.parseInt(date);
        break;
    }

  }

  public int getDateFormat(String date)
  {
    int len = date.length();

    if (len == DT_YEAR)
      return DT_YEAR;
    else if (len == DT_YEAR_MONTH && date.indexOf(DASH) == IDX_DASH1)
      return DT_YEAR_MONTH;
    else if (len ==  DT_YEARMONTHDAY && date.indexOf(DASH) == -1)
      return DT_YEARMONTHDAY;
    else if (len == DT_YEAR_MONTH_DAY && date.indexOf(DASH) == IDX_DASH1 && date.lastIndexOf(DASH) == IDX_DASH2)
      return DT_YEAR_MONTH_DAY;
    else
      return DT_UNKNOWN;
  }

  public int getDay()
  {
    return this.day;
  }

  public int getMonth()
  {
    return this.month;
  }

  public int getYear()
  {
    return this.year;
  }

  public boolean isValidDate()
  {
    return isValidDay() && isValidMonth() && isValidYear();
  }

  public boolean isValidDay()
  {
    if(this.type == DT_YEAR || this.type == DT_YEAR_MONTH)
      return true;

    if (0 >= this.day || this.day > 31 )
      return false;

    if (this.day == 31)
      if (this.month == FEB ||
        this.month == APR ||
        this.month == JUN ||
        this.month == SEP ||
        this.month == NOV)
        return false;

    if (this.day == 28)
    {
      if (this.month != FEB || this.year % 4 != 0)
              return false;
    }

    return true;
  }

  public boolean isValidMonth()
  {
    if (this.type == DT_YEAR)
      return true;
    else
      return JAN <= this.month && this.month <= DEC;
  }

  public boolean isValidYear()
  {
    return 0 < this.year && this.year < 9999;
  }

  static final int DT_UNKNOWN = -1;
  static final int DT_YEAR = 4;
  static final int DT_YEAR_MONTH = 7;
  static final int DT_YEARMONTHDAY = 8;
  static final int DT_YEAR_MONTH_DAY = 10;

  static final int LEN_YEAR = 4;
  static final int LEN_MONTH = 2;
  static final int LEN_DAY = 2;

  static final int IDX_DASH1 = 4;
  static final int IDX_DASH2 = 7;

  public static final int JAN = 1;
  public static final int FEB = 2;
  public static final int APR = 4;
  public static final int JUN = 6;
  public static final int SEP = 9;
  public static final int NOV = 11;
  public static final int DEC = 12;

  public static final int ONE = 1;
  public static final int THIRTY_ONE = 31;

  public static final String DASH = "-";

}
