//Suppose you have array that containing elements 10,20,30,10, 30,50,60 Find out duplicate elements 
//into array and print it.

package com.assignment18;

public class Question2 {

	public static void main(String[] args) {
		int arr[] = { 10,20,30,10,30,50,60 };
		int len = arr.length;
		System.out.println("Duplicate values");
		for(int i = 0; i < len; i++) {
			
			for(int j = i + 1; j < len; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
