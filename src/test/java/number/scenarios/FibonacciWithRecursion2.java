package number.scenarios;

public class FibonacciWithRecursion2 {
	
	public static void main(String[] args) {
		int n = 5;
		System.out.print("Fibonacci number: 0 1 ");
		for(int i=1; i<=n-2; i++)
			System.out.print(printFibonacci(i)+" ");
	}

	private static int printFibonacci(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		return printFibonacci(n-1)+printFibonacci(n-2);		
	}

}
