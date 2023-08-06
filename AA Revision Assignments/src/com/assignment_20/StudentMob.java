package com.assignment_20;

import java.util.ArrayList;
import java.util.Iterator;


public class StudentMob {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("9158152260");
		arrayList.add("9158152260");
		arrayList.add("9158152260");
		arrayList.add("9158152260");
		
		Iterator itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println("Mobile number is:"+ itr.next());
		}
	}
}
