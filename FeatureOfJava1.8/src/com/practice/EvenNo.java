package com.practice;

import java.util.Arrays;

public class EvenNo {

	public static void main(String[] args) {
		int arr[] = {1,2,4,7,5,8,98,12,3};
		Arrays.stream(arr).filter(a->a%2==0).forEach(s->System.out.println("Even "+s));
	// It is used to read exsting stream() and return new stream() after transfering data based on given condition	
		
		String str[] = {"jeet","shivraj","rohan"};
		Arrays.stream(str).forEach(x->System.out.println(x.toUpperCase()));

	}
}
// DI is the method used to providing dependencies
// IOC is end result of DI.