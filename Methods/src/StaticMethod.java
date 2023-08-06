//When define method in class with using static keyword is called..
//There are 3 ways to calling the method:
// by using class name
// by using object name
// direct
public class StaticMethod {
	
	static void test() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		//by using class name
		StaticMethod.test();
		
		//by using object name
		StaticMethod staticMethod=new StaticMethod();
		staticMethod.test();
		
		//Direct
		test();
	}
}


//By using class name & Direct ways are mostly used in industry.