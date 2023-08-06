
public class BitwiseOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		//Bitwise AND
		System.out.println(x < y & x < z);  //Both condition are true
		System.out.println(x > y & x < z);
		
		//Bitwise OR
				System.out.println(x < y || x < z);  
				System.out.println(x > y || x > z);
	}
}
