package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CheckStudentId {
	
	public static boolean checkId(int id) {
		DriverConnections dc = new DriverConnections();
		boolean a = false;
		try {
			Connection con = dc.getConnectionDetails();
//			PreparedStatement ps = con.prepareStatement("select student_id from student_details");
			PreparedStatement ps = con.prepareStatement("select id from student_mark where id=?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();			
			while(rs.next()) {
				if(id==rs.getInt(1)) {
					a = true;
					DisplayOld.displayOld(id);
				}
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	public static void main(String[] args) {
		boolean a = checkId(5);
		System.out.println(a);
	}

}
