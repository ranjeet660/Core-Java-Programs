package com.method2.returnsingle;

public class Test {

	public static Employee getEmployeeId() {		  //static method
		int id = 20;
		return new Employee(id); 
	}
	
	public static void main(String[] args) {
		Employee employee = getEmployeeId();  //calling method by direct method name and store into employee object
		System.out.println(employee.id);
	}
}
