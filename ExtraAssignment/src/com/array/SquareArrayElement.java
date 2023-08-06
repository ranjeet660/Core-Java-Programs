package com.array;

import java.util.HashMap;
import java.util.Map;

public class SquareArrayElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,4};		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : a) {
			if(map.containsValue(i)) {
				continue;
			}else {
				map.put(i , i * i);
			}			
		}
		map.entrySet().stream().forEach(k -> System.out.println(k.getValue()));
		
		
		
//		int res= 1;
//		for(int i = 0; i < a.length; i++) {
//			int x = a[i] ;
//			if(a[i]==4) {
//				continue;
//			}
//			res = x * x;
//			
//			System.out.println(res);
//		}
		
	}
}
