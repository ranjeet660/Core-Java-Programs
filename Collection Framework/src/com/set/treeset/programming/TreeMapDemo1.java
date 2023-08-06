package com.set.treeset.programming;

import java.util.HashMap;

public class TreeMapDemo1 {

	public HashMap<Integer,String> getMapDemo(){
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(25, "Ram");
		hashMap.put(35, "Jeet");
		hashMap.put(15, "Abhi");
		return hashMap;
	}
	
	public static void main(String[] args) {
		TreeMapDemo1 treeMapDemo1 = new TreeMapDemo1();
		treeMapDemo1.getMapDemo();
	}
}
