/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Integer;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetPictureManagerDetails call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>FolderID</code> - The ID of a folder in the user's Picture Manager album for which you want information.
 * If you specify both FolderID and PictureURL, the picture must exist
 * in the folder.
 * <br> <B>Input property:</B> <code>PictureURL</code> - The URL of a picture in the user's Picture Manager album.
 * If you specify both FolderID and PictureURL, the picture must
 * exist in the folder.
 * <br> <B>Input property:</B> <code>PictureManagerDetailLevel</code> - The type of information you want returned, about pictures and folders,
 * the account subscription, or both. Use this element rather than the generic DetailLevel element defined in AbstractRequestType. You can use the following values: ReturnAll, ReturnSubscription, or ReturnPicture.
 * <br> <B>Output property:</B> <code>ReturnedPictureManagerDetails</code> - Contains details of the account settings, folders or
 * pictures in the user's album, or both.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetPictureManagerDetailsCall extends com.ebay.sdk.ApiCall
{
  
  private Integer folderID = null;
  private String pictureURL = null;
  private PictureManagerDetailLevelCodeType pictureManagerDetailLevel = null;
  private PictureManagerDetailsType returnedPictureManagerDetails=null;


  /**
   * Constructor.
   */
  public GetPictureManagerDetailsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetPictureManagerDetailsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Requests information about folders or pictures in a Picture Manager account
   * or the account settings.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getPictureManagerDetails()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetPictureManagerDetailsRequestType req;
    req = new GetPictureManagerDetailsRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.folderID != null)
      req.setFolderID(this.folderID);
    if (this.pictureURL != null)
      req.setPictureURL(this.pictureURL);
    if (this.pictureManagerDetailLevel != null)
      req.setPictureManagerDetailLevel(this.pictureManagerDetailLevel);

    GetPictureManagerDetailsResponseType resp = (GetPictureManagerDetailsResponseType) execute(req);

    this.returnedPictureManagerDetails = resp.getPictureManagerDetails();

  }

  /**
   * Gets the GetPictureManagerDetailsRequestType.folderID.
   * @return Integer
   */
  public Integer getFolderID()
  {
    return this.folderID;
  }

  /**
   * Sets the GetPictureManagerDetailsRequestType.folderID.
   * @param folderID Integer
   */
  public void setFolderID(Integer folderID)
  {
    this.folderID = folderID;
  }

  /**
   * Gets the GetPictureManagerDetailsRequestType.pictureManagerDetailLevel.
   * @return PictureManagerDetailLevelCodeType
   */
  public PictureManagerDetailLevelCodeType getPictureManagerDetailLevel()
  {
    return this.pictureManagerDetailLevel;
  }

  /**
   * Sets the GetPictureManagerDetailsRequestType.pictureManagerDetailLevel.
   * @param pictureManagerDetailLevel PictureManagerDetailLevelCodeType
   */
  public void setPictureManagerDetailLevel(PictureManagerDetailLevelCodeType pictureManagerDetailLevel)
  {
    this.pictureManagerDetailLevel = pictureManagerDetailLevel;
  }

  /**
   * Gets the GetPictureManagerDetailsRequestType.pictureURL.
   * @return String
   */
  public String getPictureURL()
  {
    return this.pictureURL;
  }

  /**
   * Sets the GetPictureManagerDetailsRequestType.pictureURL.
   * @param pictureURL String
   */
  public void setPictureURL(String pictureURL)
  {
    this.pictureURL = pictureURL;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetPictureManagerDetailsResponseType.returnedPictureManagerDetails.
   * 
   * @return PictureManagerDetailsType
   */
  public PictureManagerDetailsType getReturnedPictureManagerDetails()
  {
    return this.returnedPictureManagerDetails;
  }

}

