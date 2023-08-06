package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateCollection {
	private static ArrayList<Integer> removeDuplicateCollection(ArrayList<Integer> arrayList) {
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		for(int data : arrayList) {
			if(!arrayList2.contains(data)) {
				arrayList2.add(data);
			}
		}
		return arrayList2;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,5,8,7,4,5,12,2,4));
		ArrayList<Integer> arr=RemoveDuplicateCollection.removeDuplicateCollection(arrayList);
		System.out.println("After removing duplicate: "+arr);
	}

	
}
