
public class Result {

	public static void main(String[] args) {
		//Scenario-1
//			Test test = new Test();
//			System.out.println(test.a);
//			System.out.println(test.b);
//			System.out.println(test.c);
//		
//			test.x1();
//			test.x2();
//			test.x3();
		//-----------------------
		//Scenario-2
//			Demo demo = new Demo();
//			System.out.println(demo.a);//20
//			System.out.println(demo.b);//40
//			System.out.println(demo.c);//50
//		
//			demo.x1();//X1 method - from Test class
//			demo.x2();//X2 method from Demo class
//			demo.x3();//X3 method from Demo class
		
		//------------------------------
		//Scenario-3
//			Test test = new Demo();
//			System.out.println(test.a);
//			System.out.println(test.b);
//		
//			test.x1();
//			test.x2();
		
		//-------------------------
		//Scenario-4  (3rd and 4rth scenario is same)
//			Test test = new Test();
//			Demo demo = new Demo();
//			test = demo;
//		
//			System.out.println(test.a);
//			System.out.println(test.b);
//			test.x1();
//			test.x2();
		
		//---------------------------------
		//Scenario-5  ---It is similar as 2nd scenario
//			Test test = new Test();
//			Demo demo = new Demo();
//			demo = (Demo) test ;  //Type casting
//			
//			System.out.println(demo.a);
//			System.out.println(demo.b);
//			System.out.println(demo.c);
//			
//			demo.x1();
//			demo.x2();
//			demo.x3();
		//-------------
		//Scenario-6
			//Demo demo = new Test();  //It is wrong approch
	}
}
