/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetProductSellingPages call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>UseCase</code> - Specifies the context in which the call is being executed, which will imply
 * certain validation rules. Use this property to make sure you retrieve the
 * appropriate version of product information and attribute meta-data
 * when you are listing, revising, or relisting an item with Pre-filled Item Information.
 * <br> <B>Input property:</B> <code>Products</code> - A catalog product identifies a prototype description
 * of a well-known type of item, such as a popular book.
 * As this call supports batch requests, you can pass in an array of products
 * to retrieve data for several products at the same time.
 * <br> <B>Output property:</B> <code>ProductSellingPagesData</code> - A string containing a list of all the attributes that are applicable
 * to the products specified in the request, along with related meta-data.
 * The meta-data specifies the pre-filled values of each attribute, the
 * possible values of attributes that are not pre-filled, the logic for presenting
 * the attributes to a user, and rules for validating the user's selections.
 * <br><br>
 * For backward compatibility, this data is in
 * the same XML format that was used in the Legacy XML API so that you can
 * apply the same Item Specifics XSL stylesheet to it. That is, individual
 * elements are not described using the unified schema format.
 * <br><br>
 * The data is based on the GetAttributesCS response (AttributeData), with
 * additional information that is specific to catalog products.
 * Product and attribute information is nested within a set of Product tags.
 * The product-specific data is merged into the attribute data so that the same
 * XSL stylesheet used to render the results of GetAttributeCS can be used to render
 * catalog product data. See GetAttributesXSL.
 * <br><br>
 * See the Attribute Meta-Data Model section of the eBay Features Guide
 * for information about each element in the ProductSellingPagesData string.
 * <br><br>
 * Because the content is returned as a string, the XML markup elements are escaped with
 * character entity references (e.g.,&amp;lt;eBay&amp;gt;&amp;lt;Attributes&amp;gt;...).
 * See the appendices in the eBay Features Guide for general information about
 * string data types.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductSellingPagesCall extends com.ebay.sdk.ApiCall
{
  
  private ProductUseCaseCodeType useCase = null;
  private ProductType[] products = null;
  private String productSellingPagesData=null;


  /**
   * Constructor.
   */
  public GetProductSellingPagesCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductSellingPagesCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * his type is deprecated as the call is no longer available.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The String object.
   */
  public String getProductSellingPages()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductSellingPagesRequestType req;
    req = new GetProductSellingPagesRequestType();

    if( this.products == null )
      throw new SdkException("Products property is not set.");
    if( this.useCase == null )
      throw new SdkException("UseCase property is not set.");

    if (this.useCase != null)
      req.setUseCase(this.useCase);
    if (this.products != null)
      req.setProduct(this.products);

    GetProductSellingPagesResponseType resp = (GetProductSellingPagesResponseType) execute(req);

    this.productSellingPagesData = resp.getProductSellingPagesData();
    return this.getProductSellingPagesData();
  }

  /**
   * Gets the GetProductSellingPagesRequestType.products.
   * @return ProductType[]
   */
  public ProductType[] getProducts()
  {
    return this.products;
  }

  /**
   * Sets the GetProductSellingPagesRequestType.products.
   * @param products ProductType[]
   */
  public void setProducts(ProductType[] products)
  {
    this.products = products;
  }

  /**
   * Gets the GetProductSellingPagesRequestType.useCase.
   * @return ProductUseCaseCodeType
   */
  public ProductUseCaseCodeType getUseCase()
  {
    return this.useCase;
  }

  /**
   * Sets the GetProductSellingPagesRequestType.useCase.
   * @param useCase ProductUseCaseCodeType
   */
  public void setUseCase(ProductUseCaseCodeType useCase)
  {
    this.useCase = useCase;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductSellingPagesResponseType.productSellingPagesData.
   * 
   * @return String
   */
  public String getProductSellingPagesData()
  {
    return this.productSellingPagesData;
  }

}

