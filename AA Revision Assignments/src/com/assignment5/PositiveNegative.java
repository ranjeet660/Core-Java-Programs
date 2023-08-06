//write a program to check the number is positive or negative.

package com.assignment5;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int x = scanner.nextInt();
		if(x >= 0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
	}
}
