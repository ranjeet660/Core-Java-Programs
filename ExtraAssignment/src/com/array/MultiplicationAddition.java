package com.array;

public class MultiplicationAddition {

	public static void main(String[] args) {
		int arr[]= {9,2,4,2,5,7,6,4,2};
		int mul=1;
		int sum1=0;
		for(int i = 0 ; i < arr.length; i++) {
			
				mul = mul * arr[i];
				sum1 = sum1 + arr[i];
			
		}
		System.out.println("Multiplication "+mul);
		System.out.println("Addition "+sum1);
	}

}
