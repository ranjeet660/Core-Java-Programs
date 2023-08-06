//Write the Java program in which create the multiple objects and display the count of number of 
// objects created into class.

package com.assignment9;

public class ObjectCount {
	static int count;
	public ObjectCount(){
		count++;
	}
	
	public static void main(String[] args) {
		ObjectCount objectCount = new ObjectCount();
		ObjectCount objectCount2 = new ObjectCount();
		
		System.out.println("Objects in class: " +count);
	}
}
