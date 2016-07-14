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
 * Wrapper class of the GetDispute call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>DisputeID</code> - The unique identifier of an eBay dispute. The caller passes in this value to
 * retrieve detailed information on a specific dispute.
 * <br> <B>Output property:</B> <code>ReturnedDispute</code> - The dispute record, containing information about
 * the buyer, seller, dispute state, dispute status,
 * comments added to the dispute, or resolutions.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetDisputeCall extends com.ebay.sdk.ApiCall
{
  
  private String disputeID = null;
  private DisputeType returnedDispute=null;


  /**
   * Constructor.
   */
  public GetDisputeCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetDisputeCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves the details of a specific eBay dispute corresponding to the supplied dispute ID.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The DisputeType object.
   */
  public DisputeType getDispute()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetDisputeRequestType req;
    req = new GetDisputeRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.disputeID != null)
      req.setDisputeID(this.disputeID);

    GetDisputeResponseType resp = (GetDisputeResponseType) execute(req);

    this.returnedDispute = resp.getDispute();
    return this.getReturnedDispute();
  }

  /**
   * Gets the GetDisputeRequestType.disputeID.
   * @return String
   */
  public String getDisputeID()
  {
    return this.disputeID;
  }

  /**
   * Sets the GetDisputeRequestType.disputeID.
   * @param disputeID String
   */
  public void setDisputeID(String disputeID)
  {
    this.disputeID = disputeID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetDisputeResponseType.returnedDispute.
   * 
   * @return DisputeType
   */
  public DisputeType getReturnedDispute()
  {
    return this.returnedDispute;
  }

}

