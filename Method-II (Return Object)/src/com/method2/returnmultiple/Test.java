package com.method2.returnmultiple;

public class Test {

	
	public Student getStudentData() {
		int id = 1;
		String name = "Ranjeet";
		String city = "Kolhapur";
		return new Student(id, name, city); //return multiple values from object
	}
	
	public static void main(String[] args) {
	
		Test test = new Test();   //create object for calling getStudentData method calling
		Student stud = test.getStudentData();  //call method and store into student stud object
		System.out.println("ID is "+stud.studentId);
		System.out.println("Name is "+stud.studentName);
		System.out.println("City is "+stud.studentCity);
	}
}
