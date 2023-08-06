package com.array;

import java.util.Arrays;

public class ComArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {1,2,3,5,4,8};
		if(arr.length == arr1.length) {
//			Arrays.sort(arr);
//			Arrays.sort(arr1);
			boolean result = Arrays.equals(arr,arr1);
			System.out.println(result);
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
