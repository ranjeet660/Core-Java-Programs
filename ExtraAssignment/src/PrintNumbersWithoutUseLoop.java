
public class PrintNumbersWithoutUseLoop {

	public static void x(int a, int b) {
		if(a <= b) {
			System.out.println(a);
			x(a+1, b);  		//recursion function
		}
	}
	public static void main(String[] args) {
		
		x(1,10);
		
	}

}
