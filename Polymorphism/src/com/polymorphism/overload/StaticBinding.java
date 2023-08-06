//One entity that differently behaves in different cases called as polymorphism.
//we can achieve polymorphism by using two ways:
//	1) Method Overloading (Early binding, static binding, compile time polymorphism)
//	2) Method Overriding (late binding, dynamic binding, runtime polymorphism).


//1) Method overloading -
//		It is same method name with different arguments in same same class is called
//		There is no need of parent class and child class relationship
//		It is also called early, static binding & compile time poly.
//		Rule - Method name must have same, 
//				Argument / parameter must have different
//				Access specifier is anything
//				Return type is anything.
package com.polymorphism.overload;

public class StaticBinding {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(double a , double b) {
		System.out.println(a + b);
	}
	
	void add(double a) {
		System.out.println(a);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
