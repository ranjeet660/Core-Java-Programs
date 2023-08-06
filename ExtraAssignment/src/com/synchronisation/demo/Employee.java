package com.synchronisation.demo;

public class Employee {

	int salary = 5000;
	
	public int getSalary() {
		return salary;
	}
	
	public int getWithdraw(int amount) {
		salary = salary - amount;
		return salary;
	}
}
