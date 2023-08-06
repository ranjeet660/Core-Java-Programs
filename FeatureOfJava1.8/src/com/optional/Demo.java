package com.optional;

import java.util.Optional;

//Optional Class Feature
public class Demo {

	public static void main(String[] args) {
		
		String str[] = {"1","2",null};
		
		//System.out.println(str[2].toLowerCase());
		
		//with the help of Optional class we can deals with nullPointerException
		Optional<String> s = Optional.ofNullable(str[2]);
		if(s.isPresent()) {
			System.out.println(str[2].toUpperCase());
		}else {
			System.out.println("Element is not present on that position");
		}
	}
}
