package com.comparator;

public class Student {

	int studentId;
	String studentName;
	int studentSalary;
	String city;
	
	public Student(int studentId, String studentName, int studentSalary, String city) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSalary = studentSalary;
		this.city = city;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentSalary() {
		return studentSalary;
	}
	public void setStudentSalary(int studentSalary) {
		this.studentSalary = studentSalary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
