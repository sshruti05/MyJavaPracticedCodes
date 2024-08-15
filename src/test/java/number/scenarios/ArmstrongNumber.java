package number.scenarios;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153; 
		int orig = num; 
		int rev = 0;
		int rem = 0;
		int count = String.valueOf(num).length();

		while (num>0) {
			rem = num % 10;
			rev = (int) (rev + Math.pow(rem,count));
			num = num/10;			
		}
		System.out.println("Calculated value "+rev);
		
		if(orig == rev) 
			System.out.println("Number is Armstron.");
		else
			System.out.println("Number is not an Armstrong.");
			
	}

}
