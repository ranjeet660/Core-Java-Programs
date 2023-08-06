package com.arraylist.mapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateShowUnion {

	private static void getUnion(int[] arr, int[] arr1) {
		Set<Integer> set = new HashSet<>();
		//List<Integer> set = new ArrayList<>();
		for(Integer i : arr) {
			set.add(i);	
		}
		for(int j : arr1) {
			set.add(j);
		}
		System.out.println(set);
		set.stream().forEach(x-> System.out.println(x));
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,6,7,1,2};
		int arr1[] = {4,5,7,6,9,10,11,1};
		getUnion(arr, arr1);
	}

	
}
