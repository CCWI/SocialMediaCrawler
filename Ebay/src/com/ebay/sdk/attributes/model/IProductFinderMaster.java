/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.sdk.SdkException;
import com.ebay.soap.eBLBaseComponents.CategoryType;

/**
 * Defines functions for rendering Product Finder HTML page and to parse the
 * postback data of the HTML page. You need to supply XmlProvider, XslProvider
 * and CategoryCSProvider before calling the renderHtml() method.
 * <br><br>
 * <a href="{@docRoot}/images/IProductFinderMaster.jpg">View UML diagram of the class.</a>
 * <br>
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface IProductFinderMaster {

  /**
   * Specifies provider for product finder XML.
   * @param xmlProvider IProductFinderXmlProvider
   */
  void setXmlProvider(IProductFinderXmlProvider xmlProvider);

  /**
   * Gets Xml provider.
   * @return IProductFinderXmlProvider
   */
  IProductFinderXmlProvider getXmlProvider();

  /**
   * Specifies provider for product finder XSL.
   * @param xslProvider IProductFinderXslProvider
   */
  void setXslProvider(IProductFinderXslProvider xslProvider);

  /**
   * Gets XSL provider.
   * @return IProductFinderXslProvider
   */
  IProductFinderXslProvider getXslProvider();

  /**
   * Specifies provider for category information.
   * @param CategoryCSProvider ICategoryCSProvider
   */
  void setCategoryCSProvider(ICategoryCSProvider CategoryCSProvider);

  /**
   * Gets provider for category information.
   * @return ICategoryCSProvider
   */
  ICategoryCSProvider getCategoryCSProvider();

  /**
   * Generates product finder HTML. Typically this HTML will be displayed to
   * the end user to collet criterias for searching products in eBay catalog.
   * @param categories CategoryType[]
   * @param formSubmitUrl String e.g., "productFinder.jsp"
   * @param submitButtonHtml String e.g., <input type="submit" name="SearchCat" id="SearchCat" value="Search">
   * @throws SdkException
   * @throws Exception
   * @return String
   */
  String renderHtml(CategoryType[] categories, String formSubmitUrl, String submitButtonHtml)
      throws SdkException, Exception;

  /**
   * Parse postdata of the rendered HTML page (through renderHtml method) to extract
   * AttributeSet objects.
   * @param nameValues Map
   * @return AttributeSet[]
   */
  SearchAttributeSet[] nameValuesToAttributeSets(java.util.Map nameValues)
    throws SdkException, Exception;
}
