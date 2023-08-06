package com.array;

public class Highest2nd {

	public static void main(String[] args) {
		int arr[] = {1,74,8,46,45,3,15,2,66};
		
		int max = arr[0];
		int max1 = arr[1];
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > max) {
				max1 = max;
				max = arr[i];
			}else {
				if(arr[i] > max1 && max!= arr[i]) {
					max1 = arr[i];
				}
			}
		}
		System.out.println(max1);
	}
}
