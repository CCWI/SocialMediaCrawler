/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package edu.hm.google;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.model.Result;
import com.google.api.services.customsearch.model.Search;

import edu.hm.socialmediacrawler.datenbankzugriff.ObjectDAO;

import java.util.List;
 

public class GoogleSearchClient {
 
    final private String GOOGLE_SEARCH_URL = "https://www.googleapis.com/customsearch/v1?";
 
    //api key 
    final private String API_KEY = "";
    //custom search engine ID
    final private String SEARCH_ENGINE_ID = "";
 
    final private String FINAL_URL= GOOGLE_SEARCH_URL + "key=" + API_KEY + "&cx=" + SEARCH_ENGINE_ID;

 
    public List<Result> getSearchResult(String keyword){
         // Set up the HTTP transport and JSON factory
        HttpTransport httpTransport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();
        //HttpRequestInitializer initializer = (HttpRequestInitializer)new CommonGoogleClientRequestInitializer(API_KEY);
        Customsearch customsearch = new Customsearch(httpTransport, jsonFactory,null);
 
        List<Result> resultList = null;
        try {
                Customsearch.Cse.List list = customsearch.cse().list(keyword);
                list.setKey(API_KEY);
                list.setCx(SEARCH_ENGINE_ID);
                //num results per page
                //list.setNum(2L);
 
                //for pagination
                list.setStart(1L);
                Search results = list.execute();
                resultList = results.getItems();
 
        }catch (Exception e) {
                e.printStackTrace();
        }
 
        return resultList;
 
    }
}
