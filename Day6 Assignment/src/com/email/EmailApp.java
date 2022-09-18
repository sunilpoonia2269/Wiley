package com.email;

public class EmailApp {
	
	public static void main(String[] args) {
		Email email = new Email();
		
		try {
			String result = email.validateEmail("sunil@gmail.com");
			System.out.println(result);
			
			String result1 = email.validateEmail("sunil@poonia@gmail.com");
			System.out.println(result1);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
