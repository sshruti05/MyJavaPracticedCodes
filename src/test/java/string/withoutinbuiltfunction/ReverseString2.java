package string.withoutinbuiltfunction;

public class ReverseString2 {	
	public static void main(String[] args) {
		String s = "India is our motherland";
		char[] c = s.toCharArray();
		String reversedString = "";
		
		for( int i=s.length()-1; i>=0; i-- ) {
			reversedString = reversedString+c[i];	
		}
		System.out.println(reversedString);//dnalrehtom ruo si aidnI			
	}
}
