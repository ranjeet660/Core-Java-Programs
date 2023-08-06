package com.select.fetch.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectDataFromDB {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			//Step 1	Loading Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step-2	Establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			
			//Step-3	Prepared sql statement
			preparedStatement = connection.prepareStatement("select * from employee");			//Show all record
			//preparedStatement = connection.prepareStatement("select firstname,city from employee where id=1");
//			preparedStatement.setString(1, "Hasur Khurd");		//it is allow
			
			//Step-4	get/fetch/select data from databse
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println("ID>>"+resultSet.getInt(1));				// or resultSet.getInt("id");
				System.out.println("Firstname>>"+resultSet.getString(2));	// or resultSet.getInt("firstname");
				System.out.println("Lastname>>"+resultSet.getString(3));	// or resultSet.getInt("lastname");
				System.out.println("City>>"+ resultSet.getString(4));		// or resultSet.getInt("city");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//Step 5 	release resources
			connection.close();
			preparedStatement.close();
		}
	}
}
