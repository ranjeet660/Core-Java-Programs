package com.arraylist.mapp;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayElement {

	public static void getCommon(int arr[], int arr1[]) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr) {		//for each loop
			list.add(i);
		}
		for(int i = 0 ; i < arr1.length; i++) {			//for loop
			if(list.contains(arr1[i])) {
				System.out.println(arr1[i]);
			}
		}
	}  
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,6,7,1,2};
		int arr1[] = {4,5,7,6,9,10,11,1};
		getCommon(arr, arr1);
	}
}
