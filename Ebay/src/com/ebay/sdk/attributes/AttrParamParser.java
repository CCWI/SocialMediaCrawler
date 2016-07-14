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
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

import com.ebay.sdk.attributes.model.Attribute;
import com.ebay.sdk.attributes.model.AttributeSet;
import com.ebay.sdk.attributes.model.AttributeTypes;
import com.ebay.sdk.attributes.model.Value;
import com.ebay.sdk.attributes.model.ValueIds;
import com.ebay.sdk.attributes.model.ValueTypes;
import com.ebay.sdk.attributes.model.YMD;

/**
 *
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
class AttrInfo
{
  /**
   * See AttributType
   */
  public int typeId;

  public String csid;

  public String attrId;

  public String[] val;
}

/**
 *
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
abstract class AttrParamParser
{
  public static final String ATTR = "attr";
  public static final String ATTR_D = "attr_d";
  public static final String ATTR_T = "attr_t";

  public static final String US = "_";
  public static final String USC = "_c";
  public static final String USD = "_d";
  public static final String USM = "_m";
  public static final String UST = "_t";
  public static final String USY = "_y";

  public static final String SEP = ",";
  public static String SEPS = ",";

  /**
   *
   * @param vcsid int
   * @param request Map
   * @return AttributeSet
   */
  public static AttributeSet parse(int vcsid, Map request)
  {
    int index;
    Hashtable htAttr = new Hashtable();

    String csidStr = new Integer(vcsid).toString();

    Object[] keys = request.keySet().toArray();
    for(int i = 0; i < keys.length; i++ )
    {
      String key = (String)keys[i];
    //foreach (string key in request.AllKeys)
    //{
      if( !(key.startsWith(ATTR + csidStr) ||
              key.startsWith(ATTR_D + csidStr) ||
              key.startsWith(ATTR_T + csidStr))
              )
        continue;

      int type = AttributeTypes.ATTR_ID;

      String[] val = (String[])request.get(key);
      String skey = key.substring(ATTR.length());
      if (skey.startsWith(USD))
      {
        index = skey.lastIndexOf(US);
        String ekey = skey.substring(index);
        skey = skey.substring(0, index);
        skey = skey.substring(USD.length());
        if (USC.equals(ekey))
        {
          type = AttributeTypes.ATTR_TEXT;
        }
        else if (USD.equals(ekey))
        {
          type = AttributeTypes.ATTR_DATE_D;
        }
        else if (USM.equals(ekey))
        {
          type = AttributeTypes.ATTR_DATE_M;
        }
        else if (USY.equals(ekey))
        {
          type = AttributeTypes.ATTR_DATE_Y;
        }
      }
      else if (skey.startsWith(UST))
      {
          skey = skey.substring(UST.length());
          type = AttributeTypes.ATTR_TEXT;
      }
      else
      {
        if (val.length > 1)
        {
          type = AttributeTypes.ATTR_IDS;
        }
        else
        {
          type = AttributeTypes.ATTR_ID;
        }
      }

      AttrInfo info = new AttrInfo();
      info.typeId = type;

      // Peel of the vcsid
      index = skey.indexOf(US);
      info.attrId = skey.substring(index + 1);
      info.csid = skey.substring(0, index);
      info.val = (String[])request.get(key);
      skey = info.attrId;

      Object obj = htAttr.get(info.attrId);
      if (obj != null)
      {
        if (obj instanceof ArrayList)
        {
          ((ArrayList)obj).add(info);
        }
        else
        {
          ArrayList al = new ArrayList();
          al.add(obj);
          al.add(info);
          htAttr.remove(info.attrId);
          htAttr.put(skey, al);
        }
      }
      else
      {
        htAttr.put(info.attrId, info);
      }
    }

    return compile(htAttr, vcsid);
  }

  static void ArrayList_removeRange(ArrayList al, int index, int count)
  {
    for(int i = 0; i < count; i++ )
    {
      al.remove(index + i);
    }
  }

  private static AttributeSet compile(Hashtable ht, int vcsid)
  {
    AttributeSet attrSet = new AttributeSet();
    attrSet.setAttributeSetID(vcsid);

    int cnt = ht.size();
    Enumeration iter = ht.keys();

    String key;
    Object val;
    AttrInfo info;
    ArrayList al;
    Attribute attr = null;

    while(iter.hasMoreElements())
    {
      key = iter.nextElement().toString();
      val = ht.get(key);
      if (val instanceof ArrayList)
      {
        al = (ArrayList)val;
        cnt = al.size();
        // Option Other
        if (cnt == 2)
        {
          AttrInfo info0 = (AttrInfo)al.get(0);
          AttrInfo info1 = (AttrInfo)al.get(1);
          if (info0.typeId == AttributeTypes.ATTR_ID)
          {
            attr = ExtractAttr2(info0, info1);
            attrSet.add(attr);
          }
          else if (info1.typeId == AttributeTypes.ATTR_ID)
          {
            attr = ExtractAttr2(info1, info0);
            attrSet.add(attr);
          }
          else
          {
            //Unknow type.
          }
        }
        // DateTime
        else if (cnt == 3)
        {
          YMD ymd = new YMD(null, null, null);
          for (int i = 0; i < cnt; i ++)
          {
            info = (AttrInfo)al.get(i);
            switch(info.typeId)
            {
              case AttributeTypes.ATTR_DATE_D:
                ymd.day = info.val[0];
                break;
              case AttributeTypes.ATTR_DATE_M:
                ymd.month = info.val[0];
                break;
              case AttributeTypes.ATTR_DATE_Y:
                ymd.year = info.val[0];
                break;
            }
          }

          YMD.FixYMD(ymd);

          if (ymd.day != null && ymd.month!= null && ymd.year != null)
          {
            info = (AttrInfo)al.get(0);
            ArrayList_removeRange(al, 0, cnt);

            info.typeId = AttributeTypes.ATTR_TEXT_DATE;
            info.val = new String[] { ymd.year + ymd.month + ymd.day };
            al.add(info);

            attr = ExtractAttr(info);
            ((Value)attr.getValue()[0]).setValueID(new Integer(ValueIds.COMPLETE_TEXT_DATE));
            //attr.ValueList[0].ValueId = (int)ValueIds.COMPLETE_TEXT_DATE;

            attrSet.add(attr);
          }
        }
      }
      else
      {
        info = (AttrInfo) val;

        // Only year field.
        if( info.typeId == AttributeTypes.ATTR_DATE_Y )
        {
          info.typeId = AttributeTypes.ATTR_DATE_Y;
          info.val = info.val;

          attr = ExtractAttr(info);
          //((Value)attr.getValue()[0]).setValueID(new Integer(ValueIds.COMPLETE_TEXT_DATE));
          ((Value)attr.getValue()[0]).setValueID(new Integer(ValueIds.TEXT));

          attrSet.add(attr);
        }
        else
        {
          attr = ExtractAttr(info);
          if( attr.getType() == AttributeTypes.ATTR_TEXT )
          {
            ((Value)attr.getValue()[0]).setValueID(new Integer(ValueIds.TEXT));
            //attr.ValueList[0].ValueId = (int) ValueIds.TEXT;
          }

          attrSet.add(attr);
        }
      }
    }

    return attrSet;
  }

  private static int AttrToValType(int attrType)
  {
    if( attrType == AttributeTypes.ATTR_ID || attrType == AttributeTypes.ATTR_IDS )
      return ValueTypes.ValueId;
    else
      return ValueTypes.Text;
  }

  private static com.ebay.sdk.attributes.model.Attribute ExtractAttr(AttrInfo info)
  {
    Value val = null;
    com.ebay.sdk.attributes.model.Attribute attr = new com.ebay.sdk.attributes.model.Attribute();
    attr.setAttributeID(Integer.parseInt(info.attrId));
    attr.setType(info.typeId);

    //IValueList list = new ValueList();
    //attr.ValueList = list;

    int valType = AttrToValType(info.typeId);

    if (info.typeId == AttributeTypes.ATTR_ID)
    {
      val = new Value(valType);
      val.setValueID(new Integer(info.val[0]));
      attr.addValue(val);
      /*
      if (info.val.equals"-10"))
      {
              attr.SType = -1;
      }
      */
    }
    else if (info.typeId == AttributeTypes.ATTR_IDS)
    {
      for (int i = 0; i < info.val.length; i++)
      {
        val = new Value(valType);
        val.setValueID(new Integer(info.val[i]));
        attr.addValue(val);
      }
      /*
      if (info.val.indexOf("-10") > -1)
      {
              attr.SType = -1;
      }
      */
    }
    else
    {
      val = new Value(valType);
      val.setValueLiteral(info.val[0]);
      attr.addValue(val);
    }

    return attr;
  }

  private static com.ebay.sdk.attributes.model.Attribute ExtractAttr2(AttrInfo info1, AttrInfo info2)
  {
    com.ebay.sdk.attributes.model.Attribute attr = new com.ebay.sdk.attributes.model.Attribute();
    //IValueList list = new ValueList();
    //attr.ValueList = list;
    attr.setAttributeID(Integer.parseInt(info1.attrId));
    attr.setType(info1.typeId);

    Value val = new Value();
    val.setValueID(new Integer(info1.val[0]));
    val.setValueLiteral(info2.val[0]);

    attr.addValue(val);

    return attr;
  }

  private static com.ebay.sdk.attributes.model.Attribute ExtractAttr(AttrInfo [] infos)
  {
    Value val = null;
    com.ebay.sdk.attributes.model.Attribute attr = new com.ebay.sdk.attributes.model.Attribute();
    attr.setAttributeID(Integer.parseInt(infos[0].attrId));
    //IValueList list = new ValueList();
    //attr.ValueList = list;

    AttrInfo info;
    int cnt = infos.length;
    for (int i = 0; i < cnt; i ++)
    {
      info = infos[i];
      if (info.typeId == AttributeTypes.ATTR_ID)
      {
        val = new Value();
        val.setValueID(new Integer(info.val[0]));
        attr.addValue(val);
      }
      else if (info.typeId == AttributeTypes.ATTR_IDS)
      {
        for (int j = 0; j < info.val.length; j++)
        {
          val = new Value();
          val.setValueID(new Integer(info.val[j]));
          attr.addValue(val);
        }
      }
      else
      {
        val = new Value();
        val.setValueLiteral(info.val[0]);
        attr.addValue(val);
      }
    }

    return attr;
  }
}
