package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentData {

	public List<Student> getStudentDetails(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(21, "Ranjeet", "Kolhapur"));
		list.add(new Student(32, "Abhi", "Satara"));
		list.add(new Student(3, "Suraj", "Pune"));
		list.add(new Student(4, "Jayant", "Mumbai"));
		
		return list;
	}
	
	public static void main(String[] args) {
		StudentData studentData = new StudentData();
		List<Student> lst = studentData.getStudentDetails();
		
		Collections.sort(lst);
		//Sorting ascending by id using comparable
		
		for(Student s: lst){
			System.out.println("id "+ s.getId());
			System.out.println("Name "+ s.getName());
			System.out.println("City "+s.getCity());
		}
		
	}
}
