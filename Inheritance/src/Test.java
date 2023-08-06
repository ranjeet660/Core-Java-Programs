//It is used to creating new class by using existing functionality is called
//It is mechanism in which one class acquires all property of another class 
//It means simply reusability.
// is called (IS Relationship)
// All the parent class members derived into child but they are depending upon following things:
//	1) It checks the access specifier
//	2) members does not exist in child class
public class Test {

	int a = 20;		//variable declaration
	int b = 30;
	
	void x1() {     //Method/ Function
		System.out.println("X1 method - from Test class");
	}
	
	void x2() {
		System.out.println("X2 method from Test class");
	}
}
