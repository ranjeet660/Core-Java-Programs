
public class Fibboonac {

	void getFib(int no) {
		int x = 0;
		int y = 1;
		int sum = 0;
		System.out.println(x);
		System.out.println(y);
		for(int i = 1; i < no-1; i++) {
			sum = x + y;
			System.out.println(sum);
			x = y;
			y = sum;
		}
	}
	public static void main(String[] args) {
		
		Fibboonac fibboonac = new Fibboonac();
		fibboonac.getFib(6);
	}
}
