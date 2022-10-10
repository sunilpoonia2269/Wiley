package com.usernamepassword;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {
	
	public static Connection getConnection() throws SQLException {
		String username = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
		
		
		return con;
		
	}
	
	public static boolean  tableExists(Connection connection, String tableName) throws SQLException {
	    DatabaseMetaData meta = connection.getMetaData();
	    ResultSet resultSet = meta.getTables(null, null, tableName, new String[] {"TABLE"});

	    return resultSet.next();
	}
	
	public static boolean createUserTable(Statement st) throws SQLException {
		 String createTable = "CREATE TABLE users(username varchar(30), password varchar(30))";
		return st.execute(createTable);
	}
	
	
	

}
