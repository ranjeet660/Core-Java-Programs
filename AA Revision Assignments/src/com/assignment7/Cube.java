//Design method public int getNumberCube(int num), return int value to that method and
//result should be into main method.

package com.assignment7;

import java.util.Scanner;

public class Cube {

	public int getNumberCube(int num) {
		int c = ( num * num * num);
		System.out.println("Cube is: "+c);
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no: ");
		int n = scanner.nextInt();
		Cube cube = new Cube();
		cube.getNumberCube(n);
	}
}
