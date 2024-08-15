package string.withoutinbuiltfunction;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "WaW";
		char[] c = s.toCharArray();
		String reversedString = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reversedString = reversedString+c[i];
		}
		
		if(s.equals(reversedString)) {
			System.out.println("This is a palindrome.");
		}else {
			System.out.println("Its not palindrome.");
		}
	}

}
