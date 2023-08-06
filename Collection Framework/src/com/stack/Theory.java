//Stack:
//	1) It is child class of vector
//	2) It is mechanism is LIFO (Last In First Out)/(FILO(First In Last Out)

package com.stack;

import java.util.Stack;

public class Theory {

	public Stack getStack() {
		Stack stack = new Stack();
		stack.push(54);  //push() use to add element into stack
		stack.push(876);
		stack.push(1);
		return stack;
	}
	
	public static void main(String[] args) {
		Theory theory = new Theory();
		Stack s = theory.getStack();
		System.out.println(s);
		System.out.println(s.peek()); //peek method used to return top element of stack without remove object stack
		System.out.println(s);
		System.out.println(s.pop());// It return top object stack
		System.out.println(s);
	}
}
