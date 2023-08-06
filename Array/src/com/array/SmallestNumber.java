package com.array;

import java.util.Arrays;

public class SmallestNumber {

	public static int[] getSmallest() {
		int arr[] = {1,8,5,3,44,12,2,6,76,5};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Smallest number is "+ arr[0]);
		
		return arr;
	}
	public static void main(String[] args) {
		SmallestNumber.getSmallest();
		//System.out.println("Smallest array element is "+ small);
	}
}
