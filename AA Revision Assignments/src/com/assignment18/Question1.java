//Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array 
//is missing. You need to provide optimum solution to find the missing number.
//Number can not be repeated in the array.

package com.assignment18;

public class Question1 {

	public static void main(String[] args) {
	
		int arr[] = {2, 3,4,6,7,8,9,10};
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
