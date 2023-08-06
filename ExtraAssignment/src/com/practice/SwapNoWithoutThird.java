package com.practice;

import java.util.Scanner;

public class SwapNoWithoutThird {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int str1 = scanner.nextInt();
		System.out.println("Enter 2st num");
		int str2 = scanner.nextInt();
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = str1 + str2;
		str2 = str1 - str2;
		str1 = str1 - str2;
		System.out.println("After "+str1);
		System.out.println("After "+str2);
	}
}
