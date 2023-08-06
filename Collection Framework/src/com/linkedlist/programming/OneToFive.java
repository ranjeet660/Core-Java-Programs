package com.linkedlist.programming;

import java.util.LinkedList;

public class OneToFive {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for(int i = 1 ; i <= 10; i++) {
			linkedList.add(i);
		}
		System.out.println(linkedList);
	}
}
