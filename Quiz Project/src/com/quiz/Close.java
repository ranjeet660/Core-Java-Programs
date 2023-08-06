package com.quiz;

import java.util.Scanner;

public class Close {

	public static void getExit() throws Exception {
		System.out.println("\nGo to home page press Y/N");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			FinalClass finalClass = new FinalClass();
			finalClass.welcomeQuiz();
		}else if(ch == 'N' || ch == 'n'){
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t|          |---------------------|  THANK YOU  |----------------------|	          |");
			System.out.println("  \t|          |--------------|  !...SOFTWARE CLOSED...!  |---------------|	          |");
			System.out.println("  \t|                                                                                 |");
			System.out.println("  \t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.exit(0);
		}
		scanner.close();
	}
}
