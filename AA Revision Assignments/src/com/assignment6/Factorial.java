//Design method int factorial(int no)which returns int value to that method. print  results into main method
//(Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

package com.assignment6;

import java.util.Scanner;

public class Factorial {

	int fact = 1;
	int factorial(int no) {
		for(int i = no; i > 0  ; i--) {
			fact = fact * i;
//			System.out.println(fact);
		}
		System.out.println("Factorial of given no: "+fact);
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no");
		int factorial = scanner.nextInt(); 
		Factorial fact = new Factorial();
	    fact.factorial(factorial);
		
	}
}
