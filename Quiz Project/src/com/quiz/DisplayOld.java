package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplayOld {

	
	public static void displayOld(int id){
		Scanner scanner = new Scanner(System.in);
		DriverConnections dc = new DriverConnections();
		try {
		   Connection con =	dc.getConnectionDetails();;
			//PreparedStatement ps=con.prepareStatement("select student_id,student_firstname,student_lastname,student_mark from student_details where student_id =?");
		   PreparedStatement ps=con.prepareStatement("select stud_id,firstname,lastname,mark from student inner join student_mark on student.stud_id=student_mark.id where student.stud_id = ?");
			ps.setInt(1, id);
//			ps.setInt(2, id);
			
			ResultSet rs1 = ps.executeQuery();
			while(rs1.next()) {
				System.out.println("Student Id>>"+ rs1.getInt("stud_id"));
				System.out.println("Student Name: "+rs1.getString("firstname")+" "+rs1.getString("lastname"));
				System.out.println("You have got "+ rs1.getInt("mark")+ " marks out of 10");
				System.out.println("You have already apperared for exam, You can't give this exam again for same Id");
				System.out.println("To reappear for please create new Id or register again new Id");
			}
			System.out.println();
					System.out.println("Note:- *-You should enter your generated above Id-*");
					System.out.println("Enter your Id: ");
					int checkId = scanner.nextInt();
					
					boolean allow = CheckStudentId.checkId(checkId);
					if(allow == false) {
						ImplQuiz implQuiz = new ImplQuiz();
						implQuiz.getQuiz();						
					}
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
