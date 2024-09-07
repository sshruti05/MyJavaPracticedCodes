package number.scenarios;

import java.util.Scanner;

public class FibbonacciWithRecursion {
	static int a1=0, a2=1, temp=0;
	private static void printFibonacci(int i) {
		if (i>0) {
			temp = a1+a2;
			a1 = a2;
			a2 = temp;
			System.out.print(temp+" ");
			printFibonacci(i-1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the number of times you want iteration:");
		Scanner sc = new Scanner(System.in);
		int numOfTimes = sc.nextInt();		
		System.out.print(a1+" "+a2+" ");
		printFibonacci(numOfTimes-2);
	}

}
