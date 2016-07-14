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
 * Wrapper class of the GetProductFinderXSL call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>FileName</code> - The name of the XSL file to retrieve. If not specified, the call
 * returns the latest versions of all available XSL files.
 * Currently, this call only retrieves the product_finder.xsl file.
 * FileName is an optional input.
 * <br> <B>Input property:</B> <code>FileVersion</code> - The desired version of the XSL file. Required if FileName is specified.
 * If not specified, the call returns the latest versions of all
 * available XSL files that could be returned by the call.
 * (Currently, this call only retrieves the product_finder.xsl file.)
 * This is not a filter for retrieving changes to the XSL file.
 * <br> <B>Output property:</B> <code>XSLFile</code> - Child elements specify data related to one XSL file.
 * In theory, multiple XSLFile objects can be returned.
 * Currently, this call only retrieves the product_finder.xsl file.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetProductFinderXSLCall extends com.ebay.sdk.ApiCall
{
  
  private String fileName = null;
  private String fileVersion = null;
  private XSLFileType[] xSLFile=null;


  /**
   * Constructor.
   */
  public GetProductFinderXSLCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetProductFinderXSLCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * This type is deprecated as the call is no longer available.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The XSLFileType[] object.
   */
  public XSLFileType[] getProductFinderXSL()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetProductFinderXSLRequestType req;
    req = new GetProductFinderXSLRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.fileName != null)
      req.setFileName(this.fileName);
    if (this.fileVersion != null)
      req.setFileVersion(this.fileVersion);

    GetProductFinderXSLResponseType resp = (GetProductFinderXSLResponseType) execute(req);

    this.xSLFile = resp.getXSLFile();
    if( xSLFile != null )
      GetAttributesXSLCall.decodeXSLData(xSLFile);
    return this.getXSLFile();
  }

  /**
   * Gets the GetProductFinderXSLRequestType.fileName.
   * @return String
   */
  public String getFileName()
  {
    return this.fileName;
  }

  /**
   * Sets the GetProductFinderXSLRequestType.fileName.
   * @param fileName String
   */
  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }

  /**
   * Gets the GetProductFinderXSLRequestType.fileVersion.
   * @return String
   */
  public String getFileVersion()
  {
    return this.fileVersion;
  }

  /**
   * Sets the GetProductFinderXSLRequestType.fileVersion.
   * @param fileVersion String
   */
  public void setFileVersion(String fileVersion)
  {
    this.fileVersion = fileVersion;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetProductFinderXSLResponseType.xSLFile.
   * 
   * @return XSLFileType[]
   */
  public XSLFileType[] getXSLFile()
  {
    return this.xSLFile;
  }

}

