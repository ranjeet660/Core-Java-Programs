
public class PmNum {

	public static void main(String[] args) {
		int no = 10;
		for(int i = 1 ; i <= no; i++) {
			int temp = 0;			
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					temp = temp + 1;
				}
			}
			if(temp == 0) {
				System.out.println(i);
			}
		}
	}
}
