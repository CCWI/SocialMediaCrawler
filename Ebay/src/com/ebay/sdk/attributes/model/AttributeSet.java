/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import com.ebay.soap.eBLBaseComponents.AttributeSetType;
import com.ebay.soap.eBLBaseComponents.AttributeType;

/**
 * Wraper class for AttributeSetType to provide support for catalog.
 * <p>
 * Title: AttributesLib for Java
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2004
 * </p>
 * <p>
 * Company: eBay Inc.
 * </p>
 * 
 * @author Weijun Li
 * @version 1.0
 */
public class AttributeSet extends AttributeSetType {

	private int categoryID;
	private int categoryOrdinal = 0;
	private String productID;
	private String productFinderID;
	private String name;

	/**
	 * Constructor.
	 */
	public AttributeSet() {
	}

	/**
	 * Sets the category ID of the AttributeSet (CS).
	 * 
	 * @param categoryID
	 *            int
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * Gets the category ID of the AttributeSet (CS).
	 * 
	 * @return int
	 */
	public int getCategoryID() {
		return this.categoryID;
	}

	/**
	 * Sets the ordinal number of the category.
	 * 
	 * @param categoryOrdinal
	 *            int
	 */
	public void setCategoryOrdinal(int categoryOrdinal) {
		this.categoryOrdinal = categoryOrdinal;
	}

	/**
	 * Gets the ordinal number of the category.
	 * 
	 * @return int
	 */
	public int getCategoryOrdinal() {
		return categoryOrdinal;
	}

	/**
	 * Sets the product ID that is used by IAttributesMaster to idenfity the
	 * catalog product that is associated with the attributes data.
	 * 
	 * @param productID
	 *            String
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * Gets the product ID that is associated with the CS object.
	 * 
	 * @return String
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * Sets the product finder that is associated with the AttributeSet object.
	 * 
	 * @param productFinderID
	 *            String
	 */
	public void setProductFinderID(String productFinderID) {
		this.productFinderID = productFinderID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return String
	 */
	public String getProductFinderID() {
		return productFinderID;
	}

	/**
	 * Add an Attribute object to the list.
	 * 
	 * @param attr
	 *            Attribute
	 */
	public void add(com.ebay.sdk.attributes.model.Attribute attr) {
		AttributeType[] attrs = this.getAttribute();
		AttributeType[] newAttrs = new AttributeType[((attrs == null) ? 0
				: attrs.length) + 1];
		int i = 0;
		if (attrs != null) {
			for (i = 0; i < attrs.length; i++) {
				newAttrs[i] = attrs[i];
			}
		}
		newAttrs[i] = attr;

		this.setAttribute(newAttrs);
	}

	// TODO
	public String toString() {
		return "******************** productID=" + productID == null ? ""
				: productID + " - " + productFinderID == null ? ""
						: productFinderID + " - " + name == null ? "" : name;
	}

}
