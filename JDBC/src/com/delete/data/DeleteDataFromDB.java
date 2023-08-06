package com.delete.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDataFromDB {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// Step-1 Loading Driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Step-2  Establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			// Step-3  Create/Prepared sql statement
			preparedStatement = connection.prepareStatement("delete from employee where id=?");
			preparedStatement.setInt(1, 5);
			//Step-4	Submit sql statement
			preparedStatement.executeUpdate();
			System.out.println("Deleted..!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
	}
}
