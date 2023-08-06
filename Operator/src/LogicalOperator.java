//Logical operator
// AND    OR
// Truth table AND  (Both condition are true .....if One condition is False then result False.) 
// Statement 1    Statement 2    Result
//    T				  T				T
//	  T					F			F
//	  F					T			F
//    F					F			F

// Truth table OR  (if One condition is true then result True.) 
// Statement 1    Statement 2    Result
//    T				  T				T
//	  T					F			T
//	  F					T			T
//    F					F			F
public class LogicalOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		//Logical AND
		System.out.println(x < y && x < z);  //Both condition are true
		System.out.println(x > y && x < z);
		
		//Logical OR
		System.out.println(x < y || x < z);  
		System.out.println(x > y || x > z);
	}
}
