package com.exception.handling.custom.exception;

public class EmpTest {

	public static void main(String[] args) {
		
		try {
			throw new Employee("Invalid Value");
		}catch(Exception e) {
			e.getStackTrace();
//			System.out.println(e);
			e.getMessage();
		}
	}
}
