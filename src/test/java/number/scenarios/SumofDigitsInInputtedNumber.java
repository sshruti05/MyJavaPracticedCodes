package number.scenarios;

public class SumofDigitsInInputtedNumber {

	public static void main(String[] args) {
		int num = 2341;
		int temp = num;
		int sum = 0;
		int rem;
		while(temp>0) {
			
			rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
			
		}System.out.println("Sum of number "+num+" : "+sum);

	}

}
