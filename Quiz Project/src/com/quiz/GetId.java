package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetId{

	static DriverConnections dc = new DriverConnections();
	public static int getStudentId() throws SQLException {
	
		int getId=0;
			Connection con = dc.getConnectionDetails();			
			//PreparedStatement ps = con.prepareStatement("select student_id from Student_details");  
			PreparedStatement ps = con.prepareStatement("select stud_id from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				getId = rs.getInt(1);
			}
		return getId;
	}
	
	public static String getGrade(int mark) {
		String grade="";
		if(mark > 8 && mark <=10) {
			grade = "A";
		}else if(mark >= 6 && mark <=8) {
			grade = "B";
		}else if(mark == 5) {
			grade = "C";
		}else if(mark >=0 && mark < 5) {
			grade = "D";
		}
		return grade;
	}
//	
//	public static void main(String[] args) {
//		String g =getGrade(10);
//		System.out.println(g);
//	}
}
