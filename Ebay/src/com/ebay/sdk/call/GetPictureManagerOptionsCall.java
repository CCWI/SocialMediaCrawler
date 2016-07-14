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
 * Wrapper class of the GetPictureManagerOptions call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Output property:</B> <code>ReturnedSubscription</code> - A type of Picture Manager subscription, with a subscription level, fee,
 * and allowed storage size.
 * <br> <B>Output property:</B> <code>ReturnedPictureType</code> - A global definition for displaying pictures, with a maximum size.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetPictureManagerOptionsCall extends com.ebay.sdk.ApiCall
{
  
  private PictureManagerSubscriptionType[] returnedSubscription=null;
  private PictureManagerPictureDisplayType[] returnedPictureType=null;


  /**
   * Constructor.
   */
  public GetPictureManagerOptionsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetPictureManagerOptionsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Requests a list of Picture Manager options and allowed values,
   * such as subscription type and picture display.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getPictureManagerOptions()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetPictureManagerOptionsRequestType req;
    req = new GetPictureManagerOptionsRequestType();

    GetPictureManagerOptionsResponseType resp = (GetPictureManagerOptionsResponseType) execute(req);

    this.returnedSubscription = resp.getSubscription();
    this.returnedPictureType = resp.getPictureType();

  }

  /**
   * Valid after executing the API.
   * Gets the returned GetPictureManagerOptionsResponseType.returnedPictureType.
   * 
   * @return PictureManagerPictureDisplayType[]
   */
  public PictureManagerPictureDisplayType[] getReturnedPictureType()
  {
    return this.returnedPictureType;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetPictureManagerOptionsResponseType.returnedSubscription.
   * 
   * @return PictureManagerSubscriptionType[]
   */
  public PictureManagerSubscriptionType[] getReturnedSubscription()
  {
    return this.returnedSubscription;
  }

}

