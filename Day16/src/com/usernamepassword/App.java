package com.usernamepassword;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your username");
		String username = sc.nextLine();
		System.out.println("Enter your password");
		String password = sc.nextLine();
		Connection con = null;
		
		
		try {
			 con = DatabaseConnect.getConnection();
			 Statement st = con.createStatement();
			 
			 if(!DatabaseConnect.tableExists(con, "users")) {
				 // create table
				if(DatabaseConnect.createUserTable(st))
					System.out.println("Table has been created");
				else
					System.out.println("Failed to create users table");
			 }
			 
			 String checkTable = "SELECT * FROM users WHERE username='"+ username + "' AND password='" + password + "'";
			 ResultSet rs = st.executeQuery(checkTable);
			 
			 if(rs.next()) {
				 System.out.println("Welcome " + username + " !!");
			 }else {
				 System.out.println("You are not a registered user. Do you want to register (yes/no)");
				 String input = sc.nextLine();
				 if(input.equals("yes")) {
					 String insert = "INSERT INTO users(username, password) VALUES(?, ?)";
					 PreparedStatement ps = con.prepareStatement(insert);
					 ps.setString(1, username);
					 ps.setString(2, password);
					 
					int rows = ps.executeUpdate();
					if(rows > 0) 
						System.out.println("Welcome " + username + " !!");
					else
						System.out.println("Error in creating user");
					
					 
					 ps.clearParameters();
					 ps.close();
					 
					 
				 }
			 }
		
			 st.close();
			 con.close();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
