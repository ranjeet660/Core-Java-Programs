package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(5, "Ranjeet", 5050));
		arrayList.add(new Employee(45, "Jeet", 4950));
		arrayList.add(new Employee(35, "Abhijeet", 1210));
		arrayList.add(new Employee(85, "Karan", 6971));
		arrayList.add(new Employee(55, "Payal", 3597));
		
		Collections.sort(arrayList);
		
		for(Employee emp: arrayList) {
			System.out.println("ID>>"+ emp.empId);
			System.out.println("Name>>"+ emp.empName);
			System.out.println("Salary>>"+ emp.salary);
		}
	}
}
