/**
 * 
 */
package edu.hm.cs.smc.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Max Keller
 *
 */
public class PropertiesReader {
	
	String result = "";
	InputStream inputStream;
	
	public Properties getProperties(String fileName) {
		Properties properties = new Properties();
		inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		
		try {
			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + fileName + "' not found in classpath.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return properties;
	}
}
