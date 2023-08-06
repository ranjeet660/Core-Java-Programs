package com.arraylist.mapp;

import java.util.HashMap;
import java.util.Map;

public class RemovingWord {

	public static void main(String[] args) {
		
		String str = "hello bye hello frd ";
		String s[] = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s1 : s) {
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}else {
				map.put(s1, 1);
			}
		}
		map.entrySet().stream().filter(a->a.getValue() == 1).forEach(x->System.out.println(x.getKey()) );
		
	}
}
