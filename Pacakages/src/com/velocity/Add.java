//Scanner is class in java.util package.
//it is used to get the input of primitive type such as int, strings, doubles
//It is easiest way to get the input from user.

package com.velocity;

import java.util.Scanner;

public class Add {
	public int addition(int x, int y) {
		int c = x + y;
		return c;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter x");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println("Enter Y");
		int second = scanner.nextInt();
		
		Add add = new Add();
		int sum = add.addition(first, second);
		System.out.println("Addition is "+ sum);
	}
}
