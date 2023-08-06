//write a program  to print all even number from 50 to 75.

package com.assignment6;

public class EvenNumbers {

	public static void main(String[] args) {
		int x = 50;
		for( ; x <= 75; x++) {
			if(x % 2 == 0) {
				System.out.println("Even no "+x);
			}
		}
	}
}
