package com.linkedlist.programming;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add("Ranjeet");
		linkedList.add(null);
		linkedList.add(30);
		linkedList.add("Maskar");
		
		System.out.println(linkedList);
		linkedList.addFirst(50);
		linkedList.addLast(90);
		System.out.println(linkedList);
		
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove("Maskar");
		System.out.println(linkedList);
	}
}
