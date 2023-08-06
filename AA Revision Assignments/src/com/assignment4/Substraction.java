//Write the java program to design method for substraction of two number which returns int value to that method
//and result should be print into main method.

package com.assignment4;

import java.util.Scanner;

public class Substraction {

	public int getSub(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int first = scanner.nextInt();
		System.out.println("Enter Second number: ");
		int second = scanner.nextInt();
		
		Substraction substraction = new Substraction();
		int sub = substraction.getSub(first, second);
		System.out.println(sub);
	}
}
