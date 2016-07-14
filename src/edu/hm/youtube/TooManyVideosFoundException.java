package edu.hm.youtube;

public class TooManyVideosFoundException extends Exception {
	
	private static final long serialVersionUID = -4571772307908135950L;

	public TooManyVideosFoundException(String message){
		super(message);
	}

}
