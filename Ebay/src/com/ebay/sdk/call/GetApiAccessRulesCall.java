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
 * Wrapper class of the GetApiAccessRules call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Output property:</B> <code>ReturnedApiAccessRules</code> - Contains the description of an API access rule, including the
 * call name, the application's current daily and hourly usage,
 * and other values.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetApiAccessRulesCall extends com.ebay.sdk.ApiCall
{
  
  private ApiAccessRuleType[] returnedApiAccessRules=null;


  /**
   * Constructor.
   */
  public GetApiAccessRulesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetApiAccessRulesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Reports how many calls your application has made and is allowed to make per hour or day.&nbsp;<b>Also for Half.com</b>.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getApiAccessRules()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetApiAccessRulesRequestType req;
    req = new GetApiAccessRulesRequestType();

    GetApiAccessRulesResponseType resp = (GetApiAccessRulesResponseType) execute(req);

    this.returnedApiAccessRules = resp.getApiAccessRule();

  }

  /**
   * Valid after executing the API.
   * Gets the returned GetApiAccessRulesResponseType.returnedApiAccessRules.
   * 
   * @return ApiAccessRuleType[]
   */
  public ApiAccessRuleType[] getReturnedApiAccessRules()
  {
    return this.returnedApiAccessRules;
  }

}

