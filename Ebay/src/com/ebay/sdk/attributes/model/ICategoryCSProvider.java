/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import java.util.Map;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.GetCategory2CSResponseType;
import com.ebay.soap.eBLBaseComponents.SiteWideCharacteristicsType;

/**
 * Supplies categoryId to CSId convertion service for IAttributesMaster.
 * It provides mapping between categoryID and CSId.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface ICategoryCSProvider {

  /**
   * Returns the Category2CS list.
   * @return CategoryType[]
   */
  CategoryType[] getCategoriesCS() throws ApiException, SdkException, Exception;

  /**
   * Returns the Category2CS list.
   * @param categoryId int The categoryId for which you want to get CSId.
   * @return CategoryType[]
   */
  CategoryType[] getCategoriesCS(String categoryId) throws ApiException, SdkException, Exception;

  /**
   * Get CSIds[0] by categoryId.
   * @see CategoryType[] getCategoriesCS
   * @param categoryId int The categoryId for which you want to get CSId.
   * @return int The CSId.
   */
  int getVCSId(int categoryId) throws ApiException, SdkException, Exception;
  
  /**
   * Get CSIdArray by categoryId.
   * @param categoryId int The categoryId for which you want to get CSId array.
   * @return int[] array of CSIds for given categoryId.
   */
  int[] getVCSIdArray(int categoryId) throws ApiException, SdkException, Exception;
  
  /**
   * Get getVCSIdMap by categoryId.
   * @param categoryId int The categoryId for which you want to get CSId map.
   * @return Map of characteritics sets by categoryId.
   */
  Map getVCSIdMap(int categoryId) throws ApiException, SdkException, Exception;

  GetCategory2CSResponseType downloadCategoryCS(ApiContext asn, String catId) throws ApiException, SdkException, Exception;
  
  GetCategory2CSResponseType downloadCategoryCS(String catId) throws ApiException, SdkException, Exception;

  SiteWideCharacteristicsType[] getSiteWideCharacteristics(String catId) throws ApiException, SdkException, Exception;

  int[] getSiteWideCharSetsAttrIds(String catId) throws ApiException, SdkException, Exception;

}
