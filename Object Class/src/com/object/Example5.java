//toString: It returns the string representation of this object

package com.object;

public class Example5 {

	int empId;
	String empName;
	String city;
	
	
	@Override
	public String toString() {
		return "Example5 [empId=" + empId + ", empName=" + empName + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		Example5 example5 = new Example5();
		example5.empId = 1;
		example5.empName = "Ranjeet";
		example5.city = "Kolhapur";
		
		System.out.println(example5);
		
	}
}
