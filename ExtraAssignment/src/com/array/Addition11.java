package com.array;

public class Addition11 {

	public static void main(String[] args) {
		
		int arr[] = {2,9,3,4,6,5,7,8};
		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
			for(int j = i + 1; j < arr.length; j++) {
				if( arr[i] + arr[j] == 11) {
					int res = arr[i]  + arr[j];
					System.out.println(arr[i] + " + " + arr[j] + " = " + res );
				}
			}
		}
	}
}
