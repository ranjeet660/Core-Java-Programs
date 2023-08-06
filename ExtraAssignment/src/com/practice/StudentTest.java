package com.practice;

public class StudentTest {

	String name;
	public StudentTest(String name) {
		//super();			//When constructor private it is not allowed
		//this.name = name;
		System.out.println("Heelo " + name);
	}
	public static void main(String[] args) {
		StudentTest studentTest = new StudentTest("Ranjeet");

	}
}
