package com.arraylist.mapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(42);
		list.add(52);
		list.add(12);
		list.add(29);
		list.add(22);
		list.add(52);
		
		//System.out.println(list);
		
//		for(Integer i : list) {
//			System.out.println(i);
//		}
		Optional<Integer> z =list.stream().min((a,b)->a.compareTo(b));
		System.out.println("Min "+z.get());
		Optional<Integer> x = list.stream().max((a,b)->a.compareTo(b));
		System.out.println("Max No "+x.get());
		
		list.stream().distinct().filter(d -> d%2==0).forEach(a-> System.out.println(a));
		//list.forEach((a)->System.out.println(a));
	}
}
