package com.nineteen;

public class WordOccurances {

	public static void main(String[] args) {
		String str = "I am java developer java is most popular technology I am very weak is java";
		String s[] = str.split(" ");
		int count = 1;
		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count++;
				}
			}

			System.out.println(s[i] + " " + count);
			count = 1;

		}

	}
}
