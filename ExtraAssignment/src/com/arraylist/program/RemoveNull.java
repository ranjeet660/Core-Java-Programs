package com.arraylist.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class RemoveNull {

	public static void main(String[] args) {
		
		//Remove null
//		List<Integer> list = Arrays.asList(1,2,3,null,null,4,5,null,6,7);
//		List<Integer> list1 = new ArrayList<Integer>();
//		for(Integer i: list) {
//			if(i != null) {
//				list1.add(i);
//			}
//		}
//		list1.forEach(a->System.out.println(a));
		
		
		//0,0,1,1,0,1,1,0,0
//		List<Integer> list = Arrays.asList(0,0,1,1,0,1,1,0,0);
//		List<Integer> list1 = new ArrayList<Integer>();
//		for(Integer i : list) {
//			if(i == 0) {
//				list1.add(i);
//			}
//		}
//		for(Integer i : list) {
//			if(i==1) {
//				list1.add(i);
//			}
//		}
//		list1.forEach(a->System.out.println(a));
		
		List<Integer> list = Arrays.asList(11,24,4,5,7,89,31,5);
		Stream<Integer> s = list.stream().sorted();
		s.forEach(x->System.out.println(x));
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
