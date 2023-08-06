// It is binding data in single entity called as Encapsulation
//Rule : 
//		Declare global variable as private and access them by using public method

package com.encapsulation;

public class Employee {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int sal) {
		if (sal > 0) {
			salary = sal;
		}else {
			salary=0;
		}
	}
	
	
}
