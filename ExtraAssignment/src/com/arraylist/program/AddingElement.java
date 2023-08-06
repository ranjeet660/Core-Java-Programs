package com.arraylist.program;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingElement {

	ArrayList<Integer> getArraylist() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count of arraylist");
		int n = scanner.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter data");
			int num = scanner.nextInt();
			arrayList.add(num);
		}
		scanner.close();
		return arrayList;
	}
	
	public static void main(String[] args) {
		AddingElement addingElement = new AddingElement();
		ArrayList<Integer> arr = addingElement.getArraylist();
		System.out.println(arr);
		
	}
}
