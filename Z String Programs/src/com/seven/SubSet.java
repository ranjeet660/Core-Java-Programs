package com.seven;

public class SubSet {

	public static void main(String[] args) {
		String str = "mask";
		for(int i = 0 ; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				System.out.println(s);
			}
		}
	}
}
