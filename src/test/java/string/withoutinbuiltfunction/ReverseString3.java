package string.withoutinbuiltfunction;

public class ReverseString3 {

	public static void main(String[] args) {
		String s = "India is our motherland";
		String newReversedString = "";
		
		for( int i=0; i<s.length(); i++ ) {
			newReversedString = s.charAt(i)+newReversedString;	
		}
		System.out.println(newReversedString);
//		dnalrehtom ruo si aidnI
	}
}
