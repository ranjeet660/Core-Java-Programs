package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import java.util.Scanner;

public class McqQuestions extends SuffelData{

	public static int mark;
	Scanner scanner = new Scanner(System.in);
	
	 public void getStartQuiz() throws SQLException {		 
		 Connection connection = null;
		 PreparedStatement preparedStatement = null;		 
		 try {
			 DriverConnections driverConnections = new DriverConnections();
			 connection = driverConnections.getConnectionDetails();

			 List<Integer> ansArr = getSuffelData();
			 for(int i = 0; i <10;i++) {
			
				 preparedStatement = connection.prepareStatement("select * from question_set where question_id=?");
				 preparedStatement.setInt(1,ansArr.get(i));
				 ResultSet resultSet = preparedStatement.executeQuery();		
				 while(resultSet.next()) {
					 //int id = resultSet.getInt(1);
					 String question = resultSet.getString("question");		//column number from db
					 String a = resultSet.getString("a");
					 String b = resultSet.getString("b");
					 String c = resultSet.getString("c");
					 String d = resultSet.getString("d");
					 String correct_answer = resultSet.getString("correct_answer");
					 
					 //System.out.print("Que:"+ resultSet.getInt(id));
					 System.out.println((i+1)+"."+question);
			
					 System.out.println("\ta) "+a);
					 System.out.println("\tb) "+b);
					 System.out.println("\tc) "+c);
					 System.out.println("\td) "+d);	
				
					 System.out.println("Enter your answer");
					 String ans = scanner.nextLine();
					 System.out.println("Your ans>>" + ans);
				
					 if(correct_answer.equalsIgnoreCase(ans)) {
						 System.out.println("Your ans>> " + ans +" is correct");
						 mark++;
					 }else {
						 System.out.println("Your ans>> " + ans +" is wrong");
					 }
					  
					 System.out.println("---------------------------------------");
				 }
				
			 }
			 String grade = GetId.getGrade(mark);
			 
			 try {
			
				 PreparedStatement ps1 = connection.prepareStatement("insert into student_mark(mark,grade)values(?,?)");
				 ps1.setInt(1, mark);
				 ps1.setString(2, grade);
				 ps1.executeUpdate();
			
				 System.out.println("Exam has ended...!");
				 System.out.println("You result: ");					
				 int getId = GetId.getStudentId();
				 System.out.println("Your Id: "+ getId);	
				 System.out.println("Quiz Marks: "+ mark);
				 System.out.println("Grade: "+GetId.getGrade(mark));
			
				 //GetId.getGrade(mark);

				 mark=0;
			
				 	System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
					System.out.println("  \t|                                                                                 |");
					System.out.println("  \t|          |---------------------|  THANK YOU  |----------------------|	          |");
					System.out.println("  \t|          |--------------|  !...QUIZ HAS CLOSED...!  |---------------|	          |");
					System.out.println("  \t|                                                                                 |");
					System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) { 
			e.printStackTrace();
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
	 }
	 
}
