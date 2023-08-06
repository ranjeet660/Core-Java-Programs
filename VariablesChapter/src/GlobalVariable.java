//Global variables are declared outside the method but inside the class.
//It is also know as Instance variable.
// Global variables are stored in heap memory.
//It is initialized automatically by JVM, default value is 0.
//Scope in anywhere in the class.

public class GlobalVariable {
	int a;  //Declaration of Global variable
	int _b;
	int c =7;  //Initialized global variable
	int _d =8;
//	int 9s; //Not allowed
//	int 5_c;  //Not allowed
	public static void main(String[] args) {
		GlobalVariable globalVariable=new GlobalVariable();
		System.out.println(globalVariable.a);
		System.out.println(globalVariable._b);
		System.out.println(globalVariable.c);
		System.out.println(globalVariable._d);
	}
}


//Note : Static keyword is applied on global variable and it will become static variable.

