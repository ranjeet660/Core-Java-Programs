//Write the program to check whether the no is greater than 100.

package com.assignment5;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no: ");
		int x = scanner.nextInt();
		if ( x > 100) {
			System.out.println(x + " no is greater than 100");
		}else {
			System.out.println(x + " ni is less than 100");
		}
		
	}
}
