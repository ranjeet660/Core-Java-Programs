package com.twentyfive;

public class Test {

	public static void main(String[] args) {
		String str = "babadbabadbranjeeteejnarabadbabad";		
		int temp=0;
		String arr[] = new String[str.length()];
		for(int i = 0 ; i < str.length();i++) {
			for(int j = i +2; j < str.length(); j++) {
				String s1 = str.substring(i, j);
				StringBuffer sb = new StringBuffer(s1);
				String s2 = sb.reverse().toString();
				if(s1.equals(s2)) {
					arr[temp++]=s1;
				}
			}
		}
		int max=0;
		int first = arr[0].length();
		for(int k = 0; k < arr.length; k++) {
			if(arr[k]!=null) {
				if(arr[k].length()>= first) {
					max = k;
					first = arr[k].length();
				}
			}
			
		}
		System.out.println(arr[max]);
	}
}
