// It name is same as class name is called.
// It is calling automatically when you create object of class.
// It does not return anything even void also.
// two types of constructor
//    Default -----Parameterized constructor

//Default Constructor-
//		It does not accept any argument is called 
package com.velocity;

public class Example {

	String name;
	public Example() {  //constructor 
		name = "Ranjeet";
	}
	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.name);
	}
}


//Note-
//	When you dont write any constructor in class then default constructor will automatically added by JVM at compile time.
//  when you write any constructor in class then default constructor will not added by JVM
//   constructor does not have any return type. If you write any return type then it will treat as method.
// Java constructor can not be abstract, final, static & synchronized