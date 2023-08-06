package com.interview.questions;

public class RemoveDuplicate {

	public static void main(String...xyz) {
		int arr[] = {1,2,3,4,5,6,2,3,4,5,6,2};
		for(int i = 0 ; i < arr.length; i++) {
			int temp = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					temp++;
				}
			}
			if(temp == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

