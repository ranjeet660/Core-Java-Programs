package com.array;

import java.util.Arrays;

public class HighestSecond {

	public static void main(String[] args) {
		int arr[] = {1,2,5,4,7,41,6,54,5,7};
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-2]);
		
		
//		for(int i = 0; i < arr.length; i++) {
//			int temp = 0;			
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					temp = arr[i];
//					arr[i] =arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println("Second highest: "+arr[1]);
	}
}
