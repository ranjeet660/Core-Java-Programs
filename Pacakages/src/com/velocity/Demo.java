//package is nothing but it is collection of classess and interfaces that work together
//java.lang is default package.
//also we can create custom package such as com.velocity , com.velocity1
//Advantage-
//	1) Reusability- we can place common code into one folder and reuse it.
//	2) Maintaince - if new employee joined company, it will be easy to find the file which they needed
package com.velocity;

import com.velocity1.Sample;

public class Demo {

	public static void main(String[] args) {
		System.out.println("This is in demo class in com.velocity pakages");
		
		Sample sample = new Sample();
		sample.getStudent();
	}
}
