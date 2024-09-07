package number.scenarios;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int numOfIterations = 1;
		int tem;
		System.out.print(a+" "+b+" ");
		for(int i = 2; i < numOfIterations; i++) {
			tem = a+b;
			System.out.print(tem+" ");
			a=b;
			b=tem;	
		}
	}
}
