package edu.hm.twitter;

public class TwitterException extends Exception {

	private static final long serialVersionUID = 957264402656073755L;
	
	public TwitterException(String message, Throwable cause){
		super(message, cause);
	}

}
