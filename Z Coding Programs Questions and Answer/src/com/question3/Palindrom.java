package com.question3;

import java.util.ArrayList;

public class Palindrom {

	public static void main(String[] args) {
		String str = "babadranjeeteejnargf";
		String arr[] = new String[str.length()];
		int arrIncre=0;
		int len = str.length();
		//ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < len; i++) {
			for(int j= i+2; j < len; j++) {
				String s1 = str.substring(i,j);
				String s2="";
//				for(int j = s1.length()-1; j >=0; j--) {
//					char ch = s1.charAt(j);
//					s2 = s2 + ch;
//				}
				StringBuffer stringBuffer = new StringBuffer(s1);
				s2=stringBuffer.reverse().toString();				//convert stringbuffer to builder
				if(s1.equals(s2)) {
					arr[arrIncre++]=s1;									// Adding into array
					//list.add(s1);									//Adding into arraylist
				}
			}
		}
		for(int k=0; k < arr.length; k++) {						//Print array 
			System.out.println(arr[k]);
		}
		int x = 0;
		int firstElementLen= arr[0].length();
		for(int k=0; k < arr.length; k++) {
			if(arr[k]!= null) {
				if(arr[k].length()>=firstElementLen) {
					x = k;
					firstElementLen= arr[k].length();
				}
			}
		}
		System.out.println("Longest palindrom is: "+arr[x]);
	}
}
