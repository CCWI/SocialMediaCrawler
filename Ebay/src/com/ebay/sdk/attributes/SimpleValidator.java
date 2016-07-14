/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;

import com.ebay.sdk.attributes.model.AttributeTypes;
import com.ebay.sdk.attributes.model.ValidationResult;

class SimpleValidator
{
  private static Class _type;
  private static Perl5Compiler _perl;
  private static Perl5Matcher _matcher;

  public static final String CLASS_NAME = "com.ebay.sdk.attributes.SimpleValidator";

  public SimpleValidator(){}

  private static Class getType() throws ClassNotFoundException
  {
    if (_type == null) {
      try {
        _type = Thread.currentThread().getContextClassLoader().loadClass(CLASS_NAME);
      }
      catch(Exception e) {
        _type = Class.forName(CLASS_NAME);
      }
    }

    return _type;
  }

  private static Perl5Compiler getPerlCompiler()
  {
    if (_perl == null) {
      _perl = new Perl5Compiler();
      _matcher = new Perl5Matcher();
    }

    return _perl;
  }

  private static Perl5Matcher getRegMatcher()
  {
    if (_perl == null) {
      _perl = new Perl5Compiler();
      _matcher = new Perl5Matcher();
    }

    return _matcher;
  }

  public static Object validate(String method, Object [] args)
    throws ClassNotFoundException, NoSuchMethodException,
      InvocationTargetException, IllegalAccessException, InstantiationException,
      MalformedPatternException
  {
    Class type = getType();
    return validate(type, method, args);
  }

  public static Object validate(Class type, String method, Object [] args)
    throws ClassNotFoundException, NoSuchMethodException,
      InvocationTargetException, IllegalAccessException, InstantiationException,
      MalformedPatternException
  {
    int cnt = args.length;

    Class [] cls = new Class[cnt];
    for (int i = 0; i < cnt; i++) {
      cls[i] = args[i].getClass();
    }
    Method info = null;
    try {
      info = type.getMethod(method, cls);
    }
    catch(Exception e) {
      System.out.println(method + ":" + e.getMessage());
    }

    if (info != null) {
      return info.invoke(type.newInstance(), args);
    }
    else {
      ValidationResult result = new ValidationResult();
      result.setErrorMessage("Validation rule " + method + " is not available.");
      return result;
    }
  }

