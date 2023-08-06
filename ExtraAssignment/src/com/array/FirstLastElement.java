package com.array;

public class FirstLastElement {

	public static void main(String[] args) {
		int arr[]= {94,2,4,2,5,97,6,4,2};
		for(int i = 0 ; i < arr.length; i++) {
			int temp=0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]  = temp;
				}
			}
		}
//		for(int k = 0; k < arr.length; k++) {
//			System.out.println(arr[k]);
//		}
		System.out.println(arr[1]);
	}
}
