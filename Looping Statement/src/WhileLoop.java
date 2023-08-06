//While loop in java is - If the condition is true then while loop will be execute, this process is continued until condition become false
//syntax-
//		initialization;
//		while (condition){
//			statement;
//			incre / decre ;
//		}

// when use - when numbers of iteration is not fixed
//WAP to print 1 to 5 
public class WhileLoop {

	public static void main(String[] args) {
		int i = 1 ; //initialization
		while (i <=5 ) {  		//condition
			System.out.println("Value of i >>" + i);
			i++;   //incre / decre ;
		}
	}
}
