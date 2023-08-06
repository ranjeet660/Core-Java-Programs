package com.array;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int arr1[] = {1,2,5,6,3,4,9,6,0,5};
		int arr2[] = {1,2,5,6,3,4,5,0,6,9};
		if(arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result =Arrays.equals(arr1, arr2);
			if(result) {
				System.out.println("Arrays are same");
			}else {
				System.out.println("Arrays are not same");
			}
		}else {
			System.out.println("Arrays are different");
		}
	}
}
