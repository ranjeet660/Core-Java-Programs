package com.statics;

//Static are used for memory management 
// It can be apply to variables, methods, inner class, static blocks 
//It means single copy storage
public class StaticTest {

	int x=5;
	static int y=0;
	
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		System.out.println("static>>>"+ staticTest.y++);  //5 ++
		System.out.println("Non static>>>" + staticTest.x++); //5 ++
		
		StaticTest staticTest1=new StaticTest();
		System.out.println("static>>>"+ staticTest1.y++);  // 6
		
		System.out.println("Non static>>>" + staticTest1.x++);  //5
	}
}
