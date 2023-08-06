package com.arraylist.mapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRemoveList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		
		Set s = list.stream().collect(Collectors.toSet());
//		System.out.println(s);
//		
//		Set set = new HashSet<>(list);
//		System.out.println(set);
		
		s.forEach(a->System.out.println(a));
	}
}
