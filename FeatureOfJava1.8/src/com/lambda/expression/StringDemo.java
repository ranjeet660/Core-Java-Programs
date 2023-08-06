package com.lambda.expression;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "Sujit Suraj ranjeet sumit";
		String arr[] = str.split(" ");
		Arrays.stream(arr).filter(a->a.endsWith("t")).forEach(x->System.out.println(x));
	}
}
