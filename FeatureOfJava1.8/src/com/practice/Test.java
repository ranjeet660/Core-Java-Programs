package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

	public static List<Student> getList(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(20000, "Rohan"));
		list.add(new Student(10000, "Shivraj"));
		list.add(new Student(30000, "Raj"));
		list.add(new Student(2000, "Jeet"));
		return list;
	}
	
	public static void main(String[] args) {
		List<Student> s = getList();
		Optional<Student> o = s.stream().sorted(Comparator.comparing(Student::getSalary).reversed()).skip(1).findFirst();
		System.out.println(o.get());
		Comparator<Student> s1 = Comparator.comparing(Student::getSalary).reversed();
		Collections.sort(s, s1);
		s.stream().forEach(a->System.out.println(a));
	}
}
