package com.practice;

public class AsendingArray {

	public static void main(String[] args) {
		int arr[] = {10,20,60,40,80,4,6,3,9,45};
		int len = arr.length;
		for(int i = 0; i < len; i++) {
//			System.out.println(arr[i]);
			int temp = 0;
			for(int j = i + 1; j < len; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k=0; k < len; k++) {
			System.out.print(arr[k]+"  ");
			
		}
		System.out.println("\n");
		//int c = arr.length/2;   // center element
		System.out.println("center no is: "+ arr[0]);   //lowest element
	}
}
