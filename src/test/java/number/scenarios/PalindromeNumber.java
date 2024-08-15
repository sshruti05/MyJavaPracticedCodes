package number.scenarios;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 12321;
		int org = num;
		int rev = 0;
		int rem = 0;
		while(num > 0) {
			rem = num%10;       // 1    2   3   2    1
			rev = rev*10 + rem; // 1    12  123 1232 12321
			num = num/10;       // 1232 123 12  1    0
		}
		
		System.out.println("Reversed Number :"+rev);
		
		if(org == rev) {
			System.out.println("Number is Palindrome.");
		}
		else
			System.out.println("Number is not Palindrome.");
	}
}
