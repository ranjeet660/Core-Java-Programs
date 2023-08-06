package com.update.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Update single Data Using PreparedStatement()
public class UpdateSingleDataUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// Step-1 Loading Driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Step-2  Establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			//Strep-3  Prepare Sql statement/Create Sql statement
			preparedStatement = connection.prepareStatement("update student set lastname=? where id= ?");
			preparedStatement.setString(1, "Patil");
			preparedStatement.setInt(2, 4);
			
			//Step 4 submit sql statement
			preparedStatement.executeUpdate();
			System.out.println("Updated...!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//Step 5 release sql statement
			connection.close();
			preparedStatement.close();
		}
	}
}
