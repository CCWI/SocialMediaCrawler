/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.util.Hashtable;
import java.util.Map;

import org.w3c.dom.Document;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.IProductFinderXmlProvider;
import com.ebay.sdk.call.GetProductFinderCall;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;

/**
 * Implements IProductFinderXmlProvider to download product finder Xml through
 * eBay SOAP API and cache them in memory.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class ProductFinderXmlDownloader implements IProductFinderXmlProvider
{
  private ApiContext apiContext;
  private Map<int[], Document> cache = new Hashtable<int[], Document>();

  /**
   * Constructor.
   */
  public ProductFinderXmlDownloader(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  /**
   * Empty cache.
   */
  public void resetCache()
  {
    this.cache = new Hashtable<int[], Document>();
  }

  /**
   * Get product finder XML by list of product finder IDs.
   * @param productFinderIDList int[] Product finder ID list.
   * @return Document
   */
  public synchronized Document getProductFinderXml(int[] productFinderIDList)
    throws SdkException, Exception
  {
    Document doc;

    Object obj = searchMap(productFinderIDList, cache);
    if( obj == null ) {
    	GetProductFinderCall gpf = new GetProductFinderCall(apiContext);
    	gpf.setDetailLevel(new DetailLevelCodeType[]{DetailLevelCodeType.RETURN_ALL});
    	gpf.setProductFinderIDs(productFinderIDList);
    	String pfXml = gpf.getProductFinder();
    	if(pfXml == null || pfXml.length() == 0) {
    		StringBuffer ids = new StringBuffer();
    		for(int i = 0; i < productFinderIDList.length; i++) {
    			ids.append(productFinderIDList[i]).append(",");
    		}
  	 		int lastComaPos = ids.lastIndexOf(",");
  	 		ids.deleteCharAt(lastComaPos);
  	 		throw new SdkException("ProductFinder Data not available for product finder ids:" + ids.toString());
    	}
    	doc = XmlUtil.createDom(pfXml);

    	//
    	cache.put(productFinderIDList, doc);
    } else {
      doc = (Document)obj;
    }

    return doc;
  }
  
  static Object searchMap(Object key, Map cache) {
	    Object[] keys = cache.keySet().toArray();
	    for(int i = 0; i < keys.length; i++ )
	    {
	      if( key instanceof int[] && keys[i] instanceof int[] )
	      {
	        if (compareIntArray( (int[])keys[i], (int[])key) == 0)
	          return cache.get(keys[i]);
	      }
	      else if( key instanceof String[] && keys[i] instanceof String[] )
	      {
	        if (compareStringArray( (String[])keys[i], (String[])key) == 0)
	          return cache.get(keys[i]);
	      }
	      else if( key instanceof String && keys[i] instanceof String )
	      {
	        if( ((String)key).equals((String)keys[i]) )
	          return cache.get(keys[i]);
	      }
	    }
	    return null;
	  }
  /**
   * Compares sorted array.
   * @param a1 int[]
   * @param a2 int[]
   * @return boolean
   */
  static int compareIntArray(int[] a1, int[] a2) {
    if( a1.length != a2.length )
      return -1;

    for(int i = 0; i < a1.length; i++ )
    {
      if( a1[i] != a2[i] )
        return -1;
    }
    return 0;
  }

  static int compareStringArray(String[] a1, String[] a2) {
    if( a1.length != a2.length )
      return -1;

    for(int i = 0; i < a1.length; i++ )
    {
      if( !a1[i].equals(a2[i]) )
        return -1;
    }
    return 0;
  }
  
}
