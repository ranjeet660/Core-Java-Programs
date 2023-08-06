package com.method_2.returnobject;

public class Student {

	int studentId = 1;
	String studentName= "Ranjeet";
	String studentCity = "Kolhapur";
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}

	public Student addStudent() {
		Student student = new Student();
		System.out.println(student);  //student.toString()----toString is invisibly present
		return student;   //return object to method and value from object
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.addStudent();
	}
}
