package com.practice;

public class OneToNumber {

	public static void getNumber(int a) {
		if(a <= 10) {
			System.out.println(a);
			getNumber(a+=1);		//a = a + 1;
		}
	}
	public static void main(String[] args) {
		int i = 1;
		getNumber(i);
	}
}
