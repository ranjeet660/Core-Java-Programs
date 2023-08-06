//It is used to create and return exact copy of this object

package com.object;

public class Example3 implements Cloneable{

	@Override
	public String toString() {
		return "Example3 [x=" + x + "]";
	}

	int x;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Example3 example3 = new Example3();
		example3.x = 20;
		
		System.out.println("first>>"+ example3.x);
		Object exmpl4 = example3.clone();
		System.out.println("second>>"+exmpl4);
	}
}
