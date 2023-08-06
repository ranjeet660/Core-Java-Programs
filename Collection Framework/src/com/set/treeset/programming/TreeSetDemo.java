package com.set.treeset.programming;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i = 1; i <= 10; i++) {
			treeSet.add(i);
		}
		System.out.print(treeSet+" ");
		System.out.println(treeSet.descendingSet());
		System.out.println(treeSet.last());
		System.out.println(treeSet.subSet(1, 7));
		System.out.println(treeSet.tailSet(3));
		for(Integer i : treeSet) {
			System.out.print(i+",");
		}
		
		treeSet.forEach(t -> System.out.print(t));
	}
}
