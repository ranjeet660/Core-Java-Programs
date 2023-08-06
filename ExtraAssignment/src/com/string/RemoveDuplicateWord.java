package com.string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String str = "hello bye hello frd ";
		String s[] = str.split(" ");
		//Arrays.stream(s).distinct().forEach(a->System.out.println(a));
		Map<String, Integer> map = new HashMap<>();
		for(String str1 : s) {
			if(map.containsKey(str1)) {
				map.put(str1, map.get(str1)+1);
			}else {
				map.put(str1, 1);
			}
		}
		map.entrySet().stream().filter(k->k.getValue() == 1).forEach(x->System.out.println(x.getKey()));
		
//		for(int i = 0 ; i < s.length; i++) {
//			int temp = 0;
//			for(int j = i +1; j< s.length; j++) {
//				if(s[i].equals(s[j]) ) {
//					temp++;
//				}
//			}
//			if(temp == 0 ) {
//				System.out.println(s[i]);
//			}
//		}
	}
}
