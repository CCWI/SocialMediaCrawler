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
 * Wrapper class of the GetProductFamilyMembers call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ProductSearch</code> - Specifies the ID of a product in the family to be retrieved,
 * along with pagination and sorting instructions.
 * ProductSearch is a required input.
 * <br> <B>Output property:</B> <code>ReturnedDataElementSets</code> - Container for one or more DataElement fields containing supplemental helpful data.
 * A DataElement field is an HTML snippet that specifies hints for the user, help links,
 * help graphics, and other supplemental information that varies per characteristics set.
 * Usage of this information is optional and may require developers to inspect the information
 * to determine how it can be applied in an application.
 * <br> <B>Output property:</B> <code>ReturnedProductSearchResults</code> - Contains the attributes and summary product details for all products that match
 * the product ID (or IDs) passed in the request.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductFamilyMembersCall extends com.ebay.sdk.ApiCall
{
  
  private ProductSearchType[] productSearch = null;
  private DataElementSetType[] returnedDataElementSets=null;
  private ProductSearchResultType[] returnedProductSearchResults=null;


  /**
   * Constructor.
   */
  public GetProductFamilyMembersCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductFamilyMembersCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * This type is deprecated as the call is no longer available.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The ProductSearchResultType[] object.
   */
  public ProductSearchResultType[] getProductFamilyMembers()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductFamilyMembersRequestType req;
    req = new GetProductFamilyMembersRequestType();

    if( this.productSearch == null )
      throw new SdkException("ProductSearch property is not set.");

    req.setDetailLevel(this.getDetailLevel());
    if (this.productSearch != null)
      req.setProductSearch(this.productSearch);

    GetProductFamilyMembersResponseType resp = (GetProductFamilyMembersResponseType) execute(req);

    this.returnedDataElementSets = resp.getDataElementSets();
    this.returnedProductSearchResults = resp.getProductSearchResult();
    return this.getReturnedProductSearchResults();
  }

  /**
   * Gets the GetProductFamilyMembersRequestType.productSearch.
   * @return ProductSearchType[]
   */
  public ProductSearchType[] getProductSearch()
  {
    return this.productSearch;
  }

  /**
   * Sets the GetProductFamilyMembersRequestType.productSearch.
   * @param productSearch ProductSearchType[]
   */
  public void setProductSearch(ProductSearchType[] productSearch)
  {
    this.productSearch = productSearch;
  }
/**
   * Executes the SOAP API. GetProductFamilyMembersCall.ProductSearch will
   * be ignored.
   * @param productSearch ProductSearchType[]
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return ProductSearchResultType[]
   */
  public ProductSearchResultType[] getProductFamilyMembers(ProductSearchType[] productSearch)
    throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductFamilyMembersRequestType req = new GetProductFamilyMembersRequestType();
    req.setProductSearch(productSearch);

    GetProductFamilyMembersResponseType resp = (GetProductFamilyMembersResponseType)this.execute(req);
    this.returnedProductSearchResults = resp.getProductSearchResult();
    this.returnedDataElementSets = resp.getDataElementSets();
    return this.returnedProductSearchResults;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductFamilyMembersResponseType.returnedDataElementSets.
   * 
   * @return DataElementSetType[]
   */
  public DataElementSetType[] getReturnedDataElementSets()
  {
    return this.returnedDataElementSets;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductFamilyMembersResponseType.returnedProductSearchResults.
   * 
   * @return ProductSearchResultType[]
   */
  public ProductSearchResultType[] getReturnedProductSearchResults()
  {
    return this.returnedProductSearchResults;
  }

}

