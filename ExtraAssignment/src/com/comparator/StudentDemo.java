package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comparable.Student;

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Ranjeet", "Kolhapur", 75000));
		list.add(new Student(2, "Shivraj", "Tuljapur", 95001));
		list.add(new Student(3, "Jeet", "KOP", 55000));
		list.add(new Student(4, "Jeevan", "Pune", 35000));
		list.add(new Student(5, "Abhi", "Mumbai", 57000));
		
	
		Comparator<Student> l = Comparator.comparing(Student::getSalary);
		Collections.sort(list,Collections.reverseOrder(l));				//ReverseOrder
		Collections.sort(list,l); 										//Ascending order by salary
		list.stream().forEach(x->System.out.println(x));

	}
}
