//It is process of hiding some details and showing of imp details to end user is called ..Ex. ATM
// we can achieve abstraction by two way
// 1) abstract class....2) Interface

//Abstract Class:
// If any method is abstract in class then that class must be declare as abstract
// To use of abstract method of class, we should extends abstract class and use that method.
// we can not create object of abstract class.
// Abstract class have constructor
// If you don't want to implement the abstract method then implement class declared as abstract.
// abstract class contain abstract methods, concrete methods and both.

package com.abstraction.abstractclass;

public abstract class Test {

	Test(){		//Abstract class constructor
		
	}
	abstract void x1();    //abstract method
	
	//void x2(){          concrete method
	//   }
	

}
