package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Ranjeet", "Kolhapur", 75000));
		list.add(new Student(2, "Shivraj", "Tuljapur", 95000));
		list.add(new Student(3, "Jeet", "KOP", 55000));
		list.add(new Student(4, "Jeevan", "Pune", 35000));
		list.add(new Student(5, "Abhi", "Mumbai", 57000));
		
		Collections.sort(list);
		list.stream().forEach(x-> System.out.println(x));
	}
}
