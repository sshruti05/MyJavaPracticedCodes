package string.withoutinbuiltfunction;

public class ReverseString1 {
	private static String reverseString(String str) {
		char[] c = str.toCharArray();
		char temp;
		for( int i=0,j=c.length-1; i<(c.length/2); i++,j-- ) {
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}		
		return new String(c);
	}	
	public static void main(String[] args) {		
		String inputString = "Sneha Shruti";
		
		System.out.println("Original String: "+inputString);
		System.out.println("Reversed String: "+reverseString(inputString));
	}
}	/*Original String: Sneha Shruti
      Reversed String: iturhS ahenS  */

