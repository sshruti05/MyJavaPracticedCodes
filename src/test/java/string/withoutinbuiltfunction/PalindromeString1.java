package string.withoutinbuiltfunction;

public class PalindromeString1 {
	public static void main(String[] args) {
		String s = "WajaW";
		char[] c = s.toCharArray();

		System.out.println(isPalindrome(c)? s+" Is a palindrome" : s+" Not a palindrome");
	}
	
	private static boolean isPalindrome(char[] c) {
		for(int i=0, j=c.length-1; i<(c.length/2); i++, j--) {
			if(c[i] != c[j]) {
				return false;
			}		
		}
		return true; 
	}
}
