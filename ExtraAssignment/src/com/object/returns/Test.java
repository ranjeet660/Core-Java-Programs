package com.object.returns;

public class Test {

	public Student getDetails() {
		int id = 2;
		String name = "Ranjeet";
		String city = "Kolhapur";
		
		return new Student(id, name, city);
		
	}
	public static void main(String[] args) {
		
		Test test = new Test();
		Student stud = test.getDetails();
		System.out.println("Student name is: "+ stud.id);
		System.out.println(stud.name);
		System.out.println(stud.city);
	}
}
