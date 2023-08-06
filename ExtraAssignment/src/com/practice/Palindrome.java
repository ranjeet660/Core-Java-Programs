package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entr number");
		int num = scanner.nextInt();
		int rev = 0;
		int rem ;
		int temp=num;
		while( num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		if(temp==rev) {
			System.out.println("No is palindrome");
		}
		else {
			System.out.println("No is not palindrome");
		}
	}
}
