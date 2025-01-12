package number.scenarios;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int numOfIterations = 9;
		int temp;
		System.out.print(a+" "+b+" ");
		for(int i = 2; i < numOfIterations; i++) {
			temp = a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
		}
	}
}
