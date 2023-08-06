//if block within another if block 

////Syntax 
// if (Condition){
//		if(condition){
//			Statement 1;
//		}
//  }

public class NestedIf {

	public static void main(String[] args) {
		int num = 50;
		if (num > 40) {	//Outer if block
			if (num > 30) {  //Inner if block
				System.out.println("Number is greter than 30");
			}
		}
	}
}
