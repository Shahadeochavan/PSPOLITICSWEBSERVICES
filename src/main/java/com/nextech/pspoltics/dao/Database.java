package com.nextech.pspoltics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
	  public static void main(String[] args) throws Exception {
	        getConnection();
	    }
	public static  Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/pspolitics?useUnicode=true&characterEncoding=utf-8";
			Connection connection = null;
			String driver="com.mysql.jdbc.Driver";
			String username="root";
            String password="root";
			System.out.println("I am in database");
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(connectionURL, username, password);
			return connection;
		} catch (SQLException e)
		{
		throw e;	
		}
		catch (Exception e)
		{
		throw e;	
		}


	}

}