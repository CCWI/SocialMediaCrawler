/*


 * 
 * 
 * 
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.smc.channels.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Comment;
import com.restfb.types.Page;
import com.restfb.types.Post;


/**
 *
 * @author yaric
 */
public class FacebookConnector {
    
    // myacesstoken von mir ergaenzt
    private String accessToken;
    private static final String ACCESS_TOKEN_NAME = "facebook.accesstoken";
    private FacebookClient fbClient;
    private long likes = 0;
    private long talkabout = 0;
    

    public FacebookConnector(Properties credentialProperties) {
		accessToken = credentialProperties.getProperty(ACCESS_TOKEN_NAME);
		fbClient = new DefaultFacebookClient(accessToken,com.restfb.Version.VERSION_1_0);
	}
    
	public FacebookClient getFbClient() {
        return this.fbClient;
    }
    public long getLikes() {
        return likes;
    }

    public long getTalkabout() {
        return talkabout;
    }
    

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public void setTalkabout(long talkabout) {
        this.talkabout = talkabout;
    }

    
    public Page getPage(String fbid) {
        Page page = fbClient.fetchObject(fbid,Page.class);
        return page;
    }
    
    public List<Post> getPosts(Page page) {       
        Connection<Post> posts = fbClient.fetchConnection(page.getId() + "/posts", Post.class);
        List<Post> postsAr = posts.getData();
        return postsAr;
    }

    public List<Comment> getComments(Post post) {
        if (post.getComments() != null) {
            return post.getComments().getData();} 
        else {
                return new ArrayList<Comment>();
            }
    }
    
    public Post getfirstPost(Page page) {       
        Connection<Post> posts = fbClient.fetchConnection(page.getId() + "/posts", Post.class);
        return (Post) posts.getData().toArray()[0];
    }
    //Muss noch getestet werden
    
    public List<Comment> getAllPostComments(String postId, DefaultFacebookClient client){
    	
    	List<Comment> result = new ArrayList<Comment>();
    	int currentCount = 0;

        boolean pom = true;
        while(pom == true){     
              pom = false;
              Connection<Comment> comments = client.fetchConnection(postId + "/comments", 
                    Comment.class, Parameter.with("limit", 50000), Parameter.with("offset", currentCount));

              for(Comment c : comments.getData()){
                    pom = true;
                    currentCount++;
                    result.add(c);
              }
        }
        
        return result;
   
      }
    
        public Connection<Post> getAllPagePosts(String pageId, DefaultFacebookClient client){
                  Connection<Post> posts = client.fetchConnection(pageId + "/posts", 
                        Post.class, Parameter.with("limit", 99), Parameter.with("offset", 0));
                  return posts;
      }

    

    
    
}
