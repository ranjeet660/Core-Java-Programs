package com.assignment_20;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public List<Employee> getEmployeeDetails(){
		List<Employee> list = new ArrayList();
		list.add(new Employee(1, "Ranjeet", "Kolhapur"));
		list.add(new Employee(2, "Sourabh", "Pune"));
		return list;
	}
	
	public static void main(String[] args) {
		EmployeeTest employeeTest = new EmployeeTest();
		List<Employee> lst= employeeTest.getEmployeeDetails();
		System.out.println("Employee data"+ lst);
	}
}
