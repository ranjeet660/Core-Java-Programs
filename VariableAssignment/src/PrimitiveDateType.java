
public class PrimitiveDateType {
	//Global / Instance variable
	byte a=5;
	short b= 10;
	int c= 15;
	long d = 20;
	float e=5.5f;
	double f=6.5;
	char name = 'R'; 
	boolean m;  //automatically initialized by JVM
	
	public static void main(String[] args) {
		//Object is created and calling global variables.
		PrimitiveDateType primitiveDateType = new PrimitiveDateType(); //create object
		System.out.println("Global byte " + primitiveDateType.a);
		System.out.println("Global short "+ primitiveDateType.b);
		System.out.println("Global int " + primitiveDateType.c);
		System.out.println("Global long " + primitiveDateType.d);
		System.out.println("Global float " + primitiveDateType.e);
		System.out.println("Global double " + primitiveDateType.f);
		System.out.println("Global char " + primitiveDateType.name);
		System.out.println("Global boolean " + primitiveDateType.m);
		
		//Declare local variables
		byte a=1;
		short b=2;
		int c=3;
		long d=4;
		float e=5;
		double f=6;
		char g='S';
		boolean h = true ;
		
		//local variables calling is directly ..no need to create object for access local variables
		System.out.println("Local byte " + a);
		System.out.println("Local short "+ b);
		System.out.println("Local int " + c);
		System.out.println ("Local long "+ d);
		System.out.println ("Local float "+ e);
		System.out.println ("Local double "+ f);
		System.out.println ("Local char "+ g);
		System.out.println ("Local boolean "+ h);
	}
}
