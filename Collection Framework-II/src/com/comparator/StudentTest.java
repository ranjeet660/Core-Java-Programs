package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(6, "Jayant", 4500, "Kolapur"));
		arrayList.add(new Student(16, "Manish", 8500, "Mumbai"));
		arrayList.add(new Student(66, "Chetan", 1400, "Aurangabad"));
		arrayList.add(new Student(86, "Sourabh", 2500, "Pune"));
		arrayList.add(new Student(26, "Balu", 900, "Nagpur"));
	
	//Sort based on Student Name:
		Collections.sort(arrayList, new NameComparator());
		
	//Sort based on Student City:
		//Collections.sort(arrayList, new CityComparator());
		
	//Sort based on Student Id:
		//Collections.sort(arrayList, new IdComparator());
		for(Student student : arrayList) {
			System.out.println("Student id>>"+student.studentId);
			System.out.println("Student Name>>"+ student.studentName);
			System.out.println("Salary>>"+ student.studentSalary);
			System.out.println("City>>"+ student.city);
		}
	}
}
