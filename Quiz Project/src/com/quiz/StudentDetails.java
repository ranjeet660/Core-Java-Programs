package com.quiz;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails extends McqQuestions implements StudentDetail{

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public Student getStudentDetails() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Details: ");
			String firstName="";
			String lastName="";
			String email="";
			String mobile="";
			System.out.println("Enter first name: ");
			firstName = scanner.next();
			while(firstName.equals(null)) {
				firstName = scanner.next();
			}
			System.out.println("Enter last name: ");
			lastName = scanner.next();
			while(lastName.equals(null)) {
				lastName = scanner.next();
			}
			System.out.println("Enter email: ");
			email = scanner.next();
			while(email.equals(null)) {
				email = scanner.next();
			}
			System.out.println("Enter mobile number: ");
			mobile = scanner.next();
			while(mobile.equals(null)) {
				mobile = scanner.next();
			}
			return new Student(firstName, lastName, email, mobile);	
	}

	@Override
	public	void getUserInputDetails() throws SQLException {
		Student student = getStudentDetails();			
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(student.getFirstname(), student.getLastname(), student.getEmail(), student.getMobile()));
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			DriverConnections driverConnections = new DriverConnections();
			connection = driverConnections.getConnectionDetails();			
		//Inserting records in db
			preparedStatement = connection.prepareStatement("insert into student(firstname,lastname, email, mobile)"
									+ "values(?,?,?,?)");
			for(Student s : studentList) {
				preparedStatement.setString(1, s.getFirstname());
				preparedStatement.setString(2, s.getLastname());
				preparedStatement.setString(3, s.getEmail());
				preparedStatement.setString(4, s.getMobile());
			}
			//Query for addedd records in db
			preparedStatement.executeUpdate();
			
			System.out.println("Registration is successfull...!");
			int getId = GetId.getStudentId();
			System.out.println("->Your Quiz Id: "+ getId);			//Here id will generate and show
						
			System.out.println("->Continue for exam Enter your above Quiz Id: ");
			int checkId = scanner.nextInt();
			boolean allow = CheckStudentId.checkId(checkId);
			if(allow == false) {
				ImplQuiz implQuiz = new ImplQuiz();
				implQuiz.getQuiz();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			connection.close();
			preparedStatement.close();
		}
		
	}

}	
	