  public static ValidationResult DateNullCheckRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
	ValidationResult result = new ValidationResult();
        if (isValid(target)) {
	  result.setSuccess((new SimpleDate(target)).isValidDate());
        }
	result.setErrorMessage("Please specify both To and From dates.");
	return result;
  }

  public static ValidationResult DateRangeRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValid(target)) {
      SimpleDate dt0 = new SimpleDate(target);
      SimpleDate dt1 = new SimpleDate(rule.min);
      SimpleDate dt2 = new SimpleDate(rule.max);
      result.setSuccess(dt0.compare(dt1) > 0 && dt0.compare(dt2) < 0);
    }
    result.setErrorMessage("DateRangeRule violation.");
    return result;
  }

  public static ValidationResult DateValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();

    try
    {
      // Empty input is allowed.
      if (target == null || target.length() == 0)
        result.setSuccess(true);
      else
        result.setSuccess( (new SimpleDate(target)).isValidDate());
    }
    catch(Exception ex)
    {
      result.setSuccess(false);
    }

    if( !result.getSuccess() )
      result.setErrorMessage("Argument must be a valid date.");
    return result;
  }

  public static ValidationResult DecimalSeparatorNotAllowedRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      result.setSuccess(target.indexOf(DOT) == -1);
    }
    result.setErrorMessage("Please enter a number with no decimal place.");
    return result;
  }

  public static ValidationResult DoubleRangeValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
        try {
          double d = Double.parseDouble(target);
          result.setSuccess(Double.parseDouble(rule.min) < d && d < Double.parseDouble(rule.max));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter a value between [" + rule.min + "] and [" + rule.max + "].");
    return result;
  }

  public static ValidationResult IntRangeValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if( target.length() == 0 )
      result.setSuccess(true);
    else if (isValid(target)) {
        try {
          double d = Double.parseDouble(target);
          result.setSuccess((d > Integer.parseInt(rule.min)) && (d < Integer.parseInt(rule.max)));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter an value between [" + rule.min + "] and [" + rule.max + "].");
    return result;
  }

  public static ValidationResult MaskCheckRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      char [] valArray = target.toCharArray();
      char [] maskArray = rule.other.toCharArray();

      int len = valArray.length;

      boolean success = (len == maskArray.length);
      if (success)
      {
        char val;
        char mask;
        int m;
        for(int i=0; i<len && success; i++)
        {
          val = valArray[i];
          mask = maskArray[i];

          switch(mask)
          {
            case 'X':
              // The value must be a number
              success = Character.isDigit(val);
              break;
            case 'A':
              // the value must be a letter
              success = Character.isLetter(val);
              break;
            default:
              // these characters must match
              success = (val == mask);
              break;
          }
        }
      }

      result.setSuccess(success);
    }
    result.setErrorMessage("Please enter this value in the format requested.");
    return result;
   }

  public static ValidationResult MaxDoubleValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
        try {
          result.setSuccess(Double.parseDouble(target) < Double.parseDouble(rule.max));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter a value less than [" + rule.max + "].");
    return result;
  }

  public static ValidationResult MaxIntValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
        try {
        result.setSuccess(Double.parseDouble(target) < Integer.parseInt(rule.max));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter an value less than [" + rule.max + "].");
    return result;
  }

  public static ValidationResult MinDoubleValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
        try {
          result.setSuccess(Double.parseDouble(target) > Double.parseDouble(rule.min));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter a value greater than [" + rule.min + "].");
    return result;
  }

  public static ValidationResult MinIntValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
        try {
          result.setSuccess(Double.parseDouble(target) > Integer.parseInt(rule.min));
        }
        catch(Exception e) {
        }
    }
    result.setErrorMessage("Please enter an value greater than [" + rule.min + "].");
    return result;
  }

  public static ValidationResult MultiSelectMinNumberValuesRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    result.setSuccess(cnt.intValue() > Integer.parseInt(rule.min));
    result.setErrorMessage("Please make no fewer than [" + rule.min + "] selections.");
    return result;
  }

  public static ValidationResult MultiSelectMaxNumberValuesRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    result.setSuccess(cnt.intValue() < Integer.parseInt(rule.max));
    result.setErrorMessage("Please make no more than [" + rule.max + "] selections.");
    return result;
  }

  public static ValidationResult MultiSelectMinMaxNumberValuesRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    int val = cnt.intValue();
    result.setSuccess(Integer.parseInt(rule.min) < val && val < Integer.parseInt(rule.max));
    result.setErrorMessage("Please make between [" + rule.min + "] and [" + rule.max + "] selections.");
    return result;
  }

  public static ValidationResult NumberSeparatorNotAllowedRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      target = target.trim();
      if (target.startsWith("-"))
      {
        target = target.substring(1, target.length() - 1);
      }
      target = target.trim();
      char [] ca = target.toCharArray();
      int len = ca.length;
      int i = 0;
      boolean success = true;
      while (success && i < len)
      {
        success = Character.isDigit(ca[i]);
        i ++;
      }
      result.setSuccess(success);
    }
    result.setErrorMessage("Please enter only numeric digits with no symbols.");
    return result;
  }

  public static ValidationResult PrecisionRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if( target.length() == 0 || isNumber(target) != 0 )
      result.setSuccess(true);
    result.setErrorMessage("PrecisionRule violation (" + rule.precision + ").");
    return result;
  }

  public static ValidationResult RegularExpressionValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
    throws MalformedPatternException
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      Perl5Compiler perl = getPerlCompiler();
      Perl5Matcher matcher = getRegMatcher();
      Pattern pat = perl.compile(rule.other);
      result.setSuccess(matcher.matches(target, pat));
    }
    result.setErrorMessage("Please enter this value in the format requested: " + rule.other);
    return result;
  }

  public static ValidationResult RequiredRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    result.setSuccess(cnt.intValue() > 0);
    result.setErrorMessage("RequiredRule violation.");
    return result;
  }

  //TODO
  public static ValidationResult SimpleRuleSetRule (Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else {
      // This rule is not supported
      result.setSuccess(true);
    }
    result.setErrorMessage("SimpleRuleSetRule violation.");
    return result;
  }

  public static ValidationResult StringLengthRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();

    if (isValidId(id.intValue())) {
      //result.setSuccess(cnt.intValue() > 0);
      //result.setErrorMessage("Please select a valid item.");
      result.setSuccess(true);
    }
    else
    {
        int len = target.length();
        result.setSuccess(0 <= len && len <= rule.length);
        if( !result.getSuccess() )
          result.setErrorMessage("Please enter no more than [" + rule.length + "] character(s).");
    }

    return result;
  }

  public static ValidationResult ThousandsSeparatorNotAllowedRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      result.setSuccess(target.indexOf(COMMA) == -1 && target.indexOf(DOT) == -1);
    }
    result.setErrorMessage("Please enter a number with no thousands separators.");
    return result;
  }

  //TODO
  public static ValidationResult UrlValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
    ValidationResult result = new ValidationResult();
    if (isValidId(id.intValue()) && cnt.intValue() > 0) {
      result.setSuccess(true);
    }
    else if (isValid(target)) {
      result.setSuccess(true);
    }
    result.setErrorMessage("UrlValidationRule violation.");
    return result;
  }

  public static ValidationResult VinValidationRule(Integer id, Integer cnt, String target, ValidationRule rule)
  {
        ValidationResult result = new ValidationResult();

        result.setSuccess(true);

        return result;
  }

  public static int isNumber(String target)
  {
    if (! isValid(target))
    {
      return 0;
    }

    int idx = target.indexOf(DOT);
    int len = target.length();
    char [] ch = target.toCharArray();
    for (int i = 0; i < idx; i++)
    {
      if (!Character.isDigit(ch[i]))
      {
        return 0;
      }
    }
    for (int i = idx + 1; i < len; i++)
    {
      if (!Character.isDigit(ch[i]))
      {
        return 0;
      }
    }

    return idx < 0 ? idx : 1;
  }

  public static boolean isValid(String target)
  {
    return target != null && target.length() > 0;
  }

  public static boolean isValidId(int id)
  {
    return id == AttributeTypes.ATTR_ID || id == AttributeTypes.ATTR_IDS;
  }

  public static final String COMMA = ",";
  public static final String DOT = ".";
}
