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
 * Wrapper class of the GetItemRecommendations call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>RecommendationsRequests</code> - Specifies the data for a single item and configures the recommendation engines to use
 * when processing the item.
 * To retrieve recommendations for multiple items, pass a separate
 * GetRecommendationsRequestContainer for each item. In this case,
 * pass a user-defined correlation ID for each item to identify the matching response.
 * <br> <B>Output property:</B> <code>ReturnedRecommendations</code> - Specifies recommended changes or opportunities for improving the data of a single item.
 * If multiple items were processed, a separate GetRecommendationsResponseContainer
 * is returned for each item. Each container includes a user-defined correlation ID
 * to help you match items in the request to recommendations in the response.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetItemRecommendationsCall extends com.ebay.sdk.ApiCall
{
  
  private GetRecommendationsRequestContainerType[] recommendationsRequests = null;
  private GetRecommendationsResponseContainerType[] returnedRecommendations=null;


  /**
   * Constructor.
   */
  public GetItemRecommendationsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetItemRecommendationsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * No longer recommended.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getItemRecommendations()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetItemRecommendationsRequestType req;
    req = new GetItemRecommendationsRequestType();

    if( this.recommendationsRequests == null )
      throw new SdkException("RecommendationsRequests property is not set.");

    if (this.recommendationsRequests != null)
      req.setGetRecommendationsRequestContainer(this.recommendationsRequests);

    GetItemRecommendationsResponseType resp = (GetItemRecommendationsResponseType) execute(req);

    this.returnedRecommendations = resp.getGetRecommendationsResponseContainer();

  }

  /**
   * Gets the GetItemRecommendationsRequestType.recommendationsRequests.
   * @return GetRecommendationsRequestContainerType[]
   */
  public GetRecommendationsRequestContainerType[] getRecommendationsRequests()
  {
    return this.recommendationsRequests;
  }

  /**
   * Sets the GetItemRecommendationsRequestType.recommendationsRequests.
   * @param recommendationsRequests GetRecommendationsRequestContainerType[]
   */
  public void setRecommendationsRequests(GetRecommendationsRequestContainerType[] recommendationsRequests)
  {
    this.recommendationsRequests = recommendationsRequests;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetItemRecommendationsResponseType.returnedRecommendations.
   * 
   * @return GetRecommendationsResponseContainerType[]
   */
  public GetRecommendationsResponseContainerType[] getReturnedRecommendations()
  {
    return this.returnedRecommendations;
  }

}

