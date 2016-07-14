/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetDescriptionTemplates call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CategoryID</code> - The category for which to retrieve templates. Enter any
 * category ID, including Motors vehicle categories. This
 * is ignored if you also send MotorVehicles.
 * <br> <B>Input property:</B> <code>LastModifiedTime</code> - If specified, only those templates modified on or after the
 * specified date are returned. If not specified, all templates are returned.
 * <br> <B>Input property:</B> <code>MotorVehicles</code> - Indicates whether to retrieve templates for motor vehicle
 * categories for eBay Motors (site 100). If true, templates
 * are returned for motor vehicle categories. If false,
 * templates are returned for non-motor vehicle categories
 * such as Parts and Accessories. If included as an input field (whether true or false), this overrides any value provided for CategoryID.
 * <br> <B>Output property:</B> <code>ReturnedDescriptionTemplate</code> - The information for one Theme or one Layout. There
 * can be multiple DescriptionTemplates.
 * <br> <B>Output property:</B> <code>ReturnedLayoutTotal</code> - The number of Layout templates returned (that is, the
 * number of DescriptionTemplates for which Type is "Layout").
 * <br> <B>Output property:</B> <code>ReturnedObsoleteLayoutID</code> - The ID of a returned layout that is obsolete. There can be zero or more IDs.
 * <br> <B>Output property:</B> <code>ReturnedObsoleteThemeID</code> - The ID of a returned theme that is obsolete. There can be zero or more IDs.
 * <br> <B>Output property:</B> <code>ReturnedThemeGroup</code> - Data for one theme group. There can be multiple
 * ThemeGroups in the response.
 * <br> <B>Output property:</B> <code>ReturnedThemeTotal</code> - The number of Theme templates returned (that is, the number
 * of DescriptionTemplates for which Type is "Theme").
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetDescriptionTemplatesCall extends com.ebay.sdk.ApiCall
{
  
  private String categoryID = null;
  private Calendar lastModifiedTime = null;
  private Boolean motorVehicles = null;
  private DescriptionTemplateType[] returnedDescriptionTemplate=null;
  private int returnedLayoutTotal=0;
  private int[] returnedObsoleteLayoutID=null;
  private int[] returnedObsoleteThemeID=null;
  private ThemeGroupType[] returnedThemeGroup=null;
  private int returnedThemeTotal=0;


  /**
   * Constructor.
   */
  public GetDescriptionTemplatesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetDescriptionTemplatesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves Theme and Layout specifications for the display of an item's description.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getDescriptionTemplates()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetDescriptionTemplatesRequestType req;
    req = new GetDescriptionTemplatesRequestType();
    if (this.categoryID != null)
      req.setCategoryID(this.categoryID);
    if (this.lastModifiedTime != null)
      req.setLastModifiedTime(this.lastModifiedTime);
    if (this.motorVehicles != null)
      req.setMotorVehicles(this.motorVehicles);

    GetDescriptionTemplatesResponseType resp = (GetDescriptionTemplatesResponseType) execute(req);

    this.returnedDescriptionTemplate = resp.getDescriptionTemplate();
    this.returnedLayoutTotal = (resp.getLayoutTotal() == null? 0: resp.getLayoutTotal().intValue());
    this.returnedObsoleteLayoutID = resp.getObsoleteLayoutID();
    this.returnedObsoleteThemeID = resp.getObsoleteThemeID();
    this.returnedThemeGroup = resp.getThemeGroup();
    this.returnedThemeTotal = (resp.getThemeTotal() == null? 0: resp.getThemeTotal().intValue());

  }

  /**
   * Gets the GetDescriptionTemplatesRequestType.categoryID.
   * @return String
   */
  public String getCategoryID()
  {
    return this.categoryID;
  }

  /**
   * Sets the GetDescriptionTemplatesRequestType.categoryID.
   * @param categoryID String
   */
  public void setCategoryID(String categoryID)
  {
    this.categoryID = categoryID;
  }

  /**
   * Gets the GetDescriptionTemplatesRequestType.lastModifiedTime.
   * @return Calendar
   */
  public Calendar getLastModifiedTime()
  {
    return this.lastModifiedTime;
  }

  /**
   * Sets the GetDescriptionTemplatesRequestType.lastModifiedTime.
   * @param lastModifiedTime Calendar
   */
  public void setLastModifiedTime(Calendar lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
  }

  /**
   * Gets the GetDescriptionTemplatesRequestType.motorVehicles.
   * @return Boolean
   */
  public Boolean getMotorVehicles()
  {
    return this.motorVehicles;
  }

  /**
   * Sets the GetDescriptionTemplatesRequestType.motorVehicles.
   * @param motorVehicles Boolean
   */
  public void setMotorVehicles(Boolean motorVehicles)
  {
    this.motorVehicles = motorVehicles;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedDescriptionTemplate.
   * 
   * @return DescriptionTemplateType[]
   */
  public DescriptionTemplateType[] getReturnedDescriptionTemplate()
  {
    return this.returnedDescriptionTemplate;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedLayoutTotal.
   * 
   * @return int
   */
  public int getReturnedLayoutTotal()
  {
    return this.returnedLayoutTotal;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedObsoleteLayoutID.
   * 
   * @return int[]
   */
  public int[] getReturnedObsoleteLayoutID()
  {
    return this.returnedObsoleteLayoutID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedObsoleteThemeID.
   * 
   * @return int[]
   */
  public int[] getReturnedObsoleteThemeID()
  {
    return this.returnedObsoleteThemeID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedThemeGroup.
   * 
   * @return ThemeGroupType[]
   */
  public ThemeGroupType[] getReturnedThemeGroup()
  {
    return this.returnedThemeGroup;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDescriptionTemplatesResponseType.returnedThemeTotal.
   * 
   * @return int
   */
  public int getReturnedThemeTotal()
  {
    return this.returnedThemeTotal;
  }

}

