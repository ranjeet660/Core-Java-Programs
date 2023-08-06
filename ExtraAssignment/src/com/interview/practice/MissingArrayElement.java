package com.interview.practice;

public class MissingArrayElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,6,7,8,10};
		int len = arr.length;
		for(int i = 1; i <= 10; i++) {
			int count = 0;
			for(int j = 0; j < len; j++) {
				if(i == arr[j]) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
	}
}
