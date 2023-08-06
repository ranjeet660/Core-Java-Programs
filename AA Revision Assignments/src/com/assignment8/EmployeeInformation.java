package com.assignment8;

import java.util.Scanner;

public class EmployeeInformation {

	public void getUserInput() {
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		employee.firstName = scanner.next();
		System.out.println("Enter last name: ");
		employee.lastName = scanner.next();
		System.out.println("Enter city name: ");
		employee.city = scanner.next();
		System.out.println("Enter mobile number: ");
		employee.mobileNumber = scanner.next();
		
		getStudentInformation(employee.firstName, employee.lastName, employee.city, employee.mobileNumber, Employee.country);
	}
	
	private void getStudentInformation(String firstName, String lastName, String city, String mob, String country) {
		System.out.println("First name is: "+ firstName);
		System.out.println("Last name is: "+ lastName);
		System.out.println("City is: "+ city);
		System.out.println("Mobile number is: "+ mob);
		System.out.println("Country is: "+ country);
	}
	
	public static void main(String[] args) {
		EmployeeInformation employeeInformation = new EmployeeInformation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Students");
		int no = scanner.nextInt();
		for(int i = 1 ; i <= no; i++) {
			employeeInformation.getUserInput();
			System.out.println("-------------------");
		}
		
		
	}
}
