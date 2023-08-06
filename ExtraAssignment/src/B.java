import java.util.Arrays;
import java.util.List;

public class B {

	public static void main(String ...args) {
		String str = "Assignmet";
		String s[]= str.split(" ");

		Arrays.stream(s).map(a->a.toUpperCase()).forEach(x->System.out.println(x));
		
		List<String> name = Arrays.asList("jeet","Ramesh","sanket");
		name.stream().map(a->a.toUpperCase()).forEach(c->System.out.println(c));
		
	}
	
	
}
