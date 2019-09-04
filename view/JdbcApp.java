package com.allstates.training.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/allstates","root","admin");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
			
		st.executeUpdate("update account set balance=60000 where accn=124");
		
		st.executeUpdate("update account set balance=120000 where accn=123");
		con.commit();
		System.out.println("done");
		}catch(Exception e) {
			con.rollback();
			e.printStackTrace();
		}
		
	}

}
