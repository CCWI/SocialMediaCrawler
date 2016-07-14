package com.tumblr.jumblr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tumblr.jumblr.types.NewPost;
import com.tumblr.jumblr.types.Post;
import com.tumblr.jumblr.types.TextPost;
import com.tumblr.jumblr.types.User;

import edu.hm.socialmediacrawler.datenbankzugriff.ObjectDAO;

/**
 * Dataextration from Jumblr API
 * 
 * @author Daniel Wiesheu
 */
public class App {

	public App() {
	}

	public void run(List<String> keywords) throws FileNotFoundException,
			IOException, InstantiationException, IllegalAccessException {

		// Read in the JSON data for the credentials
		// FileReader fr = new FileReader("credentials.json");
		InputStream is = getClass().getClassLoader().getResourceAsStream(
				"credentials.json");
		BufferedReader br = new BufferedReader(new InputStreamReader(is,
				"UTF-8"));
		StringBuilder json = new StringBuilder();
		try {
			while (br.ready()) {
				json.append(br.readLine());
			}
		} finally {
			br.close();
		}

		// Parse the credentials
		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject) parser.parse(json.toString());

		// Create a client
		JumblrClient client = new JumblrClient(obj.getAsJsonPrimitive(
				"consumer_key").getAsString(), obj.getAsJsonPrimitive(
				"consumer_secret").getAsString());

		// Give it a token
		client.setToken(obj.getAsJsonPrimitive("oauth_token").getAsString(),
				obj.getAsJsonPrimitive("oauth_token_secret").getAsString());

		// Usage
		// List<Post> posts = client.blogPosts("storiesofapple");
		// for (Post post : posts) {
		// System.out.println(post.getShortUrl());
		// }

		// List<Post> posts1 = client.blogLikes("bmwusa");
		// for (Post post : posts1) {
		// System.out.println(post.getShortUrl());
		// }

		User user = client.user();
		// returns Post with the tagged String. Limit 20 Posts!

		for (String keyword : keywords) {
			List<Post> posts = client.tagged(keyword);
			// workaround for limit
			for (int i = 0; i < 208; i++) {
				if (posts.size() > 1) {
					Long longTime = posts.get(posts.size() - 1).getTimestamp();
					Map<String, Integer> datum = new HashMap<String, Integer>();
					datum.put("before", longTime.intValue());
					List<Post> posts1 = client.tagged(keyword, datum);
					posts.addAll(posts1);
				} else {
					// Keine weiteren Posts gefunden
				}
			}
		
			// write in database
			ObjectDAO dao = new ObjectDAO();
			List<NewPost> newposts = processPost(posts);
			for (NewPost post : newposts)
				dao.speicherInDatenbank(post);
		}
		// specific blogs can be requestet
		// e.g. likes, followers, blogposts etc
		// Blog blog = client.blogInfo("spotify");

	}

	private static List<NewPost> processPost(List<Post> posts) {
		List<NewPost> newposts = new LinkedList<NewPost>();
		for (Post post : posts) {
			NewPost newpost = new NewPost(post);
			if (post.getType().equals("text")){
				TextPost x = (TextPost) post;
				newpost.setText(x.getBody());
			}
			newposts.add(new NewPost(post));
		}
		return newposts;
	}

}
