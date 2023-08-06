package com.jdbc.inserting.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataUsingCreateStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		try {
			//Insert query
			String insertQuery = "insert into employee(firstname,lastname,city)values('Shashikant','Maskar','Hydrabad')";
		//Step-1 loading Driver class
			Class.forName("com.mysql.jdbc.Driver");
		//Step-2  Establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
		//Step-3 using createStatement();
			stmt = con.createStatement();
		//step-4   Submit sql statement
			stmt.execute(insertQuery);
			System.out.println("Insertion successfully done...!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		//Step-5   Release and close connections
			con.close();
			stmt.close();
		}
	}
}
