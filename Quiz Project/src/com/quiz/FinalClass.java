package com.quiz;

import java.util.Scanner;

public class FinalClass {

	public void welcomeQuiz() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("|                                                                                 |");
		System.out.println("|         |---------------------|  WELCOME TO QUIZ  |----------------------|	  |");
		System.out.println("|                                                                                 |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Enter your choice: ");
		System.out.println("\t1:New Student Registration & Give the quiz.");
		System.out.println("\t2:Show perticular Student result.");
		System.out.println("\t3:Display All students records.");
		System.out.println("\t4:Close Quiz.");
		System.out.println("\nSelect any one option from above & Enter your response here:");
		int num = scanner.nextInt();
		
		getChoice(num);
		scanner.close();
	}
	public void getChoice(int num) throws Exception  {
		int n = num;
		switch (n) {
		case 1:
			StudentDetails studentDetails = new StudentDetails();
			studentDetails.getUserInputDetails();
			break;
		case 2:
			ImplPerticularStudentResult implPerticularStudentResult = new ImplPerticularStudentResult();
			implPerticularStudentResult.getPerticularStudentResult();
			break;
		case 3:
			ShowAllStudentRecords showAllStudentRecords = new ShowAllStudentRecords();
			showAllStudentRecords.getAllRecord();
			break;
		case 4:
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t|          |---------------------|  THANK YOU  |----------------------|	          |");
			System.out.println("  \t|          |--------------|  !...SOFTWARE CLOSED...!  |---------------|	          |");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) throws Exception {
		FinalClass finalClass = new FinalClass();
		finalClass.welcomeQuiz();
		
	}
}
