package com.twentyy;

public class SmallLargeWord {

	static String getSmallWord(String str[]) {
		String temp = "";		
		for(int i = 0 ; i < str.length; i++) {
			for(int j = i+ 1 ;j < str.length; j++)
			if(str[i].length() > str[j].length()) {
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		return str[0];
	}
	static String getLargeWord(String str[]) {
		String temp = "";
		for(int i = 0 ; i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[i].length() < str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				
			}
		}
		return str[0];		
	}
	public static void main(String[] args) {
		String str = "Hissaasdsds ab to all iam am java developer";
		String strarr[] = str.split(" ");
		String s = getSmallWord(strarr);
		System.out.println("Smallest: "+s);
		String large = getLargeWord(strarr);
		System.out.println("Largest: " + large) ;
	}
}
