//It is the block of statements that are used to perform task is called 
//Writing method becoz avoid the rewriting same code again and again.
//Syntax:
//		[Access specifier] return_type method_name(arg1, arg2,....arg_n){     
//		statement 1;
//		statement 2;
// 		}
// Arguments is an optional part
// There are two type of method: Static & Non Static method

public class Test {

	//int is return type & demo is method name
	int demo() {
		return 5; //return any integer value bacoz return type of method is int.
	}
	
	String demoOne() {
		return "R";  //return any string becoz return type of method is String.
	}
	
	void demoTwo() {
		//There is no need to return keyword for void return type.
	}
	
	public static void main(String[] args) {
		
	}
}

//Rules:
// 1) Method name is in camel case only
//     Ex. studentName  //It is start with lower case letter
// 2) Method name should be some meaning name.
// 3) Method is enclosed within { }.
//Note- Write the all code into one method that is not good programmer  practice.