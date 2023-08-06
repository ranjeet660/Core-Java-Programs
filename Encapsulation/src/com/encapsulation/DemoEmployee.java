package com.encapsulation;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(8000);
		System.out.println("Employee salary is: " + employee.getSalary());
	}
}
