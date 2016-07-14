/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

public class ValidationResult {
  private int errorCode;
  private boolean success;
  private String errorMessage;

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public boolean getSuccess() {
    return success;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
