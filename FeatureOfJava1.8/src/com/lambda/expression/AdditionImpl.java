package com.lambda.expression;

public class AdditionImpl{

	public static void main(String[] args) {
		
		Addition addition = (a,b)-> (a + b);
		int sum = addition.Add(10, 50);
		System.out.println(sum);
	}
	
}
