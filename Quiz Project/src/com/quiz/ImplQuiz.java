package com.quiz;

import java.sql.SQLException;
import java.util.Scanner;

public class ImplQuiz extends McqQuestions implements Quiz{

	Scanner scanner = new Scanner(System.in);
		
	@Override
	public void getQuiz() throws SQLException  {
		System.out.println();
		System.out.println("->Rules:-");
		System.out.println("\t1)In test have only 10 MCQ's question.");
		System.out.println("\t2)Each question have 1 mark.");
		System.out.println("\t3)You have 10 minutes only.");
		System.out.println("\t4)Your Answer will be type in A,B,C,D format");
		System.out.println("\t5)All Questions are mandatory");
		System.out.println();
		System.out.println("->Exam has Started: ");
		System.out.println("-------- All the best --------");
		System.out.println();
		getStartQuiz();	
	}
	
	

}
