package com.interview.practice;

public class PrimeNo {

	public static void main(String[] args) {
		//int num = 7;
		for (int i = 1; i <= 7; i++) {
			int count = 0;
			for(int j = 2 ; j < i; j++) {
				if( i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
	}
}
