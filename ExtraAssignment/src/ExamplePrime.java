
public class ExamplePrime {

	public static void main(String[] args) {
		
		int no = 10;
		
		for(int i = 0; i < no; i++) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count ==0) {
				System.out.println(i);
			}
		}
	}
}
