package com.polymorphism.overload;

public class Test {

	public static void main(String[] args) {
		StaticBinding staticBinding = new StaticBinding();
		staticBinding.add(10, 20);
		staticBinding.add(15.2, 14.8);
		staticBinding.add(78.6);
		staticBinding.add(50, 7, 94);
		
		Employee employee = new Employee();
		employee.addEmployee("Ranjeet", "Maskar", "Kolhapur");
		employee.addEmployee("Shashikant", "Maskar", "Hyderabad", "XTANL4562");
	}
}
