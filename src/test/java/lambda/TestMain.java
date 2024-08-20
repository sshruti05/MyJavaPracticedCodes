package lambda;

public class TestMain {

	public static void main(String[] args) {
		Greeting g = (s) -> s.toLowerCase(); 
			
		System.out.println(g.greet("Sneha"));
		
	}

}
