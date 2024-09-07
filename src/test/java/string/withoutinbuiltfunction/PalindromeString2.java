package string.withoutinbuiltfunction;

public class PalindromeString2 {

	public static void main(String[] args) {
		String s = "Madam";
		char[] c = s.toCharArray();
		String reversedString = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reversedString = reversedString+c[i];
		}
		
		if(s.equalsIgnoreCase(reversedString)) {
			System.out.println(s+" is a palindrome. "+reversedString);
		}else {
			System.out.println(s+" is not a palindrome. "+reversedString);
		}
	}
}
