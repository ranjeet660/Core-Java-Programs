package com.intenalworkingof.hashset;

public class IntenalWorkOfHashSet {

//	1) In hashSet duplicate objects are not allowed, when we add duplicates objects into hashSet then it will return false.
//	2) How it is return false?
//	3) When we create a object of hashSet, it will create object of hashMap, We know duplicate keys are not allowed in hashMap,
//		keys are unique, Internally hashSet constructor contain hashMap object such as 
//			public HashSet(){
//				map = new HashMap();
//			}
//	4) when we add object into hashSet using add() then internally it will return true/false by using map.put(k,v),
//		our object/elements are considered as keys in hashMap, 
//	5) Implementation of add() method
//		public boolean add(E e){
//			return map.put(e,PRESENT)==null;
//		}
//	6) if our key is unique or not duplicated then map.put() methods return null to add() and add() return true then will object added
//	7) if our key is not unique or it is duplicated then map.put methods return old value of key to add() then it return to false.
	
}
