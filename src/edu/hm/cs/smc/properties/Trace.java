package edu.hm.cs.smc.properties;
import org.apache.log4j.Logger;
public class Trace {
   private static final Logger logger = Logger.getLogger(Trace.class);
   public void logMail(String mailString) {
      logger.error(mailString);
   }
}
