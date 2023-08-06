//Do while loop is similar as while loop, 
// only difference between them is first execute the body of loop then check the conditions.
//do while loop is execute at least one time
//syntax-
//		initialization;
//		do{
//			statement;
//			incre / decre ;
//		} while(condition); 
//1 to 10
public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Value of i " + i);
			i++;
		}while(i <=10);
	}
}
