/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import org.w3c.dom.Document;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.attributes.model.IProductFinderXslProvider;
import com.ebay.sdk.call.GetProductFinderXSLCall;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.XSLFileType;

/**
 * Implements IProductFinderXslProvider to download product finder XSL through
 * eBay SOAP API and cache them in memory.
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class ProductFinderXslDownloader implements IProductFinderXslProvider {

  private Document xslDoc = null;
  private String xslString;
  private ApiContext apiContext;

  public ProductFinderXslDownloader() {
  }
  
  public ProductFinderXslDownloader(ApiContext apiContext) {
	  this.apiContext = apiContext;
  }

  /**
   * Returns the product finder XSL.
   * @return Document
   */
  public synchronized Document getXSL() {
    return this.xslDoc;
  }

  public synchronized String getXslFileContent() {
	  return xslString;
  }
  
  /**
   * Downloads product finder XSL through eBay SOAP API and stores them in
   * memory.
   * @param apiContext ApiContext
   * @throws SdkException
   * @throws Exception
   */
  public void downloadProductFinderXsl(ApiContext apiContext) throws SdkException, Exception {
	this.apiContext = apiContext;
	GetProductFinderXSLCall pfl = new GetProductFinderXSLCall(apiContext);
    pfl.setDetailLevel(new DetailLevelCodeType[]{DetailLevelCodeType.RETURN_ALL});

    XSLFileType[] xslFiles = pfl.getProductFinderXSL();
    if( xslFiles.length > 0 ) {
      xslString = xslFiles[0].getFileContent();
      xslDoc = XmlUtil.createDom(xslString);
    }
  }
}
