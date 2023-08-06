package com.arraylist.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingArraylist {

	public static void main(String[] args) {
		List list = new ArrayList(Arrays.asList(3,4,5,1,2,6,5,6));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
