package edu.hm.socialmediacrawler.datenbankzugriff;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = -561280899673096994L;
	
	public DatabaseException(String message, Throwable cause){
		super(message, cause);
	}

}
