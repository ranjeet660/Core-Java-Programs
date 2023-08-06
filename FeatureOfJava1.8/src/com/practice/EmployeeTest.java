package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeTest {

	public static List<Employee> getEmp(){
		List<Employee> list  = new ArrayList<Employee>();
		list.add(new Employee(1, "Jeet", 10900));
		list.add(new Employee(1, "Raj", 8000));
		list.add(new Employee(1, "Ranjeet", 50350));
		list.add(new Employee(1, "Amar", 3641));
		return list;
	}
	public static void main(String[] args) {
		List<Employee> l = EmployeeTest.getEmp();
		Optional op = l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(op.get());
		
		Comparator<Employee> c = Comparator.comparing(Employee::getSalary);
		Collections.sort(l,c);
		
		//l.stream().forEach(a->System.out.println(a));
	
	}
}
