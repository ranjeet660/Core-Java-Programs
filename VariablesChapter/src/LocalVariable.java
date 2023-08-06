//Local variables are declared inside method body only.
//Local variables are stored in stack memory.
//It does not initialized automatically.
//Scope is within method body
public class LocalVariable {
	public static void main(String[] args) {
		int a; 
		int b=10;
		System.out.println(b);
	}
}

//Note: If you are trying to use local variable are without initialized value the it will show compiler time error
//Static keyword is not applied on local variable