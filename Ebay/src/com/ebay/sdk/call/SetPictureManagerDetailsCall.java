/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;


import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the SetPictureManagerDetails call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>PictureManagerDetails</code> - Specifies the setting or folder to create, update, or delete, or the
 * picture to update. You cannot upload or delete pictures using
 * SetPictureManagerDetails; you must use the eBay site.
 * <br> <B>Input property:</B> <code>Action</code> - Specifies the action to take on the setting, folder, or picture.
 * The values Add and Delete apply only to folders.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class SetPictureManagerDetailsCall extends com.ebay.sdk.ApiCall
{
  
  private PictureManagerDetailsType pictureManagerDetails = null;
  private PictureManagerActionCodeType action = null;


  /**
   * Constructor.
   */
  public SetPictureManagerDetailsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public SetPictureManagerDetailsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Creates, updates, or deletes Picture Manager account settings, folders, or pictures.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void setPictureManagerDetails()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    SetPictureManagerDetailsRequestType req;
    req = new SetPictureManagerDetailsRequestType();

    if( this.action == null )
      throw new SdkException("Action property is not set.");
    if( this.pictureManagerDetails == null )
      throw new SdkException("PictureManagerDetails property is not set.");

    if (this.pictureManagerDetails != null)
      req.setPictureManagerDetails(this.pictureManagerDetails);
    if (this.action != null)
      req.setAction(this.action);

    SetPictureManagerDetailsResponseType resp = (SetPictureManagerDetailsResponseType) execute(req);


  }

  /**
   * Gets the SetPictureManagerDetailsRequestType.action.
   * @return PictureManagerActionCodeType
   */
  public PictureManagerActionCodeType getAction()
  {
    return this.action;
  }

  /**
   * Sets the SetPictureManagerDetailsRequestType.action.
   * @param action PictureManagerActionCodeType
   */
  public void setAction(PictureManagerActionCodeType action)
  {
    this.action = action;
  }

  /**
   * Gets the SetPictureManagerDetailsRequestType.pictureManagerDetails.
   * @return PictureManagerDetailsType
   */
  public PictureManagerDetailsType getPictureManagerDetails()
  {
    return this.pictureManagerDetails;
  }

  /**
   * Sets the SetPictureManagerDetailsRequestType.pictureManagerDetails.
   * @param pictureManagerDetails PictureManagerDetailsType
   */
  public void setPictureManagerDetails(PictureManagerDetailsType pictureManagerDetails)
  {
    this.pictureManagerDetails = pictureManagerDetails;
  }

}

