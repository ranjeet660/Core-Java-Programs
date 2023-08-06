// Write the java program to design method for addition of two number which returns int results to that method
// and result should be print into main method.

package com.assignment4;

import java.util.Scanner;

public class Addition {

	public int getAddition(int a, int b) {
		int c = a +b;
		return c;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int first = scanner.nextInt();
		System.out.println("Enter Second number: ");
		int second = scanner.nextInt();
		
		Addition addition = new Addition();
		int add = addition.getAddition(first, second);
		System.out.println("Addition is: "+add);
	}
}
