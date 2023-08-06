//Design a method as getStudentName(String name) and return and print the student name.
public class MethodAssignment {

	//declare non static method
	String getStudentName(String name) {  //pass argument
		return name;
	}
	
	//declare static method
	static String getStudentData(String name) {
		return name;
	}
	public static void main(String[] args) {
		//create object for calling non-static method
		MethodAssignment methodAssignment=new MethodAssignment();
		String n= methodAssignment.getStudentName("Ranjeet Maskar");  //name store in to String n variable
		System.out.println("Student name is : " + n);   //printing that variable
		
		
		//calling static method 		
		String x = MethodAssignment.getStudentData("Sourabh Maskar");  //by using class name
		System.out.println("Student name is : "+ x);
		
		String y = getStudentData("Shashikant Maskar");  //by using direct method
		System.out.println("Student name is : "+ y); 
	}
}

