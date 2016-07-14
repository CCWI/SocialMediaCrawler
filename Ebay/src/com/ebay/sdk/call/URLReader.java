package com.ebay.sdk.call;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Daniel Wiesheu
 * 
 */
public class URLReader {

    public static String read(String address) throws Exception{

        URL url = new URL(address);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.8) Gecko/20100722 Firefox/3.6.8");

        String line;
        String response;
        long totalBytes = 0  ;

        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            totalBytes += line.getBytes("UTF-8").length ;
            //System.out.println("Total bytes read ::  " + totalBytes);
        }

        response = builder.toString();

        return response ;
    }

}