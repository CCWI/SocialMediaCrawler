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
 * Wrapper class of the GetProductSearchResults call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ProductSearch</code> - Specifies the keywords or attributes that make up the product query, with
 * pagination instructions. ProductSearch is a required input. To search for
 * multiple different products at the same time (i.e., to perform a batch
 * search), pass in multiple ProductSearch properties.
 * <br> <B>Output property:</B> <code>ReturnedDataElementSets</code> - Container for one or more DataElement fields containing supplemental
 * helpful data. A DataElement field is an HTML snippet that specifies hints
 * for the user, help links, help graphics, and other supplemental
 * information that varies per characteristic set. Usage of this information
 * is optional and may require you to inspect the information to determine
 * how it can be applied in an application. Also returned with warnings when
 * no matches are found.
 * <br> <B>Output property:</B> <code>ReturnedProductSearchResult</code> - Contains the attributes and product details that match the attributes or
 * query keywords passed in the request. Always returned when product search
 * results are found.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductSearchResultsCall extends com.ebay.sdk.ApiCall
{
  
  private ProductSearchType[] productSearch = null;
  private DataElementSetType[] returnedDataElementSets=null;
  private ProductSearchResultType[] returnedProductSearchResult=null;


  /**
   * Constructor.
   */
  public GetProductSearchResultsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductSearchResultsCall(ApiContext apiContext) {
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
  public ProductSearchResultType[] getProductSearchResults()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductSearchResultsRequestType req;
    req = new GetProductSearchResultsRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.productSearch != null)
      req.setProductSearch(this.productSearch);

    GetProductSearchResultsResponseType resp = (GetProductSearchResultsResponseType) execute(req);

    this.returnedDataElementSets = resp.getDataElementSets();
    this.returnedProductSearchResult = resp.getProductSearchResult();
    return this.getReturnedProductSearchResult();
  }

  /**
   * Gets the GetProductSearchResultsRequestType.productSearch.
   * @return ProductSearchType[]
   */
  public ProductSearchType[] getProductSearch()
  {
    return this.productSearch;
  }

  /**
   * Sets the GetProductSearchResultsRequestType.productSearch.
   * @param productSearch ProductSearchType[]
   */
  public void setProductSearch(ProductSearchType[] productSearch)
  {
    this.productSearch = productSearch;
  }
/**
   * (For backward compatibility) Executes the GetProductSearchResults API, passing ProductSearchType[].
   * @param productSearch ProductSearchType[]
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return ProductSearchResultType[]
   */
  public ProductSearchResultType[] getProductSearchResults(ProductSearchType[] productSearch)
    throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductSearchResultsRequestType req = new GetProductSearchResultsRequestType();
    req.setProductSearch(productSearch);

    GetProductSearchResultsResponseType resp = (GetProductSearchResultsResponseType)this.execute(req);
    return resp.getProductSearchResult();
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductSearchResultsResponseType.returnedDataElementSets.
   * 
   * @return DataElementSetType[]
   */
  public DataElementSetType[] getReturnedDataElementSets()
  {
    return this.returnedDataElementSets;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductSearchResultsResponseType.returnedProductSearchResult.
   * 
   * @return ProductSearchResultType[]
   */
  public ProductSearchResultType[] getReturnedProductSearchResult()
  {
    return this.returnedProductSearchResult;
  }

}

