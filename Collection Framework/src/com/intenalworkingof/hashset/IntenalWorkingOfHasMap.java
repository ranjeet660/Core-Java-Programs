package com.intenalworkingof.hashset;

public class IntenalWorkingOfHasMap {

//	1) In HasMap, hashCode() method and equals() methods are works-
//	2) HashCode() methods are used to create hashcode for every key,
//	3) equals() methods are used to compare whether key is equal or not
//	4) In hasMap, put() methods contain key, value pair object, default capacity has 16 size.
//	5) When we add object into hashMap using put() method then internally first hash(key) method create hashcode of that key, 
//	6) JVM calculate the index for that key by using index= hash & (n-1), after calculate index will create node for that index,
//	7) Node have contain 4 columns used to stores objects, 1st column stores  key, 2nd contain hashcode, 3rd contain actual value,
//		4th contain null 
//	8) Again repeate above flow to put all data, Suppose JVM calculate index for new key and that index is already contain node 
//		then their linked list will created at last column for that new key,and that node store key,hashcode, value for that new key,
//	9) last column of previous node contain address of next node then attach to it
	
}
