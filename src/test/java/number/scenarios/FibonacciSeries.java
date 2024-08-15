package number.scenarios;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int numTill = 10;
		int s;
		
		System.out.print(a+" "+b);
		
		for(int i=1; i<=numTill-2; i++) {
			s = a+b;
			a = b;
			b = s;
			System.out.print(" "+s);			
		}
	}
}
