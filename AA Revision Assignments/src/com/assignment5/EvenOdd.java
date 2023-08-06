//Write a program to check whether number is even or odd.

package com.assignment5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no: ");
		int x = scanner.nextInt();
		if(x % 2 == 0) {
			System.out.println(x + " no is even");
		}else {
			System.out.println(x + " no is odd");
		}
	}
}
