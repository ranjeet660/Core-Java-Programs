package com.nineteen;

public class Frequesncy {

	public static void main(String[] args) {
		String str = "RanjeetMaskar";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					++count;
				}
			}
			System.out.println(str.charAt(i) + " " + count);
			count = 0;
		}
	}
}
