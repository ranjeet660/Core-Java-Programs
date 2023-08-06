//Find prime no from given array
package com.practice;
public class ArrayPrime {
	public static void main(String[] args) {
		int arr[] = {1,3,5,2,4,6,7,9,11,13,5,7};
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
