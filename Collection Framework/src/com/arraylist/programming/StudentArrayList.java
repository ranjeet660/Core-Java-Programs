package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList{

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(21, "Ranjeet", "Kolhapur"));
		arrayList.add(new Student(32, "Abhi", "Satara"));
		arrayList.add(new Student(3, "Suraj", "Pune"));
		arrayList.add(new Student(4, "Jayant", "Mumbai"));
		
		
		//Sort data by Name using comaparator 
		Collections.sort(arrayList, new StudentNameComparator());
		
		for(Student stu : arrayList) {
			//System.out.println(stu);   //This is not good approch
			//Below approch is good
			System.out.println("Id>> "+ stu.getId());
			System.out.println("Name>> "+ stu.getName());
			System.out.println("City>> "+ stu.getCity());
		}
	}
}
