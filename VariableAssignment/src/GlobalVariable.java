//1. Write the Java Program to declare the global variables as y.
//2. Write the Java Program to Print the global variable value as 25.
public class GlobalVariable {
	int y=25;  //Declare & initialized global variable
	
	public static void main(String[] args) {		
		
		GlobalVariable globalVariable = new GlobalVariable();
		System.out.println(globalVariable.y);
	}
}
