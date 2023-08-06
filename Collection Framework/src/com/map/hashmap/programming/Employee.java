package com.map.hashmap.programming;

public class Employee {

	int id=12;
	String name="Jeet";
	String salary = "50000";
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
