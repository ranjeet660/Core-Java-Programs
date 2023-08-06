package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnections {

	public Connection getConnectionDetails() throws SQLException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz?verifyServerCertificate=false&useSSL=true", "root", "Ranjeet@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
