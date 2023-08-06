//Write Java program to check whether number is prime or not. (Prime means  a number which is divisible by 
//only two numbers: 1 and itself.So,if any number is divisible by any other number, it is not a prime number.)

package com.assignment10;

import java.util.Scanner;

public class PrimeNo {

	public void getPrime(int num) {
		
		for(int i = 0; i<= num; i++) {
			int count = 0;
			for(int j= 2; j < i; j++) {
				if(i % j == 0) {
					count = count +1;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}else {
				count = 0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int no = scanner.nextInt();
		PrimeNo primeNo = new PrimeNo();
		primeNo.getPrime(no);
	}
}
