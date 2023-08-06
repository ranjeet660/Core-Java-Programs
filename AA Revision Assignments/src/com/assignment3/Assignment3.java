//Design the separate method as String getStudentName (String name) which return student name and print it.

package com.assignment3;

import java.util.Scanner;

public class Assignment3 {

	String getStudentName(String name) {
		return name;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment3 assignment3 = new Assignment3();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println(assignment3.getStudentName(name));
	}
}
