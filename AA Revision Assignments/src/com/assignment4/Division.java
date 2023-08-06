//Write the java program to design method for division of two number which returns int value to that method 
//and result should be print into main method.

package com.assignment4;

import java.util.Scanner;

public class Division {

	public float getDivision(float a, float b) {
		float c = b / a;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int first = scanner.nextInt();
		System.out.println("Enter Second number: ");
		int second = scanner.nextInt();
		
		Division division = new Division();
		float div = division.getDivision(first, second);
		System.out.println(div);
	}
}
