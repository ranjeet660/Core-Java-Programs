package com.interview.practice;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = {2,4,9,1,3,7,12,7,15,6};
		for(int i = 0 ; i < arr.length; i++) {
			int temp=0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
