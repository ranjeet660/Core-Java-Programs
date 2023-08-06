package com.encapsulation1;

import java.util.Scanner;

public class Test {

	private static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employe Id: ");
		int id = scanner.nextInt();
		System.out.println("Enter Employee name: ");
		String name = scanner.next();
		System.out.println("Enter Employee city: ");
		String city =  scanner.next();
		
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpCity(city);
		
		System.out.println("Employee id: "+ employee.getEmpId());
		System.out.println("Employee name: "+ employee.getEmpName());
		System.out.println("Employee city: "+ employee.getEmpCity());
	}
	public static void main(String[] args) {
		getUserInput();
	}
}
