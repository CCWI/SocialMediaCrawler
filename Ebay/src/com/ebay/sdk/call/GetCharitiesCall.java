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
import java.lang.Long;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetCharities call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CharityID</code> - A unique identification number assigned by eBay to registered nonprofit
 * charity organizations.
 * <br> <B>Input property:</B> <code>CharityName</code> - A name assigned to a specified nonprofit
 * organization. Accepts full charity nonprofit name
 * or partial name as input. For example, enter a
 * CharityName of "heart" (case-insensitive) to
 * return all charity nonprofits that start with
 * "heart." Use with a MatchType value of "Contains"
 * to return all charity nonprofits that contain the
 * string "heart."
 * <br> <B>Input property:</B> <code>Query</code> - Accepts a case-insensitive string used to
 * find a nonprofit charity organization. Default
 * behavior is to search the CharityName field. Use
 * with an IncludeDescription value of true to
 * include the Mission field in the search.
 * <br> <B>Input property:</B> <code>CharityRegion</code> - Region that the nonprofit charity organization is associated
 * with. A specific nonprofit charity organization may be associated
 * with only one region. Meaning of input values differs depending on
 * the site. See GetCharities in the API Developer's Guide for the meaning
 * of each input/output value. CharityRegion input value must be
 * valid for that SiteID.
 * <br> <B>Input property:</B> <code>CharityDomain</code> - Domain (mission area) that a nonprofit charity organization
 * belongs to. Nonprofit charity organizations may belong to multiple
 * mission areas. Meaning of input values differs depending on the
 * site. 
 * <br> <B>Input property:</B> <code>IncludeDescription</code> - Used with Query to search for charity nonprofit
 * organizations. A value of true will search the Mission field as
 * well as the CharityName field for a string specified in Query.
 * <br> <B>Input property:</B> <code>MatchType</code> - Indicates the type of string matching to use when a value is submitted in
 * CharityName. If no value is specified, default behavior is "StartsWith."
 * Does not apply to Query.
 * <br> <B>Input property:</B> <code>Featured</code> - Used to decide if the search is only for featured charities.
 * A value of true will search for only featured charities.
 * <br> <B>Input property:</B> <code>CampaignID</code> - Reserved for future use.
 * <br> <B>Output property:</B> <code>ReturnedCharities</code> - Contains information about charity nonprofit organizations that
 * meet the criteria specified in the request. One Charity node is
 * returned for each applicable nonprofit charity organization. The
 * CharityID value is returned as an id attribute of this node. If no
 * nonprofit charity organization is applicable, this node is not
 * returned.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetCharitiesCall extends com.ebay.sdk.ApiCall
{
  
  private String charityID = null;
  private String charityName = null;
  private String query = null;
  private Integer charityRegion = null;
  private Integer charityDomain = null;
  private Boolean includeDescription = null;
  private StringMatchCodeType matchType = null;
  private Boolean featured = null;
  private Long campaignID = null;
  private GetCharitiesRequestType overrideRequest=null;
  private CharityInfoType[] returnedCharities=null;


  /**
   * Constructor.
   */
  public GetCharitiesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetCharitiesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Searches for nonprofit charity organizations that meet the
   * criteria specified in the request.
   * It is recommended that you use at least one input filter, because this call
   * no longer returns all charities when made without filters.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void getCharities()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetCharitiesRequestType req;
    if (this.overrideRequest != null)
    {
      req = this.overrideRequest;
    } else {
      req = new GetCharitiesRequestType();
      if (this.charityID != null)
        req.setCharityID(this.charityID);
      if (this.charityName != null)
        req.setCharityName(this.charityName);
      if (this.query != null)
        req.setQuery(this.query);
      if (this.charityRegion != null)
        req.setCharityRegion(this.charityRegion);
      if (this.charityDomain != null)
        req.setCharityDomain(this.charityDomain);
      if (this.includeDescription != null)
        req.setIncludeDescription(this.includeDescription);
      if (this.matchType != null)
        req.setMatchType(this.matchType);
      if (this.featured != null)
        req.setFeatured(this.featured);
      if (this.campaignID != null)
        req.setCampaignID(this.campaignID);
  
    }

    GetCharitiesResponseType resp = (GetCharitiesResponseType) execute(req);

    this.returnedCharities = resp.getCharity();

  }

  /**
   * Gets the GetCharitiesRequestType.overrideRequest.
   * @return GetCharitiesRequestType
   */
  public GetCharitiesRequestType getOverrideRequest()
  {
    return this.overrideRequest;
  }


  /**
   * Sets the GetCharitiesRequestType.overrideRequest.
   * @param overrideRequest GetCharitiesRequestType
   */
  public void setOverrideRequest(GetCharitiesRequestType overrideRequest)
  {
    this.overrideRequest = overrideRequest;
  }

  /**
   * Gets the GetCharitiesRequestType.campaignID.
   * @return Long
   */
  public Long getCampaignID()
  {
    return this.campaignID;
  }

  /**
   * Sets the GetCharitiesRequestType.campaignID.
   * @param campaignID Long
   */
  public void setCampaignID(Long campaignID)
  {
    this.campaignID = campaignID;
  }

  /**
   * Gets the GetCharitiesRequestType.charityDomain.
   * @return Integer
   */
  public Integer getCharityDomain()
  {
    return this.charityDomain;
  }

  /**
   * Sets the GetCharitiesRequestType.charityDomain.
   * @param charityDomain Integer
   */
  public void setCharityDomain(Integer charityDomain)
  {
    this.charityDomain = charityDomain;
  }

  /**
   * Gets the GetCharitiesRequestType.charityID.
   * @return String
   */
  public String getCharityID()
  {
    return this.charityID;
  }

  /**
   * Sets the GetCharitiesRequestType.charityID.
   * @param charityID String
   */
  public void setCharityID(String charityID)
  {
    this.charityID = charityID;
  }

  /**
   * Gets the GetCharitiesRequestType.charityName.
   * @return String
   */
  public String getCharityName()
  {
    return this.charityName;
  }

  /**
   * Sets the GetCharitiesRequestType.charityName.
   * @param charityName String
   */
  public void setCharityName(String charityName)
  {
    this.charityName = charityName;
  }

  /**
   * Gets the GetCharitiesRequestType.charityRegion.
   * @return Integer
   */
  public Integer getCharityRegion()
  {
    return this.charityRegion;
  }

  /**
   * Sets the GetCharitiesRequestType.charityRegion.
   * @param charityRegion Integer
   */
  public void setCharityRegion(Integer charityRegion)
  {
    this.charityRegion = charityRegion;
  }

  /**
   * Gets the GetCharitiesRequestType.featured.
   * @return Boolean
   */
  public Boolean getFeatured()
  {
    return this.featured;
  }

  /**
   * Sets the GetCharitiesRequestType.featured.
   * @param featured Boolean
   */
  public void setFeatured(Boolean featured)
  {
    this.featured = featured;
  }

  /**
   * Gets the GetCharitiesRequestType.includeDescription.
   * @return Boolean
   */
  public Boolean getIncludeDescription()
  {
    return this.includeDescription;
  }

  /**
   * Sets the GetCharitiesRequestType.includeDescription.
   * @param includeDescription Boolean
   */
  public void setIncludeDescription(Boolean includeDescription)
  {
    this.includeDescription = includeDescription;
  }

  /**
   * Gets the GetCharitiesRequestType.matchType.
   * @return StringMatchCodeType
   */
  public StringMatchCodeType getMatchType()
  {
    return this.matchType;
  }

  /**
   * Sets the GetCharitiesRequestType.matchType.
   * @param matchType StringMatchCodeType
   */
  public void setMatchType(StringMatchCodeType matchType)
  {
    this.matchType = matchType;
  }

  /**
   * Gets the GetCharitiesRequestType.query.
   * @return String
   */
  public String getQuery()
  {
    return this.query;
  }

  /**
   * Sets the GetCharitiesRequestType.query.
   * @param query String
   */
  public void setQuery(String query)
  {
    this.query = query;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetCharitiesResponseType.returnedCharities.
   * 
   * @return CharityInfoType[]
   */
  public CharityInfoType[] getReturnedCharities()
  {
    return this.returnedCharities;
  }

}

