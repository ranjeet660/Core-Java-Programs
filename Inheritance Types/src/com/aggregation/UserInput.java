package com.aggregation;

import java.util.Scanner;

public class UserInput {

	private static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int ID= scanner.nextInt();
		System.out.println("Enter employee first name: ");
		String First= scanner.next();
		System.out.println("Enter employee last name: ");
		String Last = scanner.next();
		System.out.println("Enter employee mobile number: ");
		String MOB = scanner.next();
		
		System.out.println("Enter employee address line");
		String addressLine = scanner.next();
		System.out.println("Enter employee city");
		String C = scanner.next();
		System.out.println("Enter employee state");
		String state = scanner.next();
		System.out.println("Enter employee country");
		String country = scanner.next();
		
		//How to set value 
		Employee employee = new Employee();
		employee.setEmpId(ID);
		employee.setFirstName(First);
		employee.setLastName(Last);
		employee.setMobileNumber(MOB);
		
		Address address = new Address();
		address.setAddressLine(addressLine);
		address.setCity(C);
		address.setState(state);
		address.setCountry(country);
		employee.setAddress(address);
		
		//How to get values from object
		System.out.println("Employee id: " + employee.getEmpId());
		System.out.println("Employee first name: "+ employee.getFirstName() );
		System.out.println("Employee last name: "+ employee.getLastName());
		System.out.println("Mobile number is:" + employee.getMobileNumber());
		System.out.println("Employee address line: " + employee.getAddress().getAddressLine());
		System.out.println("Employe city: "+employee.getAddress().getCity());
		System.out.println("Employe state: "+employee.getAddress().getState());
		System.out.println("Employe country: "+employee.getAddress().getCountry());
	}
	public static void main(String[] args) {
		getUserInput();
	}
}
