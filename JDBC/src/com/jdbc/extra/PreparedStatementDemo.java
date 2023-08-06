package com.jdbc.extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "Ranjeet@123");
			preparedStatement = connection.prepareStatement("insert into student1(name,city,mob)values(?,?,?)");
			preparedStatement.setString(1, "RanJeet");
			preparedStatement.setString(2, "Kolhapur");
			preparedStatement.setString(3, "9158152660");
			
			preparedStatement.execute();
			System.out.println("Insertion data Successfull...!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
	}
}
