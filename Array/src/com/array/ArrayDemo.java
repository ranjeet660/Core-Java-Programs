//Array is collection of similar types of data which has contiguous memory location.
// Java array is an object which contains similar type of element/data.
// We can store only fixed set of elements in java array.
//array in Java is based on indexed array
//Advantages:
//	1) Code optimized: It makes a code optimized, we can retrieve and sort data efficiently.
//	2) Random access: We can fetch/ get the specific data based on index position.

//Disadvantage:
//	We can store only fixed set of element in array , we cant change size of array once it is defined
package com.array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]= new int [5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
