package com.interview.practice;

public class Factors {

	public static void main(String[] args) {
		int num = 10;
		for(int i = 2; i <= num ; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
