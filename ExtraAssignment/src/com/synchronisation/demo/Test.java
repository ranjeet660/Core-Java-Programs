package com.synchronisation.demo;

public class Test {

	public static void main(String[] args) {
		EmployeeData employeeData = new EmployeeData();
		Thread thread1 = new Thread(employeeData);
		Thread thread2 = new Thread(employeeData);
		thread1.setName("Suraj");
		thread2.setName("Abhi");
		thread1.start();
		thread2.start();
	}
}
