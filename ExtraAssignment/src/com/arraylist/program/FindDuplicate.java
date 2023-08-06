package com.arraylist.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(30);
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(Integer i : list) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		map.entrySet().stream().filter(a->a.getValue() == 1).forEach(z->System.out.println(z.getKey()));
		
		
		
	}
}
