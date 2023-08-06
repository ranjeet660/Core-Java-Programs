
public class Fibonac {

	public static void main(String[] args) {
	int a = 0;
	int b = 1;
	System.out.println(a);
	System.out.println(b);
	int sum = 0;
	int no = 5;
	for(int i = 0 ; i < no ; i++) {
		sum = a + b;
		System.out.println(sum);
		a = b ;
		b = sum ;
		sum = a;
		
	}
	}
}
