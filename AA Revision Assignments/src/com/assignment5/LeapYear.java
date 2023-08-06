//write a program  to check whether  year is leap year or not. (If else stmt).

package com.assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int x = scanner.nextInt();
		
		if((x % 4 == 0 || x % 400 == 0) && x % 100 != 0) {
			System.out.println(x + " Year is leap");
		}else {
			System.out.println(x + " Year is not leap year");
		}
	}
}
