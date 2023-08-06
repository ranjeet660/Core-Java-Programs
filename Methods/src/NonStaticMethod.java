//when Define method in class without  using static keyword is called..
// we can call the method by -
// 1) by using Object name


public class NonStaticMethod {
	
	void test() {
		System.out.println("It is Non Static method");
	}
	
	public static void main(String[] args) {  
		//by using Object name
		NonStaticMethod nonStaticMethod= new NonStaticMethod();
		nonStaticMethod.test();
	}
}
