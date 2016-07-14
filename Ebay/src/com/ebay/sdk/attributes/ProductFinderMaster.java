/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.Document;

import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.ICategoryCSProvider;
import com.ebay.sdk.attributes.model.IProductFinderMaster;
import com.ebay.sdk.attributes.model.IProductFinderXmlProvider;
import com.ebay.sdk.attributes.model.IProductFinderXslProvider;
import com.ebay.sdk.attributes.model.SearchAttributeSet;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CharacteristicsSetType;
import com.ebay.soap.eBLBaseComponents.ExtendedProductFinderIDType;

/**
 * Implements IProductFinderMaster to provide functions to render
 * product finder HTML page and to parse results.
 * <br><br>
 * <a href="{@docRoot}/images/IProductFInderMaster.jpg">View UML diagram of the class.</a>
 * <br>
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class ProductFinderMaster implements IProductFinderMaster {
  private static final String PF_ID_TAG = "pf_sdk";
  private IProductFinderXmlProvider xmlProvider;
  private IProductFinderXslProvider xslProvider;
  private ICategoryCSProvider CategoryCSProvider = null;

  /**
   *
   */
  public ProductFinderMaster() {
  }

  /**
   * Specifies provider for product finder XML.
   * @param xmlProvider IProductFinderXmlProvider
   */
  public void setXmlProvider(IProductFinderXmlProvider xmlProvider) {
    this.xmlProvider = xmlProvider;
  }

  /**
   * Gets Xml provider.
   * @return IProductFinderXmlProvider
   */
  public IProductFinderXmlProvider getXmlProvider() {
    return xmlProvider;
  }

  /**
   * Specifies provider for product finder XSL.
   * @param xslProvider IProductFinderXslProvider
   */
  public void setXslProvider(IProductFinderXslProvider xslProvider) {
    this.xslProvider = xslProvider;
  }

  /**
   * Gets XSL provider.
   * @return IProductFinderXslProvider
   */
  public IProductFinderXslProvider getXslProvider() {
    return xslProvider;
  }

  /**
   * Specifies provider for category information.
   * @param CategoryCSProvider ICategoryCSProvider
   */
  public void setCategoryCSProvider(ICategoryCSProvider CategoryCSProvider) {
    this.CategoryCSProvider = CategoryCSProvider;
  }

  /**
   * Gets provider for category information.
   * @return ICategoryCSProvider
   */
  public ICategoryCSProvider getCategoryCSProvider() {
    return CategoryCSProvider;
  }

  /**
   * Generates product finder HTML. Typically this HTML will be displayed to
   * the end user to collect criterias for searching products in eBay catalog.
   * @param categories CategoryType[]
   * @param formSubmitUrl String e.g., "productFinder.jsp"
   * @param submitButtonHtml String e.g., <input type="submit" name="SearchCat" id="SearchCat" value="Search">
   * @throws SdkException
   * @throws Exception
   * @return String
   */
  public String renderHtml(CategoryType[] categories, String formSubmitUrl, String submitButtonHtml) throws SdkException, Exception {
    StringBuffer sb = new StringBuffer();
    StringBuffer hidderTags = new StringBuffer();

    int i;

    Set<Integer> pfIdSet = new HashSet<Integer>();
    
    // Add identification tags.
    Integer  csID;
    String catID;
    for(i = 0; i < categories.length; i++ ) {
      CategoryType cat = categories[i];
      catID = cat.getCategoryID();
      if( catID == null ) {
    	  throw new SdkException("Category ID is not set for the category.");
      }

      CharacteristicsSetType[] sets = cat.getCharacteristicsSets();
      if( sets == null || sets.length == 0 ) {
        throw new SdkException("CharacteristicsSet is not set for the category.");
      }
        csID = sets[0].getAttributeSetID();

	  ExtendedProductFinderIDType[] prodFinders = cat.getProductFinderIDs();
	  if(prodFinders != null && prodFinders.length > 0) {
		  for(int k = 0; k < prodFinders.length; k++) {
			  pfIdSet.add(prodFinders[k].getProductFinderID());
		  }
	  }	 
      
      AttributesMaster.addHiddenInputTag(
    		  								hidderTags,
    		  								PF_ID_TAG + String.valueOf(i),
    		  								catID + '_' + csID.toString()
        								);
    }

    int[] pfIdList = new int[pfIdSet.size()];
    Iterator iter = pfIdSet.iterator();
    int j = 0;
    while(iter.hasNext()) {
    	pfIdList[j] = ((Integer)iter.next()).intValue();
    }
    // Source Xml
    Document xmlDoc = null;
    try {
    	xmlDoc = xmlProvider.getProductFinderXml(pfIdList);
    } catch(SdkException sdke) {
    	return sdke.getMessage();
    }

    // Generate html text.
    Document xslDoc = xslProvider.getXSL();
    String table = XmlUtil.xslTransform(xmlDoc, xslDoc);
    sb.append(table);

    String html = sb.toString();

    if( formSubmitUrl != null )
    {
      // Fix the "action" field.
      String oldAction = "action=\"PFPage\"";
      String newAction = java.text.MessageFormat.format("action=\"{0}\"", new Object[] {formSubmitUrl});
      html = html.replaceAll(oldAction, newAction);
    }

    //
    hidderTags.append("\n");
    String ns = hidderTags.toString();
    final String oldSubmit = "<input type=\"submit\" value=\"Submit\">";
    if( submitButtonHtml == null ) {
      ns += oldSubmit;
    } else {
      ns += submitButtonHtml;
    }
    html = html.replaceAll(oldSubmit, ns);

    return html;
  }

  private CategoryType extractOneCat(String catCsName, Map request) throws SdkException, Exception {
    CategoryType cat = null;

    Object obj = request.get(catCsName);
    if (obj != null)
    {
      String cat_pf = ((String[])obj)[0];

      String[] delim = cat_pf.split("_");
      if( delim == null || delim.length != 2 ) {
        throw new SdkException("Invalid PF_ID_TAG tag found in the query string array.");
      }
      String pfID = delim[0];
      String catID = delim[0];
      int csID = Integer.parseInt(delim[1]);

      if( pfID.length() > 0 ) {
        cat = new CategoryType();
        cat.setCategoryID(catID);

        CharacteristicsSetType cs = new CharacteristicsSetType();
        cs.setAttributeSetID(new Integer(csID));
        cat.setCharacteristicsSets(new CharacteristicsSetType[] {cs});
      }
    }

    return cat;
  }

  static CategoryType findCategoryByProductFinderID(CategoryType[] cats, int pfid) {
	  for(int i = 0; i < cats.length; i++ ) {
		  CategoryType cat = cats[i];
		  ExtendedProductFinderIDType[] prodFinders = cat.getProductFinderIDs();
		  boolean hasPF = prodFinders != null && prodFinders.length > 0;
   		  if(!hasPF) {
   			  continue;
   		  }
   		 for(int j = 0; i < prodFinders.length; j++) {
   			 if(prodFinders[j].getProductFinderID().intValue() == pfid) {
   				return cat;
   			 }
   		 }
    }
    return null;
  }

  /**
   * Parse postdata of the rendered HTML page (through renderHtml method) to extract
   * AttributeSet objects.
   * @param nameValues Map
   * @return AttributeSet[]
   */
  public SearchAttributeSet[] nameValuesToAttributeSets(Map nameValues) throws SdkException, Exception
  {
    //if( this.CategoryCSProvider == null )
    // throw new SdkException("CategoryCSProvider is not set.");

    ArrayList<CategoryType> catsList = new ArrayList<CategoryType>();

    for (int ordinal = 0; ; ordinal++) {
      String ordStr = String.valueOf(ordinal);
      CategoryType cat = extractOneCat(PF_ID_TAG + ordStr, nameValues);
      if ( cat != null) {
        catsList.add(cat);
      }
      else
        break;
    }

    //
    CategoryType cats[] = new CategoryType[catsList.size()];
    for(int i = 0; i < catsList.size(); i++ ) {
      cats[i] = (CategoryType)catsList.get(i);
    }
    //
    SearchAttributeSet[] sets = ProductFinderParamParser.parseProductFinderPostData(nameValues);
    for(int i = 0; i < sets.length; i++ )
    {
      SearchAttributeSet set = sets[i];
      CategoryType cat = findCategoryByProductFinderID(cats, set.getProductFinderID());
//      CategoryType cat = cats[0];

      if( cat == null ) {
        throw new SdkException("findCategoryByProductFinderID failed.");
      }
      set.setCategoryID(Integer.parseInt(cat.getCategoryID()));
      //set.setCategoryOrdinal(i);
 //     set.setProductFinderID(cat.getProductFinderID().intValue());

      // Set to the first CSID.
      CharacteristicsSetType[] css = cat.getCharacteristicsSets();
      if( css != null && css.length > 0 )
        set.setAttributeSetID(css[0].getAttributeSetID().intValue());
    }

    return sets;
  }
}
