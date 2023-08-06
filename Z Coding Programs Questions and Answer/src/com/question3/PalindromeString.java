package com.question3;

import java.util.ArrayList;
import java.util.List;

public class PalindromeString {

	public static void main(String[] args) {
		String str ="babadranjeeteejnard";
		
		int len = str.length();
		List<String> arrayList = new ArrayList<String>();		
		for(int i = 0; i < len ; i++) {
			for(int j = i + 2; j < len; j++) {
				String s1 = str.substring(i,j);
				String s2="";
				for(int k = s1.length()-1; k >=0; k--) {			//Reverse
					char ch = s1.charAt(k);
					s2 = s2 + ch;
				}
				if(s1.equals(s2)) {
					arrayList.add(s2);
				}	
			}
		}
		int large = 0;
		int first = arrayList.get(0).length();

		for(int r = 0; r < arrayList.size(); r++) {
			//System.out.println(strArr[r]);
			if(arrayList.get(r)!= null) {
				if(arrayList.get(r).length() >= first) {
					large = r; 
					first = arrayList.get(r).length();
				}
			}
		}
		System.out.println("Longest palindrome: "+ arrayList.get(large));
	}
}
