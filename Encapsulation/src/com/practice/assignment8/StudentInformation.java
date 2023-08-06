package com.practice.assignment8;

import java.util.Scanner;

public class StudentInformation {

	private static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name");
		String first = scanner.next();
		System.out.println("Enter last name");
		String last = scanner.next();
		System.out.println("Enter city name");
		String citty = scanner.next();
		System.out.println("Enter Mobile number");
		long num = scanner.nextLong();
		System.out.println("Enter Country name");
		String contry = scanner.next();
		
		Student student = new Student();
		student.setFirstName(first);
		student.setLastName(last);
		student.setCity(citty);
		student.setMobileNum(num);
		student.setCountry(contry);
		
		System.out.println("Student first name: "+ student.getFirstName());
		System.out.println("Student last name: "+student.getLastName());
		System.out.println("Student city: "+student.getCity());
		System.out.println("Student Mobile number: "+student.getMobileNum());
		System.out.println("Student country is: "+ student.getCountry());
	}
	public static void main(String[] args) {
		getUserInput();
	}
}
