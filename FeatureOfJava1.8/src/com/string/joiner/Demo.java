package com.string.joiner;

import java.util.StringJoiner;

public class Demo {

	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner("-");
		stringJoiner.add("Ranjeet");
		stringJoiner.add("Maskar");
		System.out.println(stringJoiner);
		
		StringJoiner sj = new StringJoiner("*");
		sj.add("Shashi");
		sj.add("Madhuri");
		sj.add("Kolhapur");
		System.out.println(sj);
		
		StringJoiner s = stringJoiner.merge(sj);
		System.out.println(s);
		
		
	}
}
