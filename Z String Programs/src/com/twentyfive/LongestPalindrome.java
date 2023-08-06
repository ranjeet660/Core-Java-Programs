package com.twentyfive;

import java.util.Arrays;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "babadranjeeteejnard";
		
		String arr[] = new String[str.length()];
		int temp = 0;
		for(int i = 0; i < str.length(); i++) {		
			
			for(int j = i + 2; j < str.length(); j++) {
				String s1 = str.substring(i, j);//bab	
				StringBuffer stringBuffer = new StringBuffer(s1);//bab
				String s2 = stringBuffer.reverse().toString();//bab
				if(s1.equals(s2)) {//bab.equals(bab)
					arr[temp++]= s1;
				}
			}
		}
		int max=0;
		int first = arr[0].length();//bab=3
		for(int k = 0; k < arr.length; k++) {
			
			if(arr[k]!=null) {
				if(arr[k].length() >= first) {
					max = k;
					first = arr[k].length();
				}
			}
			
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[max]);
		Arrays.stream(arr).forEach(a->System.out.println(a));
	}
}
