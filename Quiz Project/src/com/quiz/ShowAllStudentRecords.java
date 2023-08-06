package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowAllStudentRecords implements DisplayAllStudentRecords {

	@Override
	public void getAllRecord() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			DriverConnections driverConnections = new DriverConnections();
			connection = driverConnections.getConnectionDetails();
			preparedStatement = connection.prepareStatement("select stud_id,firstname,lastname,email,mobile,mark,grade from student inner join student_mark on student.stud_id=student_mark.id  order by firstname");
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t|     |---------------------|  ALL STUDENTS RECORDS  |----------------------|	  |");
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
			
			Close.getExit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
