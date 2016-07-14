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

import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.SearchAttribute;
import com.ebay.sdk.attributes.model.SearchAttributeSet;
import com.ebay.sdk.attributes.model.Value;

/**
 * Parser for post data of product finder HTML.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
abstract class ProductFinderParamParser {
  static final String PFID = "pfid";
  static final String A = "a";

  public static final String US = "_";
  public static final String USD = "_d";
  public static final String USM = "_m";
  public static final String USY = "_y";

  /**
   * Gets groupKey to PFID map.
   * @param request Map
   * @return Map
   */
  static java.util.Map getPFIDList(java.util.Map request)
  {
    Hashtable pfids = new Hashtable();

    Object[] keys = request.keySet().toArray();
    for(int i = 0; i < keys.length; i++ )
    {
      String key = (String)keys[i];
      if( !key.startsWith(PFID) )
        continue;

      String val = ((String[])request.get(key))[0];
      String skey = key.substring(PFID.length());
      if( skey.length() == 0 || skey.charAt(0) == '_' )
        pfids.put(skey, val);
    }

    return pfids;
  }

  private static Object findValueByStringKey(java.util.Map map, String strKey)
  {
    Object[] keys = map.keySet().toArray();
    for(int i = 0; i < keys.length; i++ )
    {
      String key = (String)keys[i];
      if( key.equals(strKey) )
      {
        return map.get(key);
      }
    }

    return null;
  }

  private static SearchAttributeSet findAttributeSetByPFID(SearchAttributeSet[] sets, int pfid) {
    for(int i = 0; i < sets.length; i++ )
    {
      if( pfid == sets[i].getProductFinderID() )
        return sets[i];
    }
    return null;
  }

  /**
   *
   * @param request Map
   * @throws SdkException
   * @throws Exception
   * @return SearchAttributeSet[]
   */
  static SearchAttributeSet[] parseProductFinderPostData(java.util.Map request)
    throws SdkException, Exception
  {
    int i;
    java.util.Map gkey_pfid = getPFIDList(request);
    if( gkey_pfid.size() == 0 )
      throw new SdkException("No product finder post data were found.");

    Object[] rgPFID = gkey_pfid.values().toArray();

    //
    SearchAttributeSet[] sets = new SearchAttributeSet[gkey_pfid.size()];
    for( i = 0; i < sets.length; i++ )
    {
      sets[i] = new SearchAttributeSet();
      sets[i].setProductFinderID(Integer.parseInt((String)rgPFID[i]));
    }

    //
    Object[] keys = request.keySet().toArray();
    for(i = 0; i < keys.length; i++ )
    {
      String key = (String) keys[i];

      if (!key.startsWith(A))
        continue;

      String skey = key.substring(A.length());
      String aid, groupKey;
      int us_idx = skey.indexOf(US);
      if( us_idx != -1 )
      {
        aid = skey.substring(0, us_idx);
        groupKey = skey.substring(us_idx);
      }
      else
      {
        aid = skey;
        groupKey = "";
      }

      String valStr = ((String[])request.get(key))[0];

      Object objPFID = findValueByStringKey(gkey_pfid, groupKey);
      if( objPFID == null )
        throw new SdkException("Invalid group key.");

      SearchAttributeSet set = findAttributeSetByPFID(sets, Integer.parseInt((String)objPFID));
      SearchAttribute attr = new SearchAttribute();
      attr.setAttributeID(Integer.parseInt(aid));
      Value val = new Value();
      val.setValueID(new Integer(valStr));
      attr.addValue(val);
      set.add(attr);
    }

    return sets;
  }
}
