package com.lambda.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOutOne {

	public static void main(String[] args) {
		String str = "10 22 310 343 11 23";
		String arr[] =str.split(" ");
		Arrays.stream(arr).filter(c->c.startsWith("1")).forEach(z->System.out.println(z));
		System.out.println("--------------------");
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("120");
		list.add("320");
		list.add("1220");
		list.add("1720");
		
		
	list.stream().filter(c->c.startsWith("1")).forEach(z->System.out.println(z));
	}
}
