package com.map.hashmap.programming;

import java.util.HashMap;
import java.util.Set;

public class ReturnCustomeEmployee {

	public static void main(String[] args) {
		HashMap<Employee, String> hashMap = new HashMap<Employee,String>();
		Employee employee = new Employee();
		hashMap.put(employee, employee.name); 
		//System.out.println(hashMap.get(employee));
		
		Set<Employee> set = hashMap.keySet();
		for(Employee emp : set) {
			System.out.println("Id "+ emp.getId());
			System.out.println("Employee name: "+hashMap.get(emp));
			
		}
	}
}
