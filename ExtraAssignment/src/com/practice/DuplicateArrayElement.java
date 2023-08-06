package com.practice;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,6,8,5,4,3,1,7};
		for(int i = 0; i < arr.length; i++) {
			int temp = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					temp++;
					System.out.println("duplicate: "+ arr[j]);
				}
			}
			if(temp == 0) {
				System.out.println("After remove: "+arr[i]);
			}
			
		}
		
	}
}
