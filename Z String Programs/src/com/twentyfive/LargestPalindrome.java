package com.twentyfive;

public class LargestPalindrome {

	public static void main(String[] args) {
		String str = "babad";
		String arr[] = new String[str.length()];
		int temp=0;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i + 2; j < arr.length; j++) {
				String s1=str.substring(i, j);
				StringBuffer stringBuffer = new StringBuffer(s1);
				String s2 = stringBuffer.reverse().toString();
				
				if(s1.equals(s2)) {
					arr[temp++] = s1;
				}
			}
		}
		int max=0;
		int first = arr[0].length();
		for(int k = 0; k < arr.length; k++) {
			if(arr[k]!= null) {
				if(arr[k].length() >= first) {
					max = k;
					first = arr[k].length();
				}
			}
		}
		System.out.println(arr[max]);
	}
}
