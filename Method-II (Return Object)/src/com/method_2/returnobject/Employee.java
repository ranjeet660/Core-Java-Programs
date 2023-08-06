package com.method_2.returnobject;

public class Employee {

//	public int addEmployee() {  //No one use float, int, even void also as return type to method and string also are very rarely used in now days
//		return 10;
//	}
	
	public Employee addEmployee() {  //Most preferable way is return object to method & value from object
		Employee employee = new Employee();
		return employee;
	}
}
