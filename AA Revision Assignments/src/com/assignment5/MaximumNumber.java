//write a program to find out maximum number among three number(if else if ladder statement)

package com.assignment5;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int x = scanner.nextInt();
		System.out.println("Enter second no: ");
		int y = scanner.nextInt();
		System.out.println("Enter third no: ");
		int z = scanner.nextInt();
		
		if((x > y) && (x > z)) {
			System.out.println(x + " is greater no");
		}else if ((y > x) && (y > z)) {
			System.out.println(y + " is no greater");
		}else {
			System.out.println(z + " is greater");
		}
	}
}
