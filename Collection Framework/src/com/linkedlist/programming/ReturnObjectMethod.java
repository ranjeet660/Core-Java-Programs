package com.linkedlist.programming;

import java.util.Iterator;
import java.util.LinkedList;



public class ReturnObjectMethod {

	public LinkedList getLinkedList() {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(5);
		linkedList.add("Ranjeet");
		return linkedList;
	}
	public static void main(String[] args) {
		ReturnObjectMethod returnObjectMethod = new ReturnObjectMethod();
		LinkedList list = returnObjectMethod.getLinkedList();
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
