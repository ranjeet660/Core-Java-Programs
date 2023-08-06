package com.dyanamic.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DyanamicInsertRecord {
	
	public Connection getConnectionDetails() {
		Connection connection = null;
//		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
	private static void getUserInput(String fName, String lName, String city) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			DyanamicInsertRecord dyanamicInsertRecord = new DyanamicInsertRecord();
			connection = dyanamicInsertRecord.getConnectionDetails();
			preparedStatement = connection.prepareStatement("insert into employee(firstname,lastname,city)values(?,?,?)");
			preparedStatement.setString(1, fName);
			preparedStatement.setString(2, lName);
			preparedStatement.setString(3, city);
			
			preparedStatement.execute();
			
			System.out.println("Inserted Successfully...!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
		
	}

	public static void main(String[] args) throws SQLException {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first name>>");
		 String fName = scanner.next();
		 System.out.println("Enter last name>>");
		 String lName = scanner.next();
		 System.out.println("Enter city name>>");
		 String city = scanner.next();
		 getUserInput(fName, lName,city);
	}
	
}
