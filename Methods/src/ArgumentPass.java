
public class ArgumentPass {

	//Design the method as example
	String getStudentName(String name) {  //pass argument String name...
		return name;
	}
	public static void main(String[] args) {
		//here create object becoz method is non static.
		ArgumentPass argumentPass=new ArgumentPass();
		String n=argumentPass.getStudentName("Ranjeet");
		System.out.println(n);
	}
}
