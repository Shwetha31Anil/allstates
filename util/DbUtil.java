package com.allstates.training.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private static Connection con=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/allstates","root","admin");
		}catch(Exception e) {
			System.out.println("db connection problem");
		}
		return con;
	}

}
