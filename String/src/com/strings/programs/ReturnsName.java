package com.strings.programs;

public class ReturnsName {

	public String getStudentName(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		ReturnsName returnsName = new ReturnsName();
		String name = returnsName.getStudentName("Jeet Maskar");
		System.out.println(name);
	}
}
