//Object class is parent class of all classes in java.
//It is also called as topmost class of java which is predefined in java.lang package
//every class of java is directly or indirectly derived from object class in java. If class does not extends with another class then that class is direct child class of object class

//getClass() :- It is used to get metadata of class such as classname and package name
package com.object;

public class Example {

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.getClass().getName());  //package name
		System.out.println(example.getClass().getSimpleName());  //class name
	}
}
