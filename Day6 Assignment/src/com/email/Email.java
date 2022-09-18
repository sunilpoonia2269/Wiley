package com.email;

public class Email {

	String validateEmail(String email) throws EmailException {
		
		String[] emailElements = email.split("@");
		
		if(emailElements.length > 2) throw new EmailException();
		
		if(!emailElements[emailElements.length - 1].equals("gmail.com")) throw new EmailException();
		
		if(email.startsWith(".") || email.startsWith("@")) throw new EmailException();
		
		return email + " is a valid email";
	}
}
