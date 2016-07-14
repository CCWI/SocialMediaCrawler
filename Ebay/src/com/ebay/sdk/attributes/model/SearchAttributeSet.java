/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.soap.eBLBaseComponents.SearchAttributesType;

/**
 * Defines collection of SearchAttributesType objects.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class SearchAttributeSet {

  private SearchAttributesType[] searchAttributes;
  private int productFinderID;
  private int attributeSetID;
  private int categoryID;

  /**
   *
   */
  public SearchAttributeSet() {
  }

  public String toString() {
	  String searchAttrs = (searchAttributes != null)?searchAttributes.toString():"null";
	  return " *** SearchAttributeSet: " + "PFID:" + productFinderID +
	               " * ATTRSETID:" + attributeSetID +
	               " * CATID:" + categoryID +
	               " * SearchAttrs: " + searchAttrs;
	            	   
  }
  /**
   * The SearchAttributesType list.
   * @param searchAttributes SearchAttributesType[]
   */
  public void setSearchAttributes(SearchAttributesType[] searchAttributes) {
    this.searchAttributes = searchAttributes;
  }

  /**
   * Sets ID of the product finder that is associated with the SearchAttributeSet object.
   * @param productFinderID int
   */
  public void setProductFinderID(int productFinderID) {
    this.productFinderID = productFinderID;
  }

  /**
   * Sets ID of the AttributeSet that is associated with the SearchAttributeSet object.
   * @param attributeSetID int
   */
  public void setAttributeSetID(int attributeSetID) {
    this.attributeSetID = attributeSetID;
  }

  /**
   *
   * @param categoryID int
   */
  public void setCategoryID(int categoryID) {
    this.categoryID = categoryID;
  }

  /**
   *
   * @return SearchAttributesType[]
   */
  public SearchAttributesType[] getSearchAttributes() {
    return searchAttributes;
  }

  /**
   *
   * @return int
   */
  public int getProductFinderID() {
    return productFinderID;
  }

  /**
   *
   * @return int
   */
  public int getAttributeSetID() {
    return attributeSetID;
  }

  /**
   *
   * @return int
   */
  public int getCategoryID() {
    return categoryID;
  }

  /**
   * Add an element to the list.
   * @param attr SearchAttributesType
   */
  public void add(SearchAttributesType attr)
  {
    SearchAttributesType[] attrs = this.getSearchAttributes();
    SearchAttributesType[] newAttrs = new SearchAttributesType[((attrs == null) ? 0 : attrs.length) + 1];
    int i = 0;
    if( attrs != null )
    {
      for (i = 0; i < attrs.length; i++) {
        newAttrs[i] = attrs[i];
      }
    }
    newAttrs[i] = attr;

    this.setSearchAttributes(newAttrs);
  }
}
