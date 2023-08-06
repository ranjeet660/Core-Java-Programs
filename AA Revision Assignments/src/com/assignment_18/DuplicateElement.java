package com.assignment_18;

public class DuplicateElement {

	public static void main(String[] args) {
		System.out.println("Duplicate elements: ");
		int arr[] = {10,20,30,10, 30,50,60, 40, 50 };
		int len = arr.length;
		for(int i=0; i < len; i++) {
			int temp = 0;
			for(int j = i+1; j < len; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
			
		}
	}
}
