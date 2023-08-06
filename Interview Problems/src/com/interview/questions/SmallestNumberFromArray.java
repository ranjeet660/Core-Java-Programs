package com.interview.questions;

import java.util.Arrays;

public class SmallestNumberFromArray {
	public static void main(String[] args){
		int arr[] = {-20, 34, 21, -87, 92};
		int len = arr.length;
											//without using sort() method
//		for(int i = 0; i < len; i++){
//			int temp = 0;
//			for(int j = i + 1; j < len; j++){
//				if(arr[i] > arr[j]){
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for(int k = 0; k < len; k++){
//			System.out.println(arr[k]);
//		}
//		System.out.println("Smallest no " + arr[0]);
							
										//By using in built methods(Arrays.sort())
		Arrays.sort(arr);
		for(int i= 0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Smallest no " + arr[0]);
	}
}
