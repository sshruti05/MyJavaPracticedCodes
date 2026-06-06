package logicbuilding;

public class _2ReverseNumber {
	public static void main(String[] args) {
		int num = 1234556;
		int lastDigit=0, rev=0;

		while (num>0) {
            lastDigit = num%10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && lastDigit>7){
                System.out.println(0);
                System.exit(0);
            }
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && lastDigit< -8) {
                System.out.println(0);
                System.exit(0);
            }
            rev = rev*10 + lastDigit;
            num = num/10;
		}
		System.out.println(rev); //6554321
	}
}
