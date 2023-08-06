package com.quiz;


import java.sql.SQLException;

public interface StudentDetail {

	public void getUserInputDetails() throws SQLException;
	Student getStudentDetails() throws SQLException ;
}
