package com.jdbc.inserting.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PreparedStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
			java.sql.PreparedStatement stmt = con.prepareStatement("insert into employee(firstname,lastname,city)values(?,?,?)");
			stmt.setString(1, "Rajan");
			stmt.setString(2, "Hande");
			stmt.setString(3, "Gargoti");
			stmt.execute();
			
			System.out.println("Insertion data successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
