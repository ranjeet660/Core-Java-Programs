package com.arraylist.mapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Ranjeet"));
		list.add(new Student(2, "Suraj"));
		list.add(new Student(3, "Shashi"));
		
		Map<Integer, String> newList = list.stream().collect(Collectors.toMap(Student::getId, Student::getName, (k, v)->k + "," + v, HashMap::new));
		
		newList.forEach((k,v)-> System.out.println(k +"="+v));
		
//		Map<Integer, String> newList = new HashMap<Integer, String>();
//		for(Student stu: list) {
//			System.out.println(stu);
//			newList.put(stu.getId(), stu.getName());
//		}
//		System.out.println(newList);
	}
}
