package string.withinbuiltfunctions;

public class ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		String inputString = "Sneha Shruti";
		StringBuffer str = new StringBuffer(inputString);
		StringBuilder str1 = new StringBuilder(inputString);
		
		System.out.println("Original String: "+inputString);
		System.out.println("Reversed String using StringBuffer: "+(str.reverse()));
		System.out.println("Reversed String using StringBuilder: "+str1.reverse());				
	}
}/*Original String: Sneha Shruti
   Reversed String using StringBuffer: iturhS ahenS
   Reversed String using StringBuilder: iturhS ahenS	
*/

