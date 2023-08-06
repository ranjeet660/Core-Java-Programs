//Set:
//	1) Set is child interface of collection.
//	2) If we want represent group of individual objects as single entity where duplicates are not allowed
//		and insertion order is not preserved then we should go for the set.
//	3) It is present into java.util package
//	4) It has child classes named as HashSet, LinkedHashSet.

//	#HashSet:
//		1) It is child class of abstractSet class and implements serializable, clonable, Set inteface
//		2) It is present in to java.util package
//		3) Duplicates are not allowed but if we trying to write duplicate value then wont get error
//		4) Insertion order is not preserved
//		5) Heterogeneous objects are allowed
//		6) Null insertion is possible.
//		7) Internally, data structure for HashSet is HashTable.
//		8) It is best choice if our frequent operation is search operation

//Constructor:
//	1) HashSet hashSet = new HashSet();
//	2) HashSet hashSet = new HashSet(int initialcapacity);
//	3) HashSet hasSet = new HashSet(Collection c);


//	#LinkedHashSet:
//		1) It is child class of HashSet class & implements serializable, clonable, set inteface
//		2) It is present in java.util package
//		3) Duplicates are not allowed.
//		4) Null insertion is possible
//		5) Heterogeneous objects are possible
//		6) Insertion order is preserved
//		7) It is best choice if you want to develop cache based application where duplicates are not allowed but 
//			insertion order is preserved.

//Difference:
//							HashSet									LinkedHashSet
//		1) Internally data structure for HasSet 	|		1) HashTable + LinkedList
//			id HashTable
//		2) Insertion order is not preserved			|		2) Insertion order is preserved
//		3) It was introduced in 1.2 version			|		3) 1.4 version

//Sorted set:
//	1) It is child interface of Set interface
//	2) If you want to represent group of object to some sorting order and duplicates are not allowed then we should go
//		for sortedSet

//TreeSet:
//	1) Internally data structure for TreeSet is Balanced tree
//	2) It is present in java.util package
//	3) Insertion order is not applicable 
//	4) Insertion order is sorting based on ascending order
//	5) Duplicates are not allowed.
//	6) Heterogeneous object are not allowed, if you write heterogeneous object the you will get error at run time
//		as ClassCastException
//	7) If you are trying to null insertion then you will get run time error as NullPointerException

//Constructor:
//	1) TreeSet treeSet = new TreeSet();
//	2) TreeSet treeSet = new TreeSet(Comparator c);
//	3) TreeSet treeSet = new TreeSet(Collection c);
package com.set;

public class Theory {

}
