//It will execute one condition from multiple conditions
//it used for specific condition such as.. grading system
//Syntax 
// if (Condition 1){
//		Statement 1;
//  }else if(condition 2){
//		Statement 2;
//	}else if (condition 3){
//		Statement 3;
//	}else{
//	execute when all condition will false.
//	}


public class IfElseIfLadder {

	public static void main(String[] args) {
		
		int mark = 71;
		if(mark >= 80 ) {
			System.out.println("A grade");
		}else if(mark >=70 && mark < 80) {
			System.out.println("B grade");
		}else if(mark >=60 && mark < 70) {
			System.out.println("S grade");
		}else {
			System.out.println("Student fail");
		}
	}
}
