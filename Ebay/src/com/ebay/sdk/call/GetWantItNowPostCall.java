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
 * Wrapper class of the GetWantItNowPost call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>PostID</code> - Specifies the post ID that uniquely identifies the Want It Now post for
 * which to retrieve the data. PostID is a required input. PostID is unique
 * across all eBay sites.
 * <br> <B>Output property:</B> <code>ReturnedWantItNowPost</code> - Contains the data defining a single Want It Now post.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetWantItNowPostCall extends com.ebay.sdk.ApiCall
{
  
  private String postID = null;
  private WantItNowPostType returnedWantItNowPost=null;


  /**
   * Constructor.
   */
  public GetWantItNowPostCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetWantItNowPostCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves data for a specific, active Want It Now post identified by a post ID.
   * The response includes the following fields: CategoryID, Description, PostID,
   * Site, StartTime, ResponseCount, and Title. Although GetWantItNowSearchResults
   * returns most of this information, only GetWantItNowPost returns Description for
   * a post.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The WantItNowPostType object.
   */
  public WantItNowPostType getWantItNowPost()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetWantItNowPostRequestType req;
    req = new GetWantItNowPostRequestType();
    if (this.postID != null)
      req.setPostID(this.postID);

    GetWantItNowPostResponseType resp = (GetWantItNowPostResponseType) execute(req);

    this.returnedWantItNowPost = resp.getWantItNowPost();
    return this.getReturnedWantItNowPost();
  }

  /**
   * Gets the GetWantItNowPostRequestType.postID.
   * @return String
   */
  public String getPostID()
  {
    return this.postID;
  }

  /**
   * Sets the GetWantItNowPostRequestType.postID.
   * @param postID String
   */
  public void setPostID(String postID)
  {
    this.postID = postID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetWantItNowPostResponseType.returnedWantItNowPost.
   * 
   * @return WantItNowPostType
   */
  public WantItNowPostType getReturnedWantItNowPost()
  {
    return this.returnedWantItNowPost;
  }

}

