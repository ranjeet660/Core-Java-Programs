package com.assignment4;
//Write the java program to design method for division of two number which returns int value to that method 
//and result should be print into main method.
public class DivisionEx {

	int division(int b, int a) {
		return (b/a);
	}
	
	static int divisionOne(int z, int y) {
		return (z/y);
	}
	public static void main(String[] args) {
		
		DivisionEx divisionEx=new DivisionEx();		//by using create object
		int result = divisionEx.division(1000, 5);
		System.out.println("Division of two no is : "+ result);
		
		
		int result1 = DivisionEx.divisionOne(55, 11);	//by using class name
		System.out.println("Division of two no is : "+ result1);
	}
}
