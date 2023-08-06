package com.practice;

public class Student {

	private int salary;
	private String name;
	
	public Student(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [salary=" + salary + ", name=" + name + "]";
	}
	
	
}
