package com.update.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMultipleRows {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// Step-1 Loading Driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Step-2 establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			// Step-3 Create/ Prepared Statement
			preparedStatement = connection.prepareStatement("update employee set city=?, lastname=? where firstname=? ");
			preparedStatement.setString(1, "Hasur Khurd");
			preparedStatement.setString(2, "Ghugare");
			preparedStatement.setString(3, "Datta");
			// Step-4 Submit Sql statement
			preparedStatement.executeUpdate();			
			System.out.println("Updated...!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// Step-5 Realease code and resources
			connection.close();
			preparedStatement.close();
		}
	}
}
