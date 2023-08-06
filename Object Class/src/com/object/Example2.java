//public boolean equals(Object obj)-
//			It compare given object to this object. There are two equal method & this method used to check address of string not content

package com.object;

public class Example2 {
	int empId;
	String empName;
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.empId = 2;
		example2.empName = "Ranjeet";
		
		Example2 example3 = new Example2();
		example3.empId = 3;
		example3.empName = "Jeet";
		
		example2 = example3;  
		System.out.println(example2.equals(example3));
	}
	}
