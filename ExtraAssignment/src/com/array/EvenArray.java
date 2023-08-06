package com.array;

public class EvenArray {

	public static void main(String[] args) {
		int arr[]= {9,2,4,2,5,7,6,4,2};
		for(int i = 0 ; i < arr.length; i++) {
			int temp=0;
			for(int j = 2; j < i; j++) {
				if(arr[i] % j ==0) {
					temp++;
				}
			}
			if(temp == 0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
