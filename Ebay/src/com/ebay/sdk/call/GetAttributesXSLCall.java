/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.io.*;
import com.ebay.sdk.util.*;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetAttributesXSL call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>FileName</code> - This field is deprecated.
 * <br> <B>Input property:</B> <code>FileVersion</code> - This field is deprecated.
 * <br> <B>Output property:</B> <code>XSLFile</code> - Child elements contain data related to one XSL file.
 * Multiple XSLFile objects can be returned. However, currently only
 * one is returned.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetAttributesXSLCall extends com.ebay.sdk.ApiCall
{
  
  private String fileName = null;
  private String fileVersion = null;
  private XSLFileType[] XSLFile=null;

  private GetAttributesXSLResponseType response;

  /**
   * Constructor.
   */
  public GetAttributesXSLCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetAttributesXSLCall(ApiContext apiContext) {
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
  public XSLFileType[] getAttributesXSL()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetAttributesXSLRequestType req;
    req = new GetAttributesXSLRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.fileName != null)
      req.setFileName(this.fileName);
    if (this.fileVersion != null)
      req.setFileVersion(this.fileVersion);

    GetAttributesXSLResponseType resp = (GetAttributesXSLResponseType) execute(req);

    this.XSLFile = resp.getXSLFile();
	if( this.XSLFile != null ) {
		decodeXSLData(this.XSLFile);
	}

	response = resp;

    return this.getXSLFile();
  }

  /**
   * Gets the GetAttributesXSLRequestType.fileName.
   * @return String
   */
  public String getFileName()
  {
    return this.fileName;
  }

  /**
   * Sets the GetAttributesXSLRequestType.fileName.
   * @param fileName String
   */
  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }

  /**
   * Gets the GetAttributesXSLRequestType.fileVersion.
   * @return String
   */
  public String getFileVersion()
  {
    return this.fileVersion;
  }

  /**
   * Sets the GetAttributesXSLRequestType.fileVersion.
   * @param fileVersion String
   */
  public void setFileVersion(String fileVersion)
  {
    this.fileVersion = fileVersion;
  }
/*
  * Helper function to do base64 decode of the returned file data.
  */
  public static void decodeXSLData(XSLFileType[] files) throws Exception {
  	String returnedContent = null;
    for (int i = 0; i < files.length; i++) {
      returnedContent = files[i].getFileContent();
      if (returnedContent != null) {
    	  byte[] decodeOut = Base64.decode(returnedContent.toCharArray());
    	  String xsl = eBayUtil.convertInputStreamToString(new ByteArrayInputStream(decodeOut));
    	  files[i].setFileContent(xsl);
      }
    }
  }
 
  public GetAttributesXSLResponseType getResponse() {
	return response;
  }


  /**
   * Valid after executing the API.
   * Gets the returned GetAttributesXSLResponseType.XSLFile.
   * 
   * @return XSLFileType[]
   */
  public XSLFileType[] getXSLFile()
  {
    return this.XSLFile;
  }

}

