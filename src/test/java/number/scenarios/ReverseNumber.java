package number.scenarios;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345; 
		int temp = num; 
		int rem=0, rev=0;

		while (temp>0) {
			rem = temp%10;
			rev = rev*10 + rem; 
			temp = temp/10;
		}
		System.out.println(rev); //54321
	}

}
