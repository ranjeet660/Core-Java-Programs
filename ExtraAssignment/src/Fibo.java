
public class Fibo {

	void FiboNo() {
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		int no = 5;
		int i = 0;
		while(i < no) {
			sum = a + b;
			System.out.println(sum);
			i++;
			a = b;
			b = sum ;
			sum = a;
		}
	}
	 public static void main(String[] args) {
		
		 Fibo fibo = new Fibo();
		 fibo.FiboNo();
	}
}
