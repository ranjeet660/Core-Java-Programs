package com.interview.questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCSteps {

	public static void main(String[] args) throws Exception {
		//1st step:Loading Driver class
		Class.forName("com.mysql.jdbc.Driver");
		//2nd step: Establish 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schemna_name","username","password");
		//3rd step
		PreparedStatement preparedStatement = connection.prepareStatement("Query");
		//4rth step
		preparedStatement.executeUpdate();
		// 5th step
		connection.close();
		preparedStatement.close();
	}
}
