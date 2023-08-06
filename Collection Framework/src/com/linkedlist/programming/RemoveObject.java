package com.linkedlist.programming;

import java.util.LinkedList;

public class RemoveObject {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add("Ranjeet");
		linkedList.add(null);
		linkedList.add(30);
		linkedList.add("Maskar");
		linkedList.add("Ranjeet");
		
		System.out.println(linkedList);
		while(linkedList.contains("Ranjeet")) {
			linkedList.remove("Ranjeet");
		}
		System.out.println( linkedList);
	}
}
