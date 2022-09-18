package com.email;

@SuppressWarnings("serial")
public class EmailException extends Exception{
	private String message;

	public EmailException() {
		super();
		this.message = "Email format is invalid";
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}	

}
