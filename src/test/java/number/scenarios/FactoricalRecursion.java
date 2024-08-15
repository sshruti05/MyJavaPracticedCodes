package number.scenarios;

public class FactoricalRecursion {
	public static void main(String[] args) {
		int num = 5; 
		
		if (num<0)
			System.out.println("Factorial is not for negative numbers.");
		else
			System.out.println("Factorical of "+num+" is "+calFact(num));
	}

	private static int calFact(int num) {
		if(num==0 || num==1)
			return 1;
		return num * calFact(num-1);
	}
}
