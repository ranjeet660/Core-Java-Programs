package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ImplPerticularStudentResult implements ParticularStudentResult{

	@Override
	public void getPerticularStudentResult() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student id");
		int studId = scanner.nextInt();
		
		try {
			DriverConnections dc = new DriverConnections();
			Connection connection = dc.getConnectionDetails();
			
			PreparedStatement ps = connection.prepareStatement("select stud_id,firstname,lastname,email,mobile,mark,grade from student inner join student_mark on student.stud_id=student_mark.id where student.stud_id = ?");
			ps.setInt(1, studId);
			ResultSet resultSet = ps.executeQuery();
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t|     |----------------|  PERTUCULAR STUDENTS RECORDS  |-------------------|	  |");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println();
			System.out.println(" ------------------------------------------------------------------------------------------------------------------------------- ");
			System.out.println("| Sr.No | Quiz Id | Student Name                | Email                               | Mobile No.       | Marks     | Grade    |");
			System.out.println(" ------------------------------------------------------------------------------------------------------------------------------- ");
			int i =1;
			while(resultSet.next()) {
				System.out.println("|   "+i+"   |   "+resultSet.getInt("stud_id")+"     | "+resultSet.getString("firstname")+" " +resultSet.getString("lastname")+"           \t| "+resultSet.getString("email")+"                  | "+resultSet.getString("mobile")+"        | "+resultSet.getString("mark")+"        | "+resultSet.getString("grade")+"        |");
				i++;

				System.out.println(" ------------------------------------------------------------------------------------------------------------------------------- ");
			}
			System.out.println();
			System.out.println("If You want see another student details press (Y/N)");
			String y = scanner.next();
			if(y.equals("Y") || y.equals("y")) {
				getPerticularStudentResult();			//recursion
			}else if(y.equals("N") ||y.equals("n")) {
				FinalClass finalClass = new FinalClass();
				finalClass.welcomeQuiz();
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
