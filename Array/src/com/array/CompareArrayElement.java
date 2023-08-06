package com.array;

import java.util.Arrays;

public class CompareArrayElement {

	public static void main(String[] args) {
		int arr1[] = {1,2,5,6,3,4,9,6,0,5};
		int arr2[] = {1,2,5,6,3,4,5,0,6,9};
		int len1 = arr1.length;
		int len2 = arr2.length;
						
		if( len1 == len2) {				//check length if length is not equal then else part executed
						//Sorting array using Arrays.sort()
			Arrays.sort(arr1);				
						//for loop use for print sort array1
//			for(int i = 0; i < len1; i++) {         
//				System.out.print(arr1[i]+" ");
//			}
//			System.out.println("");			//for next line
			Arrays.sort(arr2);
						//for loop use for print sort array2
//			for(int j = 0; j < len1; j++) { 		
//				System.out.print(arr2[j]+" ");
//			}
//			System.out.println("");         //for next line
			boolean result = Arrays.equals(arr1, arr2);
			if(result) {
				System.out.println("Both Array are same");
			}else {
				System.out.println("Both are different");
			}
		}else {
			System.out.println("Given array is different");
		}
		
	}
}
