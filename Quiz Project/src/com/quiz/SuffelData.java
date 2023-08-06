package com.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SuffelData {

	public static List<Integer> getSuffelData(){
		List<Integer> suffel = new ArrayList<Integer>();
		for(int i = 1 ; i <=10; i++) {
			suffel.add(i);
		}
		Collections.shuffle(suffel);
		
		return suffel;
	}
}
