//Map:
//	1)If u want to represent the group of object as key values pair then we should go for map
//	2)Both Keys and values are objects, Duplicate keys are not allowed but values may be duplicates.
//	3)It is not part of collection becoz they are incompatible.
//	4)List, Set, Queue are collection of similar type of objects but map is collection of key values pairs

//HashMap:
//	1) It is child class of abstractMap class & implements serializable, cloneable, map interface
//	2) It is present into java.util package
//	3) It has stores the values based on keys
//	4) It has 16 size and internally it will be increase the size by double 
//	5) It is unordered it means keys must be unique
//	6) Adding elements in HashMap using put().
//	7) return type of hashMap is Object
//	8) HashMap have null key and null values

// LinkedHashMap:
//	1) It child class of HashMap class and implements map interface.
//	2) LinkedHashMap is hashTable.
//	2) It is same as HashMap but diff is it is ordered it means it maintain the insertion ordered is preserved

//TreeMap:
//	1) It is child class of AbstractMap class
//	2) It is  implements NavigableMap, Serializable, cloneable interface
//	3) Stores values based on keys.
//	4) Keys should be unique
//	5) It is ordered but maintain ascending manner
//	6) TreeMap cant have null key at run time but can have null values because interpreter will not understand
//		how to sort null with other values.

//HashTable:
//	1) It is child class of Dictionary class and implements the map interface
//	2) It is stores values based on keys.
//	3) It is unordered means keys must be unique
//	4) All methods of HashTable are synchronised it menas hashTable object is threads safe
//	5) It cant have null keys and null values. If you try to add null keys/values then you will get error ata runtime but wont get
//		error at compile time
//	6) It is slower than hashMap

//Difference between TreeMap and TreeSet
//					TreeSet														TreeMap
//		1) It is implements the navigible set, set inteface	|		1) It is implements navigibale map , map interface
//		2) It is child class of abstract set class			|		2) Child of Abstract map class
//		3) Heterogeneous objects are not allowed 			|		3) It is stores values based on keys
//		4) Insertion order is not preserved but maintain	|		4) It is ordered but maintain ascending order
//			sorting order ascending order		
//		5) It is used to represent just one element			| 		5) It is used to represent object as key and value pairs
//			in sorted order		


package com.map;

import java.util.HashMap;

public class Theory {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
	}
}
