package edu.hm.cs.smc.channels.twitter;

import com.cybozu.labs.langdetect.Detector;
import com.cybozu.labs.langdetect.DetectorFactory;
import com.cybozu.labs.langdetect.LangDetectException;

public class LanguageDetection {
		
	     public void init() throws LangDetectException {
	         String path = Thread.currentThread().getContextClassLoader().getResource("profiles").getPath();
	    	 DetectorFactory.loadProfile(path);
	     }
	     
	     public String detect(String text) throws LangDetectException {
	         Detector detector = DetectorFactory.create();
	         detector.append(text);
	         return detector.detect();
	     }
	     
	     public boolean detect(String text, String lg) throws LangDetectException {
	    	 String isLanguage = lg;
	         
	    	 Detector detector = DetectorFactory.create();
	         detector.append(text);
	         if(isLanguage.equals(detector.detect())){
	        	 return true;
	         }else {
	        	 return false;
	         }
	         
	     }
}
