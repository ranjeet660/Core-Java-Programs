package com.quiz;

public class Student {

	int id;
	String firstname;
	String lastname;
	String email;
	String mobile;
	int mark;
	public Student() {
		Student student = new Student();
	}
	public Student( String firstname, String lastname, String email, String mobile, int mark) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.mark = mark;
	}
	public Student(String firstname, String lastname, String email, String mobile) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		
	}
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	public int getMark() {
		return mark;
	}
		
	
	
}
