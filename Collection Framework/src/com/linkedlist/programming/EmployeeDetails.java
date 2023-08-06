package com.linkedlist.programming;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EmployeeDetails {

	public static List<Employee> getEmployeeDetails() {
		List<Employee> list = new LinkedList<Employee>();
		list.add(new Employee("Ranjeet"));
		list.add(new Employee("Sourabh"));
		list.add(new Employee("Jeet"));
		list.add(new Employee("Ranjeet"));
		list.add(new Employee("Jayant"));
		list.add(new Employee("Ranjeet"));
		return list;
	}
	public static void main(String[] args) {
		List<Employee> empList = getEmployeeDetails();
		
		//System.out.println("Employee>> "+ empList);
//		System.out.println("Employee Details: ");
//		for(Employee empLst : empList) {
//			
//			System.out.println("Employee Name>> " + empLst.empName);
//			
//		}	
		
		//For each methods
		//empList.forEach(z -> System.out.println("Employee name " + z));
		
		Set<Employee> hashSet = new HashSet<Employee>(empList);
		//System.out.println("Employee>> "+ hashSet);
		for(Employee emp : hashSet) {
			System.out.println(emp);
		}
	}
}
