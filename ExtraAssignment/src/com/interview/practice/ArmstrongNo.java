package com.interview.practice;

public class ArmstrongNo {

	public static void main(String[] args) {
		int num = 153;
		int rem;
		int rev=0;
		int cube = 0;
		int temp = num;
		while(num > 0) {
			rem = num % 10;
			int result = rem * rem * rem;
			rev = rev * 10 + rem;
			num = num/10;
			cube = cube + result;	
		}
		
		if(temp == cube) {
			System.out.println("Armstrong");
		}else {
			System.out.println("NOT");
		}
	}
}
