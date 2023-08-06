package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AscendingArray {

	public static void main(String[] args) {
		int arr[] = {5,4,7,6,4,1,3};
//		for(int i = 0; i < arr.length; i++) {
//			int temp = 0;
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		List list = new ArrayList<>();
		for(int i = 0 ;i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
//		Set set = new HashSet();
//		for(int k = 0; k < arr.length; k++) {
//			set.add(arr[k]);
//			
//		}
		//System.out.print(set);
	}
}
