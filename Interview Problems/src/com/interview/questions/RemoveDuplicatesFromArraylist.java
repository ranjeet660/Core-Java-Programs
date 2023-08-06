package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromArraylist {

	public static void main(String[] args) {
		List<Integer> arrayList =Arrays.asList(1,11,1,8,5,8,20,30,20,50,70,70);
//		arrayList.add(1);
//		arrayList.add(11);
//		arrayList.add(1);
//		arrayList.add(8);
//		arrayList.add(5);
//		arrayList.add(8);
//		arrayList.add(20);
		System.out.println("Original array "+ arrayList);
		
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : arrayList) {
			if(!list.contains(i)) {
				list.add(i);
			}
		}
		System.out.println("After removing duplicates "+list);
	}
}
