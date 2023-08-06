package com.array;

public class AddingTwoArrays {

	public static void main(String[] args) {
		
		int arr1[] = { 1,2,3,4,5};   //1st array
		int arr2[] = {6,7,8,9,10};	// 2nd array
		int arr3[] = new int[arr1.length + arr2.length];   //3rd array with addition 1st and 2nd array length
		
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];    //using for loop  place data into index 
		}
		for(int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];
		}
		// print 3rd array
		for(int k = 0 ; k < arr3.length; k++) {
			System.out.print(arr3[k]+ " ");
		}
	}
}
