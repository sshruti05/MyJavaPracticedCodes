package number.scenarios;

public class FactorialIteration {
		public static void main(String[] args) {
			int num = 4; 
			
			if (num<0)
				System.out.println("Factorial is not for negative numbers.");
			else
				System.out.println("Factorical of "+num+" is "+calFact(num));
		}

		private static int calFact(int num) {
			int fact = 1;
			for(int i=1; i<=num; i++) {
				fact = fact * i;
			}
			return fact;
	}

}
