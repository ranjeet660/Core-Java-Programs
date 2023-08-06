//Write a java program to display the Fibonacci series up to given number. 
//(Fibonacci series mean next number is the sum of previous two numbers 
//for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).


package com.assignment10;

import java.util.Scanner;

public class Fibonacci {

	public void getFibo(int num) {
		int a = 0;
		int b = 1;
		int sum;
		System.out.println(a);
		System.out.println(b);
		int i = 1;
		while(i < num-1) {
			sum = a + b;
			System.out.println(sum);
			i++;
			a = b;
			b = sum;
			sum = a;			
		}
//		for (int i = 1; i < num-1; i++){
//			int sum = a + b;
//			System.out.println(sum);
//			a = b;
//			b = sum;
//			sum = a;
//		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int no = scanner.nextInt();
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.getFibo(no);
	}
}
